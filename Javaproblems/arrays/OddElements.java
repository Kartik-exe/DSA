package Javaproblems.arrays;

public class OddElements {

    public static int func(int[] arr, int n){

        int count = 0;

        for(int i=0; i<n; i++){
            if(arr[i]%2 != 0){
                count++;
            }
        }
        return  count;
    }

    public static void main(String[] args){
        int result = func(new int[] {1,3,4}, 3);
        System.out.println(result);
    }
}