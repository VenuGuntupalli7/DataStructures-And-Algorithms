package LeetCode.recursion;

public class EntireRecursion {
    public static void main(String[] args) {
        zeroToN(7);
        nToZero(6);
        System.out.println(factorial(5));
        System.out.println(fibonacci(8));
        System.out.println(sumOfDigits(2314));
        reverse(1739);
        System.out.println(ans);
        System.out.println(reverse2(1234));
    }

    // 1. Print numbers from zero to n
    static void  zeroToN(int n){
        if(n == -1) {
            return;
        }
        System.out.print(" " +n + ",");
         zeroToN(n-1);
    }

    // 2. Print numbers from n to zero
    static void nToZero(int n){
        if(n ==-1){
            return;
        }
        nToZero(n-1);
        System.out.print(" " + n + ",");
    }

    //3. find Factorial of a Number
    static int factorial(int n){
        if(n == 1){
            return n;
        }
        return n * factorial(n-1);
    }

    //4.print fibonacci number 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, 610
    static int fibonacci(int n){
        if(n < 2){
            return n;
        }
        return fibonacci(n-1) + fibonacci(n-2);
    }

    //5.print the sum of digits example:- 2314
    static int sumOfDigits(int n){
        if(n == 0){
            return n;
        }
        int rem = n %10;
        return rem + sumOfDigits(n/10);
    }

    //6. reverse a number
   static  int ans = 0;
    static void reverse(int n){
        if(n == 0){
            return;
        }
        int rem = n %10;
        ans = ans *10 + rem;
         reverse(n/10);
    }

    //7. Second way of reversing a number
    static int reverse2(int n){
      int digits = (int) (Math.log10(n))+1;
      return  helper(n, digits);

    }

    private static int helper(int n, int digits) {
        if(n == 0){
            return n;
        }
        int rem = n %10;
        return rem * (int)(Math.pow(10,digits-1)) + helper(n/10, digits-1);
    }

}
