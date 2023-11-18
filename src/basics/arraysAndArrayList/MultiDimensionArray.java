package basics.arraysAndArrayList;

public class MultiDimensionArray {
    public static void main(String[] args) {

        /*

             1 2 3                   -->> ROWS(values store in horizontal way)
             4 5 6
             7 8 9


            COLUMNS(values store in vertical ways)
         */

        // int[] [] array = new int[3][3]; // first[] is for rows, second[] is for columns

        int[] [] arrd = new int[3][]; //number rows are mandatory not the columns

        int[] [] arr = {             // each row store as an individual object
                {1,2,3,4},           // -->> the first row store in Oth index of an arr(array)
                {5,6,7},             // -->> the second row store in 1 th index of an arr(array)
                {8,9,10,11,12,13}    // -->> the first row store in 2nd index of an arr(array)
        };

        int num = arr[2][4];       // here we are storing 2nd index, inside 2nd index we are calling 4th index of the 2nd index objecty
        System.out.println(num);
     }
}
