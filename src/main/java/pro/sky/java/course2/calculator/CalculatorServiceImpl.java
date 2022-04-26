package pro.sky.java.course2.calculator;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;

@Service
public class CalculatorServiceImpl implements CalculatorService {

    public String greeting() {
        return "Добро пожаловать в калькулятор";
    }

    public String plusCalculate(int num1, int num2) {
        int result = num1 + num2;
        return num1 + " + " + num2 + " = " + result;
    }

    public String minusCalculate(int num1, int num2) {
        int result = num1 - num2;
        return num1 + " - " + num2 + " = " + result;
    }

    public String multiplyCalculate(int num1, int num2) {
        int result = num1 * num2;
        return num1 + " * " + num2 + " = " + result;
    }

    public String divideCalculate(int num1, int num2) {
        if (num2 == 0) {
            return "на 0 делить нельзя";
        } else {
            float result = num1 / (float) num2;
            return num1 + " / " + num2 + " = " + result;
        }
    }

}
