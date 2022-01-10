
import java.util.Scanner;

public class Main {
    public static String correctguess(int userguess, int secretnumber) {
        if (userguess < secretnumber ) {
            return "Less than.";
        }
        else if (userguess > secretnumber) {
            return "More than.";
        }
        return "Equal to.";
}
    public static void main(String[] args) {

        boolean game = true;
        System.out.println("Lets Play!");

        while(game) {

            int guessingNumber = 0;
            int guesstheNumber = 0;
            int numTries = 6;
            String res = "";
            guessingNumber = (int) (Math.random() * 3 + 1);

            Scanner keyboard = new Scanner(System.in);
            do {

                System.out.println("Enter a number between 1 - 20.");

                try {
                    guesstheNumber = keyboard.nextInt();
                    System.out.println("Hmm...");
                } catch (Exception e) {
                    System.out.println("Caught Exception: Unexpected Input");
                }

                if (guesstheNumber == guessingNumber) {
                    System.out.println("You guessed the number right!");
                    System.out.println("Would you like to play again? y or n?");
                    res = keyboard.nextLine();
                    try {
                        res = keyboard.nextLine();
                        System.out.println("Hmm...");
                    } catch (Exception e) {
                        System.out.println("Caught Exception: Unexpected Input");
                    }
                    if (res.equals("n")) {
                        game = false;
                    }
                } else if (guesstheNumber < guessingNumber) {
                    System.out.println("Your guess is smaller than the guessing number.");
                    numTries--;
                } else if (guesstheNumber > guessingNumber) {
                    System.out.println("Your guess is greater than the guessing number.");
                    numTries--;
                }

            } while ((guesstheNumber != guessingNumber && (numTries > 0)));
            System.out.println(guesstheNumber);
        }
        //keyboard.close();
    }
}