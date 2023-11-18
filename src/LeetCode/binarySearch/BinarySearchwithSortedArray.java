package LeetCode.binarySearch;

public class BinarySearchwithSortedArray {

    public static void main(String[] args) {
        //consider we are initiating an array in ascending/descending(sorting) order
        int[] array = {1, 3, 5, 6, 7, 9, 10, 14, 17, 25, 30, 45, 67, 78, 89, 99};
        int target = 89;
        int answer = binarySearchmethod(array, target);
        System.out.println(answer);
    }

    public static int binarySearchmethod(int[] arraydiff, int target) {
        int start = 0;
        int end = arraydiff.length - 1;

        while (start <= end) {
            int middle = start + (end-start) / 2;

            if (target < arraydiff[middle]) {
                end = middle - 1;
            } else if (target > arraydiff[middle]) {
                start = middle + 1;
            } else {
                return middle;
            }
        }
        return -1;
    }
}
