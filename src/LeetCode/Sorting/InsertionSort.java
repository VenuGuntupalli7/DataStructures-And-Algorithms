package LeetCode.Sorting;


import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int [] nums = {4,5,2,1,3,45,25,90};
        for (int i = 0; i < nums.length-1; i++) {
            for (int j = i+1; j>0 ; j--) {
                if(nums[j]<nums[j-1]){
                    swap(nums,j,j-1);
                }else{
                    break;
                }
            }
        }
        System.out.println(Arrays.toString(nums));
    }

   public static void swap(int[] nums, int a, int b){
        int temp = nums[b];
        nums[b] = nums[a];
        nums[a] = temp;
    }
}
