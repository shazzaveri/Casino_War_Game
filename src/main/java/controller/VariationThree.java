package controller;
import java.util.ArrayList;
import java.util.HashMap;
public class VariationThree {

    ArrayList< ArrayList <String> > cardsUsedDuringWar = new ArrayList< ArrayList <String> >();

    int player1CardValue, player2CardValue, player3CardValue;
    int p1Score,p2Score, p3Score;
    int j,k;
    StringBuilder sb = new StringBuilder();
    VariationThreeHelper gamePlay = new VariationThreeHelper();

    public String gameVariation3(ArrayList< ArrayList <String> > player1Cards, ArrayList< ArrayList <String> > player2Cards,
                               ArrayList< ArrayList <String> > player3Cards,
                               HashMap <String,Integer> cardValuesScore,
                               int numOfPlayers ,int deckSize)
    {

        for (int i = 0; i < player1Cards.size();  i++) {

            if(player1Cards.size() == 0 || player2Cards.size() == 0 || player3Cards.size() == 0) {
                break;
            }
            player1CardValue = cardValuesScore.get(player1Cards.get(i).get(1));
            player2CardValue = cardValuesScore.get(player2Cards.get(i).get(1));
            player3CardValue = cardValuesScore.get(player3Cards.get(i).get(1));

            sb.append("Sue Plays " + player1Cards.get(i).get(1) + " of " + player1Cards.get(i).get(0) + "\n");
            sb.append("Bryan Plays " + player2Cards.get(i).get(1) + " of " + player2Cards.get(i).get(0) + "\n");
            sb.append("Ron Plays " + player3Cards.get(i).get(1) + " of " + player3Cards.get(i).get(0) + "\n");

            if ( player1CardValue != player2CardValue && player1CardValue != player3CardValue && player2CardValue != player3CardValue) {
               checkWinner(player1Cards, player2Cards, player3Cards, player1CardValue , player2CardValue, player3CardValue, cardValuesScore,sb,i);
            }

            // STATE OF WAR
            else if ( player1CardValue == player2CardValue || player1CardValue == player3CardValue || player2CardValue == player3CardValue) {
                //IT IS WAR
                sb.append("***WAR!!!***" + "\n");
                while ( player1CardValue == player2CardValue || player1CardValue == player3CardValue || player2CardValue == player3CardValue ) {
                    j = i+2;

                    burnCardsDuringWar(player1Cards, player2Cards, player3Cards, j);

                    if ( player1Cards.size() == 0 || player2Cards.size() == 0 || player3Cards.size() == 0 ) {
                        break;
                    }

                    player1CardValue = cardValuesScore.get(player1Cards.get(i).get(1));
                    player2CardValue = cardValuesScore.get(player2Cards.get(i).get(1));
                    player3CardValue = cardValuesScore.get(player3Cards.get(i).get(1));
                    //create the list
                }
                if ( player1Cards.size() == 0 || player2Cards.size() == 0 || player3Cards.size() == 0 ) {
                    sb.append("Sue has a score of " + p1Score + "\n");
                    sb.append("Bryan has a score of " + p2Score + "\n");
                    sb.append("Ron has a score of " + p3Score + "\n");
                    break;
                }
                //updated i after burning and removing card
                player1CardValue = cardValuesScore.get(player1Cards.get(i).get(1));
                player2CardValue = cardValuesScore.get(player2Cards.get(i).get(1));
                player3CardValue = cardValuesScore.get(player3Cards.get(i).get(1));

                checkWinner(player1Cards, player2Cards, player3Cards, player1CardValue , player2CardValue, player3CardValue, cardValuesScore,sb,i);

            }
            i--;
            sb.append("Sue has a score of " + p1Score + "\n");
            sb.append("Bryan has a score of " + p2Score + "\n");
            sb.append("Ron has a score of " + p3Score + "\n");
        }

        sb.append(gamePlay.evaluateWinner(p1Score,p2Score,p3Score, player1Cards.size(),player2Cards.size(),player3Cards.size()));

        System.out.println(sb.toString());
        return sb.toString();
    }

    public void checkWinner(ArrayList<ArrayList<String>> player1Cards, ArrayList< ArrayList <String> > player2Cards,
                                     ArrayList< ArrayList <String> > player3Cards,
                                     int player1CardValue, int player2CardValue, int player3CardValue,
                                     HashMap<String,Integer> cardValuesScore, StringBuilder sb , int i) {

        if ( player1CardValue > player2CardValue && player1CardValue > player3CardValue) {
            sb.append("Sue wins the round!" + "\n");
            System.out.println("Sue wins the round!");
            p1Score+=2;
            player1Cards.remove(i);
            player2Cards.remove(i);
            player3Cards.remove(i);
        }

        else if(player2CardValue > player1CardValue && player2CardValue > player3CardValue) {
            // player2 wins
            sb.append("Bryan wins the round!" + "\n");
            p2Score+=2;
            player1Cards.remove(i);
            player2Cards.remove(i);
            player3Cards.remove(i);
        }

        else if(player3CardValue > player1CardValue && player3CardValue > player2CardValue) {
            //player3 Wins
            sb.append("Ron wins the round!" + "\n");
            p3Score+=2;
            player1Cards.remove(i);
            player2Cards.remove(i);
            player3Cards.remove(i);
        }
    }

    public void burnCardsDuringWar(ArrayList< ArrayList <String> > player1Cards, ArrayList< ArrayList <String> > player2Cards, ArrayList< ArrayList <String> > player3Cards, int j) {
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

        if (player3Cards.size() >= 2) {
            //face down card
            player3Cards.remove(j-2);
            //face up card
            player3Cards.remove(j-2);
        }
        else if (player3Cards.size() == 1) {
            player3Cards.remove(j-2);
        }

    }
}
