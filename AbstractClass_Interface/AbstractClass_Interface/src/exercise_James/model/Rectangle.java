package exercise_James.model;

import exercise_James.inheritance.Geometry;
import exercise_James.inheritance.Resizeable;

public class Rectangle extends Geometry implements Resizeable {
    private double width = 1.0;
    private double length = 1.0;

    public Rectangle( double width, double length) {
        this.width = width;
        this.length = length;
    }

    public Rectangle() {
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    @Override
    public String toString() {
        return "Rectangle: " +
                "width= " + width +
                ", length= " + length + ", Area= " + getArea();
    }

    @Override
    public void resize(double percent) {
        this.width = this.width + this.width / 100 * percent;
        this.length = this.length + this.length / 100 * percent;
    }

    @Override
    public Double getArea() {
        return width * length;
    }
}
