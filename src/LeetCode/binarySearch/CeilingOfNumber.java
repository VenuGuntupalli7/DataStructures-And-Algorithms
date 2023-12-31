package LeetCode.binarySearch;

public class CeilingOfNumber {
    public static void main(String[] args){
        int[] array = {1,3,5,6,9,14,16,18};
        int target = 9;
        int result = ceilingNumber(array, target);
        System.out.println(result);
    }


    static int ceilingNumber(int[] arrayDiff, int targetDiff){
        int start = 0;
        int end = arrayDiff.length-1;

        while(start <= end){
            int middle = start + (end-start)/2;

            if(targetDiff == arrayDiff[middle]){
                return  middle;
            }
            if(targetDiff > arrayDiff[middle]){
                start = middle +1;
            } else if (targetDiff<arrayDiff[middle]) {
                end = middle -1;
            }
        }
        return start; // please check your notes
    }
}
