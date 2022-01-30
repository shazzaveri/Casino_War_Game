package model;

import java.util.ArrayList;

public class Person {
    private String myName;
    private ArrayList< ArrayList <String> > playersDeck = new ArrayList< ArrayList <String> >();
    int score;

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    private int myAge;
    //private char myGender;

    //this will be called from Deck class OR war game class where we will deal the cards and store in this list
    // this arraylist will be treated as cards for that specific player


    // imagine if myname and myage are optional for a valid instance of Person
    // lets add constructors for all the options




    @Override
    public String toString() {
        return myName + ", age " + myAge;
    }

    // accessors

    public String getMyName() {
        return myName;
    }

    public void setMyName(String myName) {
        this.myName = myName;
    }

    public int getMyAge() {
        return myAge;
    }

    public void setMyAge(int myAge) {
        this.myAge = myAge;
    }

    public ArrayList<ArrayList<String>> getPlayersDeck() {
        return playersDeck;
    }

    public void setPlayersDeck(ArrayList<ArrayList<String>> playersDeck) {
        this.playersDeck = playersDeck;
    }
}
