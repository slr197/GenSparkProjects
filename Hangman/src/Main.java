    import java.io.File;
    import java.util.ArrayList;
    import java.util.Scanner;

    public class Main {
        public static void main(String[] args) throws Exception {

            System.out.println(" Greetings human! Let's tango with Hangman..");
            File Dictionary = new File("C:\\HangMan\\Hangman\\engmix.txt");

            Scanner textScanner = new Scanner(Dictionary);
            Scanner input = new Scanner(System.in);

            ArrayList<String> words = new ArrayList<>();
            while (textScanner.hasNextLine()) {
                words.add(textScanner.nextLine());
            }
            String hidden_text = words.get((int) (Math.random() * words.size()));
            char[] textArray = hidden_text.toCharArray();

            char[] myAnswers = new char[textArray.length];
            for (int i = 0; i < textArray.length; i++) {
                myAnswers[i] = '?';
            }

            boolean finished = false;
            int lives =6;

            while (finished == false) {
                System.out.println("------------------------------");

                String letter = input.next();

                while (letter.length() != 1 || Character.isDigit(letter.charAt(0))) {
                    System.out.println("Uh oh! Try Again!");
                    letter = input.next();
                }

                boolean found = false;
                for (int i = 0; i < textArray.length; i++) {
                    if (letter.charAt(0) == textArray[i]) {
                        myAnswers[i] = textArray[i];
                        found = true;
                    }
                }

                if (!found) {
                    lives--;

                    System.out.println("Wrong Letter");
                }

                boolean done = true;
                for (int i = 0; i < myAnswers.length; i++) {
                    if (myAnswers[i] == '?') {
                        System.out.println(" _");
                        done = false;
                    } else {
                        System.out.println(" " + myAnswers[i]);
                    }
                }
                System.out.println("\n" + "lives left: " + lives);
                drawHangman(lives);

                if (done) {
                    System.out.println("Congrats you're smart!");
                    finished = true;
                }

                if (lives <= 0) {
                    System.out.println("Oh no. Try again next time..");
                    finished = true;
                }
            }
        }
        public static void drawHangman(int l) {
            if(l == 6) {
                System.out.println("|----------");
                System.out.println("|");
                System.out.println("|");
                System.out.println("|");
                System.out.println("|");
                System.out.println("|");
                System.out.println("|");
            }
            else if(l == 5) {
                System.out.println("|----------");
                System.out.println("|    O");
                System.out.println("|");
                System.out.println("|");
                System.out.println("|");
                System.out.println("|");
                System.out.println("|");
            }
            else if(l == 4) {
                System.out.println("|----------");
                System.out.println("|    O");
                System.out.println("|    |");
                System.out.println("|");
                System.out.println("|");
                System.out.println("|");
                System.out.println("|");
            }
            else if(l == 3) {
                System.out.println("|----------");
                System.out.println("|    O");
                System.out.println("|   -|");
                System.out.println("|");
                System.out.println("|");
                System.out.println("|");
                System.out.println("|");
            }
            else if(l == 2) {
                System.out.println("|----------");
                System.out.println("|    O");
                System.out.println("|   -|-");
                System.out.println("|");
                System.out.println("|");
                System.out.println("|");
                System.out.println("|");
            }
            else if(l == 1) {
                System.out.println("|----------");
                System.out.println("|    O");
                System.out.println("|   -|-");
                System.out.println("|   /");
                System.out.println("|");
                System.out.println("|");
                System.out.println("|");
            }
            else{
                System.out.println("|----------");
                System.out.println("|    O");
                System.out.println("|   -|-");
                System.out.println("|   /|");
                System.out.println("|");
                System.out.println("|");
                System.out.println("|");
            }
        }
    }