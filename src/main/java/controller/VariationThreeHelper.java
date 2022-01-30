package controller;

import java.util.ArrayList;
import java.util.HashMap;

public class VariationThreeHelper {
    StringBuilder sb = new StringBuilder();
    public StringBuilder evaluateWinner(int p1Score, int p2Score, int p3Score , int player1DeckSize, int player2DeckSize,int player3DeckSize){
        if (p1Score > p2Score && p1Score > p3Score) {
            sb.append("Winner is Sue Hand : " + player1DeckSize + " Pile: " + p1Score + "\n");
            System.out.println("Winner is Sue Hand : " + player1DeckSize + " Pile: " + p1Score);
        }
        else if (p2Score > p1Score && p2Score > p3Score ){
            sb.append("Winner is Bryan Hand : " + player2DeckSize + " Pile: " + p2Score + "\n");
            System.out.println("Winner is Bryan Hand : " + player2DeckSize+ " Pile: " + p2Score);
        }
        else if (p3Score > p1Score && p3Score > p2Score ){
            sb.append("Winner is Ron Hand : " + player3DeckSize + " Pile: " + p3Score + "\n");
            System.out.println("Winner is Ron Hand : " + player3DeckSize + " Pile: " + p3Score);
        }
        else if (p1Score == p2Score && p2Score == p3Score) {
            sb.append("Its a Tie Game Between All Players" + "\n");
            System.out.println("Its a Tie Game Between All Players");
        }
        else if (p1Score == p2Score) {
            sb.append("Its a Tie Game Between Sue And Bryan" + "\n");
            System.out.println("Its a Tie Game");
        }
        else if (p1Score == p3Score) {
            sb.append("Its a Tie Game Sue And Ron" + "\n");
            System.out.println("Its a Tie Game");
        }
        else if (p2Score == p3Score) {
            sb.append("Its a Tie Game Between Bryan And Ron" + "\n");
            System.out.println("Its a Tie Game");
        }


        return sb;
    }
}
