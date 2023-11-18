package basics.arraysAndArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class MultiDimArrayList {
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);
       ArrayList<ArrayList<Integer>> numbers = new ArrayList<>();

       // initialization
        for (int i = 0; i < 3; i++) {
            numbers.add(new ArrayList<>());
        }

        // add elements
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                numbers.get(i).add(input.nextInt());
            }
        }
        System.out.println(numbers);
    }
}
