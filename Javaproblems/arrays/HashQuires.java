package Javaproblems.arrays;

import java.util.Scanner;

// This code computes the number of array elements using hash by creating a
// hash array, and it precomputes and takes 'q' quires

public class HashQuires {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n]; // array input
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        // precompute

//        int max = Integer.MIN_VALUE;
//        for (int i = 0; i < n; i++) {
//            max = Math.max(max, arr[i]);
//        }
//        int[] hash = new int[max + 1];

        int[] hash = new int[13]; // ASSUMING VALUES ARE IN RANGE 0-12
        for(int i=0; i<n; i++){
            hash[arr[i]]++; // hash array and counts the actual values from the array
        }

        //compute the number of quires
        int Q = sc.nextInt();
        while(Q-- > 0){
            int num = sc.nextInt();
            //fetch
            System.out.println(hash[num]);
        }
    }
}
