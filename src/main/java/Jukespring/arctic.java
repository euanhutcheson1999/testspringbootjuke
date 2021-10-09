package Jukespring;

import com.google.gson.Gson;

import java.util.ArrayList;
import java.util.List;

public class arctic {


    private String songsAM;

    public void kw(String songsAM) {
        this.songsAM = songsAM;
    }
    public List<String> songs3(){
        List<String> song3 = new ArrayList<String>();
        song3.add("The View from the Afternoon");
        song3.add("I Bet You Look Good on the Dancefloor");
        song3.add("Fake Tales of San Francisco");
        song3.add("Dancing Shoes");
        song3.add("You Probably Couldnt See for the Lights but You Were Staring Straight at Me");
        song3.add("Still Take You Home");
        song3.add("Riot Van");
        song3.add("Red Light Indicates Doors are Secured");
        song3.add("Mardy Bum");
        song3.add("Perhaps Vampires Is a Bit Strong But...");
        song3.add("When the Sun Goes Down");
        song3.add("From the Ritz to the Rubble ");
        song3.add("A Certain Romance");

        return song3;
    }

    public String  toString(){
        arctic am = new arctic();
        String json = new Gson().toJson(am.songs3());
        return  json;



    }




}

