package basics.String;

import java.util.ArrayList;

public class Operators {
    public static void main(String[] args) {
        System.out.println('a'+'b'); //this is a char and the operator is converting this into its integer(ascii) value and adding up and result is 195
        System.out.println("a"+"b"); //this is a string, here it is concatted the given two Strings and printing as ab
        System.out.println((char)('a' + 5));


        System.out.println("a" + 5);
        //when integer is concatted with a String, then integer will be converted to Integer(Wrapper class) that will call toString()


        System.out.println("Venu"+ new ArrayList<>());
        // here the empty ArrayList will be concatted with String, result will be Venu[]
    }
}
