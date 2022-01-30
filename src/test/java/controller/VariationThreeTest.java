package controller;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;

import static org.junit.jupiter.api.Assertions.*;

class VariationThreeTest {
    public static VariationThree variationThree = null;

    @BeforeAll
    public static void setupBeforeClass() throws Exception {
        variationThree = new VariationThree();
    }

    @AfterAll
    public static void tearDownAfterClass() throws Exception {
        variationThree = null;
    }

    @Test
    void gameVariation3() {
        variationThree = new VariationThree();

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
        ArrayList <String> player3;
        ArrayList <ArrayList<String>> player3Deck = new ArrayList<ArrayList<String>>();

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

        player3 = new ArrayList<String>();
        player3.add("Diamonds");
        player3.add("5");
        player3Deck.add(player3);
        player3 = new ArrayList<String>();
        player3.add("Diamonds");
        player3.add("6");
        player3Deck.add(player3);

        StringBuilder sb = new StringBuilder();

        sb.append("Sue Plays " + player1Deck.get(0).get(1) + " of " + player1Deck.get(0).get(0) + "\n");
        sb.append("Bryan Plays " + player2Deck.get(0).get(1) + " of " + player2Deck.get(0).get(0) + "\n");
        sb.append("Ron Plays " + player3Deck.get(0).get(1) + " of " + player3Deck.get(0).get(0) + "\n");
        sb.append("***WAR!!!***" + "\n");

        sb.append("Sue has a score of " + "0" + "\n");
        sb.append("Bryan has a score of " + "0" + "\n");
        sb.append("Ron has a score of " + "0" + "\n");

        sb.append("Its a Tie Game Between All Players" + "\n");

        String result = sb.toString();
        String expectedResult = variationThree.gameVariation3(player1Deck,player2Deck,player3Deck,cardValuesScore, 3, 2);
        assertEquals(result, expectedResult);
    }

    @Test
    void gameVariation3Test2() {
        variationThree = new VariationThree();

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
        ArrayList <String> player3;
        ArrayList <ArrayList<String>> player3Deck = new ArrayList<ArrayList<String>>();

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

        player3 = new ArrayList<String>();
        player3.add("Diamonds");
        player3.add("4");
        player3Deck.add(player3);
        player3 = new ArrayList<String>();
        player3.add("Diamonds");
        player3.add("6");
        player3Deck.add(player3);

        StringBuilder sb = new StringBuilder();

        sb.append("Sue Plays " + player1Deck.get(0).get(1) + " of " + player1Deck.get(0).get(0) + "\n");
        sb.append("Bryan Plays " + player2Deck.get(0).get(1) + " of " + player2Deck.get(0).get(0) + "\n");
        sb.append("Ron Plays " + player3Deck.get(0).get(1) + " of " + player3Deck.get(0).get(0) + "\n");
        sb.append("Bryan wins the round!" + "\n");
        sb.append("Sue has a score of " + "0" + "\n");
        sb.append("Bryan has a score of " + "2" + "\n");
        sb.append("Ron has a score of " + "0" + "\n");

        sb.append("Sue Plays " + player1Deck.get(1).get(1) + " of " + player1Deck.get(1).get(0) + "\n");
        sb.append("Bryan Plays " + player2Deck.get(1).get(1) + " of " + player2Deck.get(1).get(0) + "\n");
        sb.append("Ron Plays " + player3Deck.get(1).get(1) + " of " + player3Deck.get(1).get(0) + "\n");
        sb.append("Sue wins the round!" + "\n");
        //sb.append("Bryan wins the round!" + "\n");
        sb.append("Sue has a score of " + "2" + "\n");
        sb.append("Bryan has a score of " + "2" + "\n");
        sb.append("Ron has a score of " + "0" + "\n");

        sb.append("Its a Tie Game Between Sue And Bryan" + "\n");

        String result = sb.toString();
        String expectedResult = variationThree.gameVariation3(player1Deck,player2Deck,player3Deck,cardValuesScore, 3, 2);
        assertEquals(result, expectedResult);
    }

    @Test
    void gameVariation3Test3() {
        variationThree = new VariationThree();

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
        ArrayList <String> player3;
        ArrayList <ArrayList<String>> player3Deck = new ArrayList<ArrayList<String>>();

        player1 = new ArrayList<String>();
        player1.add("Hearts");
        player1.add("Jack");
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

        player3 = new ArrayList<String>();
        player3.add("Diamonds");
        player3.add("4");
        player3Deck.add(player3);
        player3 = new ArrayList<String>();
        player3.add("Diamonds");
        player3.add("6");
        player3Deck.add(player3);

        StringBuilder sb = new StringBuilder();

        sb.append("Sue Plays " + player1Deck.get(0).get(1) + " of " + player1Deck.get(0).get(0) + "\n");
        sb.append("Bryan Plays " + player2Deck.get(0).get(1) + " of " + player2Deck.get(0).get(0) + "\n");
        sb.append("Ron Plays " + player3Deck.get(0).get(1) + " of " + player3Deck.get(0).get(0) + "\n");
        sb.append("Sue wins the round!" + "\n");
        sb.append("Sue has a score of " + "2" + "\n");
        sb.append("Bryan has a score of " + "0" + "\n");
        sb.append("Ron has a score of " + "0" + "\n");

        sb.append("Sue Plays " + player1Deck.get(1).get(1) + " of " + player1Deck.get(1).get(0) + "\n");
        sb.append("Bryan Plays " + player2Deck.get(1).get(1) + " of " + player2Deck.get(1).get(0) + "\n");
        sb.append("Ron Plays " + player3Deck.get(1).get(1) + " of " + player3Deck.get(1).get(0) + "\n");
        sb.append("Sue wins the round!" + "\n");
        //sb.append("Bryan wins the round!" + "\n");
        sb.append("Sue has a score of " + "4" + "\n");
        sb.append("Bryan has a score of " + "0" + "\n");
        sb.append("Ron has a score of " + "0" + "\n");

        sb.append("Winner is Sue Hand : " + "0" + " Pile: " + "4" + "\n");

        String result = sb.toString();
        String expectedResult = variationThree.gameVariation3(player1Deck,player2Deck,player3Deck,cardValuesScore, 3, 2);
        assertEquals(result, expectedResult);
    }
}