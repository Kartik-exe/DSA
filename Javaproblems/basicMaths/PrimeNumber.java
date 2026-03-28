package Javaproblems.basicMaths;

public class PrimeNumber {

    // This is correct but slow (O(n))
//    public static int func(int num) {
//        if(num <= 1) return 0;
//        for(int i=2; i<num-1; i++){
//            if(num%i == 0){
//                return 0;
//            }
//        }
//        return 1;
//    }

    // optimized code TC: sqrt[n]
    public static int func(int num) {
        if (num <= 1) return 0;

        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return 0;
            }
        }
        return 1;
    }

    public static void main(String[] args){
        int result = func(2);
        System.out.println(result);
    }
}
