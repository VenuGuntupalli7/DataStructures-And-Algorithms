package fundamentals.arraysAndArrayList;

import java.util.Arrays;

public class Swap{
    public static void main(String[] args){


        int[] number = {10,20,30,40,50};
        swaping(number,1,4);
        System.out.println(Arrays.toString(number));
    }

    public static void swaping(int[]number,int a, int b){
        int temp = number[b];
        number[b] = number[a];
        number[a] = temp;
    }
}
