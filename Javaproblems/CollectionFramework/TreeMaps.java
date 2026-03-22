package Javaproblems.CollectionFramework;

import java.util.TreeMap;

public class TreeMaps {
    public static void main(String[] args) {

        // (Key , Value)
        // Stores the sorted order KEYS
        // O(log N)
        // It doesn't store duplicates!!!
        TreeMap<Integer, String> tm = new TreeMap<>();
        tm.put(12, "Steve");
        tm.put(1, "Grok");
        tm.put(5, "Bell");
        tm.put(8, "Kartik");
        tm.put(8, "Kartik"); // Duplicate it won't return!
        System.out.println(tm);
        System.out.println(tm.ceilingKey(2)); // Returns the least key greater than or equal to key, or null if there is no such key
        // Output: 5
        System.out.println(tm.floorKey(3)); // Returns the greatest key less than or equal to key, or null if there is no such key
        // Output: 1
        System.out.println(tm.keySet()); // Returns a set of the keys contained in this map
        // Output: [1, 5, 8, 12]
    }
}
