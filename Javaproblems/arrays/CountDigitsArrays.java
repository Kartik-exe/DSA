package Javaproblems.arrays;

import java.util.Scanner;

// Count Frequency in Array

public class CountDigitsArrays {

    // array -> arr[];
    // num -> actual numbers in an array
    // n -> count of quires

    public static int func(int[] arr, int num, int n){

        int Count = 0;

        for(int i = 0; i<n-1; i++){
            if(arr[i] == num){
                Count++;
            }
        }
        return Count;
    }

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for(int i=0; i<n-1; i++){
            arr[i] = sc.nextInt();
        }

        int Q = sc.nextInt(); // number of queries
        while(Q--> 0){
            int num = sc.nextInt(); // query number
            int result = func(arr, num, n);
            System.out.println(result);
        }

        sc.close();
    }
}
