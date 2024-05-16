package practise_2.practise_3;

import practise_2.Circle;

import java.util.Arrays;
import java.util.Comparator;

public class TestComparator {
    public static void main(String[] args) {
        Circle[] circles = new Circle[5];
        circles[0] = new Circle(3.5);
        circles[1] = new Circle("red", true,8.2);
        circles[2] = new Circle("pink", false, 2.8);
        circles[3] = new Circle("none", true, 0);
        System.out.println("Pre-sorted: ");
        for (Circle circle : circles){
            System.out.println(circle);
        }
        Comparator circleComparator = new CircleComparator();
        Arrays.sort(circles, circleComparator);
        System.out.println("After-sorted: ");
        for (Circle circle : circles){
            System.out.println(circle);
        }
    }
}
