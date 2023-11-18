package basics.MethodsOrFunctions;

import java.util.Scanner;

public class MethodsWithParameters {
    public static void main(String[] args) {
       //int answer=  sum1(10, 30);
       String answer2 = sum2("   Venu Guntupalli");
        System.out.println(answer2);
    }

   //this method returns the value  at the end
    static int sum() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        int num1 = input.nextInt();
        System.out.println("Enter the Second number: ");
        int num2 = input.nextInt();
        int num3 = num1 + num2;
        return num3;
    }
    //pass the value of numbers when calling this method in main() and pass the parameters for this method
    static int sum1(int a, int b){
        int c = a +b;
        return c;
    }
    static String sum2(String name){
        String name2 = "Hello" + name;
        return name2;
    }
}

