package practice2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayExample arrExample = new ArrayExample();
        Integer [] arr = arrExample.createRandom();

        Scanner input = new Scanner(System.in);
        System.out.println("\n Please enter any elements: ");
        int x = input.nextInt();
        try{
            System.out.println("Valueable of element have index " + x + " is " + arr[x]);
        } catch (IndexOutOfBoundsException e){
            System.out.println("Index exceeds array limit ");
        }
    }
}
