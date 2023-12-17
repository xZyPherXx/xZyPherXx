
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class UnitTest {

    @Test
    void addUnitTest() {

        Calculator calculator = new Calculator();
        assertTrue(calculator.operation("+", 2, 2) == 4);
    }

    @Test
    void subtractUnitTest() {

        Calculator calculator = new Calculator();
        assertTrue(calculator.operation("-", 2, 2) == 0);
    }

    @Test
    void multiplyUnitTest() {

        Calculator calculator = new Calculator();
        assertTrue(calculator.operation("*", 2, 2) == 4);
        assertTrue(calculator.operation("x", 2, 2) == 4);
    }

    @Test
    void divisionUnitTest() {

        Calculator calculator = new Calculator();
        assertTrue(calculator.operation("division", 2, 2) == 1);
    }

}
