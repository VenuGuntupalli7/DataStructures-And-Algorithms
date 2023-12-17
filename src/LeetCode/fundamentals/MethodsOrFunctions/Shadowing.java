package LeetCode.fundamentals.MethodsOrFunctions;

public class Shadowing {

    //Shadowing in Java means the low-level(a=45) scope overrides the upper level(a=77) scope, below is the given example!
    static int a = 77; //class variable

    public static void main(String[] args) {
        System.out.println("Inside the main is " + a); //77
        int a = 45; //the class variable at line 5 is shadowed by this variable
        System.out.println("local variable value is  " + a); //45
        sum();

    }

    static void sum(){
        System.out.println("Inside the sum " + a); // 77, obv this will print 77 bc of a = 77 initialized at class level
    }
}
