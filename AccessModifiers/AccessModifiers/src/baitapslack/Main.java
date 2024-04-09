package baitapslack;

public class Main {
    public static void main(String[] args){
        Circle circle1 = new Circle(5.5);
        Circle circle2 = new Circle(4);
        Circle circle3 = new Circle(9);
        Circle circle4 = new Circle(2.6);
        System.out.println("Quanity of Circle : " + Circle.getCount());
        System.out.println("Area :" + circle1.area());
        System.out.println("perimeter :" + circle1.perimeter());
        System.out.println("Area :" + circle2.area());
        System.out.println("Perimeter :" + circle2.perimeter());
        System.out.println("Area :" + circle3.area());
        System.out.println("Perimeter :" + circle3.perimeter());
        System.out.println("Area :" + circle4.area());
        System.out.println("Perimeter :" + circle4.perimeter());
        System.out.println("Circle with the largest radius :" + Circle.getMaxRadius());
        System.out.println("The sum area of circles = " + Circle.getSum());
    }
}
