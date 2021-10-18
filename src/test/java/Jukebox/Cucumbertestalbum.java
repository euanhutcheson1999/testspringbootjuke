package Jukebox;


import Jukespring.UserInteraction;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import static org.junit.jupiter.api.Assertions.assertEquals;

class Cucumbertestalbum {

    private int Choice ;
    private int actualAnswer;

    @Given("I have selected rumours in console")
    public int rumoursselected(){
        UserInteraction ui = new UserInteraction();
        if (ui.UIchoice1()==1){
            Choice = ui.UIchoice1();

        }
        return Choice;
    }

    @When ("I have selected an input in the console")
    public int  Userinteractswithconsoles(){
        UserInteraction ui = new UserInteraction();
        actualAnswer = 1;
        return actualAnswer;

    }

    @Then("Information should be displayed on the album")
    public void shoulddisplay(int expectedAnswer){
        assertEquals(expectedAnswer, actualAnswer);

    }














}
