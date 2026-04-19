package Javaproblems.strings;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ReverseStringII {

//    Two Pointer approach!!
//    Reverse a String II
//    Given a string, the task is to reverse it. The string is represented by an array of characters s.

    public static void main(String[] args) {

        List<Character> str = new ArrayList<>(Arrays.asList('C', 'A', 'R'));
        ReverseStringII sol = new ReverseStringII();

        sol.func(str);
        for (char c : str) {
            System.out.println(c);
        }
    }

    public void func(List<Character> s) {

        int start = 0;
        int end = s.size() - 1;

        while (start < end) {
            char ch = s.get(start);
            s.set(start, s.get(end));
            s.set(end, ch);

            start++;
            end--;
        }
    }
}
