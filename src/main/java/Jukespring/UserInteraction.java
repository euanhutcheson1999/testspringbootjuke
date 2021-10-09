package Jukespring;

import java.util.List;
import java.util.Scanner;

public class UserInteraction {
    public int UIchoice1(){
        Scanner myMusic = new Scanner(System.in);
        int myalbum = myMusic.nextInt();
        return myalbum;}

    public int UIchoice2(){
        Scanner myChoice = new Scanner(System.in);
        int mysong = myChoice.nextInt();

        return mysong;}

    public List<String> UIalbum() {

        Album a = new Album();
        List<String> aname = a.albumname();

        return aname;}


    public List<String> UIgenre(){
        Album a = new Album();
        List<String> genre = a.genretype();

        return genre;}



    public List<Integer> UIsongyear(){
        Album a = new Album();
        List<Integer> syear = a.songyear();

        return syear;}

    public List<String> UIartistname(){
        Album a = new Album();
        List<String> artname = a.artistname();

        return artname;}

    public List<String> UIsongselection1(){
        Fleetwood f= new Fleetwood();
        List<String> songn1 = f.songs1();

        return songn1;}

    public List<String> UIsongselection2(){
        Kanye ka= new Kanye();
        List<String> songn2 = ka.songs2();

        return songn2;}


    public List<String> UIsongselection3(){
        arctic am = new arctic();
        List<String> songn3 = am.songs3();

        return songn3;}



}
