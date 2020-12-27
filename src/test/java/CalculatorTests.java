import calculator.Calculator;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorTests {
    private Calculator calculator = new Calculator();

    @Test
    public void addsTwoNumbers() {
        assertEquals(8.0, calculator.calc(6.0,2.0,'+'), 0);
    }

    @Test
    public void subtractsTwoNumbers() {
        assertEquals(4.0, calculator.calc(6.0, 2.0, '-'), 0);
    }

    @Test
    public void multipliesTwoNumbers() {
        assertEquals(12.0, calculator.calc(6.0, 2.0, '*'), 0);
    }

    @Test
    public void dividesTwoNumbers() {
        assertEquals(3.0, calculator.calc(6.0, 2.0, '/'), 0);

    }
}
