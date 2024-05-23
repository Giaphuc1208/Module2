package practice_1;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class TestMap {
    public static void main(String[] args) {
        // HashMap
        Map<String, Integer> hashMap = new HashMap<>();
        hashMap.put("Phuc", 22);
        hashMap.put("Linh", 22);
        hashMap.put("Hoi", 24);
        hashMap.put("Sy", 25);
        System.out.println("Display entries in HashMap");
        System.out.println(hashMap + "\n");

        // TreeMap
        Map<String, Integer> treeMap = new TreeMap<>();
        System.out.println("Display entries in ascending order of key");
        treeMap.put("Phuc", 22);
        treeMap.put("Linh", 23);
        treeMap.put("Hoi", 24);
        treeMap.put("Sy", 25);
        System.out.println(treeMap);

        // LinkedHashMap
        Map<String, Integer> linkedHashMap = new LinkedHashMap<>();
        linkedHashMap.put("Phuc", 22);
        linkedHashMap.put("Linh", 22);
        linkedHashMap.put("Hoi", 24);
        linkedHashMap.put("Sy", 25);
        System.out.println("\nThe age of " + "Phuc is " + linkedHashMap.get("Phuc"));
        System.out.println("\nThe age of " + "Linh is " + linkedHashMap.get("Linh"));
        System.out.println("\nThe age of " + "Hoi is " + linkedHashMap.get("Hoi"));
        System.out.println("\nThe age of " + "Sy is " + linkedHashMap.get("Sy"));
    }
}
