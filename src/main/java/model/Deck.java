package model;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ThreadLocalRandom;
import java.util.Random;
public class Deck {
    private Cards card;
    private Person sue;
    private Person jones;
    private ArrayList<String> cardSuits;
    private ArrayList<String> cardValues;
    private int deckSize;
    //ArrayList< ArrayList <String> > shuffledCard = new ArrayList< ArrayList <String> >();

    public Deck() {
        this.card = new Cards();
        this.cardSuits = new ArrayList<String>();
        this.cardValues = new ArrayList<String>();
    }

    public ArrayList< ArrayList <String> > shuffleCards(int deckSize)
    {
        ArrayList< ArrayList <String> > shuffledCard = new ArrayList< ArrayList <String> >();
        ArrayList<String> cardCombinationList;
        Set<String> set = new HashSet<String>();
        String suit;
        String value;
        int randomIndex1;
        int randomIndex2;
        cardSuits = card.getCardSuits();
        cardValues = card.getCardValues();
        Random rand = new Random();

        for (int i = 0; i < deckSize; i++) {

            randomIndex1 = rand.nextInt(cardSuits.size());
            randomIndex2 = rand.nextInt(cardValues.size());
            suit = cardSuits.get( randomIndex1 );
            value = cardValues.get(randomIndex2 );
            if (set.contains(suit + "-" + value)) {
                i--;
            }
            else {
                cardCombinationList = new ArrayList<String>();
                set.add(suit + "-" + value);
                cardCombinationList.add(suit);
                cardCombinationList.add(value);
                shuffledCard.add(cardCombinationList);
            }

        }


        return shuffledCard;
        // ThreadLocalRandom generate a int type number

    }

    public ArrayList< ArrayList <ArrayList <String> > > deal( ArrayList< ArrayList <String> > shuffledCard, int deckSize ) {

        ArrayList< ArrayList <ArrayList <String> > > distributedCards = new ArrayList< ArrayList <ArrayList <String> > >();
        ArrayList< ArrayList <String> > player1CardList = new ArrayList<ArrayList <String>>();
        ArrayList< ArrayList <String> >player2CardList = new ArrayList<ArrayList <String>>();
        int cardsToDealTwoPlayers;
        cardsToDealTwoPlayers = deckSize - (deckSize%2);

        for (int k = 0; k < cardsToDealTwoPlayers; k++) {
            if (k%2 == 0) {
                player2CardList.add(shuffledCard.get(k));
            }
            else {
                player1CardList.add(shuffledCard.get(k));
            }
        }

        distributedCards.add(player1CardList);
        distributedCards.add(player2CardList);

        return distributedCards;
    }

    public ArrayList< ArrayList <ArrayList <String> >> deal3Players( ArrayList< ArrayList <String> > shuffledCard, int deckSize, int numOfPlayers ) {

        ArrayList< ArrayList <ArrayList <String> > > distributedCards = new ArrayList< ArrayList <ArrayList <String> > >();
        ArrayList< ArrayList <String> > player1CardList = new ArrayList<ArrayList <String>>();
        ArrayList< ArrayList <String> >player2CardList = new ArrayList<ArrayList <String>>();
        ArrayList< ArrayList <String> >player3CardList = new ArrayList<ArrayList <String>>();

        int cardsToDeal;

        cardsToDeal = deckSize - (deckSize%numOfPlayers);


        for (int k = 0; k < cardsToDeal; k++) {
            if (k % numOfPlayers == 0) {
                player3CardList.add(shuffledCard.get(k));
            }
            else if ( k % (numOfPlayers-1) == 0 ) {
                player2CardList.add(shuffledCard.get(k));
            }
            else {
                player1CardList.add(shuffledCard.get(k));
            }
        }

        distributedCards.add(player1CardList);
        distributedCards.add(player2CardList);
        distributedCards.add(player3CardList);
        return distributedCards;
    }


    public ArrayList<String> getCardSuits() {
        return cardSuits;
    }

    public void setCardSuits(ArrayList<String> cardSuits) {
        this.cardSuits = cardSuits;
    }

    public ArrayList<String> getCardValues() {
        return cardValues;
    }

    public void setCardValues(ArrayList<String> cardValues) {
        this.cardValues = cardValues;
    }
    public int getDeckSize() {
        return deckSize;
    }
    public void setDeckSize(int deckSize) {
        this.deckSize = deckSize;
    }



}
