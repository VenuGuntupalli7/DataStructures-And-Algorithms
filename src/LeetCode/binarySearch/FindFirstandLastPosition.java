package LeetCode.binarySearch;

import java.util.Arrays;

public class FindFirstandLastPosition {
    public static void main(String[] args) {

        int[] nums ={5,7,7,7,7,8,8,8,8,9};
        int target = 7;
        System.out.println(Arrays.toString(searchRange(nums, target)));
    }

    static int[] searchRange(int[] nums, int target) {
        int[] ans = {-1,-1};
        int start = search(nums, target,true);
        int end = search(nums,target,false);

        ans[0] = start;
        ans[1] = end;

        return ans;
    }

    // this function returns the index value of target
    static int search(int[] nums, int target, boolean firstStartIndex){
        int ans = -1;
        int start = 0;
        int end = nums.length - 1;
        while (start <= end) {
            int middle = start + (end - start) / 2;

            if (target < nums[middle]) {
                end = middle - 1;
            }
            else if(target>nums[middle]){
                start = middle + 1;
            }
            else {
                //potential ans found
               ans = middle;
               if(firstStartIndex){
                   end = middle-1;
               }
               else{
                   start = middle+1;
               }
            }
        }
        return ans;
    }
}
