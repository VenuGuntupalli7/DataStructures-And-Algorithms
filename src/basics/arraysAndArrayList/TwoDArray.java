package basics.arraysAndArrayList;

import java.util.Arrays;
import java.util.Scanner;

public class TwoDArray {
    public static void main(String[] args) {

        // please refer to your notes for re-memorize how exactly 2D Arrays store in Memory!
        Scanner input = new Scanner(System.in);
        int[] [] arr = new int[3][3];

        // input
         for(int row= 0; row<arr.length; row++ ){
             //for each column in every row
            for (int column= 0; column<arr[row].length; column++){
                arr[row][column] = input.nextInt();
            }
        }


         //output
//        for(int row= 0; row<arr.length; row++ ){
//            //for each column in every row
//            for (int column= 0; column<arr[row].length; column++){
//                System.out.print(arr[row][column] + " ");
//            }
//            System.out.println();
//        }

        //one more way of printing output
//        for(int row= 0; row<arr.length; row++ ){
//            System.out.println(Arrays.toString(arr[row]));
//        }

        // one more way of printing output
        for(int[] a : arr){
            System.out.println(Arrays.toString(a));
        }
    }
}
