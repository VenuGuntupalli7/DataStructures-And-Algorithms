package LeetCode.fundamentals.ConditionsAndLoops;

import java.util.Scanner;

public class LargestNumberTask {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();

        int maximum = 0;


        if (a > maximum){
            maximum =a;
        }
        if(b > maximum){
            maximum = b;
        }
        if (c > maximum){
            maximum =c;
        }

        System.out.println("The largest number is : " + maximum);

        // one more way to do it!

        int a1 = input.nextInt();
        int b2  = input.nextInt();

        int Maxz = Math.max(a1,b2);
        System.out.println("The Maxz value is :" + Maxz);






    }
}
