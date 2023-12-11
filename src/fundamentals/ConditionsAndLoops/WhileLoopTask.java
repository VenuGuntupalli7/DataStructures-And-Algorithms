package fundamentals.ConditionsAndLoops;

import java.util.Scanner;

public class WhileLoopTask {
    public static void main(String[] args) {

        //Take integer inputs till the user enters 0 and print the sum of all numbers (HINT: while loop)
        Scanner input = new Scanner(System.in);
        int a = 0;
        int b = input.nextInt();

        while (b > 0) {
            if (b > 0) {
                a = a+b;
            }
            b= input.nextInt();
        }
        System.out.println(a);

    }
}
