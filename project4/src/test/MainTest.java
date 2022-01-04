
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    private Person test;

    @Test
    void getAge(){
        assertEquals(10, test.getAge(), "get Age equals 10");
    }

    @Test
    void getName(){
        assertEquals("Test", test.getName(), "Name == name");
    }

    @AfterEach
    void tearDown(){}
}