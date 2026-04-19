package Javaproblems.strings;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ReverseString {

//    Brute force approach!!
//    Reverse a String II
//    Given a string, the task is to reverse it. The string is represented by an array of characters s.

    public static void main(String[] args) {

        List<Character> str = new ArrayList<>(Arrays.asList('h', 'e', 'l', 'l', 'o'));
        ReverseString sol = new ReverseString();

        sol.func(str);

        for (char c : str) {
            System.out.print(c);
        }
    }

    public void func(List<Character> s) {

        int n = s.size();
        List<Character> dups = new ArrayList<>(n);

        for (int i = 0; i < n; i++) {
            dups.add(' ');
        }
        for (int i = 0; i < n; i++) {
            dups.set(i, s.get(n - i - 1));
        }
        for (int i = 0; i < n; i++) {
            s.set(i, dups.get(i));
        }
    }
}
