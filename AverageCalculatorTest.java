import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class AverageCalculatorTest {

    @Test
    public void averageOfNumsTest() {
        int num1 = 1;
        int num2 = 2;
        int num3 = 3;
        int expected = 2;
        int actual = AverageCalculator.averageOfNums(num1, num2, num3);
        assertEquals(expected, actual);
    }

}