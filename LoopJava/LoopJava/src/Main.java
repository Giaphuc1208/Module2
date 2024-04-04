import java.util.Scanner;

public class Main {
//    public static void main(String[] args) {
    /*[Bài tập] Hiển thị các loại hình*/
//        /*The rectangle*/
//        int a = 3;
//        int b = 7;
//        for (int i = 0; i < a; i++) {
//            for (int j = 0; j < b; j++) {
//                System.out.print("* ");
//            }
//            System.out.println();
//        }
//
//        /*The square triangle bottom-left*/
//        System.out.println();
//        int n = 5;
//        for (int i = 0; i < n; i++) {
//            for (int j = 0; j <= i; j++) {
//                System.out.print("* ");
//            }
//            System.out.println();
//        }
//
//        /*The square triangle top-left*/
//        System.out.println();
//        for (int i = n; i >= 1; i--) {
//            for (int j = 1; j <= i; j++) {
//                System.out.print("* ");
//            }
//            System.out.println();
//        }
//
//        /*The square triangle top-right*/
//        System.out.println();
//        for (int i = 1; i <= 5; i++) {
//            System.out.println();
//            for (int j = 1; j <= 5 - i; j++) {
//                System.out.print("  ");
//            }
//            for (int j = 1; j <= i; j++) {
//                System.out.print("* ");
//            }
//        }
//
//        /*The square triangle bottom-right*/
//        System.out.println();
//        for (int i = 1; i <= n; i++) {
//            System.out.println();
//            for (int j = 1; j <= i - 1; j++) {
//                System.out.print("  ");
//            }
//            for (int j = 0; j <= n - i; j++) {
//                System.out.print("* ");
//            }
//        }
//
//        /*The isosceles triangle*/
//        System.out.println();
//        for (int i = 0; i < n; i++) {
//            System.out.println();
//            for (int j = 0; j < i; j++) {
//                System.out.print(" ");
//            }
//            for (int j = i; j < n; j++) {
//                System.out.print("* ");
//            }
//        }
    /*[Bài tập]: Hiển thị 20 số nguyên tố đầu tiên */
//        int number = 2;
//        int count = 0;
//        System.out.println("String of 20 prime numbers :");
//        while(count < 20){
//            if (isPrime(number)){
//                System.out.println(number + " ");
//                count++;
//            }
//            number++;
//        }
//    }
//    public static boolean isPrime(int number) {
//        if (number <= 1) {
//            return false;
//        }
//
//        for (int i = 2; i <= number / 2; i++) {
//            if (number % i == 0) {
//                return false;
//            }
//        }
//        return true;
//    }
//    }

    /*[Bài tập]: Hiển thị các số nguyên tố nhỏ hơn 100*/
    public static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }
        for (int i = 2; i <= number / 2; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
    public static void main (String[] args) {
        int count = 0;
        int numbers = 2;
        System.out.println("An integer less than 100 is :");
        while (numbers < 100){
            if (isPrime(numbers)){
                System.out.println(numbers + " ");
                count++;
            }
            numbers++;
        }
    }
}

