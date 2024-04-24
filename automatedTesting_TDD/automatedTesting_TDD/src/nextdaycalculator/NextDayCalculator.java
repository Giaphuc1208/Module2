package nextdaycalculator;

public class NextDayCalculator {

    public static final String Concatenation = "/";

    public static String getNextday(int dayTest, int monthTest, int yearTest) {
        int nextDay = dayTest + 1;
        String result = nextDay + Concatenation + monthTest + Concatenation + yearTest;
        return result;
    }
}
