package LeetCode.sorting;

class missingNumber {
    public static void main(String[] args) {
        int[] nums = {9,6,4,2,3,5,7,0,1};
        System.out.println(missingNumber(nums));
    }
    public static int missingNumber(int[] nums) {
        int i = 0;

        while(i<nums.length){
            int index = nums[i];

            if(nums[i]<nums.length && nums[i] != nums[index]){
                swap(nums, i, index);
            }
            else{
                i++;
            }
        }
        

        //check for missing number
        for(int ind=0; ind<nums.length; ind++){
            if(nums[ind] != ind){
                return ind;
            }
        }

        //case 2 where N(nums.length) is not there in array
        return nums.length;
    }

    public static void swap(int[] nums, int a, int b){
        int temp = nums[b];
        nums[b] = nums[a];
        nums[a] = temp;
    }
}