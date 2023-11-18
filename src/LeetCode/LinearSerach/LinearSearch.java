package LeetCode.LinearSerach;

// Yay!!!! I solved this problem by myself and did it without seeing
// an answer and very little help from Chatgpt at the end!

public class LinearSearch {
    public static void main(String[] args){

        int[] array ={10, 15, 17, 29, 35, 67, 89, 42};
        int target = 42;
        int answer = search(array, target);
        System.out.println(answer);
    }
    // search in the array: return the index if the item found
    // otherwise if item not found return -1
    static int search(int[] array, int targetDiff){

        for(int i=0; i<array.length; i++){
            if(array[i] == targetDiff){
                return i;
            }
        }
       return -1;
    }
}
