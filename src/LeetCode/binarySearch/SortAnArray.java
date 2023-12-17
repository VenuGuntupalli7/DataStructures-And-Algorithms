package LeetCode.binarySearch;

import java.util.Arrays;

public class SortAnArray {

    //https://leetcode.com/problems/sort-an-array/

    public int[] sortArray(int[] nums) {
        // going to use Merge sort baby!!

        //base condition
        if(nums.length == 1){
            return nums;
        }
        //find out the middle
        int mid = nums.length/2;

        // divide the given array into two halfs
        int[] left = sortArray(Arrays.copyOfRange(nums,0,mid));
        int[]  right = sortArray(Arrays.copyOfRange(nums, mid,nums.length));

        //return the merged array
        return merge(left,right);
    }

    public int[] merge(int[] left, int[] right){

        // create a new array to add the elements from both of the arrays after sorting;
        int[] both = new int[left.length + right.length];
        int i =0;
        int j =0;
        int k =0;
        // comparing i vs j which is smaller, and the smaller element has been added to both array sequentially
        while(i<left.length && j<right.length){
            if(left[i] < right[j]){
                both[k] = left[i];
                i++;
            }
            else{
                both[k] = right[j];
                j++;
            }
            k++;
        }

        // check if the one of two arrays might have more left over elements, means if it's an odd number, we can see leftover element
        // and add those elements to both array via using k as an element
        while(i<left.length){
            both[k] = left[i];
            i++;
            k++;
        }
        while(j<right.length){
            both[k] = right[j];
            j++;
            k++;
        }
        return both;
    }
}
