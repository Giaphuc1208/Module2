package exercise_James;

import exercise_James.model.Circle;
import exercise_James.model.Rectangle;
import exercise_James.model.Square;

public class Test {
    public static void main(String[] args) {
        Circle circle = new Circle(4.5);
        Rectangle rectangle = new Rectangle(4.2,2.6);
        Square square = new Square(5.6);
        System.out.println("Before change: ");
        System.out.println(circle);
        System.out.println(rectangle);
        System.out.println(square);

        circle.resize(Math.random() * 100);
        rectangle.resize(Math.random() * 100);
        square.resize(Math.random() * 100);
        square.howToColor();
        System.out.println("After change: ");
        System.out.println(circle);
        System.out.println(rectangle);
        System.out.println(square);
    }
}
