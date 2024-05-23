package Exercise.Optional_exercise;

import java.util.Scanner;
import java.util.Stack;

public class DecimalToBinary {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Decimal: ");
        int inputDecimal = scanner.nextInt();
        while (inputDecimal > 0){
            stack.push(inputDecimal % 2);
            inputDecimal /= 2;
        }
        System.out.println("Decimal To Binary :" );
        while (!stack.isEmpty()){
            System.out.println(stack.pop());
        }
    }
}
