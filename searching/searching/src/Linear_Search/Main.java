package Linear_Search;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] arr ={1, 7, 9, 0, 2, 2 ,2};
        int x = input.nextInt();
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x){
                count++;
            }
        }
        System.out.println("Numbers of times :" + count);
    }
}