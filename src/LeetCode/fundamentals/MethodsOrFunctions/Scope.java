package LeetCode.fundamentals.MethodsOrFunctions;

public class Scope {
    public static void main(String[] args) {


        int a = 7;
        int b = 8;
        {
            //int a =44; int a is already initialized outside the block in same method, you can't initialize it again!
            a =16; //reassign the original ref variable to some other value
            int c =77;
            System.out.println("The block of a is : " + a);
            //values initialized inside the block can't be accessed from outside the block

        }

        System.out.println("The regular value of a is : " + a);
    }
}
