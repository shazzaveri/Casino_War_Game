package model;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public class Cards {
    //public static void main(String[] args) {
    private int totalCards;
    //String[] array = {"Hearts", "Diamonds", "Clubs", "Spades"};
    private ArrayList<String> cardSuits = new ArrayList<String>(Arrays.asList("Hearts", "Diamonds", "Clubs", "Spades"));
    private ArrayList<String> cardValues = new ArrayList<String>(Arrays.asList("Ace", "King", "Queen", "Jack", "10","9",
            "8","7","6","5","4","3","2"));

    //totalCards = cardSuits.size() * cardValues.size();




    //		for(int i = 0;  i < cardSuits.size(); i++) {
//			for (int j = 0; j < cardValues.size(); j++) {
//				System.out.println(cardSuits.get(i) + " " + cardValues.get(j));
//			}
//		}
//	}
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
}
