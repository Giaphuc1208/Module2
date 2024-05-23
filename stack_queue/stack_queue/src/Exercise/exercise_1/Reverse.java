package Exercise.exercise_1;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

public class Reverse {
    public static void main(String[] args) {

        // Reverse number
        Stack<Integer> stack = new Stack<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        for (int i = 0; i < 5; i++) {
            Integer integer = scanner.nextInt();
            stack.push(integer);
        }
        System.out.println("Reverse number ");
        while (!stack.isEmpty()){
            System.out.println(stack.pop());
        }
        // Reverse string
        Stack<String> stackStr = new Stack<>();
        Scanner scStr = new Scanner(System.in);
        System.out.println("Enter String ");
        String string = scStr.nextLine();

        String[] stringArr = string.split(" ");
        for (String item : stringArr) {
            stackStr.push(item);
        }

        System.out.println("Reverse String ");
        while (!stackStr.isEmpty()) {
            System.out.print(Arrays.toString(stackStr.pop().split(" ")));
        }
}
}
