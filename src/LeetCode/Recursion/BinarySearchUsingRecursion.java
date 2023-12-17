package LeetCode.Recursion;



public class BinarySearchUsingRecursion {
    public static void main(String[] args) {
        int[] arr = {1,3,5,7,11,20,39,45,75};
        int target =45;
        System.out.println(search(arr,target,0,arr.length-1));

    }

    static int search(int[] arr, int target, int start, int end){

            if(start>end){
                return -1;
            }

            //body
            int middle = start + (end - start)/2;

            if(arr[middle] == target){
                return middle;
            }

            if(arr[middle]>target){
                return search(arr,target,start,middle-1);
            }

                return search(arr,target, middle+1, end);

            }
    }

