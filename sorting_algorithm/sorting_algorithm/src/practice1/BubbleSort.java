package practice1;

import java.util.Scanner;

public class BubbleSort {
    Scanner input = new Scanner(System.in);
    static int[] list = {1,2,0,8,2,3,0,1,7,10};
    public static void bubbleSort(int[] list){
        boolean needNextPass = true;
        for (int k = 0; k < list.length && needNextPass; k++) {
            needNextPass = false;
            for (int i = 0; i < list.length - k; i++) {
                if(list[i] > list[i + 1]){
                    int temp = list[i];
                    list[i] = list[i + 1];
                    list[i + 1] = temp;

                    needNextPass = true;
                }
            }
        }
    }

    public static void main(String[] args) {
        bubbleSort(list);
        for (int i = 0; i < list.length; i++) {
            System.out.println(list[i] + " ");
        }
    }
}
