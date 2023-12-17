package fundamentals.Recursion;

import java.util.ArrayList;

public class ArrayList2 {
    public static void main(String[] args) {
        int[] arr = {1,5,3,5};
        int target = 5;
        System.out.println(helper(arr, target,0));

    }
    public static ArrayList<Integer> helper(int[] arr, int target, int index){

        ArrayList<Integer> ans = new ArrayList<>();
        if(index == arr.length){
            return ans;
        }

        // this will contain answer for that function call only
        if(arr[index] == target){
            ans.add(index);
        }

        ArrayList<Integer> ansFromBelowCalls = helper(arr, target,index+1);
        ans.addAll(ansFromBelowCalls);
        return ans;

    }
}
