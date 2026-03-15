package Javaproblems;

import java.util.ArrayList;

public class Basics {

    public static void main(String[] args) {
        ArrayList<Integer> aList = new ArrayList<>();
        aList.add(1);
        aList.add(2);
        aList.add(3);
        aList.add(4);
        aList.add(5);
        aList.add(6);
        System.out.println(aList.size()); // Output: 6
        System.out.println(aList.remove(3)); // Output: removes 4 from index 3!
        aList.add(1, 100); // Output: [1, 100, 2, 3, 5, 6]
        System.out.println(aList);
    }
}
