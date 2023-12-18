package LeetCode.arrays;

import java.util.Arrays;

public class ConcatenationOfArray {
    public static void main(String[] args) {
        int[] nums = {1,2,1};
        int [] ans = getConcatenation(nums);
        System.out.println(Arrays.toString(ans));

    }

    public static int[] getConcatenation(int[] nums) {
        int[] ans = new int[2* nums.length];

        for(int i=0; i<nums.length; i++){
            ans[i] = nums[i]; // this will store 1 when i=0;
            ans[i+nums.length] = nums[i]; // here ans[0+3] -> nums[4] = nums[i]
        }
        return ans;
    }
}
