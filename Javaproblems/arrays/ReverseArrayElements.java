package Javaproblems.arrays;

public class ReverseArrayElements {

    public void func(int[] arr, int n){
        int[] temp = new int[n];

        for(int i=0; i<n; i++){
            temp[n-i-1] = arr[i];
        }

        for(int i=0; i<n; i++){
            arr[i] = temp[i];
        }
    }

    public static void main(String[] args){
        int[] arr = {1, 2, 3, 4, 5};

        ReverseArrayElements obj = new ReverseArrayElements();
        obj.func(arr, arr.length);

        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
}


