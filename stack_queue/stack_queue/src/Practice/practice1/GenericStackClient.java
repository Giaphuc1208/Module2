package Practice.practice1;

import static Practice.practice1.MyGenericStack.stackOfIntegers;
import static Practice.practice1.MyGenericStack.stackOfStrings;

public class GenericStackClient {
    public static void main(String[] args) {
        System.out.println("1. Stack of strings");
        stackOfStrings();
        System.out.println("2. Stack of integers");
        stackOfIntegers();
    }
}
