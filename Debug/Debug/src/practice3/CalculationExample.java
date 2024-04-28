package practice3;

import java.util.Scanner;

public class CalculationExample {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter x: ");
        double x = input.nextInt();
        System.out.println("Enter y: ");
        double y = input.nextInt();
        CalculationExample calc = new CalculationExample();
        calc.calculate(x, y);
    }
    private void calculate(double x, double y){
        try{
            double addition = x + y;
            double subtraction = x - y;
            double multiplication = x * y;
            double division = x / y;
            System.out.println("Addition x + y = " + addition);
            System.out.println("Subtraction x - y = " + subtraction);
            System.out.println("Multiplication x * y = " + multiplication);
            System.out.println("Division x / y = " + division);
        } catch (Exception e){
            System.err.println("exceptional" + e.getMessage());
        }
    }
}
