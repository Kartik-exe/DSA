package Javaproblems.CollectionFramework;

import java.util.TreeSet;

public class TreeSets {

    public static void main(String[] args){

        // DS that stores unique elements in any sorted order!!!
        TreeSet<Integer> ts = new TreeSet<>();
        ts.add(1);
        ts.add(2);
        ts.add(3);
        ts.add(10);
        ts.add(20);
        System.out.println(ts);
        System.out.println(ts.floor(4)); // prints elements >4 in an array
        System.out.println(ts.ceiling(4)); // prints elements >= 4 in an array
    }

//    Output: [1, 2, 3, 10, 20]
//            3
//            10

}
