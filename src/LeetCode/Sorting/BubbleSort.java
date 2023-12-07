package LeetCode.Sorting;


import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {3,1,4,5,2};
        bubble(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void bubble(int[] arr){

        boolean swapped;
        // run the steps n-1 times
        for(int i=0; i<arr.length; i++){
            swapped =false;
            //for each step, the maximum item will come at the last respective index
            for(int j=1; j<arr.length-i; j++){
                //swap it if the item is less than previous element
                if(arr[j] < arr[j-1]){ //1<3
                    //swap it by using our swapping methodology
                    int temp = arr[j]; // temp:1
                    arr[j] = arr[j-1]; // arr[j]: 3
                    arr[j-1] = temp;   // arr[j-1]: 1
                    swapped = true;
                }
            }
            if(!swapped){
                break;
            }
        }

    }
}
