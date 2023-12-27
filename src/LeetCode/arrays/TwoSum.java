package LeetCode.arrays;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public static void main(String[] args) {
        int[] nums = {2,7,11,15};
        String[] n = {"Venu", "aees"};
        int target = 9;
        System.out.println(Arrays.toString(twoSum(nums,target)));

    }

        public static int[] twoSum(int[] nums, int target) {
            // Using hashmap
            Map<Integer, Integer> map = new HashMap<>();
            for(int i=0; i<nums.length; i++){
                // current + x = target
                // x = target- current
                int current = nums[i];
                int x = target- current;

                if(map.containsKey(x)){
                    return new int[] {map.get(x), i};
                }
                map.put(nums[i], i);
            }
            return null;
        }

    }

