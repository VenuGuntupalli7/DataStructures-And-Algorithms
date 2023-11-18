package basics.ConditionsAndLoops;

import java.util.Scanner;

public class FibonacciNumbersTask {
    public static void main(String[] args) {

        Scanner inputReader = new Scanner(System.in);

        int nthTerm = inputReader.nextInt();
        int a =0;  // first term
        int b =1;  //second term
        // In the Fibonacci sequence, each number is found by adding the two previous numbers.
        // The first two numbers are always 0 and 1.

        // When you want to calculate, let's say, the 5th term of the Fibonacci sequence,
        // you already know the first two terms are 0 and 1.

        // To find the 5th term, you need to perform calculations starting from the 3rd term onwards
        // (because 0 and 1 are the first two terms).
        // That's why the program starts counting from 2;
        // it's telling you that it has already dealt with the first two terms,
        // and it's ready to calculate the 3rd term and beyond.

        int count = 2; //third term
        while (count <= nthTerm){
            int tempVariable = b;
            b =a+b;
            a = tempVariable;
            count++;
        }
        System.out.println(b);
    }
}
