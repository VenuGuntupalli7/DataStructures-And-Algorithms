package LeetCode.Recursion;

public class SmallProblems {                 //Space complexity: O(n) times, because we are storing n times each function calls and not taking any extra space
    public static void main(String[] args) { // Time complexity is : O(n) times, because we are printing n times,
        fiveToOne(5);
        //OnetoFive(5);
    }
    public static void fiveToOne(int n){
        //Base condition in Recursion:
        if(n==0) return;
        System.out.println(n);
        fiveToOne(n-1); //recursive call
    }
    static void OnetoFive(int n){
        if (n == 0)return;
        OnetoFive(n-1);
        System.out.println(n);
    }
}
