package LeetCode.recursion;

public class SumOfDigits {
    public static void main(String[] args) {
        System.out.println(sum(1342));
    }
    static int sum(int n){
       if(n==0) return n;
       int rem = n %10;
       return rem + sum(n/10) ;
    }
}
