package Javaproblems.basicMaths;

public class FactorialNum {
    public static int func(int num){
        int fac = 1;
        for(int i=1; i<=num; i++) {
            fac = fac*i;
        }
        return fac;
    }

    public static void main(String[] args) {
        int result = func(3);
        System.out.println(result);
    }
}
