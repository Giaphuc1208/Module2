package baitapslack;

public class Circle {
    private int id;
    private double radius;
    private final static double pi = 3.14;
    private static int count = 0;
    private static double maxRadius = 0;
    private static double sum = 0;

    public Circle(double radius) {
        this.id = ++count;
        this.radius = radius;
        if (radius > maxRadius) {
            maxRadius = radius;
        }
        sum += area();
    }

    public static int getCount() {
        return count;
    }

    public double area() {
        return 2 * pi * radius;
    }

    public double perimeter() {
        return pi * radius * radius;
    }

    public static double getMaxRadius() {
        return maxRadius;
    }

    public static double getSum() {
        return sum;
    }

}
