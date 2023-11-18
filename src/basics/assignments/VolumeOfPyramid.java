package basics.assignments;

import java.util.Scanner;

public class VolumeOfPyramid {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int l = input.nextInt();
        int w = input.nextInt();
        int h = input.nextInt();
        int v = (l*w*h)/3;
        System.out.println("The volume of Pyramid is " + v);
    }
}
