package LeetCode.Sorting;

import java.util.Arrays;

//https://leetcode.com/problems/set-mismatch/

public class SetMismatchByCyclicSort {
    public static void main(String[] args) {
        int [] nums = {1,2,2,4};
        int[] ans = findErrorNums(nums);
        System.out.println(Arrays.toString(ans));

    }
    public static int[] findErrorNums(int[] nums) {
        int i=0;

        while(i<nums.length){
            int correctIndex = nums[i]-1;
            if(nums[i] != nums[correctIndex]){
                swap(nums, i, correctIndex);
            }else{
                i++;
            }
        }

        //find dupliactes and missing number
        for(int ind=0; ind<nums.length; ind++){ //ind=2
            if(nums[ind] != ind+1){ //2 !=3
                return new int[] {nums[ind], ind+1};
            }

        }
        return new int[] {-1,-1};
    }

    public static void swap(int[] nums, int a, int b){
        int temp = nums[b];
        nums[b] = nums[a];
        nums[a] = temp;
    }

}
