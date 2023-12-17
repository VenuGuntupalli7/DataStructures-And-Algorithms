package LeetCode.fundamentals.MethodsOrFunctions;

import java.util.Arrays;

public class ChangeValue {
    public static void main(String[] args) {

        int [] array = {12, 30,45, 67, 89};
        number(array);
        System.out.println("the array consists of : " + Arrays.toString(array));
    }

    static void number(int[] num){
        num[0] = 876;
        System.out.println("the num consists of : " +Arrays.toString(num));
    }
}
