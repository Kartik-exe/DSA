package Javaproblems.arrays;

public class SortedArray {

//    public static int func(int[] arr, int n){
//
//        for(int i=0; i<n-1; i++){
//            if(arr[i] > arr[i+1]){
//                return -1;
//            }
//        }
//        return 1;
//    }


    public static boolean func(int[] arr, int n){

        for(int i=0; i< arr.length-1; i++){
            if(arr[i] > arr[i+1]){
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args){
        boolean result = func(new int[] {1,3,4}, 3);
        System.out.println(result);
    }
}
