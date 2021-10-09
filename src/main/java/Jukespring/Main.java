package Jukespring;
import org.springframework.boot.SpringApplication;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@org.springframework.boot.autoconfigure.SpringBootApplication
@RestController
public class Main {
    public static void main(String [] arg) {
        SpringApplication.run(Main.class, arg);}

       public static void choice(){
        UserInteraction u= new UserInteraction();
        System.out.println("Which album would you like to listen to?");
        System.out.println("1." +u.UIalbum().get(0));
        System.out.println("2." +u.UIalbum().get(1));
        System.out.println("3." +u.UIalbum().get(2));
        int mySelection = u.UIchoice1();
        System.out.println("Genre:"+u.UIgenre().get(mySelection-1));
        System.out.println("Year:"+ u.UIsongyear().get(mySelection-1));
        System.out.println("Artist:"+u.UIartistname().get(mySelection-1));

        if (mySelection == 1) {
              System.out.println("Which track would you like to listen to?(1-11)");
            for (int i = 0; i <= (u.UIsongselection1().size() - 1); i++) {
              System.out.println(u.UIsongselection1().get(i));
        }
         int mysong1 = u.UIchoice2();
        System.out.println("Now Playing:" + u.UIsongselection1().get(mysong1 - 1));
        } else if (mySelection == 2) {
          System.out.println("Which track would you like to listen to?(1-13");
        for (int i = 0; i <= (u.UIsongselection2().size() - 1); i++) {
            System.out.println(u.UIsongselection2().get(i));
        }
        int mysong2 = u.UIchoice2();
         System.out.println("Now Playing:" + u.UIsongselection2().get(mysong2 - 1));
          } else if (mySelection == 3) {
            System.out.println("Which track would you like to listen to?");
          for (int i = 0; i <= u.UIsongselection3().size() - 1; i++) {
            System.out.println(u.UIsongselection3().get(i));
            }
          int mysong3 = u.UIchoice2();
          System.out.println("Now Playing:" + u.UIsongselection3().get(mysong3 - 1));
        }







    }



    @CrossOrigin("http://localhost:3000")
    @GetMapping("/customRoute")
    public String springChoice(){
        Album ab = new Album();
        return ab.toString();
    }

    @CrossOrigin("http://localhost:3000")
    @GetMapping("/albumchoice1")
    public String albumchoicefm(){
        Fleetwood fl = new Fleetwood();
        return fl.toString();
    }
    @CrossOrigin("http://localhost:3000")
    @GetMapping("/albumchoice2")
    public String albumchoicekw(){
        Kanye kw = new Kanye();
        return kw.toString();
    }

    @CrossOrigin("http://localhost:3000")
    @GetMapping("/albumchoice3")
    public String albumchoiceam(){
        arctic ar = new arctic();

        return ar.toString();
    }


}

