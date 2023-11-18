package basics;

import java.util.Scanner;

public class TypeCasting {
    public static void main(String[] args) {

        Scanner number = new Scanner(System.in);
        float num = number.nextInt();
        System.out.println(num);


        //DataType casting
        int num1 = (int) (56.77);
        System.out.println(num1);
        int v = 300;
        byte b = (byte) v;
        System.out.println(b);


        byte a = 50;
        byte b1 = 80;
        byte c = 20;

        int  d = (a*b1) /c ;

        System.out.println(d);



    }
}
