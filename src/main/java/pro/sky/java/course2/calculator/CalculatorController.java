package pro.sky.java.course2.calculator;

import org.springframework.lang.NonNull;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/calculator")
public class CalculatorController {
    private final CalculatorServiceImpl calculatorServiceImpl;

    public CalculatorController(CalculatorServiceImpl calculatorServiceImpl) {
        this.calculatorServiceImpl = calculatorServiceImpl;
    }

    @GetMapping()
    public String hello() {
        return calculatorServiceImpl.greeting();
    }

    @GetMapping("/plus")
    public String plusCalc(@RequestParam int num1, @RequestParam int num2) {
        return calculatorServiceImpl.plusCalculate(num1, num2);
    }

    @GetMapping("/minus")
    public String minusCalc(@RequestParam int num1, @RequestParam int num2) {
        return calculatorServiceImpl.minusCalculate(num1, num2);
    }

    @GetMapping("/multiply")
    public String multiplyCalc(@RequestParam int num1, @RequestParam int num2) {
        return calculatorServiceImpl.multiplyCalculate(num1, num2);
    }

    @GetMapping("/divide")
    public String divideCalc(@RequestParam int num1, @RequestParam int num2) {
        return calculatorServiceImpl.divideCalculate(num1, num2);
    }

}
