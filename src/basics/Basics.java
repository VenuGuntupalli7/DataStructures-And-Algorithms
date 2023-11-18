package basics;

import java.util.Scanner;

public class Basics {
    public static void main(String[] args) {
        int a = 20;
        //Basic If condition
        /*if (a == 10 ) {
            System.out.println("Hello World!");
        }
        else {
            System.out.println("Generative AI");
        }*/


        //while loop
       /* int number = 0;
        while (number <= 8){
            System.out.println(number);
            number++;
        }*/


        //for loop
/*
        for (int num=0; num<10; num++){
            System.out.println(num);
        }
*/

        //
        Scanner reader = new Scanner(System.in);
        System.out.println("Please enter temperature in Celsius(C) : ");
        float tempC = reader.nextFloat();
        float tempF = (tempC * 9/5) +32 ;
        System.out.println("The temperature in fahrenheit is : " + tempF);
    }
}
