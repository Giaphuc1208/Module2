package exercise_James.model;

import exercise_James.inheritance.Colorable;
import exercise_James.inheritance.Geometry;
import exercise_James.inheritance.Resizeable;


public class Square extends Geometry implements Resizeable, Colorable {
    private double length = 1;


    public Square(double length) {
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
    public void resize(double percent) {
        this.length = this.length+ this.length * percent / 100 ;
    }

    @Override
    public void howToColor() {
        System.out.println("Color all four sides");
    }

    @Override
    public Double getArea() {
        return length * length;
    }
}
