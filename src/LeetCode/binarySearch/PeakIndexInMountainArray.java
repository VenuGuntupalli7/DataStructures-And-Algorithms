package LeetCode.binarySearch;

public class PeakIndexInMountainArray {
    public static void main(String[] args){
        int[] arr = {0,1,3,5,7,9,3,2,1};
        int ans = peakIndex(arr);
        System.out.println(ans);

    }

    static int peakIndex(int[] arr){
        int start = 0;
        int end = arr.length-1;

        while(start<end){
            int mid = start + (end-start)/2;

            if(arr[mid] < arr[mid+1]){
                start = mid+1;
            }
            else if(arr[mid]> arr[mid+1]){
                end = mid;
            }
        }
        return start;
    }


}
