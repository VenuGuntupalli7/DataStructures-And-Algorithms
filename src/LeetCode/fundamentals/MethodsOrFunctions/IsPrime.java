package LeetCode.fundamentals.MethodsOrFunctions;

import java.util.Scanner;

public class IsPrime {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("please enter the number ");
        int n =input.nextInt();
        //boolean answer = isPrime(n);
        //System.out.println(answer);

        System.out.println(armstrongNumbers(n));

    }

    //this method can tell us whether the given number is prime or not
    static boolean isPrime(int n){
      if(n <=1){
          return false;
      }
      int c = 2; // the reason why we declared c = 2 because if any number divides by 2 and get a remainder zero is not prime number
      while (c * c <= n){
          if(n%c == 0){
              return false;
          }
          c++;
      }
     return c * c > n;
    }


   // this method will print all the 3 digit armstrong numbers

    static boolean armstrongNumbers(int n){
        int original = n;
         int sum=0;

        while (n>0){
            int rem = n%10;
            sum = sum + (rem*rem*rem);
            n = n/10;
        }
        return sum == original;
    }

}
