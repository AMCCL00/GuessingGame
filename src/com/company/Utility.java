package com.company;

public class Utility {
    public static void Win(int tries, int wins, int losses){
        System.out.println("Congradulations! You guessed correctly. You have played " + tries +" times, " + wins + " wins, "+ losses + " losses. Would you like to play again? Y/N. \n");
    }
    public static void higher(){
        System.out.println("Your guess was too low, guess again. \n");
    }
    public static void lower(){
        System.out.println("Your guess was too high, guess again. \n");
    }
    public static void invalidGuess(){
        System.out.println("This is not a number. \n");
    }
    public static void instructions(){
        System.out.println("Guess a number between 1 and 100, you have 5 guesses. \n");
    }
    public static void restart(){
        System.out.println("Would you like to play again? Y/N. \n");
    }
    public static void guess(){
        System.out.print("Enter your guess: \n");
    }
    public static void yes(){
        System.out.print("Great! \n");
    }
    public static void no(){
        System.out.print("Have a nice day! \n");
    }
    public static void notEquals(int number, int tries, int wins ,int losses) {
        System.out.println("Sorry! The answer was " + number + ". You have played " + tries + " times, " + wins + " wins, " + losses + " losses. Would you like to play again? Y/N. \n");
    }

}
