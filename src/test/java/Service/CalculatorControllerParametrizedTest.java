package Service;

import net.bytebuddy.asm.MemberSubstitution;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class CalculatorControllerParametrizedTest {

    CalculatorService service = new CalculatorService();

    private static List<Arguments> parameter() {
        return List.of(
                Arguments.of(5, 5),
                Arguments.of(-2d, -3d),
                Arguments.of(2d, -3d),
                Arguments.of(-2d, 3d),
                Arguments.of(-2d, 1d));
    }

    @ParameterizedTest
    @MethodSource("parameter")
    void test(double num1, double num2) {
        assertEquals(num1 + num2 ,service.plus(num1, num2));
        assertEquals(num1 - num2 ,service.minus(num1, num2));
        assertEquals(num1 * num2 ,service.multiply(num1, num2));
        assertEquals(num1 / num2 ,service.divide(num1, num2));

    }

    @Test
    void testZeroDivide() {

        assertThrows(IllegalAccessError.class, () -> service.divide(7d, 0d));
    }


}
