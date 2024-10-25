package blackjack;

import java.awt.*;
import java.util.Scanner;

public class BlackJack {
    public int startGame(int numPlayers){
        boolean continueGame = true;
        Player[] players = new Player[numPlayers];

        for (int i = 0; i < numPlayers; i++) {
            players[i] = new Player(); // Assuming Player has a default constructor
            players[i].setTotal((int) (Math.random() * 20) + 2);
            System.out.println("Player " + i + " total is " +players[i].getTotal());
        }



        for (int i =0; i < numPlayers; i++) {

            while (!players[i].isStuck() && !players[i].isBust()) {
                System.out.println("Player " + i + " stick (1) or twist (2)");
                Scanner scanner = new Scanner(System.in);
                int answer = scanner.nextInt();

                if (answer == 1) {
                    players[i].setStuck(true);
                    System.out.println("Player " + i + " has stuck");
                } else {
                    players[i].setTotal((int) (Math.random() * 12));
                    System.out.println("new total: " + players[i].getTotal());

                    if(players[i].getTotal() > 21){
                        players[i].setBust(true);
                        System.out.println("You are Bust");
                    }
                }
            }
        }

        int maxPos = -1;
        int[] endingVal = new int[numPlayers];
        int highestTotal = 0;

        for (int i = 0; i < numPlayers; i++){
            if (!players[i].isBust() && players[i].getTotal() > highestTotal){
                highestTotal = players[i].getTotal();
                maxPos = i;
            }
        }

        System.out.println("The winner is Player " + maxPos);





        return 1;
    }
}
