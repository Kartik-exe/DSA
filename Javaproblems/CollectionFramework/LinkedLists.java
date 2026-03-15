package Javaproblems.CollectionFramework;

import java.util.LinkedList;

public class LinkedLists {

    public static void main(String[] args){

        // Adds elements from front and end as well
        LinkedList<Integer> l = new LinkedList<>();

        l.add(1);
        l.add(2);
        l.add(3);
        l.add(4);
        l.add(5);
        l.addFirst(4); // Adds element in array at 0 index!    output: [4, 1, 2, 3, 4, 5]
        l.addLast(10); // Adds element in array at last index!     output: [4, 1, 2, 3, 4, 5, 10]
        System.out.println(l); // [4, 1, 2, 3, 4, 5, 10]
        System.out.println(l.contains(6)); // Prints weather element at index 6 is there or not     output: false
        System.out.println(l.contains(2)); // Prints weather element at index 2 is there or not     output: true

    }

}
