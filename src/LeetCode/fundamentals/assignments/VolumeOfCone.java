package LeetCode.fundamentals.assignments;

import java.util.Scanner;

public class VolumeOfCone {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        float h = input.nextInt();
        int r = input.nextInt();

        double volume = Math.PI *  r*r * (h/3);
        System.out.println("The volume of cone is " + volume);

    }
}
