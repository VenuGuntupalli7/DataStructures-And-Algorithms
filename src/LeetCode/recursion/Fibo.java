package LeetCode.recursion;

public class Fibo {
    public static void main(String[] args) {
        int n = 50;
        int ans =fibo(n);
        System.out.println(ans);
     }

    static int fibo(int n){
        //base condition
        if(n<2){
            return n;
        }
        // recursive call here
        return fibo(n-1) + fibo(n-2);
    }
}
