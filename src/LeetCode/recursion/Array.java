package LeetCode.recursion;

import java.util.ArrayList;

public class Array {
    public static void main(String[] args) {
        int [] nums = {2,3,4,5,6,7};
        int[] num2 = {3,2,1,45,8,8,9};
        int target = 8;
        System.out.println(helper(nums, 0));
        System.out.println(helper2(num2,8,0));
        findAllIndex(num2,8,0);
        System.out.println(arr);
    }
    static boolean helper(int[] nums, int index){

        //base condition
        if(index == nums.length-1) {
            return true;
        }
        return nums[index]<nums[index+1] && helper(nums, index+1);
    }

    static boolean helper2(int[] num2, int target, int index){
        if(index == num2.length){
            return false;
        }
        return num2[index] == target || helper2(num2,target,index+1);
    }

  static ArrayList<Integer> arr = new ArrayList<>();
    static void findAllIndex(int[] num2, int target, int index){
        if(index == num2.length){
            return;
        }
        if(num2[index] == target){
             arr.add(index);
        }
         findAllIndex(num2,target,index+1);
    }

}
