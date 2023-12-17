package LeetCode.fundamentals.arraysAndArrayList;

public class ArrayInterviewQuestions {

    public static void main(String[] args) {

        int[] numbers = {2,5, 29, 49, 53};

        //iterate via for loop for a given array
        for(int i =0; i<numbers.length; i++){
            System.out.println(numbers[i]);
        }

        //iterate via for-each loop for a given array
        for(int a : numbers){
            System.out.println(a);
        }

        //System.out.println(Arrays.toString(numbers));
    }

}
