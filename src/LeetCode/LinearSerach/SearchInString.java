package LeetCode.LinearSerach;

import java.util.Arrays;

public class SearchInString {
    public static void  main(String[] args){
        String dreamCompany = "Tesla";
        char name  = 'e';
        System.out.println(exists(dreamCompany, name));// here we are the passing the values to str, diff
        System.out.println(Arrays.toString(dreamCompany.toCharArray()));
    }

    // please note that once if we initialize any variable
    // it can be accessed only in the specific method where we initialized!
    // it can be accessed in other methods, but we can pass the values of those variable by calling
    // the other methods, please look at the top example!
    static boolean exists(String str, char diff){ // str have the value of dreamCompany and diff have name

        // adding on edge case
        if(str.length() == 0){
            return false;
        }

        for (int i=0; i<str.length(); i++){
            if (str.charAt(i) == diff) {
                return true;
            }
        }

        //for each loop

       /* for(char cr : str.toCharArray()){
            if(diff == cr){
                return true;
            }
        }*/

        return false;
    }

}
