package LeetCode.fundamentals.ConditionsAndLoops;

import java.util.Scanner;

public class AdditionOfTwoNumbers {

    public static void main(String[] args) {

        //Addition Of Two Numbers
        Scanner input = new Scanner(System.in);

        System.out.println("please enter the numbers : ");
        int a = input.nextInt();
        int b = input.nextInt();

        int c = a + b;
        System.out.println("The addition of given two numbers is : " + c);

    }
}

