import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        /*Bài tập tạo hình chữ nhật :
        System.out.println("Enter the length :");
        double length = input.nextDouble();
        System.out.println("Enter the width :");
        double width = input.nextDouble();
        Rectangle rectangle = new Rectangle(length , width);
        System.out.println("Rectangle "+rectangle.display());
        System.out.println("Area = " +rectangle.area());
        System.out.println("Perimetter "+ rectangle.perimetter());*/

        /*Xây dựng lớp QuadraticEquation (Phương trình bậc hai)
        System.out.println("Enter a, b, c");
        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();
        QuadraticEquation quadraticEquation = new QuadraticEquation(a, b, c);
        System.out.println("Delta = " + quadraticEquation.getDiscriminant());
        if (quadraticEquation.getDiscriminant() > 0){
            System.out.println("root 1 = " + quadraticEquation.getRoot1());
            System.out.println("root 2 = " + quadraticEquation.getRoot2());
        } else if (quadraticEquation.getDiscriminant() == 0) {
            System.out.println("The equation has 1 root " + quadraticEquation.getRoot1() +" "+ quadraticEquation.getRoot2());
        } else
            System.out.println("The equation has no real roots");*/

        /*[Bài tập] Xây dựng lớp StopWatch*/

        /*[Bài tập] Xây dựng lớp Fan*/
        Fan fan1 = new Fan();
        fan1.setSpeed(fan1.fast);
        fan1.setRadius(10);
        fan1.setColor("Yellow");
        fan1.setOn(true);

        Fan fan2 = new Fan();
        fan2.setSpeed(fan2.fast);
        fan2.setRadius(5);
        fan2.setColor("Blue");
        fan2.setOn(false);

        System.out.println("Fan 1 :");
        System.out.println(fan1.toString());
        System.out.println();

        System.out.println("Fan 2: ");
        System.out.println(fan2.toString());
    }
}