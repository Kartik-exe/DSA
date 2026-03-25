package Javaproblems.basicMaths;

public class PalindromeNumber {
    public static int func(int num) {
        int originalNum = num;
        int revNum = 0;
        while(num>0){
            int digit = num % 10;
            revNum = (revNum*10) + digit;
            num = num / 10;
        }
        if(originalNum == revNum){
            return 1;
        }
        else {
            return 0;
        }
    }

    public static void main(String[] args){
        int result = func(101);
        System.out.println(result);
    }
}
