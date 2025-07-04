
import org.example.StringCalculator;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class StringCalculatorTest {
    StringCalculator calculator = new StringCalculator();

    @Test
    void testEmptyString() {
        assertEquals(0, calculator.add(""));
    }

    @Test
    void testSingleNumber() {
        assertEquals(7, calculator.add("7"));
    }

    @Test
    void testTwoNumbers() {
        assertEquals(10, calculator.add("4,6"));
    }

    @Test
    void testMultipleNumbers() {
        assertEquals(15, calculator.add("2,3,4,6"));
    }

    @Test
    void testNewlineAsDelimiter() {
        assertEquals(6, calculator.add("1\n2,3"));
    }
}
