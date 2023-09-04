package controller;

import Service.CalculatorService;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


import java.util.Objects;

@RestController
@RequestMapping("/calculator")
public class CalculatorController {
    private final CalculatorService calculator = new CalculatorService();
    @GetMapping
    public String hello() {
        return "<h3>Добро пожаловать калькулятор</h3>";
    }

    @GetMapping("/plus")
    public String plus(@RequestParam double num1, @RequestParam double num2) {
        return num1 + " + " + num2 + " = " + calculator.plus(num1, num2);
    }

    @GetMapping("/minus")
    public String minus(@RequestParam double num1, @RequestParam double num2) {
        return num1 + " - " + num2 + " = " + calculator.minus(num1, num2);
    }

    @GetMapping("/multiply")
    public String multiply(@RequestParam double num1, @RequestParam double num2) {
        if (num2 == 0) {
            return "Умножать на 0 нельзя";
        }
        return num1 + " * " + num2 + " = " + calculator.multiply(num1, num2);
    }

    @GetMapping("/divide")
    public String divide(@RequestParam double num1, @RequestParam double num2) {
        if (num2 == 0) {
            return "Делить на 0 нельзя";
        }
        return num1 + " / " + num2 + " = " + calculator.divide(num1, num2);
    }
}
