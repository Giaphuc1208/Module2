package homework_exercise;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SearchElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of array elements: ");
        int n = scanner.nextInt();

        List<Integer> list = new ArrayList<>();
        System.out.println("Enter elements of array: ");
        for (int i = 0; i < n; i++) {
            int e = scanner.nextInt();
            list.add(e);
        }

        System.out.println("Enter element need to find: ");
        int x = scanner.nextInt();
        int index = list.indexOf(x);
        if (index != -1){
            System.out.println("Element: " + x + "found at index: " + index);
        } else {
            System.out.println("Element: " + x + "not found in array");
        }
    }
}
