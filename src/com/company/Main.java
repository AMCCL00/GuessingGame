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
        int numberOfTimes = 0;
        boolean playAgain = true;
        int number = (int)Math.ceil(Math.random() * 100);
        while (playAgain) {
            System.out.println("Enter Your Guess: ");
            int userGuess = input.nextInt();

            if (numberOfTimes >= 5){
                System.out.println("Sorry! Would you like to play again?");
                String playAgainThree = input.nextLine();
                if (playAgainThree.equals("no")){
                    System.out.println("Have a nice day!");
                    playAgain = false;
                }
                else if (!playAgainThree.equals("yes") || !playAgainThree.equals("no")) {
                    System.out.println("Ending Program due to invalid response");
                    playAgain = false;
                }
                else if (playAgainThree.equals("yes")) {
                    System.out.println("Great!");
                    playAgain = true;
                    numberOfTimes = 0
                }
            }

            else if (userGuess > number) {
                System.out.println("Your guess was too high, try again!");
                numberOfTimes = numberOfTimes + 1;
            }
            else if(userGuess < number) {
                System.out.println("Your guess was too low, try again!");
                numberOfTimes = numberOfTimes + 1;
            }
            else {
                System.out.println("Congratulations!, you guessed correctly, Would you like to play again?");
                String playAgainTwo = input.nextLine();
                if (playAgainTwo.equals("no")){
                    System.out.println("Have a nice day!");
                    playAgain = false;
                }
                else if (!playAgainTwo.equals("yes") || !playAgainTwo.equals("no")) {
                    System.out.println("Ending Program due to invalid response");
                    playAgain = false;
                }
                else if (playAgainTwo.equals("yes")){
                    System.out.println("Great!");
                    playAgain = true;
                }
            }
        }
    }
}
