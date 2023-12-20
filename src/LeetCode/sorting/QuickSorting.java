package LeetCode.sorting;

import LeetCode.recursion.Array;

import java.util.Arrays;

public class QuickSorting {
    public static void main(String[] args) {
    int[] nums ={5,4,3,2,1};
    sort(nums,0,nums.length-1);
        System.out.println(Arrays.toString(nums));
    }

    static void sort(int[] nums, int low, int high){
       if(low >= high){
           return;
       }

       int start = low;
       int end = high;
       int mid = start + (end-start)/2;
       int pivot = nums[mid];

       while (start <= end){

           while(nums[start] < pivot){
               start++;
           }
           while(nums[end] > pivot){
               end--;
           }

           if(start <= end){
               int temp = nums[start];
               nums[start] = nums[end];
               nums[end] = temp;
               start++;
               end--;

           }
       }
       // now my pivot is at correct index, please sort two halves now

        sort(nums, low, end);
        sort(nums,start,high);

    }
}
