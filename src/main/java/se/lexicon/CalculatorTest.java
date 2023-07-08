package se.lexicon;
// CalculatorTest.java
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CalculatorTest {
    private Calculator calculator;

    @BeforeEach
    public void setUp() {
        calculator = new Calculator();
    }

    @Test
    public void testAdd() {
        int result = calculator.add(3, 5);
        Assertions.assertEquals(8, result);
    }

    @Test
    public void testSubtract() {
        int result = calculator.subtract(10, 4);
        Assertions.assertEquals(6, result);
    }
}
