package LeetCode.Recursion;

import java.util.ArrayList;

public class ArrayList1 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,5,4,8,10,5,5,5,5};
        int target = 5;
        System.out.println(helper(arr, target,0, new ArrayList<>()));

    }

    public static ArrayList helper(int[] arr, int target, int index, ArrayList<Integer> ans){
        if(index == arr.length){
          return ans;
        }

        if(arr[index] == target){
            ans.add(index);
        }

        return helper(arr, target,index+1,ans);
    }
}
