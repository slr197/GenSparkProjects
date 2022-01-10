import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    void correctguess() {
        assertEquals("Less than.", Main.correctguess(1,7));
        assertEquals("More than.", Main.correctguess(8,7));
        assertEquals("Equal to.", Main.correctguess(7,7));

    }
}