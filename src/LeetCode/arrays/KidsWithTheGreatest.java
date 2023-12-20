package LeetCode.arrays;

import java.util.ArrayList;
import java.util.List;


//https://leetcode.com/problems/kids-with-the-greatest-number-of-candies/description/

public class KidsWithTheGreatest {
    public static void main(String[] args) {

        int [] candies = {2,3,5,1,3};
        int extraCandies = 3;
        System.out.println(kidsWithCandies(candies, extraCandies));

    }
    public static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> result = new ArrayList<>();
        int max = candies[0];
        for(int j=1; j<candies.length; j++){
            if(candies[j]>max){
                max = candies[j];
            }
        }

        for(int i=0; i<candies.length; i++){
            if(candies[i] + extraCandies >= max){
                result.add(true);
            }else{
                result.add(false);
            }
        }
        return result;
    }
}
