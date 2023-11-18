package LeetCode.binarySearch;

/*

A peak element is an element that is strictly greater than its neighbors.
Given a 0-indexed integer array nums, find a peak element, and return its index.
If the array contains multiple peaks, return the index to any of the peaks.
You may imagine that nums[-1] = nums[n] = -∞.
In other words, an element is always considered to be strictly greater than a neighbor that is outside the array.
You must write an algorithm that runs in O(log n) time
nums = [1,2,1,3,5,6,4]

*/
public class FindPeakElement {
    public static void main(String[] args){
        int[] nums = {1,2,1,3,5,6,4};
        int res = findPeakElement(nums);
        System.out.println(res);
    }
    static int findPeakElement(int[] nums){
        int start = 0; //5 (last iteration instead of debugging)
        int end   = nums.length-1;  //5

        while(start<end){ //5<5, loop breaks
            int mid = start + (end-start)/2; //4

            if(nums[mid] < nums[mid+1]){  //5<6 true -> start = 5
                start = mid+1;
            }
            else if(nums[mid]> nums[mid+1]){
                end = mid;
            }
        }
        return start;
    }
}
