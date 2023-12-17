package LeetCode.fundamentals.assignments;

import java.util.Scanner;

public class AreaOfRectangle {
    public static void main(String[] args) {
        Scanner area  = new Scanner(System.in);
        System.out.println("please enter length :" );
        int length = area.nextInt();
        System.out.println("please enter width :");
        int width  = area.nextInt();
        int areaTriangle = width*length;
        System.out.println("the are of triangle is " + areaTriangle);
    }
}
