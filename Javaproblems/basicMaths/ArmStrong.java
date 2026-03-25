package Javaproblems.basicMaths;


public class ArmStrong {
    public static int func(int num) {

        if (num == 0) {
            return 1;
        }
        int originalNum = num;

        int sum = 0;
        int count = 0;
        int temp = num;

        while (temp > 0) {
            temp = temp / 10;
            count++;
        }
        // reset temp
        temp = num;
        while (temp > 0) {
            int digit = temp % 10;
            sum += Math.pow(digit, count);
            temp = temp / 10;
        }
        return (sum == originalNum) ? 1 : 0;
    }

    public static void main(String[] args) {
        int result = func(153);
        System.out.println(result);
    }
}
