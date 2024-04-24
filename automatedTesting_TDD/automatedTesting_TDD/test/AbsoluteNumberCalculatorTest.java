import org.junit.Test;
import practice2.AbsoluteNumberCalculator;

import static org.junit.Assert.assertEquals;

public class AbsoluteNumberCalculatorTest {
    @Test
    public void findAbsoluteWith0(){
        int number = 0;
        int expected = 0;

        AbsoluteNumberCalculator calc = new AbsoluteNumberCalculator();
        int actual = calc.findAbsolute(number);
        assertEquals(expected, actual);
    }
    @Test
    public void findtAbsolueWithPositive(){
        int number = 2;
        int expected = 2;

        AbsoluteNumberCalculator positive = new AbsoluteNumberCalculator();
        int actual = positive.findAbsolute(number);
        assertEquals(expected,actual);
    }
    @Test
    public void findAbsolueWithNegative(){
        int number = -1;
        int expected = 1;
        AbsoluteNumberCalculator negative = new AbsoluteNumberCalculator();
        int actual = negative.findAbsolute(number);
        assertEquals(expected,actual);
    }

}
