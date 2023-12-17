package LeetCode.sorting;

import java.util.ArrayList;
import java.util.List;

//https://leetcode.com/problems/find-all-duplicates-in-an-array/

public class FindAllDuplicatesinAnArray {

    public static List<Integer> findDuplicates(int[] nums) {
        int i =0;

        while(i<nums.length){
            int correctIndex = nums[i]-1;
            if(nums[i] != nums[correctIndex]){
                swap(nums,i,correctIndex);
            }else{
                i++;
            }
        } // after sorting the array until this step it looks like 1,2,3,4,3,2,7,8

        //find All Duplicates in array
        List<Integer> Dup = new ArrayList<>();
        for(int ind=0; ind< nums.length; ind++){
            if(nums[ind] != ind+1){ //3 !=5
                Dup.add(nums[ind]);
            }
        }
        return Dup;
    }
    public static void swap(int[] nums, int a, int b){
        int temp = nums[b];
        nums[b] = nums[a];
        nums[a] = temp;
    }
}
