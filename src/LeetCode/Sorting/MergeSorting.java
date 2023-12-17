package LeetCode.Sorting;

import java.util.Arrays;

public class MergeSorting {
    public static void main(String[] args) {
        int[] arr = {6,5,4,3,2,1};
        System.out.println(Arrays.toString(mergeSort(arr)));

    }

    static int[] mergeSort(int[] arr){

        //base condition, when the length of the array is 1, just return the array
        if(arr.length == 1){
            return arr;
        }

        int mid = arr.length/2;

        // here we are dividing array into two parts
        int[] left  = mergeSort(Arrays.copyOfRange(arr,0, mid)) ;
        int[] right = mergeSort(Arrays.copyOfRange(arr, mid, arr.length));

      return merge(left,right);

    }

    static int[] merge(int[] left, int[] right){
        int [] mix = new int[left.length + right.length];
        int i = 0;
        int j = 0;
        int k = 0;

        while(i<left.length && j<right.length){
            if(left[i] < right[j]){
                mix[k] = left[i];
                i++;
            }
            else{
                mix[k] = right[j];
                j++;
            }
            k++;
        }

        // it may be possible that one of the arrays is not complete, copy the remaining elements
        while(i< left.length){
            mix[k] = left[i];
            i++;
            k++;
        }
        while(j< left.length){
            mix[k] = right[j];
            j++;
            k++;
        }
    return mix;
    }

}
