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

        System.out.println("Enter Your Guess: ");
        int userGuess = input.nextInt();


    }
}
