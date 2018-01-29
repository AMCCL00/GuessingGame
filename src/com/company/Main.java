package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //1. Allow user to input a number(guess)
        //2. Tell the user if their guess is too high or too low.
        //3. Allow for 5 chances, if the number isn't guessed, tell them what it is.
        //4. If the number is guessed, congratulate them.
        //5. Allow them to play again if they would like.

        Scanner input = new Scanner(System.in);
        Scanner yesNo = new Scanner(System.in);
        int tries = 0;
        int wins = 0;
        int losses = 0;
        int numberOfTimes = 0;
        boolean playAgain = true;
        int number = (int)(Math.ceil(Math.random() * 100));
        while (playAgain) {
            System.out.println("Enter Your Guess: ");
            try {
                int userGuess = input.nextInt();
                if (userGuess > number) {
                    System.out.println("Your guess was too high, try again!");
                    numberOfTimes +=  1;
                } else if(userGuess < number) {
                    System.out.println("Your guess was too low, try again!");
                    numberOfTimes += 1;
                } else {
                    tries += 1;
                    wins += 1;
                    System.out.println("Congratulations!, you guessed correctly. You have played " + tries + " times. " + wins + " wins, " + losses + " losses. Would you like to play again? Y/N");
                    String playAgainTwo = yesNo.nextLine();
                    number = (int) (Math.ceil(Math.random() * 100));
                    if (playAgainTwo.equals("N") || playAgainTwo.equals("n")) {
                        System.out.println("Have a nice day!");

                        playAgain = false;
                    } else if (playAgainTwo.equals("Y") || playAgainTwo.equals("y")) {
                        System.out.println("Great!");
                        playAgain = true;
                        numberOfTimes = 0;
                    } else {
                        System.out.println("Ending Program due to invalid response");
                        playAgain = false;
                    }
                }
            }
            catch (Exception e){
                System.out.println("That isn't a number.");
                break;
            }
            if (numberOfTimes >= 5) {
                tries += 1;
                losses += 1;
                String playAgainThree = " ";
                System.out.println("Sorry! The answer was " + number + ". You have played " + tries + " times." + wins + " Wins, " + losses + " losses. Would you like to play again? Y/N ");
                playAgainThree = yesNo.nextLine();
                number = (int)(Math.ceil(Math.random() * 100));
                if (playAgainThree.equals("N") || playAgainThree.equals("n")) {
                    System.out.println("Have a nice day!");
                    playAgain = false;
                } else if (playAgainThree.equals("Y") || playAgainThree.equals("y")) {
                    System.out.println("Great!");
                    playAgain = true;
                    numberOfTimes = 0;
                } else {
                    System.out.println("Ending Program due to invalid response");
                    playAgain = false;
                }
            }
        }
    }
}