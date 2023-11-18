package LeetCode.LinearSerach;

/*
Given an array nums of integers, return how many of them contain an even number of digits.
Example 1:
        Input: nums = [12,345,2,6,7896]
        Output: 2
*/


import java.util.Arrays;

public class FindEvenNumberOfDigits {
    public  static void main(String[] args){
        int[] nums = {555,901,482,1721};
        System.out.println(findNumbers(nums));
    }

    static int findNumbers(int[] nums) {
        int count = 0;
        for(int n  : nums) {
            if(even(n)){
                count++;
            }}
        return count;
    }

    // method to check whether a number contains even digits or not

    static boolean even(int number){
        int numberOfDigits = digits(number);
        if(numberOfDigits%2 == 0){
            return true;
        }
            return false;
    }

    //count number of digits in a number
    static int  digits(int number){
      int count = 0;
      while (number>0){
          count++;
          number=number/10;
      }
      return count;
    }

}





// Find the number of digits using converting Integer to a String method;
//    static int findNumber(int[] numsdiff){
//
//        int count = 0;
//
//        for (int nums : numsdiff){
//
//            String number = Integer.toString(nums);
//            int lengthOfString = number.length();
//
//            if(lengthOfString % 2 == 0){
//                count++;
//            }
//        }
//        return count;
//    }
