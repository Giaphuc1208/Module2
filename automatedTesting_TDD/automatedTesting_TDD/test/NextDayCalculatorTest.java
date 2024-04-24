import nextdaycalculator.NextDayCalculator;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class NextDayCalculatorTest {

    @Test
    public void nextDayTestday1month1year2018(){
        int dayTest = 1;
        int monthTest = 1;
        int yearTest = 2018;
        String expected = "2/1/2018";
        String result = NextDayCalculator.getNextday(dayTest, monthTest, yearTest);
        assertEquals(result,expected);
    }

    @Test
    public void nextDayTestday31month1year2018(){
        int dayTest = 31;
        int monthTest = 1;
        int yearTest = 2018;
        String expected = "1/2/2018";
        String result = NextDayCalculator.getNextday(dayTest, monthTest, yearTest);
        assertEquals(result,expected);
    }
}
