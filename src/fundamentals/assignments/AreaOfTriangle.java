package fundamentals.assignments;

import java.util.Scanner;

public class AreaOfTriangle {
    public static void main(String[] args) {

        Scanner triangle = new Scanner(System.in);
        System.out.println("please enter altitude : ");
        int altitude = triangle.nextInt();
        System.out.println("please enter base : ");
        int base = triangle.nextInt();
        int area = (base*altitude)/2;
        System.out.println("The area of triangle is " + area);
    }
}

