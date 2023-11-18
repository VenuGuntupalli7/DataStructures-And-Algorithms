package basics.arraysAndArrayList;

import java.util.Arrays;
import java.util.Scanner;

public class Array {
    public static void main(String[] args) {

        //store 5 roll numbers
        //int[] rollNumbers = new int[5];

        // Whenever an object is created, it's always stored in the Heap space and stack memory contains the reference to it.
        //int[] rollnum; //this will execute at compile time & stored in stack memory
        //rollnum =  new int[3];    //this will execute at runtime and store in heap (also called as Dynamic memory allocation)


        // Dynamic memory allocation means memory has been allocated during run-time/execution time

        Scanner input = new Scanner(System.in);
        int[] rollnum = new int[3];

        for (int i = 0; i < rollnum.length; i++) { // using for-loop
            rollnum[i] = input.nextInt();
            System.out.println(rollnum[i]);
        }
//        for (int number: rollnum) { //for-each loop ,  for every element in rollnum, print the element
//            System.out.println(number); // number represents the every element of an array
//        }


        //array of objects
        String [] str = new String[3];
        for (int i = 0; i < str.length; i++) {
            str[i] = input.next();
        }
        System.out.println(Arrays.toString(str));

//        for(String names : str){
//            System.out.println(Arrays.toString(str));
//        }
    }
}
