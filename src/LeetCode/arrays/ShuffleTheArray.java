package LeetCode.arrays;

import java.util.Arrays;

public class ShuffleTheArray {
    public static void main(String[] args) {
        int[] nums = {2,5,1,3,4,7};
        int n = 3;
        System.out.println(Arrays.toString(shuffle(nums,n)));

    }
    public static int[] shuffle(int[] nums, int n) {
        int[] ans = new int[2*n];
        for(int i=0; i<n; i++){
            ans[2*i] = nums[i]; // here it will store ans[2*0] => ans[0]     ==> nums[0] = 2
            ans[2*i+1] = nums[n+i];  // here it will store ans[2*0 +1] => ans[3+0]    ==> nums[3] = 3
        }
        return ans;
    }
}
