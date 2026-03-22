package Javaproblems.basicMaths;

/*
Count all Digits of a Number

You are given an integer n. You need to return the number of digits in the number.
The number will have no leading zeroes, except when the number is 0 itself.
*/

public class CountDigit {

    public static int func(int num) {
        if (num == 0) {
            return 1;
        }
        int count = 0;
        while (num > 0) {
            num = num / 10;
            count = count + 1;
        }
        return count;
    }

    public static void main(String[] args) {
        int result = func(0);
        System.out.println(result);
    }

}
