package LeetCode.Sorting;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindTargets {

    public static void main(String[] args) {
        int[] nums = {1,2,5,2,3,2,3,4,5,9,0,5}; // after sorting it should looks like 1,2,2,3,5
        int target = 5;
        System.out.println(targetIndices(nums,target));


    }

    public static List<Integer> targetIndices(int[] nums, int target) {

        List<Integer> list = new ArrayList<>();
        int[] def = mergeSort(nums);
        // add the elements which matches with target in the list after sorting
        for(int k=0; k<def.length; k++){
            if(def[k] == target){
                list.add(k);
            }
        }
        return list;
    }

    // let's use Merge sort
    public static int[] mergeSort(int[] nums){
        if(nums.length == 1) return nums;
        int mid = nums.length/2;
        int[] left = mergeSort(Arrays.copyOfRange(nums,0,mid));
        int[] right= mergeSort(Arrays.copyOfRange(nums,mid,nums.length));
        return merge(left, right);
    }

    public static int[] merge(int[]left, int[]right){
        int[] both = new int[left.length+ right.length];
        int i = 0;
        int j = 0;
        int k = 0;
        while(i<left.length && j<right.length){
            if(left[i] < right[j]){
                both[k] = left[i];
                i++;
            }else{
                both[k] = right[j];
                j++;
            }
            k++;
        }
        while(i<left.length){
            both[k] = left[i];
            i++;
            k++;
        }
        while(j<right.length){
            both[k] = right[j];
            j++;
            k++;
        }
        return both;
    }


}

