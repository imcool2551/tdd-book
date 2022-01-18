package chap01;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTest {

    @Test
    void plus() {
        int result = Caculator.plus(1, 2);
        assertEquals(3, result);
        assertEquals(5, Caculator.plus(1, 4));
    }
}
