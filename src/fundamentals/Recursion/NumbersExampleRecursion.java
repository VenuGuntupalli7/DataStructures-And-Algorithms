package fundamentals.Recursion;

public class NumbersExampleRecursion {
    public static void main(String[] args) {
        //what happens if someone asks to print 1 lakh numbers?
        print(1);
    }

    static void print(int n){

        //Base condition in Recursion:- condition where recursion will stop making new calls
        if(n==5){
            System.out.println(5);
            return;
        }
        System.out.println(n);

        //recursive call
        //if you're calling a function again and again, you can treat it as a separate call in the stack
        // this is called tail recursion print(n+1)
        // this is the last function call
        print(n+1);
    }

}
