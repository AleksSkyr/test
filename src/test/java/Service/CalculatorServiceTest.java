package Service;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorServiceTest {

    CalculatorService service = new CalculatorService();

    @Test
    void testPlus() {
        var actual = service.plus(2d,5d);
        assertEquals(7d, actual);

        var actual1 = service.plus(2d,2d);
        assertEquals(4d, actual);

        var actual2 = service.plus(5d,5d);
        assertEquals(10d, actual);

        var actual3 = service.plus(2d,6d);
        assertEquals(7d, actual);

        var actual4 = service.plus(-5d,3d);
        assertEquals(-8d, actual);
    }

    @Test
    void minus() {
        var actual = service.plus(2d,5d);
        assertEquals(-3d, actual);

        var actual1 = service.plus(-2d,-3d);
        assertEquals(-5d, actual1);

        var actual2 = service.plus(5d,5d);
        assertEquals(0d, actual2);

        var actual3 = service.plus(2d,6d);
        assertEquals(-4d, actual3);

        var actual4 = service.plus(-5d,3d);
        assertEquals(-8d, actual4);
    }

    @Test
    void multiply() {
        var actual = service.plus(2d,5d);
        assertEquals(10d, actual);

        var actual1 = service.plus(2d,2d);
        assertEquals(4d, actual1);

        var actual2 = service.plus(5d,5d);
        assertEquals(25d, actual2);

        var actual3 = service.plus(2d,0d);
        assertEquals(0d, actual3);

        var actual4 = service.plus(5d,3d);
        assertEquals(15d, actual4);
    }

    @Test
    void divide() {
        var actual = service.plus(2d,5d);
        assertEquals(0.4d, actual);

        var actual1 = service.plus(2d,2d);
        assertEquals(1d, actual1);

        var actual2 = service.plus(-3d,2d);
        assertEquals(-1.5d, actual2);

        var actual3 = service.plus(-2d,0d);
        assertEquals(-0d, actual3);

        var actual4 = service.plus(0d,2d);
        assertEquals(0d, actual4);
    }
}