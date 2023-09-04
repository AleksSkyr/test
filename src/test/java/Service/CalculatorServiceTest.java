//package Service;
//
//import org.junit.jupiter.api.Test;
//
//import static org.junit.jupiter.api.Assertions.*;
//
//class CalculatorServiceTest {
//
//    CalculatorService service = new CalculatorService();
//
//    @Test
//    void testPlus() {
//        var actual = service.plus(1d, 2d);
//        assertEquals(3d, actual);
//
//        var actual1 = service.plus(-2d, -3d);
//        assertEquals(-5d, actual);
//
//        var actual2 = service.plus(2d, -3d);
//        assertEquals(-1d, actual);
//
//        var actual3 = service.plus(-2d, 3d);
//        assertEquals(7d, actual);
//
//        var actual4 = service.plus(-2d, 0d);
//        assertEquals(-2d, actual);
//
//    }
//}

//    @Test
//    void testMinus() {
//        var actual = service.minus(1d, 2d);
//        assertEquals(-1d, actual);
//
//        var actual1 = service.minus(-2d, -3d);
//        assertEquals(-1d, actual);
//
//        var actual2 = service.minus(2d, -3d);
//        assertEquals(5d, actual);
//
//        var actual3 = service.minus(-2d, 3d);
//        assertEquals(-5d, actual);
//
//        var actual4 = service.minus(-2d, 0d);
//        assertEquals(-2d, actual);
//    }
//}

//    @Test
//    void multiply() {
//        var actual = service.plus(2d,5d);
//        assertEquals(7d, actual);
//
//        var actual1 = service.plus(2d,2d);
//        assertEquals(4d, actual1);
//
//        var actual2 = service.plus(5d,5d);
//        assertEquals(25d, actual2);
//
//        var actual3 = service.plus(2d,0d);
//        assertEquals(0d, actual3);
//
//        var actual4 = service.plus(5d,3d);
//        assertEquals(15d, actual4);
//    }
//
//    @Test
//    void divide() {
//        var actual = service.plus(1d,2d);
//        assertEquals(3d, actual);
//
//        var actual1 = service.plus(-3d,-3d);
//        assertEquals(1d, actual1);
//
//        var actual2 = service.plus(6d,-3d);
//        assertEquals(-6d, actual2);
//
//        var actual3 = service.plus(-2d,4d);
//        assertEquals(-8d, actual3);
//
//        var actual4 = service.plus(-2d,0d);
//        assertEquals(-0d, actual3);
//
//        var actual5 = service.plus(0d,2d);
//        assertEquals(0d, actual4);
//    }
//}