package LeetCode.fundamentals.String;

import java.util.ArrayList;

public class SubSet {

    //SubSet is for Arrays, where SubSequence is for Strings

    public static void main(String[] args) {
        System.out.println(subSet("" ,"abc"));

    }

    static ArrayList<String> subSet(String p, String up){

         ArrayList<String> list = new ArrayList<>();
         if(up.isEmpty()){
             list.add(p);
             return list;
         }

         char ch = up.charAt(0);

         ArrayList<String> left = subSet(p+ch,up.substring(1));
         ArrayList<String> right = subSet(p, up.substring(1));

        left.addAll(right);
         return left;

    }
}
