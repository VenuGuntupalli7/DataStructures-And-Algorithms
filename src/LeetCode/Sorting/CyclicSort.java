package LeetCode.Sorting;

import java.util.Arrays;

public class CyclicSort {
    public static void main(String[] args) {

         int[] nums = {3,5,2,1,4};
         //1,2,3,4,5

         int i =0;
         while(i<nums.length){
             int correctIndex = nums[i]-1;

             if(nums[i] != nums[correctIndex]){
                 swap(nums, i, correctIndex);
             }
             else{
                 break;
             }
         }
        System.out.println(Arrays.toString(nums));
    }
    public static void swap(int[] nums, int a, int b){
        int temp = nums[b];
        nums[b] = nums[a];
        nums[a] = temp;
    }
}

