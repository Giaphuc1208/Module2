package Exercise.Optional_exercise;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class Palindrome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter String Check : ");
        String ipStr = scanner.nextLine();
        Stack<Character> stack= new Stack<>();
        Queue<Character> queue = new LinkedList<>();

        for (int i = 0; i < ipStr.length(); i++) {
            char convert = ipStr.charAt(i);
            stack.push(convert);
            queue.offer(convert);
        }
        System.out.println("Stack : " + stack);
        System.out.println("Queue : " + queue);
    }
}
