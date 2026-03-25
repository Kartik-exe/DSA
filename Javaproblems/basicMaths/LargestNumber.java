package Javaproblems.basicMaths;

public class LargestNumber {
    public static int fun(int num) {
        int largestDigit = 0;
        while(num>0){
            int lastDigit = num % 10;
            if(lastDigit>largestDigit){
                largestDigit = lastDigit;
            }
            num = num / 10;
        }
        return largestDigit;
    }

    public static void main(String[] args){
        int result = fun(5629);
        System.out.println(result);
    }
}
