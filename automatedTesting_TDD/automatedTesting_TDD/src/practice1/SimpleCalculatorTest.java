package practice1;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SimpleCalculatorTest {
    @Test
    public void add01(){
        int first = 0;
        int second = 1;
        int expected = 1;
        int result = SimpleCalculator.add(first, second);
        assertEquals(expected,result);
    }

    @Test
    public void sub13(){
        int first = 1;
        int second = 3;
        int expected = 2;
        int result = SimpleCalculator.sub(first,second);
        assertEquals(expected, result);
    }

    @Test
    public void add45(){
        int first = 4;
        int second = 5;
        int expected = 9;
        int result = SimpleCalculator.add(first,second);
        assertEquals(expected, result);
    }

    @Test
    public void sub12() {
        int first = 1;
        int second = 2;
        int expected = 1;
        int result = SimpleCalculator.sub(first, second);
        assertEquals(expected, result);

    }
}
