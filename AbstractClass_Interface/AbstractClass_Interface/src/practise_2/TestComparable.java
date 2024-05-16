package practise_2;

import java.util.Arrays;

public class TestComparable {
    public static void main(String[] args) {
        ComparableCircle[] circles = new ComparableCircle[4];
        circles[0] = new ComparableCircle(3.6);
        circles[1] = new ComparableCircle();
        circles[2] = new ComparableCircle("indigo", false, 3.5);
        circles[3] = new ComparableCircle("blue",true,12.4);
        System.out.println("Pre-sorted: ");
        for (ComparableCircle circle : circles){
            System.out.println(circle);
        }
        Arrays.sort(circles);
        System.out.println("After-s");
        for (ComparableCircle circle : circles){
            System.out.println(circle);
        }
    }
}
