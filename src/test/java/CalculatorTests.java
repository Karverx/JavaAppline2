import calculator.Calculator;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorTests {
    private Calculator calculator = new Calculator();

    @Test
    public void addsTwoNumbers() {
        assertEquals(8, calculator.calc(6,2,'+'), 0);
    }

    @Test
    public void subtractsTwoNumbers() {
        assertEquals(4, calculator.calc(6, 2, '-'), 0);
    }

    @Test
    public void multipliesTwoNumbers() {
        assertEquals(12, calculator.calc(6, 2, '*'), 0);
        assertEquals(0, calculator.calc(6, 0, '*'), 0);
    }

    @Test
    public void dividesTwoNumbers() {
        assertEquals(3, calculator.calc(6, 2, '/'), 0);
        assertEquals(1.5, calculator.calc(3, 2, '/'), 0);

    }

    @Test(expected = ArithmeticException.class)
    public void dividesOnZero() {
       calculator.calc(2, 0, '/');
    }

}
