package controller;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;

import static org.junit.jupiter.api.Assertions.*;

class VariationOneTest {
    public static VariationOne variationOne = null;

    @BeforeAll
    public static void setupBeforeClass() throws Exception {
        variationOne = new VariationOne();
    }

    @AfterAll
    public static void tearDownAfterClass() throws Exception {
        variationOne = null;
    }

    @Test
    void gameVariation1() {
        variationOne = new VariationOne();
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

        //sb.append("Winner is Sue Hand : " + "0" + " Pile: " + "15" + "\n");
        //sb.append("Winner is Bryan Hand : " + player2Deck.size() + " Pile: " + p2Score + "\n");
        sb.append("Its a Tie Game" + "\n");

        String result = sb.toString();

        String expectedResult = variationOne.gameVariation1(player1Deck,player2Deck,cardValuesScore, 2);
        assertEquals(result, expectedResult);
    }

    @Test
    void gameVariation1Test2() {
        variationOne = new VariationOne();
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
        player1.add("5");
        player1Deck.add(player1);
        player1 = new ArrayList<String>();
        player1.add("Spades");
        player1.add("7");
        player1Deck.add(player1);

        player2 = new ArrayList<String>();
        player2.add("Hearts");
        player2.add("5");
        player2Deck.add(player2);
        player2 = new ArrayList<String>();
        player2.add("Spades");
        player2.add("2");
        player2Deck.add(player2);
        player2 = new ArrayList<String>();
        player2.add("Spades");
        player2.add("3");
        player2Deck.add(player2);

        StringBuilder sb2 = new StringBuilder();

        sb2.append("Sue Plays " + player1Deck.get(0).get(1) + " of " + player1Deck.get(0).get(0) + "\n");
        sb2.append("Bryan Plays " + player2Deck.get(0).get(1) + " of " + player2Deck.get(0).get(0) + "\n");
        //sb.append("Sue wins the round!" + "\n");
        sb2.append("Bryan wins the round!" + "\n");
        sb2.append("Sue has a score of " + "0" + "\n");
        sb2.append("Bryan has a score of " + "2" + "\n");


        sb2.append("Sue Plays " + player1Deck.get(1).get(1) + " of " + player1Deck.get(1).get(0) + "\n");
        sb2.append("Bryan Plays " + player2Deck.get(1).get(1) + " of " + player2Deck.get(1).get(0) + "\n");
        sb2.append("Sue wins the round!" + "\n");
        //sb.append("Bryan wins the round!" + "\n");
        sb2.append("Sue has a score of " + "2" + "\n");
        sb2.append("Bryan has a score of " + "2" + "\n");

        sb2.append("Sue Plays " + player1Deck.get(2).get(1) + " of " + player1Deck.get(2).get(0) + "\n");
        sb2.append("Bryan Plays " + player2Deck.get(2).get(1) + " of " + player2Deck.get(2).get(0) + "\n");
        sb2.append("Sue wins the round!" + "\n");
        //sb.append("Bryan wins the round!" + "\n");
        sb2.append("Sue has a score of " + "4" + "\n");
        sb2.append("Bryan has a score of " + "2" + "\n");

        sb2.append("Winner is Sue Hand : " + "0" + " Pile: " + "4" + "\n");
        //sb.append("Winner is Bryan Hand : " + player2Deck.size() + " Pile: " + p2Score + "\n");
        //sb2.append("Its a Tie Game" + "\n");

        String result = sb2.toString();

        String expectedResult = variationOne.gameVariation1(player1Deck,player2Deck,cardValuesScore, 2);
        assertEquals(result, expectedResult);
    }

    @Test
    void gameVariation1Test3() {
        variationOne = new VariationOne();
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
        player1.add("8");
        player1Deck.add(player1);


        player2 = new ArrayList<String>();
        player2.add("Hearts");
        player2.add("8");
        player2Deck.add(player2);


        StringBuilder sb2 = new StringBuilder();

        sb2.append("Sue Plays " + player1Deck.get(0).get(1) + " of " + player1Deck.get(0).get(0) + "\n");
        sb2.append("Bryan Plays " + player2Deck.get(0).get(1) + " of " + player2Deck.get(0).get(0) + "\n");
        sb2.append("***WAR!!!***" + "\n");
        sb2.append("Sue has a score of " + "0" + "\n");
        sb2.append("Bryan has a score of " + "0" + "\n");
        sb2.append("Its a Tie Game" + "\n");

        //sb.append("Winner is Sue Hand : " + "0" + " Pile: " + "15" + "\n");
        //sb.append("Winner is Bryan Hand : " + player2Deck.size() + " Pile: " + p2Score + "\n");


        String result = sb2.toString();

        String expectedResult = variationOne.gameVariation1(player1Deck,player2Deck,cardValuesScore, 2);
        assertEquals(result, expectedResult);
    }

    @Test
    void gameVariation1Test4() {
        variationOne = new VariationOne();
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
        player1.add("7");
        player1Deck.add(player1);

        player1 = new ArrayList<String>();
        player1.add("Spades");
        player1.add("5");
        player1Deck.add(player1);

        player2 = new ArrayList<String>();
        player2.add("Hearts");
        player2.add("5");
        player2Deck.add(player2);
        player2 = new ArrayList<String>();
        player2.add("Spades");
        player2.add("9");
        player2Deck.add(player2);

        player2 = new ArrayList<String>();
        player2.add("Spades");
        player2.add("7");
        player2Deck.add(player2);

        player2 = new ArrayList<String>();
        player2.add("Spades");
        player2.add("9");
        player2Deck.add(player2);

        StringBuilder sb2 = new StringBuilder();

        sb2.append("Sue Plays " + player1Deck.get(0).get(1) + " of " + player1Deck.get(0).get(0) + "\n");
        sb2.append("Bryan Plays " + player2Deck.get(0).get(1) + " of " + player2Deck.get(0).get(0) + "\n");
        //sb.append("Sue wins the round!" + "\n");
        sb2.append("Bryan wins the round!" + "\n");
        sb2.append("Sue has a score of " + "0" + "\n");
        sb2.append("Bryan has a score of " + "2" + "\n");


        sb2.append("Sue Plays " + player1Deck.get(1).get(1) + " of " + player1Deck.get(1).get(0) + "\n");
        sb2.append("Bryan Plays " + player2Deck.get(1).get(1) + " of " + player2Deck.get(1).get(0) + "\n");
        sb2.append("Sue wins the round!" + "\n");
        //sb.append("Bryan wins the round!" + "\n");
        sb2.append("Sue has a score of " + "2" + "\n");
        sb2.append("Bryan has a score of " + "2" + "\n");

        sb2.append("Sue Plays " + player1Deck.get(2).get(1) + " of " + player1Deck.get(2).get(0) + "\n");
        sb2.append("Bryan Plays " + player2Deck.get(2).get(1) + " of " + player2Deck.get(2).get(0) + "\n");
        sb2.append("***WAR!!!***" + "\n");

        //sb.append("Winner is Sue Hand : " + "0" + " Pile: " + "15" + "\n");
        //sb.append("Winner is Bryan Hand : " + player2Deck.size() + " Pile: " + p2Score + "\n");
        //sb2.append("Its a Tie Game" + "\n");


        sb2.append("Sue has a score of " + "2" + "\n");
        sb2.append("Bryan has a score of " + "2" + "\n");

        //sb2.append("Winner is Sue Hand : " + "0" + " Pile: " + "19" + "\n");
        sb2.append("Its a Tie Game" + "\n");
        String result = sb2.toString();

        String expectedResult = variationOne.gameVariation1(player1Deck,player2Deck,cardValuesScore, 2);
        assertEquals(result, expectedResult);
    }
}