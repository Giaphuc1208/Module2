package exercise_James.model;

import exercise_James.inheritance.Colorable;
import exercise_James.inheritance.Geometry;


public class Square extends Geometry implements Colorable {
    private double length = 1.0;


    public Square() {
        this.length = length;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    @Override
    public String toString() {
        return "Square: " +
                "length= " + length + ", Area= " + getArea();
    }


    @Override
    public void howToColor() {
        System.out.println("Color all four sides");
    }

    @Override
    public Double getArea() {
        return Math.pow(length, 2);
    }
}
