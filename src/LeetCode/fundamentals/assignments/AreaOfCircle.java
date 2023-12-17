package LeetCode.fundamentals.assignments;

import java.util.Scanner;

public class AreaOfCircle {
    public static void main(String[] args) {

        Scanner circle = new Scanner(System.in);
        System.out.println("Please enter radius of circle: ");
        int radius = circle.nextInt();
        double area = Math.PI * (radius*radius);
        System.out.println("The area of circle is " + area);



    }
}
