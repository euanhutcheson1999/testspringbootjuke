package Jukespring;

import com.google.gson.Gson;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Album {
    private String albums;
    private String aname;
    private int year;
    private String genre;

    public void album(String aname, String artist, int year, String genre) {
        this.aname = aname;
        this.year = year;
        this.genre = genre;

    }

    public List<String> albumname() {
        List<String> albums = new ArrayList<String>();
        albums.add("Rumours");
        albums.add("My Beautiful Dark Twisted Fantasy (Explicit)");
        albums.add("Whatever People Say I Am, Thats What Im Not (Explicit)");

        return albums;
    }

    public List<String> genretype() {
        List<String> genre = new ArrayList<String>();
        genre.add("Rock");
        genre.add("Hip-Hop");
        genre.add("Indie");

        return genre;

    }

    public List<Integer> songyear() {
        List<Integer> year = new ArrayList<Integer>();
        year.add(1977);
        year.add(2010);
        year.add(2006);

        return year;


    }

    public List<String> artistname() {
        List<String> artist = new ArrayList<String>();
        artist.add("Fleetwood Mac");
        artist.add("Kanye West");
        artist.add("Arctic Monkeys");


        return artist;
    }
    public String  toString(){
        Album al = new Album();
        String json = new Gson().toJson(al.albumname());
        return  json;













    }}

