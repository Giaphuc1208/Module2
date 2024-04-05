import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*Xoá phần tử khỏi mảng*/
//        Scanner input = new Scanner(System.in);
//        int[] array = {2,4,5,8,12,54};
//        int[] newArr = new int[6];
//        int j = 0;
//        System.out.println("Index need delete : ");
//        int x = input.nextInt();
//        for (int i = 0; i  < array.length; i++) {
//            if (x != i){
//                newArr[j] = array[i];
//                j++;
//            }
//        }
//        System.out.println(Arrays.toString(newArr));

        /*Thêm phần tử vào mảng*/
//        Scanner input = new Scanner(System.in);
//        System.out.println("Enter the number of elements of an array");
//        int N = input.nextInt();
//        int[] arr = new int[N];
//        System.out.println("Import elements of an array: ");
//        for (int i = 0; i < N; i++) {
//            arr[i] = input.nextInt();
//        }
//        System.out.println("Enter the number to add: ");
//        int x = input.nextInt();
//        System.out.println("Enter the location you want to add");
//        int index = input.nextInt();
//        if (index <= -1 || index >= arr.length - 1) {
//            System.out.println("Failed to insert element into array");
//        } else {
//            for (int i = arr.length -1; i > index ; i--) {
//                arr[i] = arr[i - 1];
//            }
//            arr[index] = x;
//        }
//        System.out.println(Arrays.toString(arr));




        /*Gộp 2 mảng thành mảng 1 chiều*/
//        Scanner input = new Scanner(System.in);
//        int[] arr1 = new int[5];
//        int[] arr2 = new int[3];
//        int[] arr3 = new int[arr1.length + arr2.length];
//        System.out.println("Import elements of an array 1: ");
//        for (int i = 0; i < arr1.length; i++) {
//            arr1[i] = input.nextInt();
//            arr3[i] = arr1[i];;
//        }
//        System.out.println("Import elements of an array 2: ");
//        for (int i = 0; i < arr2.length; i++) {
//            arr2[i] = input.nextInt();
//            arr3[arr1.length + i] = arr2[i];
//        }
//        System.out.println("Array 3 includes: " + Arrays.toString(arr3));



        /*Tìm phần tử lớn nhất trong mảng hai chiều*/
//        Scanner input = new Scanner(System.in);
//        int[][] matrix = new int[3][3];
//        System.out.println("Enter " + matrix.length + " rows and " +
//                matrix[0].length + " columns: ");
//        for (int row = 0; row < matrix.length; row++) {
//            for (int column = 0; column < matrix[row].length; column++) {
//                matrix[row][column] = (int) (Math.random() * 100);
//            }
//        }
//        for (int row = 0; row < matrix.length; row++) {
//            for (int column = 0; column < matrix[row].length; column++) {
//                System.out.print(matrix[row][column] + " ");
//            }
//            System.out.print("\n");
//        }
//        int max = 0;
//        for (int i = 0; i < matrix.length; i++) {
//            for (int j = 0; j < matrix.length; j++) {
//                if (matrix[i][j]>max){
//                    max = matrix[i][j];
//                }
//            }
//        }
//        System.out.println("Max is: " + max);

        /*Tìm giá trị nhỏ nhất trong mảng*/
//        Scanner input = new Scanner(System.in);
//        System.out.println("Enter the number of elements of an array");
//        int N = input.nextInt();
//        int[] arr = new int[N];
//        System.out.println("Import elements of an array: ");
//        for (int i = 0; i < N; i++) {
//            arr[i] = input.nextInt();
//        }
//        int min = arr[0];
//        for (int i = arr[1]; i < arr.length ; i++) {
//            if(arr[i] < min){
//                min = arr[i];
//            }
//        }
//        System.out.println("Min is : " + min);

        /*"Tính tổng các số ở một cột xác định"*/
//        Scanner input = new Scanner(System.in);
//        System.out.println("Enter row and columns");
//        int N = input.nextInt();
//        int M = input.nextInt();
//        double[][] matrix = new double[N][M];
//        System.out.println("Enter " + matrix.length + " rows and " +
//                matrix[0].length + " columns: ");
//        for (int row = 0; row < matrix.length; row++) {
//            for (int column = 0; column < matrix[row].length; column++) {
//                matrix[row][column] = input.nextDouble();
//            }
//        }
//        for (int row = 0; row < matrix.length; row++) {
//            for (int column = 0; column < matrix[row].length; column++) {
//            }
//        }
//        for (int i = 0; i < matrix.length; i++) {
//            System.out.println(Arrays.toString(matrix[i]));
//        }
//        System.out.println("Enter the column u want :");
//        int columns = input.nextInt();
//        double sum = 0;
//        for (int i = 0; i < N; i++) {
//            sum += matrix[i][columns];
//        }
//        System.out.println("Sum of columns " + columns + " is " + sum);

        /*"Mảng hai chiều - tính tổng các số ở đường chéo chính của ma trận vuông"*/
//        Scanner input = new Scanner(System.in);
//        System.out.println("Enter row and columns");
//        int N = input.nextInt();
//        double[][] matrix = new double[N][N];
//        System.out.println("Enter " + matrix.length + " rows and " +
//                matrix[0].length + " columns: ");
//        for (int row = 0; row < matrix.length; row++) {
//            for (int column = 0; column < matrix[row].length; column++) {
//                matrix[row][column] = input.nextDouble();
//            }
//        }
//        for (int row = 0; row < matrix.length; row++) {
//            for (int column = 0; column < matrix[row].length; column++) {
//            }
//        }
//        System.out.println("Array:");
//        for (int i = 0; i < matrix.length; i++) {
//            System.out.println(Arrays.toString(matrix[i]));
//        }
//
//        /*Tính tổng các phần tử của một ma trận vuông*/
//        double sum = 0;
//        for (int i = 0; i < matrix.length; i++) {
//            for (int j = 0; j < matrix.length; j++) {
//                sum += matrix[i][j];
//            }
//        }
//        System.out.println("The sum of the elements is : " + sum);
//
//        /*Tính tổng các số ở đường chéo chính của ma trận vuông*/
//        double diogonal = 0;
//        for (int i = 0; i < N; i++) {
//            diogonal += matrix[i][i];
//        }
//        System.out.println("The sum number on the crossway is:  " + diogonal);

        /*Đếm số lần xuất hiện của ký tự trong chuỗi*/
        Scanner input = new Scanner(System.in);
        String str = "Codegym,C02G104JV01";
        System.out.println(str);
        System.out.println("Enter another letter : ");
        char letter = input.next().charAt(0);
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == letter){
                count++;
            }
        }
        System.out.println("Number of occurrences of letters " + letter +" in string is : " + count);
    }
}