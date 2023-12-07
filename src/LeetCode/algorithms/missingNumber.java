package LeetCode.algorithms;

class missingNumber {
    public int missingNumber(int[] nums) {
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

    public void swap(int[] nums, int a, int b){
        int temp = nums[b];
        nums[b] = nums[a];
        nums[a] = temp;
    }
}