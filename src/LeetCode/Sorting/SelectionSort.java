package LeetCode.Sorting;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {4,5,2,1,3,45,25,90};

        for(int i=0; i<arr.length; i++){
            int lastIndex = arr.length-i-1;
            int peakIndex = getMaxValue(arr, 0, lastIndex);
            swap(arr, peakIndex,lastIndex);
        }
        System.out.println(Arrays.toString(arr));
    }

    public static int getMaxValue(int[] arr, int start, int end){
        int max = start;
        for(int i=start; i<= end; i++){
            if(arr[i] > arr[max]){
                max = i;
            }
        }
        return max;
    }

    public static void swap(int[] arr, int a, int b){
        int temp = arr[b];
        arr[b] = arr[a];
        arr[a] = temp;
    }
}
