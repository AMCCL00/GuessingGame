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
        int numberOfTimes = 0;
        boolean playAgain = true;
        int number = (int)(Math.ceil(Math.random() * 100));
        while (playAgain) {
            System.out.println("Enter Your Guess: ");
            int userGuess = input.nextInt();

            if (numberOfTimes >= 4){
                String playAgainThree = " ";
                System.out.println("Sorry! The answer was " + number + ". Would you like to play again? Y/N");
                playAgainThree = yesNo.nextLine();
                if (playAgainThree.equals("N")){
                    System.out.println("Have a nice day!");
                    playAgain = false;
                }
                else if (playAgainThree.equals("Y")) {
                    System.out.println("Great!");
                    playAgain = true;
                    numberOfTimes = 0;
                }
                else {
                    System.out.println("Ending Program due to invalid response");
                    playAgain = false;
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
                System.out.println("Congratulations!, you guessed correctly, Would you like to play again? Y/N");
                String playAgainTwo = yesNo.nextLine();
                if (playAgainTwo.equals("N")){
                    System.out.println("Have a nice day!");
                    playAgain = false;
                }
                else if (playAgainTwo.equals("Y")){
                    System.out.println("Great!");
                    playAgain = true;
                }
                else {
                    System.out.println("Ending Program due to invalid response");
                    playAgain = false;
                }
            }
        }
    }
}
