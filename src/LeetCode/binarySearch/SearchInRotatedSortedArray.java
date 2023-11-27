package LeetCode.binarySearch;

public class SearchInRotatedSortedArray {

        public int search(int[] nums, int target) {

            int pivot = pivot(nums);

            //not able to find pivot, that means not a rotated array
            if(pivot == -1){
                return binary(nums, target, 0, nums.length-1);
            }

            //able to find pivot, then will 2 asc arrays
            if(nums[pivot] == target){
                return pivot;
            }
            if(target >= nums[0]){
                return binary(nums, target, 0, pivot-1);
            }
            return binary(nums, target, pivot+1, nums.length-1);
        }

        //regular binary serach method incase if there's no pivot
        int binary(int[] nums, int target, int start, int end){
            while(start<=end){
                int mid = start + (end-start)/2;

                if(target> nums[mid]){
                    start = mid+1;
                }
                else if (target< nums[mid]){
                    end = mid-1;
                }
                else{
                    return mid;
                }
            }
            return -1;
        }


        //find pivot
        int pivot(int[] nums){
            int start = 0;
            int end = nums.length-1;

            while(start<=end){
                int mid = start + (end-start)/2;

                if(mid<end && nums[mid]>nums[mid+1]){
                    return mid;
                }
                if(mid>start && nums[mid]<nums[mid-1]){
                    return mid-1;
                }
                if(nums[mid] <= nums[start]){
                    end = mid - 1;
                }
                else{
                    start = mid + 1;
                }
            }
            return -1;
        }
    }

