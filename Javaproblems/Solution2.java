package Javaproblems;

///  Problem Description: Print last character of string

/*

Given a string s. Return the last character of the given string s.

Example 1
Input : s = "takeuforward"
Output : d
Explanation : The last character of given string is "d".

Example 2
Input : s = "goodforyou"
Output : u
Explanation : The last character of given string is "u".

Example 3
Input : s = "lovecoding"
Output: g

 */

public class Solution2 {

    public char lastChar(String s){
        return s.charAt(s.length()-1);
    }

    public static void main(String[] args){

        Solution2 sol = new Solution2();
        String s = "Kartik";
        char answer = sol.lastChar(s);
        System.out.println(answer);
    }
}
