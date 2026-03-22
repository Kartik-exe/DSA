package Javaproblems.CollectionFramework;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class ListIterators {
    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<>();

        al.add(1);
        al.add(55);
        al.add(3);
        System.out.println(al); // [1, 55, 3]
        Collections.sort(al); // Sorts the elements in array in ascending order1
        System.out.println(al); // [1, 3, 55]

        System.out.println(Collections.max(al)); // Returns the max element of this array list-----55
        System.out.println(Collections.min(al)); // Returns the min element of this array list-----1
        Collections.reverse(al); // reverse the array list!

        Iterator<Integer> iterator = al.iterator();
        while (iterator.hasNext()) {
            Integer num = iterator.next();
            System.out.println(num);
        }
//             Output: 1
//                     3
//                     55
    }

}
