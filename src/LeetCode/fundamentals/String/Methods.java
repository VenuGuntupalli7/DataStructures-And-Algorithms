package LeetCode.fundamentals.String;

import java.util.Arrays;


public class Methods {
    public static void main(String[] args) {
        String name = "Venu Guntupalli";
        System.out.println(name.substring(0,4));

        System.out.println(Arrays.toString(name.toCharArray()));
        System.out.println(name.length());
        System.out.println(name.toLowerCase());
        System.out.println(name.toUpperCase());
        System.out.println(name.substring(5));
        System.out.println(Arrays.toString(name.split(" ")));
    }
}
