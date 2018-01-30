package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Main Game = new Main();
        Game.game();
    }

    Scanner yesNo = new Scanner(System.in);
    Scanner input = new Scanner(System.in);
    int number = (int) (Math.ceil(Math.random() * 100));
    int tries = 0;
    int wins = 0;
    int losses = 0;
    int numberOfTimes = 0;
    boolean playAgain = true;


    public void game() {
        // number of times a user has guessed and if they want to keep playing
        Utility.instructions();

        while (playAgain) {
            Utility.guess();
            // catching for any non-number input
            try {
                int userGuess = input.nextInt();
                if (userGuess > number) {
                    Utility.lower();
                    numberOfTimes += 1;
                } else if (userGuess < number) {
                    Utility.higher();
                    numberOfTimes += 1;
                } else if (userGuess == number) { //for replaying if the user guesses correctly
                    wins ++;
                    tries ++;
                    Utility.Win(tries, wins, losses);
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
                        Utility.invalid();
                        playAgain = false;
                    }
                }
            } catch (Exception e) {
                input.nextLine();
                Utility.invalidGuess();
                numberOfTimes = 0;
            }
            if (numberOfTimes >= 5){
                replay();
            }
        }
    }
    public void replay(){
        String playAgainThree = "";
        losses ++;
        tries++;
        Utility.notEquals(number, tries, wins, losses);
        playAgainThree = yesNo.nextLine();
        number = (int) (Math.ceil(Math.random() * 100));
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
