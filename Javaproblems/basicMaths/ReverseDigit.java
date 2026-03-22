package Javaproblems.basicMaths;

public class ReverseDigit {
    public static int func(int num) {
        int revNum = 0;
        while (num > 0) {
            int lasDigit = num % 10; // reminder
            revNum = (revNum * 10) + lasDigit;
            num = num / 10;
        }
        return revNum;
    }

    public static void main(String[] args) {
        int result = func(123);
        System.out.println(result);
    }
}

