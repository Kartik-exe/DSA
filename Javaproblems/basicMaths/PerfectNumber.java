package Javaproblems.basicMaths;

public class PerfectNumber {

//    public static boolean isPerfectNumber(int num){
//        int sum = 0;
//
//        for(int i=1; i<num-1; i++){
//            if(num%i == 0){
//                sum += i;
//            }
//        }
//        return (sum == num);
//    }

    // Optimized code
    public static boolean isPerfectNumber(int num) {
        if (num <= 1) return false;
        int sum = 1;
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                sum += i;

                if (i != num / i && i != 1) {
                    sum += num / i;
                }
            }
        }
        return (sum == num);
    }

    public static void main(String[] args){
        boolean result = isPerfectNumber(6);
        System.out.println(result);
    }
}