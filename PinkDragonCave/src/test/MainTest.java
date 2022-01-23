package test;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.*;

import java.Main;

import static org.junit.jupiter.api.Assertions.assertEquals;


class MainTest {

    Main main;

    @BeforeEach
    void setUp() {
        main = new Main();
    }

    @Test
    void start() {
        assertEquals("\nYou are in a land full of dragons. In front of you,\n\" +\n" +
                "                \"you see two caves. In one cave, the dragon is friendly\n\" +\n" +
                "                \"and will share his treasure with you. The other dragon\n\" +\n" +
                "                \"is greedy and hungry and will eat you on sight!\n\" +\n" +
                "                \"Which cave will you go into? choose 1 or 2..\n", main.begin());
    }

    @Test
     void getChoice() {
        assertEquals(main.choiceOne(), main.getChoice(1));
        assertEquals(main.choiceTwo(), main.getChoice(2));
    }

    @Test
    void begin() {
        assertEquals("\nYou are in a land full of dragons. In front of you,\n\" +\n" +
                "                \"you see two caves. In one cave, the dragon is friendly\n\" +\n" +
                "                \"and will share his treasure with you. The other dragon\n\" +\n" +
                "                \"is greedy and hungry and will eat you on sight!\n\" +\n" +
                "                \"Which cave will you go into? choose 1 or 2..\n", main.begin());
    }

    @Test
    void choiceOne() {
        assertEquals("\nYou approach the cave...\n\" +\n" +
                "                \"And a bright beam of light appears!\n\" +\n" +
                "                \"Next thing you know, you're on the back of a large (but friendly) dragon!\n\" +\n" +
                "                \"You and your new dragon friend soar off into the infinite realm with his treasure, never to be seen again...",main.choiceOne());
    }

    @Test
    void choiceTwo() {
        assertEquals("\nYou approach the cave...\n\" +\n" +
                "                \"It is dark and spooky...\n\" +\n" +
                "                \"A large dragon jumps out in front of you! He opens his jaws and...\n\" +\n" +
                "                \"Gobbles you down in one bite!\n",main.choiceTwo());
    }

    @Test
    void invalid() {
        assertEquals("\nYou made an invalid choice...choose 1 or 2\n", main.invalid());
    }

    // @Test
    //    void main() {
    //   }
    @AfterEach
    void tearDown() {
    }
}