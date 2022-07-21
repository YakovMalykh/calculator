import org.assertj.core.internal.bytebuddy.asm.Advice;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import pro.sky.java.course2.calculator.CalculatorServiceImpl;

import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static pro.sky.java.course2.calculator.CalculatorServiceImplTestConstans.*;

public class CalculatorServiceImplParametrizedTest {

    private final CalculatorServiceImpl out = new CalculatorServiceImpl();

    public static List<Arguments> provideParamsForTest() {
        return List.of(
                Arguments.of(NUM1, NUM2)
        );
    }

    @ParameterizedTest
    @MethodSource("provideParamsForTest")
    public void shouldReturnCorrectSumString(int num1, int num2) {
        String result = out.plusCalculate(num1, num2);
        assertEquals(CORRECT_SUM_STRING, result);
    }

    @ParameterizedTest
    @MethodSource("provideParamsForTest")
    public void shouldReturnCorrectMinusString(int num1, int num2) {
        String result = out.minusCalculate(num1, num2);
        assertEquals(CORRECT_MINUS_STRING, result);
    }

    @ParameterizedTest
    @MethodSource("provideParamsForTest")
    public void shouldReturnCorrectMultiplyString(int num1, int num2) {
        String result = out.multiplyCalculate(num1, num2);
        assertEquals(CORRECT_MULTIPLY_STRING, result);
    }

    @ParameterizedTest
    @MethodSource("provideParamsForTest")
    public void shouldReturnCorrectDivideString(int num1, int num2) {
        String result = out.divideCalculate(num1, num2);
        assertEquals(CORRECT_DIVIDE_STRING, result);
    }


    @Test
    public void shouldThrowIlligalArgumentExceptionWhenDividedByZero() {
        assertThrows(IllegalArgumentException.class, () -> out.divideCalculate(NUM1, ZERO));
    }
}
