package LeetCode.binarySearch;

public class BinarySearchWithOutSortingArray {
    public static  void main(String[] args){
        int [] array = {1,3,5,7,9,11,13,15,17,19,25,50,75,100};
        //int [] desArray = {100,75,50,25,19,17,15,13,11,9,7,5,3,1};
//        int [] notSortedArray = {3,10,18,2,1};
//        Arrays.sort(notSortedArray);
//        System.out.println(Arrays.toString(notSortedArray));
        int target = 11;
        int answer = binarySearch(array,target);
        System.out.println(answer);

    }

    public static int binarySearch(int[] arraydiff, int targetdiff) {

        int start = 0;
        int end = arraydiff.length-1;

        boolean isAsc = arraydiff[start]<arraydiff[end];

        while (start <=end){
            int middle = start + (end-start)/2;

            if(arraydiff[middle]== targetdiff){
                return middle;
            }

            if(isAsc){
                if(targetdiff<arraydiff[middle]){
                    end = middle-1;
                }
                else{
                    start = middle +1;
                }
            }
            else {
                if(targetdiff>arraydiff[middle]){
                    end = middle -1;
                }else{
                    start = middle +1;
                }
            }
        }
        return -1;
    }
}