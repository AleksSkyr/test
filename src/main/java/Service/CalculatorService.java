package Service;
import Exeption.DivideByZeroException;
import org.springframework.stereotype.Service;


@Service
public class CalculatorService {

    public static Number plus(double num1, double num2) {
        return num1 + num2;
    }

    public Number minus(double num1, double num2) {
        return num1 - num2;
    }

    public Number multiply(double num1, double num2) {
        return num1 * num2;
    }

    public Number divide(double num1, double num2) {
        if (num2 == 0) {
            throw new IllegalArgumentException();
        }
        return num1 / num2;
    }

}