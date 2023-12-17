package LeetCode.Sorting;

import java.util.ArrayList;
import java.util.Collections;

public class MaximumProduct {
    public static void main(String[] args) {
        int[] nums = {3,4,5,2};
        maxProduct(nums);

    }

    public static int maxProduct(int[] nums) {
        ArrayList<Integer> list = new ArrayList<>();
        int ans = 0;
        for(int i=0; i<nums.length; i++){
            for(int j=1; j<nums.length; j++){
                ans = ((nums[i]-1) * (nums[j]-1));
                list.add(ans);
            }
        }
        Integer max = Collections.max(list);
        System.out.println(list);
        return max;
    }
}

