package exercise_James.model;

import exercise_James.inheritance.Geometry;
import exercise_James.inheritance.Resizeable;

public class Circle extends Geometry implements Resizeable{
    private double radius = 1.0;



    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public String toString() {
        return "Circle: " +
                "radius= " + radius + ", Area= " + getArea();
    }

    @Override
    public void resize(double percent) {
        this.radius = this.radius * percent/100 + this.radius;
    }

    @Override
    public Double getArea() {
        return radius * radius * Math.PI;
    }
}
