package LeetCode.linearSerach;
import java.util.Arrays;

public class SearchInTwoDArrays {

    public static void main(String[] args){

        int [] [] twoDArray = {
                {33,44,55,66},
                {77,88,990989}

        };
        int target = 77 ;
        int[] answer = search(twoDArray, target);
        System.out.println(Arrays.toString(answer));
        System.out.println(max(twoDArray));
    }

    public static int[] search(int[][] twoDiff, int target){

        for(int row=0; row<twoDiff.length; row++){
            for (int column=0; column<twoDiff[row].length; column++){

                if(twoDiff[row][column] == target){
                    return new int[]{row,column};
                }
            }
        }
        return new int[]{-10,-39};
    }

    public static int max(int[][] arrayy){
        int maximum = Integer.MIN_VALUE;

        for(int row=0; row<arrayy.length; row++){
            for (int column=0; column<arrayy[row].length; column++){

                if(arrayy[row][column] > maximum){
                      maximum = arrayy[row][column];
                }
            }
        }
        return maximum;
    }

}
