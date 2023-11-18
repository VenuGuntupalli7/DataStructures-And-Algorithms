package LeetCode.binarySearch;


public class InfiniteLoop {
    public static void main(String[] args) {

        int[] nums = {3,5,7,9,10,90,100,130,140,160,170};//imagine this array is infinite
        int target = 10;
        System.out.println(ans(nums,target));

    }

    static int ans(int[] nums, int target) {
        //first find the range
        //let's start with the box of size 2
        int start = 0;
        int end = 1;

        //
        while(target >nums[end]){
            int newStartOrtemp = end +1; // just like the way we did for temp/this is  my new start
            //double the box value
            // formula for end = Previous end + sizeofbox *2
            // end = 1 + 2*2 =5 as an example
            end = end + (end-start +1)*2;
            start = newStartOrtemp ;
        }
        return search(nums,target,start,end);

    }

    // this function returns the index value of target
    static int search(int[] nums, int target, int start, int end){

        while (start <= end) {
            int middle = start + (end - start) / 2;

            if (target < nums[middle]) {
                end = middle - 1;
            }
            else if(target>nums[middle]){
                start = middle + 1;
            }
            else {
                return middle;
                }
            }
        return -1;
    }
}

