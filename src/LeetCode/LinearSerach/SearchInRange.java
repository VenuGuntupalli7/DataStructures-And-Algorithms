package LeetCode.LinearSerach;

public class SearchInRange {
    public static void main(String[] args) {

        // search for 44 in the range of index[1,5]
        int [] arr = { 4, -90, 34, 22, 44, 7, 19};
        int target = 44;
        System.out.println(search(arr, target,1,5));
    }

    static int search(int[] arrayDiff, int targetdiff, int start, int end){

        for(int i=start; i<=end; i++){
            int itemFound = arrayDiff[i];
            if(itemFound == targetdiff){
                return i;
            }
        }
        return -1;
    }
}
