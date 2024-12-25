import Exam.PowerCalculator;
import junit.framework.TestCase;
import org.testng.annotations.Test;

public class PowerCalculatorTest {

    @Test
    public void testCalculatePower() {
        PowerCalculator calculator = new PowerCalculator();

        // Test cases
        TestCase Assert = null;
        Assert.assertEquals(calculator.calculatePower(230.0, 5.0), 1150.0);
        Assert.assertEquals(calculator.calculatePower(0.0, 10.0), 0.0);
        Assert.assertEquals(calculator.calculatePower(120.0, 0.0), 0.0);
        Assert.assertEquals(calculator.calculatePower(12.0, 1.5), 18.0);
    }
}