package LeetCode.arrays;

// https://leetcode.com/problems/final-value-of-variable-after-performing-operations/
public class FinalValueOfVariable {
    public static void main(String[] args) {
        String [] operations = {"++X","++X","X++"};
        System.out.println(finalValueAfterOperations(operations));

    }
    //== operator only compares object references, while the String. equals() method compares both String 's values i.e.
    // the sequence of characters that make up each String .
    public static int finalValueAfterOperations(String[] operations) {
        int x = 0;

        for(int i=0; i<operations.length; i++){
            if(operations[i].equals("++X") || operations[i].equals("X++")){
                x++;
            }
            if(operations[i].equals("--X")|| operations[i].equals("X--")){
                x--;
            }
        }
        return x;
    }
}
