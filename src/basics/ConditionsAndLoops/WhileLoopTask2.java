package basics.ConditionsAndLoops;

import java.util.Scanner;

public class WhileLoopTask2 {
    public static void main(String[] args) {


        //Take integer inputs till the user enters 0 and print the largest number from all.
        Scanner input = new Scanner(System.in);

        int maximum = 0;
        int b = input.nextInt();

        while (b>0){
            if (b > maximum) {
                maximum =  b;
            }
            b = input.nextInt();
        }
        System.out.println(maximum);
    }
}
