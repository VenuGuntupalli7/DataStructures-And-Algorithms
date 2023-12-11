package fundamentals.arraysAndArrayList;

import java.util.Arrays;

public class MaxValue {


    public static void main(String[] args){

        int[] numbers = { 17, 20, 3, 40,5,6};

        Arrays.sort(numbers);
        System.out.println(Arrays.toString(numbers));

        swap(numbers,0,3);
        //reverse(numbers);
        //System.out.println(Arrays.toString(numbers));
        System.out.println("The max range of given Array " + maxRange(numbers, 0, 3));
        System.out.println("The swapped Array value is " + Arrays.toString(numbers));
        System.out.println("The maximum value of given array is : "+ max(numbers));
    }

    public static int max(int[] numbers){

        int max = numbers[0];

        for(int i=0; i<numbers.length; i++){

            if (numbers[i] > max) {
               max = numbers[i];
            }
        }
        return max;
    }


    public static void swap(int[] numbers, int index0, int index9){

        int temp = numbers[index0];
        numbers[index9]= numbers[index0];
        numbers[index0]= temp;

    }

    //find the maximum value in given range

    public static int maxRange(int[] numbers, int start, int end){
        int maxRange= numbers[start];
        // 17, 20, 30
        for(int i=start; i<end; i++){
            if(numbers[i]>maxRange){
                maxRange=numbers[i];
            }
        }
     return maxRange;
    }

    //reverse the given array
//    public static void reverse(int [] numbers){
//
//        int start = 0;
//        int end = numbers.length-1;
//
//        while(start<end){
//            swap(numbers, start, end);
//            start++;
//            end--;
//        }
//    }


}


