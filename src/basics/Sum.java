package basics;

import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        Scanner numbers = new Scanner(System.in);
        System.out.println("please enter the  numbers:");
        int num1 = numbers.nextInt();
        int num2 = numbers.nextInt();

        int sum = num1 + num2;

        System.out.println("the sum of two numbers is = " + sum);
    }
}
