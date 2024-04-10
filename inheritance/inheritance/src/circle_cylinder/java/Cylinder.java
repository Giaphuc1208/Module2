package circle_cylinder.java;

public class Cylinder extends Circle {
    private double height;

    public Cylinder(double radius, String color, double height) {
        super(radius, color);
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double volumetric(){
        return area() * height;
    }

    @Override
    public String toString() {
        return "Cylinder = {" +
                "height=" + height + ", " +
                 super.toString() + ", volumetric = " + volumetric() + '}';
    }

    public static void main(String[] args) {
        Circle circle = new Circle(4.2, "blue");
        System.out.println( "Circle = {radius = " + circle.getRadius() + " , Color : "+ circle.getColor() + " , area =" + circle.area()+"}");
        circle = new Cylinder(3.5, "red", 2.1);
        System.out.println(circle);
    }
}
