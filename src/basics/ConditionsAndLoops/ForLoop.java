package basics.ConditionsAndLoops;

import java.util.Scanner;

public class ForLoop {
    public static void main(String[] args) {

        // WE CAN USE FOR-LOOP WHEN WE KNOW HOW MANY TIMES THE LOOP NEED TO RUN
        /*
        Syntax for-loop
        for(initialization; condition; increment/decrement){
              // execute this
        }
         */
        //Task: Print number from 0 to 10 within a line and separated by comma
        // 1. Approach using for loop
        System.out.println("Zero to Ten consists of " );
        for (int i=0; i<11; i++){
            System.out.print( i + ", "  );
        }

        //Print numbers from 0 to n via using for loop

        Scanner input = new Scanner(System.in);
        int number = input.nextInt();

        System.out.print("The numbers from o to n is :" );
        for(int i=0; i<number; i++){
            System.out.print( i + " ");
        }

    }
}
