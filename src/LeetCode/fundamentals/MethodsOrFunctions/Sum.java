package LeetCode.fundamentals.MethodsOrFunctions;

import java.util.Scanner;

public class Sum {
    public static void main(String [] args){
        sum();
        multiply();
    }

    static void sum(){
        //Question : Take the input of two numbers and print the sum

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        int num1 = input.nextInt();
        System.out.println("Enter the Second number: ");
        int num2 = input.nextInt();
        int num3 = num1 + num2;
        System.out.println("The input of above two numbers are " +  num3);
    }

    static void multiply(){

        //Question : Take the input of two numbers and multiply the sum
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        int num1 = input.nextInt();
        System.out.println("Enter the Second number: ");
        int num2 = input.nextInt();
        int num3 = num1 * num2;
        System.out.println("The input of above two numbers are " +  num3);
    }



}
