package LeetCode.fundamentals.assignments;

import java.util.Scanner;

public class VolumeOfSphere {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("please enter radius : ");
        int r =input.nextInt();
        double volume =  ((double) 4 /3) * ( (Math.PI) * (Math.pow(r, 3)) ) ;
        System.out.println("The volume of Sphere is : " +  volume);

    }
}
