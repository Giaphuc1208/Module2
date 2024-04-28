package practice1;

import java.util.Scanner;

public class LinearEquationResolver {
    public static void main(String[] args) {
        System.out.println("Linear equation resolver: ");
        System.out.println("Given a equation as 'a * x + b = 0', please enter constants:");

        Scanner input = new Scanner(System.in);

        System.out.println("Enter a: ");
        double a = input.nextDouble();
        System.out.println("Enter b: ");
        double b = input.nextDouble();

        if (a != 0 ){
            double soluction = -b / a;
            System.out.println("The solution is: " + soluction);
        } else {
            if (b == 0){
                System.out.println("The soluction is all x!");
            } else {
                System.out.println("No soluction!");
            }
        }
    }
}
