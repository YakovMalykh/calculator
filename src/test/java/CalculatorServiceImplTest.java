import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import pro.sky.java.course2.calculator.CalculatorService;
import pro.sky.java.course2.calculator.CalculatorServiceImpl;
import pro.sky.java.course2.calculator.CalculatorServiceImplTestConstans;

import static org.junit.jupiter.api.Assertions.*;
import static pro.sky.java.course2.calculator.CalculatorServiceImplTestConstans.*;

public class CalculatorServiceImplTest {

    private final CalculatorServiceImpl out = new CalculatorServiceImpl();

    @Test
    public void shouldReturnCorrectGreeting() {
        String result = out.greeting();
        assertEquals(CORRECT_GREETING, result);
    }

    @Test
    public void shouldReturnCorrectSumString() {
        String result = out.plusCalculate(NUM1, NUM2);
        assertEquals(CORRECT_SUM_STRING, result);
    }

    @Test
    public void souldReturnCorrectMinusString() {
        String result = out.minusCalculate(NUM1, NUM2);
        assertEquals(CORRECT_MINUS_STRING, result);
    }

    @Test
    public void shouldReturnCorrectMutiplyString() {
        String result = out.multiplyCalculate(NUM1, NUM2);
        assertEquals(CORRECT_MULTIPLY_STRING, result);
    }

    @Test
    public void shouldReturnCorrectDivideString() {
        String result = out.divideCalculate(NUM1, NUM2);
        assertEquals(CORRECT_DIVIDE_STRING, result);
    }

    @Test
    public void shouldThrowIlligalArgumentExceptionWhenDividedByZero() {
        assertThrows(IllegalArgumentException.class, () -> out.divideCalculate(NUM1, ZERO));
    }
}
