package controller;
import java.util.ArrayList;
import java.util.HashMap;
public class VariationTwo {

    //int numOfIterations = 15;
    ArrayList< ArrayList <String> > cardsUsedDuringWar;
    int j;
    String winner = "";
    int k;
    int p1Score, p2Score;
    StringBuilder sb = new StringBuilder();

    public String gameVariation2(ArrayList< ArrayList <String> > player1Cards, ArrayList< ArrayList <String> > player2Cards, HashMap <String,Integer> cardValuesScore,
                               int deckSize, int numOfIterations) {
        for (int i = 0; k < numOfIterations; i++) {
            k++;

            if(player1Cards.size() == 0 || player2Cards.size() == 0 ) {
                break;
            }
            sb.append("Sue Plays " + player1Cards.get(i).get(1) + " of " + player1Cards.get(i).get(0) + "\n");
            sb.append("Bryan Plays " + player2Cards.get(i).get(1) + " of " + player2Cards.get(i).get(0) + "\n");

            if (cardValuesScore.get(player1Cards.get(i).get(1)) != cardValuesScore.get(player2Cards.get(i).get(1))) {
                checkWinner(player1Cards, player2Cards, cardValuesScore,i);
            }
            // STATE OF WAR
            else if ( cardValuesScore.get(player1Cards.get(i).get(1)) == cardValuesScore.get(player2Cards.get(i).get(1)) ) {
                //IT IS WAR
                sb.append("***WAR!!!***" + "\n");
                cardsUsedDuringWar = new ArrayList< ArrayList <String> >();
                while ( cardValuesScore.get(player1Cards.get(i).get(1)) == cardValuesScore.get(player2Cards.get(i).get(1)) ) {
                    k++;
                    j = i+2;

                    burnCardsDuringWar(player1Cards, player2Cards, cardsUsedDuringWar, j);

                    if (player1Cards.size() == 0 || player2Cards.size() == 0 ) {
                        break;
                    }
                }
                if (player1Cards.size() == 0 || player2Cards.size() == 0 ) {
                    sb.append("Sue has a score of " + p1Score + "\n");
                    sb.append("Bryan has a score of " + p2Score + "\n");
                    break;
                }
                if ( cardValuesScore.get(player1Cards.get(i).get(1)) > cardValuesScore.get(player2Cards.get(i).get(1)) ) {
                    //adds player 2 cards to his deck and his own cards to the deck faced Up
                    sb.append("Sue wins the round!" + "\n");
                    p1Score+=2;
                    player1Cards.add(player2Cards.get(i));
                    player1Cards.add(player1Cards.get(i));
                    player1Cards.addAll(cardsUsedDuringWar);
                    p1Score+=cardsUsedDuringWar.size();
                    player1Cards.remove(i);
                    player2Cards.remove(i);

                }
                else if (cardValuesScore.get(player1Cards.get(i).get(1)) < cardValuesScore.get(player2Cards.get(i).get(1))) {
                    //adds player 1 cards to his deck and his own cards to the deck faced Up
                    sb.append("Bryan wins the round!" + "\n");
                    p2Score+=2;
                    player2Cards.add(player2Cards.get(i));
                    player2Cards.add(player1Cards.get(i));
                    player2Cards.addAll(cardsUsedDuringWar);
                    p2Score+=cardsUsedDuringWar.size();
                    player1Cards.remove(i);
                    player2Cards.remove(i);
                }


            }
            i--;

            sb.append("Sue has a score of " + p1Score + "\n");
            sb.append("Bryan has a score of " + p2Score + "\n");
        }

        if (p1Score > p2Score) {
            sb.append("Winner is Sue Hand : " + player1Cards.size() + " Pile: " + p1Score + "\n");
        }
        else if (p1Score < p2Score){
            sb.append("Winner is Bryan Hand : " + player2Cards.size() + " Pile: " + p2Score + "\n");
        }
        else if (p1Score == p2Score) {
            sb.append("Its a Tie Game" + "\n");
        }

        System.out.println(sb.toString());
        return sb.toString();

    }
    public void checkWinner(ArrayList< ArrayList <String> > player1Cards, ArrayList< ArrayList <String> > player2Cards,
                            HashMap <String,Integer> cardValuesScore, int i) {

        if ( cardValuesScore.get(player1Cards.get(i).get(1)) > cardValuesScore.get(player2Cards.get(i).get(1)) ) {
            //adds player 2 cards to his deck and his own cards to the deck faced Up
            sb.append("Sue wins the round!" + "\n");
            p1Score+=2;
            player1Cards.add(player2Cards.get(i));
            player1Cards.add(player1Cards.get(i));
            player1Cards.remove(i);
            player2Cards.remove(i);
        }
        else if (cardValuesScore.get(player1Cards.get(i).get(1)) < cardValuesScore.get(player2Cards.get(i).get(1))) {
            //adds player 1 cards to his deck and his own cards to the deck faced Up
            sb.append("Bryan wins the round!" + "\n");
            p2Score+=2;
            player2Cards.add(player2Cards.get(i));
            player2Cards.add(player1Cards.get(i));
            player1Cards.remove(i);
            player2Cards.remove(i);
        }

    }
    public void burnCardsDuringWar(ArrayList< ArrayList <String> > player1Cards, ArrayList< ArrayList <String> > player2Cards,
                                   ArrayList< ArrayList <String> > cardsUsedDuringWar,int j) {

        if (player2Cards.size() >= 2) {
            //face down card
            cardsUsedDuringWar.add(player2Cards.get(j-2));
            player2Cards.remove(j-2);
            //face up card
            cardsUsedDuringWar.add(player2Cards.get(j-2));
            player2Cards.remove(j-2);
        }

        else if (player2Cards.size() == 1) {
            cardsUsedDuringWar.add(player2Cards.get(j-2));
            player2Cards.remove(j-2);
        }

        if (player1Cards.size() >= 2) {
            cardsUsedDuringWar.add(player1Cards.get(j-2));
            player1Cards.remove(j-2);
            //face up card
            cardsUsedDuringWar.add(player1Cards.get(j-2));
            player1Cards.remove(j-2);
        }
        else if (player1Cards.size() == 1){
            cardsUsedDuringWar.add(player1Cards.get(j-2));
            player1Cards.remove(j-2);
        }


    }
}
