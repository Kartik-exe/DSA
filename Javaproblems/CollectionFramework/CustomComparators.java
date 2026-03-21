package Javaproblems.CollectionFramework;

import java.util.ArrayList;
import java.util.Comparator;

public class CustomComparators {
    public static Comparator<Integer> getComparator() {
        return new Comparator<Integer>() {
            // Comparator logic:
            // compare(num1, num2) decides the order of num1 relative to num2

            // return negative  → keep first element before
            // return positive  → move first element after
            // return 0         → both are equal

            // DESCENDING ORDER LOGIC:
            // If num1 is smaller than num2, push it AFTER num2
            // (i.e., smaller elements go to the right, larger come first)
            @Override
            public int compare(Integer num1, Integer num2) {
                if (num1 < num2) {  // num1 should come after num2 i.e. (Smaller number goes to the right)
                    return 1;
                } else if (num2 < num1) { // num1 should come before num2 i.e. (Larger number goes to the left)
                    return -1;
                }
                return 0;
            }
        };
    }

    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<>();
        al.add(1);
        al.add(2);
        al.add(3); //Sorts the specified list into ascending order, according to the natural ordering of its elements.
        al.sort(getComparator());
        // The other way can be:
        // Collections.sort(al, getComparator());
        System.out.println(al);
    }
}
