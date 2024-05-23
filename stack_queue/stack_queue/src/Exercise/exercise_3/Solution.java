package Exercise.exercise_3;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
      Queue queue = new Queue();
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 4 ; i++) {
            queue.enDeque(Integer.parseInt(scanner.nextLine()));
        }

        System.out.println("Initial Queue: ");
        queue.displayQueue();

        System.out.println("Dequeuing element: " + queue.deQueue());
        System.out.println("Dequeuing element: " + queue.deQueue());

        System.out.println("Queue after dequeue:");
        queue.displayQueue();

    }
}
/*queue.enDeque(1);
      queue.enDeque(2);
      queue.enDeque(3);
      queue.enDeque(4);
      queue.enDeque(5);
      queue.enDeque(6);
      queue.enDeque(4);*/