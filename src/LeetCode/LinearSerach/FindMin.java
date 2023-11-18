package LeetCode.LinearSerach;

public class FindMin {
    public static void main(String[] args) {

        int[] arr = {23,43,45,12,44,9,-2,-10,4,756};
        System.out.println(findMin(arr));
    }

    //assume if arrayDiff.length != 0
    static int findMin (int[] arrayDiff){

        int min = arrayDiff[0];
        for (int i =0; i<arrayDiff.length; i++){
            if(arrayDiff[i]<min){
                min = arrayDiff[i];
            }}
        return min;
    }
}
