package Exercise.exercise_2;

import java.util.HashMap;
import java.util.Locale;
import java.util.Scanner;

public class TreeMap {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter string: ");
        String str = scanner.nextLine();
        str = str.replaceAll(",","");
        str = str.toLowerCase(Locale.ROOT);
        String[] arr = str.split("");
        HashMap<String,Integer> map = new HashMap<>();
        for (String s : arr){
            if(map.get(s) == null){
                map.put(s,1);
            } else {
                int value = map.get(s);
                map.put(s, ++value);
            }
        }
        System.out.println(map);
    }
}
