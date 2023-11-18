package basics.assignments;

import java.util.Scanner;

public class AreaOfEquilateralTriangle {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("please enter value of a :");
        int a = reader.nextInt();
        double area = Math.sqrt(3)/4 * (a*a);
        System.out.println("The area of quilateral triangle is " + area);
    }
}
