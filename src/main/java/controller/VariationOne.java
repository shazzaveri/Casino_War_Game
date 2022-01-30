package controller;



import java.util.ArrayList;
import java.util.HashMap;

public class VariationOne {
    int p1Score = 0;
    int p2Score = 0;
    int j;
    StringBuilder sb = new StringBuilder();



    public String gameVariation1(ArrayList< ArrayList <String> > player1Cards, ArrayList< ArrayList <String> > player2Cards, HashMap <String,Integer> cardValuesScore, int deckSize) {

        for  (int i = 0; i < player2Cards.size(); i++ ) {
            if(player1Cards.size() == 0 || player2Cards.size() == 0 ) {
                break;
            }
            sb.append("Sue Plays " + player1Cards.get(i).get(1) + " of " + player1Cards.get(i).get(0) + "\n");
            sb.append("Bryan Plays " + player2Cards.get(i).get(1) + " of " + player2Cards.get(i).get(0) + "\n");


            if (cardValuesScore.get(player1Cards.get(i).get(1)) != cardValuesScore.get(player2Cards.get(i).get(1))) {
                checkWinner(player1Cards, player2Cards, cardValuesScore, i);
            }


            // WAR STARTS
            else if ( cardValuesScore.get(player1Cards.get(i).get(1)) == cardValuesScore.get(player2Cards.get(i).get(1)) ) {
                sb.append("***WAR!!!***" + "\n");

                //IT IS WAR
                while ( cardValuesScore.get(player1Cards.get(i).get(1)) == cardValuesScore.get(player2Cards.get(i).get(1)) ) {

                    j=i+2;

                    burnCardsDuringWar(player1Cards, player2Cards, j);

                    if ( player1Cards.size() == 0 || player2Cards.size() == 0  ) {
                        break;
                    }

                }

//                if ( player1Cards.size() == 0 || player2Cards.size() == 0  ) {
//                    break;
//                }


                if ( player1Cards.size() > 0) {
                    checkWinner(player1Cards, player2Cards, cardValuesScore,i);
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

        return sb.toString();

    }

    public void checkWinner(ArrayList< ArrayList <String> > player1Cards, ArrayList< ArrayList <String> > player2Cards,
                            HashMap <String,Integer> cardValuesScore,  int i) {

        if ( cardValuesScore.get(player1Cards.get(i).get(1)) > cardValuesScore.get(player2Cards.get(i).get(1)) ) {
            sb.append("Sue wins the round!" + "\n");
            p1Score += 2;
            player1Cards.remove(i);
            player2Cards.remove(i);
        }
        else if ( cardValuesScore.get(player1Cards.get(i).get(1)) < cardValuesScore.get(player2Cards.get(i).get(1)) ){
            sb.append("Bryan wins the round!" + "\n");
            p2Score += 2;
            player1Cards.remove(i);
            player2Cards.remove(i);

        }

    }

    public void burnCardsDuringWar(ArrayList< ArrayList <String> > player1Cards, ArrayList< ArrayList <String> > player2Cards, int j) {

        if (player1Cards.size() >= 2) {
            player1Cards.remove(j-2);
            //face up card
            player1Cards.remove(j-2);
        }
        else if (player1Cards.size() == 1){
            player1Cards.remove(j-2);
        }


        if (player2Cards.size() >= 2) {
            //face down card
            player2Cards.remove(j-2);
            //face up card
            player2Cards.remove(j-2);
        }

        else if (player2Cards.size() == 1) {
            player2Cards.remove(j-2);
        }

    }
}
