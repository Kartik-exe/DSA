package Javaproblems.basicMaths;

public class CountOddDigit {

    public static int func(int num) {
        int countOdd = 0;
        while (num > 0){
            int lastDigit = num % 10;
            if(lastDigit % 2 == 1){
                countOdd++;
            }
            num = num / 10;
        }
        return countOdd;
    }

    public static void main(String[] args){
        int result = func(5627);
        System.out.println(result);
    }
}
