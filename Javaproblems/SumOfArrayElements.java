package Javaproblems;

public class SumOfArrayElements {

    public int sum(int[] arr, int n){

        int arrSum=0;

        for(int i = 0; i < n; i++){
            arrSum = arrSum + arr[i];
        }

        return arrSum;

    }

    public static void main(String[] args){

        int n=4;
        int[] arr ={1,2,3,4};

        SumOfArrayElements b = new SumOfArrayElements();
        int result = b.sum(arr, n);
        System.out.println(result);

    }

}
