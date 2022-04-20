package org.example;

import java.util.Scanner;

public class Play {
    String playerName;
    private int playerScore;
    private int computerScore;
    boolean winner = false;
    int min = 1;
    public void print() {


        String[] pack = {"rock", "paper", "scissors"};
        System.out.println("Please enter your name");
        Scanner scanner = new Scanner(System.in);
        String player = scanner.next();
        System.out.println("Playing game....!");
        playerName = player;

        while (winner == false) {
            int random = (int) Math.floor(Math.random() * ( pack.length - min + 1));
            System.out.println("Please enter your choice:");



            String playerChoice = scanner.next();
            String computerChoice = pack[random];



            if(playerChoice.equals(computerChoice)){
                System.out.println("It's a tie!");
            }

            if ((computerChoice.equals("scissors") && playerChoice.equals("paper")) || (computerChoice.equals("rock") && playerChoice.equals("scissors")) || (computerChoice.equals("paper") && playerChoice.equals("rock")))

            {

                if (computerScore == 3)
                {
                    System.out.println("Computer won!");
                    winner = true;
                }
                else
                {
                    computerScore++;


                }
            }
            else if((playerChoice.equals("scissors") && computerChoice.equals("paper")) || (playerChoice.equals("rock") && computerChoice.equals("scissors")) || (playerChoice.equals("paper") && computerChoice.equals("rock")))

            {

                if (playerScore == 3) {
                    System.out.println(playerName + " won!");
                    winner = true;
                } else {
                    playerScore++;


                }
            }
        }

    }
}




