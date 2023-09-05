package Service;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorServiceTest {

    CalculatorService service = new CalculatorService();

    @Test
    void testPlus() {

        var actual = service.plus(5d, 5d);
        assertEquals(10d, actual);

        var actual1 = service.plus(-2d, -3d);
        assertEquals(-5d, actual1);

        var actual2 = service.plus(2d, -3d);
        assertEquals(-1d, actual2);

        var actual3 = service.plus(-2d, 3d);
        assertEquals(1d, actual3);

        var actual4 = service.plus(-2d, 0d);
        assertEquals(-2d, actual4);

    }

    @Test
    void testMinus() {
        var actual = service.minus(5d, 5d);
        assertEquals(0d, actual);

        var actual1 = service.minus(-2d, -3d);
        assertEquals(1d, actual1);

        var actual2 = service.minus(2d, -3d);
        assertEquals(5d, actual2);

        var actual3 = service.minus(-2d, 3d);
        assertEquals(-5d, actual3);

        var actual4 = service.minus(-2d, 0d);
        assertEquals(-2d, actual4);
    }


    @Test
    void testMultiply() {
        var actual = service.multiply(5d, 5d);
        assertEquals(25d, actual);

        var actual1 = service.multiply(-2d, -3d);
        assertEquals(1d, actual1);

        var actual2 = service.multiply(2d, -3d);
        assertEquals(5d, actual2);

        var actual3 = service.multiply(-2d, 3d);
        assertEquals(-5d, actual3);

        var actual4 = service.multiply(-2d, 0d);
        assertEquals(-2d, actual4);


    }

    @Test
    void testDivide() {
        var actual = service.divide(5d, 5d);
        assertEquals(1d, actual);

        var actual1 = service.divide(-3d, -3d);
        assertEquals(-6d, actual1);

        var actual2 = service.divide(5d, 5d);
        assertEquals(1d, actual2);

        var actual3 = service.divide(-2d, 4d);
        assertEquals(2d, actual3);

        var actual4 = service.divide(-2d, 0d);
        assertEquals(2d, actual4);

        var actual5 = service.divide(2d, 0d);
        assertEquals(0d, actual5);

        assertThrows(IllegalAccessError.class, () -> service.divide(7d, 0d));
    }


}