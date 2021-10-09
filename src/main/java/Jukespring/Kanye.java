package Jukespring;

import com.google.gson.Gson;

import java.util.ArrayList;
import java.util.List;

public class Kanye {
    private String songsKW;

    public void kw(String songsKW){
        this.songsKW = songsKW;


    }






    public List<String> songs2() {
        List<String> song2 = new ArrayList<String>();
        song2.add("Dark Fantasy");
        song2.add("Gorgeous ft(Kid Cudi and Raekwon)");
        song2.add("Power");
        song2.add("All of the Lights (Interlude)");
        song2.add("All of the Lights");
        song2.add("Monster ft(Jay-Z, Rick Ross, Nicki Minaj and Bon Iver");
        song2.add("So Appalled ft( Swizz Beatz, Jay-Z, Pusha T, Cyhi the Prynce and RZA");
        song2.add("Devil in a New Dress ft(Rick Ross)");
        song2.add("Runaway ft(Pusha T)");
        song2.add("Hell of a Life");
        song2.add("Blame Game ft(John Legend)");
        song2.add("Lost in the World ft(Bon Iver)");
        song2.add("Who Will Surive in America");

        return song2;
    }
    public String  toString(){
        Kanye k = new Kanye();
        String json = new Gson().toJson(k.songs2());
        return  json;



}}

