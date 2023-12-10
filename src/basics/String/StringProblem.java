package basics.String;

import java.util.Arrays;
import java.util.Locale;

public class StringProblem {
    public static void main(String[] args) {
        String name = "ABCDcBA";
        System.out.println(isPalindrome(name));

    }

    static boolean isPalindrome(String str){
        str = str.toLowerCase();
        for(int i=0; i<=str.length()/2; i++){
         char start = str.charAt(i);
         char end = str.charAt(str.length()-1-i);

         if(start!=end){
             return false;
         }
        }
        return true;
    }
}
