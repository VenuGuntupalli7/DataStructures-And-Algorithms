package LeetCode.Sorting;
import java.util.Arrays;
import java.util.List;

public class CountPairs {
    //https://leetcode.com/problems/count-pairs-whose-sum-is-less-than-target/
    public static void main(String[] args) {
        //{-1,1,2,3,1}
        List<Integer> nums = Arrays.asList(-6,2,5,-2,-7,-1,3);
        int target = -2;
        System.out.println(countPairs(nums,target));

    }

        public static int countPairs(List<Integer> nums, int target) {
            int count = 0;
            for(int i=0; i<nums.size(); i++ ){
                for(int j=i+1; j<nums.size(); j++){
                    if(nums.get(i) + nums.get(j) < target){
                    count++;
                    }
                }
            }
            return count;
        }
    }

