package coffee;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public void start() {

        System.out.println(begin());

        Scanner input = new Scanner(System.in);

        try {
            System.out.println(getChoice(input.nextInt()));
        } catch (InputMismatchException e) {
            System.out.println("Error: Input a number");
        }
    }
    public String getChoice(int option) {
        if (option == 1)
            return choiceOne();

        else if (option == 2)
            return choiceTwo();

        else
            return invalid();
    }
    public String begin() {
        return ("\nYou are in a land full of dragons. In front of you,\n" +
                "you see two caves. In one cave, the dragon is friendly\n" +
                "and will share his treasure with you. The other dragon\n" +
                "is greedy and hungry and will eat you on sight!\n" +
                "Which cave will you go into? choose 1 or 2..\n");
    }
    public String choiceOne() {
        return ("\nYou approach the cave...\n" +
                "And a bright beam of light appears!\n" +
                "Next thing you know, you're on the back of a large (but friendly) dragon!\n" +
                "You and your new dragon friend soar off into the infinite realm with his treasure, never to be seen again...");
    }
    public String choiceTwo() {
        return ("\nYou approach the cave...\n" +
                "It is dark and spooky...\n" +
                "A large dragon jumps out in front of you! He opens his jaws and...\n" +
                "Gobbles you down in one bite!\n");
    }
    public String invalid() {
        return ("\nYou made an invalid choice...choose 1 or 2\n");
    }
    public static void main(String[] args) {
        new Main().start();
    }
}
