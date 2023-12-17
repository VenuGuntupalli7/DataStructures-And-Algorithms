package LeetCode.sorting;

import java.util.Arrays;

//https://leetcode.com/problems/make-two-arrays-equal-by-reversing-subarrays/

public class MakeTwoArrays {
    public boolean canBeEqual(int[] target, int[] arr) {
        // let's use both inserion and Merge sort

        int[] ans1 = sortArray(arr);
        int[] ans2 = sortArray(target);

        if(Arrays.equals(ans1, ans2)){
            return true;
        }
        return false;
    }

    // insert sort run time 16 ms lol
//     public int[] insertionSorting(int[] nums){
//         for(int i=0; i<nums.length-1; i++){
//             for(int j=i+1; j>0; j--){
//                 if(nums[j]<nums[j-1]){
//                     swap(nums, j, j-1);
//                 }
//             }
//         }
//         return nums;
//     }

//     public void swap(int[] nums, int a, int b){
//         int temp = nums[b];
//         nums[b] = nums[a];
//         nums[a] = temp;
//     }


// }

    // insert sort run time 4 ms lol
    public int[] sortArray(int[] nums) {
        // going to use Merge sort baby!!

        //base condition
        if(nums.length == 1){
            return nums;
        }
        //find out the middle
        int mid = nums.length/2;

        // divide the given array into two halfs
        int[] left = sortArray(Arrays.copyOfRange(nums,0,mid));
        int[]  right = sortArray(Arrays.copyOfRange(nums, mid,nums.length));

        //return the merged array
        return merge(left,right);
    }

    public int[] merge(int[] left, int[] right){

        // create a new array to add the elements from both of the arrays after sorting;
        int[] both = new int[left.length + right.length];
        int i =0;
        int j =0;
        int k =0;
        // comparing i vs j which is smaller, and the smaller element has been added to both array sequentially
        while(i<left.length && j<right.length){
            if(left[i] < right[j]){
                both[k] = left[i];
                i++;
            }
            else{
                both[k] = right[j];
                j++;
            }
            k++;
        }

        // check if the one of two arrays might have more left over elements, means if it's an odd number, we can see leftover element
        // and add those elements to both array via using k as an element
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

