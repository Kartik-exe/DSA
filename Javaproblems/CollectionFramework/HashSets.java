package Javaproblems.CollectionFramework;

import java.util.HashSet;

public class HashSets {

    public static void main(String[] args) {

        // DS that stores unique elements in any random order!!!
        HashSet<Integer> h = new HashSet<>();
        h.add(1);
        h.add(2);
        h.add(3);
        h.add(1); // duplicate and never prints it!
        h.add(1); // duplicate and never prints it!
        h.add(1); // duplicate and never prints it!
        h.add(6);
        h.add(0);
        System.out.println(h); // [0, 1, 2, 3, 6]
        System.out.println(h.size());

        // HashSet does not store elements by index.
        HashSet<Integer> hs = new HashSet<>();
        hs.add(1);
        hs.add(2);
        hs.add(3);
        hs.remove(2); // removes the element with value 2
        System.out.println(hs); //[1, 3]

        // var means Java automatically infer the type from the collection.
        // for-each loop iterates through each element of the HashSet one by one and prints them on separate lines
        for (var num : hs) {
            System.out.println(num);
        }
        // output:
        // 1
        //2

        // Or else we can explicitly declare the type of num.
        for (int num : hs) {
            System.out.println(num);
        }

    }

}
