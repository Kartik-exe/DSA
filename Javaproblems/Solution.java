package Javaproblems;

/* 

Given an integer array nums, return the sum of the 1st and last element of the array.

Example 1
Input: nums = [2, 3, 4, 5, 6]
Output: 8
Explanation: 1st element = 2, last element = 6, sum = 2 + 6 = 8.

Example 2
Input: nums = [2]
Output: 4
Explanation: 1st element = last element = 2, sum = 2 + 2 = 4.

Example 3
Input: nums = [-1, 2, 4, 1]
Output:0

*/

class Solution {
    
    public int sumOfFirstAndLast(int[] nums){

        if(nums.length == 0){
            return 0;
        }

        int firstNum = nums[0];
        int lastNum = nums[nums.length -1];
        return firstNum+lastNum;
    }

    public static void main(String[] args){

        int[] nums = {1,2,3,4,5,6};
        
        Solution sol = new Solution();
        int answer = sol.sumOfFirstAndLast(nums);

        System.out.println("Sum is: " + answer);

    } 
}
