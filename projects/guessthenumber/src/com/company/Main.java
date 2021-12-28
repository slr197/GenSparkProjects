package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        boolean game = true;
        while(game) {
            int guessingNumber;
            int guesstheNumber;
            int numTries = 6;
            String res;
            guessingNumber = (int) (Math.random() * 3 + 1);
            // scanner means =
            Scanner keyboard = new Scanner(System.in);
            do {
                System.out.println("TIME TO PLAYYYY!");
                //keyboard.nextInt =
                System.out.println("Enter a number between 1 - 20.");
                guesstheNumber = keyboard.nextInt();
                if (guesstheNumber == guessingNumber) {
                    System.out.println("You guessed the number right!");
                    System.out.println("Would you like to play again y or n?");
                    res = keyboard.next();
                    //.equals=
                    if (res.equals("n")) {
                        game = false;
                    }
                } else if (guesstheNumber < guessingNumber) {
                    System.out.println("Your guess is smaller than the number.");
                    numTries--;
                } else if (guesstheNumber > guessingNumber) {
                    System.out.println("Your guess is greater than the secret number.");
                    numTries--;
                }
            } while ((guesstheNumber != guessingNumber) && (numTries > 0));
            System.out.println(guesstheNumber);
        }
    }
}
