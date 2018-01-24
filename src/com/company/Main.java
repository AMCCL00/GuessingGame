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
        boolean playAgain = true;
        while (playAgain = true) {
            System.out.println("Enter Your Guess: ");
            int userGuess = input.nextInt();

            int number = (int)Math.ceil(Math.random() * 100);

            if (userGuess > number) {
                System.out.println("Your guess was too high, try again!");
            }
            if(userGuess < number) {
                System.out.println("Your guess was too low, try again!");
            }
            else {
                System.out.println("Congratulations!, you guessed correctly, Would you like to play again? 1 for Yes and 2 for No");
                String playAgainTwo = input.nextLine();
                if (playAgainTwo.equals("no")){

                }
                if (!playAgainTwo.equals("yes") || !playAgainTwo.equals("no")) {
                    System.out.println("Ending Program due to invalid response");
                    break;

                }
            }
        }
    }
}
