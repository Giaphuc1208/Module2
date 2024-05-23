package exercise_James;

import exercise_James.model.Circle;
import exercise_James.model.Rectangle;
import exercise_James.model.Square;


import java.util.concurrent.ThreadLocalRandom;

public class Test {
    public static void main(String[] args) {
        Circle[] circle = new Circle[3];
        circle[0] = new Circle(1.8);
        circle[1] = new Circle(2.5);
        circle[2] = new Circle(3.2);
        for (int i = 0; i < circle.length; i++) {
            System.out.println("Circle " + i + ": " + circle[i]);
            int ranNum = ThreadLocalRandom.current().nextInt(1, 101);
            System.out.println(ranNum + " " + circle[i].resize(ranNum));
        }

        Rectangle[] rectangles = new Rectangle[3];
        rectangles[0] = new Rectangle();
        rectangles[1] = new Rectangle();
        rectangles[2] = new Rectangle();
        for (int i = 0; i < rectangles.length; i++) {
            System.out.println("Rectangle " + i + " : " + rectangles[i]);
            int ranNum = ThreadLocalRandom.current().nextInt(1, 101);
            System.out.println(ranNum + " " + rectangles[i].resize(ranNum));
        }

        Square square = new Square();
        square.howToColor();
        System.out.println(square);
        System.out.println("=================");

        Square[] squaresTwo = new Square[3];
        squaresTwo[0] = new Square();
        squaresTwo[1] = new Square();
        squaresTwo[2] = new Square();

        for (int i = 0; i < squaresTwo.length; i++) {
            System.out.println("Square " + i + ": " + squaresTwo[i]);
            if (squaresTwo[i] instanceof Square)
                squaresTwo[i].howToColor();
        }
    }
}
