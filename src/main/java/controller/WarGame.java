package controller;
import model.Deck;
import model.Person;
import model.PersonBuilder;

import java.util.ArrayList;
import java.util.HashMap;
public class WarGame {
    // once the players recieve cards from deck.java class.
    // we will retrieve the list here and make them play
    // one variation is player 1 reveals card first than player 2

    public String initializeWar(int deckSize, int numOfPlayers, int variationNumber) {
        Deck deck = new Deck();
        VariationOne gameType1 = new VariationOne();
        VariationTwo gameType2 = new VariationTwo();
        VariationThree gameType3 = new VariationThree();
        String variationOnefinalOut = "";
        String variationTwofinalOut = "";
        String variationThreefinalOut = "";

        ArrayList< ArrayList <String> > shuffledCard = new ArrayList< ArrayList <String> >();
        ArrayList< ArrayList <ArrayList <String> > > dealtCards = new ArrayList< ArrayList <ArrayList <String> > >();
        ArrayList< ArrayList <ArrayList <String> > > dealt3PlayerCards = new ArrayList< ArrayList <ArrayList <String> > >();

        ArrayList< ArrayList <String> > sueCardDeck = new ArrayList< ArrayList <String> >();
        ArrayList< ArrayList <String> > bryanCardDeck = new ArrayList< ArrayList <String> >();
        ArrayList< ArrayList <String> > shazCardDeck = new ArrayList< ArrayList <String> >();




        int sueScore = 0;
        int bryanScore = 0;
        //int numOfPlayers = 3;
        int p1Score  = 0;
        int p2Score = 0;
        int p3Score = 0;

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




        shuffledCard = deck.shuffleCards(52);

        Person shaz = new PersonBuilder().build();


        // grab instance of sue with a correct name and no age
        Person sue = new PersonBuilder().setMyName("Sue Jones").build();


        // grab instance of sue with a correct name and no age
        PersonBuilder pb = new PersonBuilder();
        pb.setMyName("bryan");
        Person b = pb.build();

        Person p1 = new Person();
        p1.setMyName("p1");
        //p1.setMyName();

        Person bryan = new PersonBuilder().setMyName("Bryan").setMyAge(14).build();


        dealtCards = deck.deal(shuffledCard,deckSize);
        dealt3PlayerCards = deck.deal3Players(shuffledCard, deckSize, 3);

        if (numOfPlayers == 3) {
            sue.setPlayersDeck(dealt3PlayerCards.get(0));
            bryan.setPlayersDeck(dealt3PlayerCards.get(1));
            shaz.setPlayersDeck(dealt3PlayerCards.get(2));

            sueCardDeck = sue.getPlayersDeck();
            bryanCardDeck = bryan.getPlayersDeck();
            shazCardDeck = shaz.getPlayersDeck();
        }

        else {
            sue.setPlayersDeck(dealtCards.get(0));
            bryan.setPlayersDeck(dealtCards.get(1));

            sueCardDeck = sue.getPlayersDeck();
            bryanCardDeck = bryan.getPlayersDeck();
        }


        //variation 1

        if (variationNumber == 1){
            variationOnefinalOut = gameType1.gameVariation1(sueCardDeck, bryanCardDeck, cardValuesScore, deckSize);
            return variationOnefinalOut;
        }
        else if (variationNumber == 2){
            variationTwofinalOut = gameType2.gameVariation2(sueCardDeck, bryanCardDeck, cardValuesScore, deckSize,15);
            return variationTwofinalOut;
        }
        else if (variationNumber == 3){
            variationThreefinalOut = gameType3.gameVariation3(sueCardDeck, bryanCardDeck,shazCardDeck, cardValuesScore, 3, deckSize);
            return variationThreefinalOut;
        }



        return "";
    }
}
