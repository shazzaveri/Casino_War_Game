package controller;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;

import static org.junit.jupiter.api.Assertions.*;

class VariationTwoTest {
    public static VariationTwo variationTwo = null;

    @BeforeAll
    public static void setupBeforeClass() throws Exception {
        variationTwo = new VariationTwo();
    }

    @AfterAll
    public static void tearDownAfterClass() throws Exception {
        variationTwo = null;
    }
    @Test
    void gameVariation2() {
        variationTwo = new VariationTwo();
        HashMap<String,Integer> cardValuesScore = new HashMap<String, Integer>();
        cardValuesScore.put("2", 2);
        cardValuesScore.put("3", 3);
        cardValuesScore.put("4", 4);
        cardValuesScore.put("5", 5);
        cardValuesScore.put("6", 6);
        cardValuesScore.put("7", 7);
        cardValuesScore.put("8", 8);
        cardValuesScore.put("9", 9);
        cardValuesScore.put("10", 10);
        cardValuesScore.put("Jack", 11);
        cardValuesScore.put("Queen", 12);
        cardValuesScore.put("King", 13);
        cardValuesScore.put("Ace", 14);

        ArrayList<String> player1;
        ArrayList <ArrayList<String>> player1Deck = new ArrayList<ArrayList<String>>();
        ArrayList <String> player2;
        ArrayList <ArrayList<String>> player2Deck = new ArrayList<ArrayList<String>>();

        player1 = new ArrayList<String>();
        player1.add("Hearts");
        player1.add("2");
        player1Deck.add(player1);
        player1 = new ArrayList<String>();
        player1.add("Spades");
        player1.add("10");
        player1Deck.add(player1);
        player1 = new ArrayList<String>();
        player1.add("Spades");
        player1.add("3");
        player1Deck.add(player1);

        player2 = new ArrayList<String>();
        player2.add("Hearts");
        player2.add("5");
        player2Deck.add(player2);
        player2 = new ArrayList<String>();
        player2.add("Spades");
        player2.add("5");
        player2Deck.add(player2);
        player2 = new ArrayList<String>();
        player2.add("Spades");
        player2.add("4");
        player2Deck.add(player2);
        StringBuilder sb = new StringBuilder();

        sb.append("Sue Plays " + player1Deck.get(0).get(1) + " of " + player1Deck.get(0).get(0) + "\n");
        sb.append("Bryan Plays " + player2Deck.get(0).get(1) + " of " + player2Deck.get(0).get(0) + "\n");
        //sb.append("Sue wins the round!" + "\n");
        sb.append("Bryan wins the round!" + "\n");
        sb.append("Sue has a score of " + "0" + "\n");
        sb.append("Bryan has a score of " + "2" + "\n");


        sb.append("Sue Plays " + player1Deck.get(1).get(1) + " of " + player1Deck.get(1).get(0) + "\n");
        sb.append("Bryan Plays " + player2Deck.get(1).get(1) + " of " + player2Deck.get(1).get(0) + "\n");
        sb.append("Sue wins the round!" + "\n");
        //sb.append("Bryan wins the round!" + "\n");
        sb.append("Sue has a score of " + "2" + "\n");
        sb.append("Bryan has a score of " + "2" + "\n");

        sb.append("Sue Plays " + "3" + " of " + "Spades" + "\n");
        sb.append("Bryan Plays " + "4" + " of " + "Spades" + "\n");
        sb.append("Bryan wins the round!" + "\n");
        sb.append("Sue has a score of " + "2" + "\n");
        sb.append("Bryan has a score of " + "4" + "\n");

        sb.append("Sue Plays " + "5" + " of " + "Spades" + "\n");
        sb.append("Bryan Plays " + "5" + " of " + "Hearts" + "\n");
        sb.append("***WAR!!!***" + "\n");

        sb.append("Sue has a score of " + "2" + "\n");
        sb.append("Bryan has a score of " + "4" + "\n");


        //sb.append("Winner is Sue Hand : " + "5" + " Pile: " + "8" + "\n");
        sb.append("Winner is Bryan Hand : " + "2" + " Pile: " + "4" + "\n");
        //sb.append("Its a Tie Game" + "\n");

        String result = sb.toString();
        String expectedResult = variationTwo.gameVariation2(player1Deck,player2Deck,cardValuesScore, 4, 6);
        assertEquals(result, expectedResult);

    }

    @Test
    void gameVariation2Test2() {
        variationTwo = new VariationTwo();
        HashMap<String,Integer> cardValuesScore = new HashMap<String, Integer>();
        cardValuesScore.put("2", 2);
        cardValuesScore.put("3", 3);
        cardValuesScore.put("4", 4);
        cardValuesScore.put("5", 5);
        cardValuesScore.put("6", 6);
        cardValuesScore.put("7", 7);
        cardValuesScore.put("8", 8);
        cardValuesScore.put("9", 9);
        cardValuesScore.put("10", 10);
        cardValuesScore.put("Jack", 11);
        cardValuesScore.put("Queen", 12);
        cardValuesScore.put("King", 13);
        cardValuesScore.put("Ace", 14);

        ArrayList<String> player1;
        ArrayList <ArrayList<String>> player1Deck = new ArrayList<ArrayList<String>>();
        ArrayList <String> player2;
        ArrayList <ArrayList<String>> player2Deck = new ArrayList<ArrayList<String>>();

        player1 = new ArrayList<String>();
        player1.add("Hearts");
        player1.add("2");
        player1Deck.add(player1);
        player1 = new ArrayList<String>();
        player1.add("Spades");
        player1.add("10");
        player1Deck.add(player1);

        player2 = new ArrayList<String>();
        player2.add("Hearts");
        player2.add("5");
        player2Deck.add(player2);
        player2 = new ArrayList<String>();
        player2.add("Spades");
        player2.add("5");
        player2Deck.add(player2);
        StringBuilder sb = new StringBuilder();

        sb.append("Sue Plays " + player1Deck.get(0).get(1) + " of " + player1Deck.get(0).get(0) + "\n");
        sb.append("Bryan Plays " + player2Deck.get(0).get(1) + " of " + player2Deck.get(0).get(0) + "\n");
        //sb.append("Sue wins the round!" + "\n");
        sb.append("Bryan wins the round!" + "\n");
        sb.append("Sue has a score of " + "0" + "\n");
        sb.append("Bryan has a score of " + "2" + "\n");


        sb.append("Sue Plays " + player1Deck.get(1).get(1) + " of " + player1Deck.get(1).get(0) + "\n");
        sb.append("Bryan Plays " + player2Deck.get(1).get(1) + " of " + player2Deck.get(1).get(0) + "\n");
        sb.append("Sue wins the round!" + "\n");
        //sb.append("Bryan wins the round!" + "\n");
        sb.append("Sue has a score of " + "2" + "\n");
        sb.append("Bryan has a score of " + "2" + "\n");


        sb.append("Sue Plays " + "5" + " of " + "Spades" + "\n");
        sb.append("Bryan Plays " + "5" + " of " + "Hearts" + "\n");
        sb.append("***WAR!!!***" + "\n");

        //sb.append("Sue wins the round!" + "\n");
        //sb.append("Bryan wins the round!" + "\n");
        sb.append("Sue has a score of " + "2" + "\n");
        sb.append("Bryan has a score of " + "2" + "\n");

        //sb.append("Winner is Sue Hand : " + "2" + " Pile: " + "4" + "\n");
        //sb.append("Winner is Bryan Hand : " + player2Deck.size() + " Pile: " + p2Score + "\n");
        sb.append("Its a Tie Game" + "\n");

        String result = sb.toString();
        String expectedResult = variationTwo.gameVariation2(player1Deck,player2Deck,cardValuesScore, 4, 6);
        assertEquals(result, expectedResult);

    }

    @Test
    void gameVariation2Test3() {
        variationTwo = new VariationTwo();
        HashMap<String,Integer> cardValuesScore = new HashMap<String, Integer>();
        cardValuesScore.put("2", 2);
        cardValuesScore.put("3", 3);
        cardValuesScore.put("4", 4);
        cardValuesScore.put("5", 5);
        cardValuesScore.put("6", 6);
        cardValuesScore.put("7", 7);
        cardValuesScore.put("8", 8);
        cardValuesScore.put("9", 9);
        cardValuesScore.put("10", 10);
        cardValuesScore.put("Jack", 11);
        cardValuesScore.put("Queen", 12);
        cardValuesScore.put("King", 13);
        cardValuesScore.put("Ace", 14);

        ArrayList<String> player1;
        ArrayList <ArrayList<String>> player1Deck = new ArrayList<ArrayList<String>>();
        ArrayList <String> player2;
        ArrayList <ArrayList<String>> player2Deck = new ArrayList<ArrayList<String>>();

        player1 = new ArrayList<String>();
        player1.add("Hearts");
        player1.add("2");
        player1Deck.add(player1);
        player1 = new ArrayList<String>();
        player1.add("Spades");
        player1.add("10");
        player1Deck.add(player1);
        player1 = new ArrayList<String>();
        player1.add("Spades");
        player1.add("3");
        player1Deck.add(player1);

        player2 = new ArrayList<String>();
        player2.add("Hearts");
        player2.add("5");
        player2Deck.add(player2);
        player2 = new ArrayList<String>();
        player2.add("Spades");
        player2.add("6");
        player2Deck.add(player2);
        player2 = new ArrayList<String>();
        player2.add("Spades");
        player2.add("4");
        player2Deck.add(player2);
        StringBuilder sb = new StringBuilder();

        sb.append("Sue Plays " + player1Deck.get(0).get(1) + " of " + player1Deck.get(0).get(0) + "\n");
        sb.append("Bryan Plays " + player2Deck.get(0).get(1) + " of " + player2Deck.get(0).get(0) + "\n");
        //sb.append("Sue wins the round!" + "\n");
        sb.append("Bryan wins the round!" + "\n");
        sb.append("Sue has a score of " + "0" + "\n");
        sb.append("Bryan has a score of " + "2" + "\n");


        sb.append("Sue Plays " + player1Deck.get(1).get(1) + " of " + player1Deck.get(1).get(0) + "\n");
        sb.append("Bryan Plays " + player2Deck.get(1).get(1) + " of " + player2Deck.get(1).get(0) + "\n");
        sb.append("Sue wins the round!" + "\n");
        //sb.append("Bryan wins the round!" + "\n");
        sb.append("Sue has a score of " + "2" + "\n");
        sb.append("Bryan has a score of " + "2" + "\n");


        sb.append("Sue Plays " + "3" + " of " + "Spades" + "\n");
        sb.append("Bryan Plays " + "4" + " of " + "Spades" + "\n");
        sb.append("Bryan wins the round!" + "\n");
        sb.append("Sue has a score of " + "2" + "\n");
        sb.append("Bryan has a score of " + "4" + "\n");

        sb.append("Sue Plays " + "6" + " of " + "Spades" + "\n");
        sb.append("Bryan Plays " + "5" + " of " + "Hearts" + "\n");
        sb.append("Sue wins the round!" + "\n");
        sb.append("Sue has a score of " + "4" + "\n");
        sb.append("Bryan has a score of " + "4" + "\n");

        sb.append("Sue Plays " + "10" + " of " + "Spades" + "\n");
        sb.append("Bryan Plays " + "2" + " of " + "Hearts" + "\n");
        sb.append("Sue wins the round!" + "\n");
        sb.append("Sue has a score of " + "6" + "\n");
        sb.append("Bryan has a score of " + "4" + "\n");

        sb.append("Sue Plays " + "5" + " of " + "Hearts" + "\n");
        sb.append("Bryan Plays " + "4" + " of " + "Spades" + "\n");
        sb.append("Sue wins the round!" + "\n");
        sb.append("Sue has a score of " + "8" + "\n");
        sb.append("Bryan has a score of " + "4" + "\n");




        sb.append("Winner is Sue Hand : " + "5" + " Pile: " + "8" + "\n");


        String result = sb.toString();
        String expectedResult = variationTwo.gameVariation2(player1Deck,player2Deck,cardValuesScore, 4, 6);
        assertEquals(result, expectedResult);

    }


}