package pro.sky.java.course2.calculator;

public interface CalculatorService {
    String greeting();
    String plusCalculate(int num1, int num2);
    String minusCalculate(int num1, int num2);
    String multiplyCalculate(int num1, int num2);
    String divideCalculate(int num1, int num2);
}
