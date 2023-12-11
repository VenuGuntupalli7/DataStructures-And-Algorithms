package fundamentals.assignments;

import java.util.Scanner;

public class PerimeterOfCircle {
    public static void main (String[] args){

        Scanner input = new Scanner(System.in);

        //perimeter of circle
        /*System.out.println("please enter radius: ");
        int r = input.nextInt();
        double area = 2*Math.PI*r;
        System.out.println("The Perimeter of circle is " + area);*/


        //perimeter of rectangle
        System.out.println("please enter length: ");
        int l = input.nextInt();
        System.out.println("please enter Width: ");
        int w = input.nextInt();
        int area = 2* (l+w);
        System.out.println("The Perimeter of circle is " + area);


    }
}
