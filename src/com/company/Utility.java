package com.company;

public class Utility {
    public static void Win(int tries, int wins, int losses){
        System.out.println("Congradulations! You guessed correctly. You have played " + tries +" time(s), " + wins + " win(s), "+ losses + " loss(es). Would you like to play again? Y/N. ");
    }
    public static void higher(int numberOfTimes){
        System.out.println("Your guess was too low, guess again. You have: " + (4 - numberOfTimes) + " guesses remaining. \n");
    }
    public static void lower(int numberOfTimes){
        System.out.println("Your guess was too high, guess again. You have: " + (4 - numberOfTimes) + " guesses remaining. \n");
    }
    public static void invalidGuess(){
        System.out.println("That is not a number. Try again... \n");
    }
    public static void instructions(){
        System.out.println("Welcome to the Guessing Game! \nGuess a number between 1 and 100, you have 5 guesses. \n");
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
        System.out.println("Sorry! The answer was " + number + ". You have played " + tries + " time(s), " + wins + " win(s), " + losses + " loss(es). Would you like to play again? Y/N. ");
    }
    public static void invalid(){
        System.out.println("Y or N ......");
    }

}
