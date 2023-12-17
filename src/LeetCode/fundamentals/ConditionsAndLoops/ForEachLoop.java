package LeetCode.fundamentals.ConditionsAndLoops;

public class ForEachLoop {
    public static void main(String[] args) {


        //Print number from 0 to 10 via Approach using for-each loop
        System.out.println("Zero to Ten consists of ");
        int [] object = {0,1,2,3,4,5,6,7,8,9,10};
        for(int i : object){
            System.out.print(i + ", ");
        }
    }
}

