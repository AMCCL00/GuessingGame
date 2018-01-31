package com.company;

import java.util.Scanner;

public class Game {
    Scanner yesNo = new Scanner(System.in);
    Scanner input = new Scanner(System.in);
    int number = (int) (Math.ceil(Math.random() * 100));
    int tries = 0;
    int wins = 0;
    int losses = 0;
    int numberOfTimes = 0;
    boolean playAgain = true;
    boolean retry = true;


    public void init() {
        // number of times a user has guessed and if they want to keep playing
        Utility.instructions();

        while (playAgain) {
            Utility.guess();
            // catching for any non-number input
            try {
                int userGuess = input.nextInt();
                if (userGuess > number) {
                    Utility.lower(numberOfTimes);
                    numberOfTimes += 1;
                } else if (userGuess < number) {
                    Utility.higher(numberOfTimes);
                    numberOfTimes += 1;
                } else if (userGuess == number) { //for replaying if the user guesses correctly
                    congrats();
                }
            } catch (Exception e) {
                input.nextLine();
                Utility.invalidGuess();
            }
            if (numberOfTimes >= 5){
                replay();
            }
        }
    }
    public void replay() {
        losses++;
        tries++;
        Utility.notEquals(number, tries, wins, losses);
        number = (int) (Math.ceil(Math.random() * 100));
        String playAgainThree = "";
        while(retry) {
            try {
                playAgainThree = yesNo.nextLine();
                if (playAgainThree.equals("N") || playAgainThree.equals("n")) {
                    Utility.no();
                    playAgain = false;
                    retry = false;
                } else if (playAgainThree.equals("Y") || playAgainThree.equals("y")) {
                    Utility.yes();
                    playAgain = true;
                    numberOfTimes = 0;
                    retry = false;
                    }
                    else {
                    Utility.invalid();
                }
            } catch (Exception e) {
                yesNo.nextLine();
            }
        }
    }
    public void congrats() {
        wins++;
        tries++;
        Utility.Win(tries, wins, losses);
        number = (int) (Math.ceil(Math.random() * 100));
        String playAgainTwo = yesNo.nextLine();
        while (retry) {
            try {
                playAgainTwo = yesNo.nextLine();
                if (playAgainTwo.equals("N") || playAgainTwo.equals("n")) {
                    Utility.no();
                    playAgain = false;
                    retry = false;
                } else if (playAgainTwo.equals("Y") || playAgainTwo.equals("y")) {
                    Utility.yes();
                    playAgain = true;
                    numberOfTimes = 0;
                    retry = false;
                } else {
                    Utility.invalid();
                }
            } catch (Exception e) {
                yesNo.nextLine();
            }
        }
    }
}
