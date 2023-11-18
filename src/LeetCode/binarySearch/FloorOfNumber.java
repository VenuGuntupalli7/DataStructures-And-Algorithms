package LeetCode.binarySearch;

public class FloorOfNumber {
    public static void main(String[] args) {
        int[] array = {1,3,5,6,9,14,16,18};
        int target = 7;
        int ans = floorNumber(array,target);
        System.out.println(ans);
    }

    static int floorNumber(int[] arrayDiff, int targetDiff){
        int start = 0;
        int end = arrayDiff.length-1;

        while (start <= end){
            int middle = start + (end-start)/2;

            if(targetDiff == arrayDiff[middle]){
                return middle;
            }

            if(targetDiff > arrayDiff[middle]){
                start = middle +1;
            }
            else {
                end = middle -1;
            }
        }
        return end;
    }
}
