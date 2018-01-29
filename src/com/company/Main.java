package com.company;

import javax.rmi.CORBA.Util;
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
        Utility.instructions();
        int number = (int)(Math.ceil(Math.random() * 100));
        while (playAgain) {
            Utility.guess();
            try {
                int userGuess = input.nextInt();
                if (userGuess > number) {
                    Utility.lower();
                    numberOfTimes +=  1;
                } else if(userGuess < number) {
                    Utility.higher();
                    numberOfTimes += 1;
                } else {
                    tries += 1;
                    wins += 1;
                     Utility.Win(tries,wins,losses);
                    String playAgainTwo = yesNo.nextLine();
                    number = (int) (Math.ceil(Math.random() * 100));
                    if (playAgainTwo.equals("N") || playAgainTwo.equals("n")) {
                        Utility.no();

                        playAgain = false;
                    } else if (playAgainTwo.equals("Y") || playAgainTwo.equals("y")) {
                        Utility.yes();
                        playAgain = true;
                        numberOfTimes = 0;
                    } else {
                        Utility.invalidGuess();
                        playAgain = false;
                    }
                }
            }
            catch (Exception e){
                Utility.invalidGuess();
                break;
            }
            if (numberOfTimes >= 5) {
                tries += 1;
                losses += 1;
                String playAgainThree = " ";
                Utility.notEquals(number, tries, wins, losses);
                playAgainThree = yesNo.nextLine();
                number = (int)(Math.ceil(Math.random() * 100));
                if (playAgainThree.equals("N") || playAgainThree.equals("n")) {
                    Utility.no();
                    playAgain = false;
                } else if (playAgainThree.equals("Y") || playAgainThree.equals("y")) {
                    Utility.yes();
                    playAgain = true;
                    numberOfTimes = 0;
                } else {
                    Utility.invalidGuess();
                    playAgain = false;
                }
            }
        }
    }
}