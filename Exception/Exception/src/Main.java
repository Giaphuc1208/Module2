import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a = 0;
        double b = 0;
        double c = 0;
        try{
            System.out.println("Enter a: ");
            a = scanner.nextDouble();
            System.out.println("Enter b: ");
            b = scanner.nextDouble();
            System.out.println("Enter c: ");
            c = scanner.nextDouble();
        } catch (InputMismatchException ime){
            System.err.println("Please enter number!!!");
        }
        try {
            if (a <= 0 || b <= 0 || c <= 0 || a + c > b || c + b <= a){
                throw new IllegalTriangleException("Not a Triangle");
            }
        } catch (IllegalTriangleException e){
            System.out.println(e.getMessage());
        }
    }
}