package Javaproblems.arrays;

public class ReverseElements {

    // Two pointer approach!!

    public void func(int[] arr, int n){

        int left = 0;
        int right = n-1;

        while(left<right){
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;

            left++;
            right--;
        }
    }

    public static void main(String[] args){

        int[] arr = {1, 3, 4};
        ReverseElements revE = new ReverseElements();
        revE.func(arr, arr.length);

        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
}
