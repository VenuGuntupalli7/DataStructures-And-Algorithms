package basics;

import java.util.Scanner;

public class Inputs {
    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);
        System.out.println("please enter your car name: ");
        String car= reader.nextLine();
        System.out.println("your car is " + car);
    }

    public static class Primitive {
        public static void main(String[] args) {

           //basics.Inputs.Primitive data types
           int age = 25;
           float lifeSpan = 77.99f;
           char surname = 'G';
           long networth = 778923400l;
           double familyWorth = 384353538434d;
           short size = 6;
           boolean always = true;
           byte equals = 8;


        }
    }
}
