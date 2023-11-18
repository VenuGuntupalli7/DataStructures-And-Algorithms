package basics.ConditionsAndLoops;

import java.util.Scanner;

public class CaseCheck {
    public static void main(String[] args) {

       Scanner input = new Scanner(System.in);

       /*//remove white spaces at beginning or ending
       String name = input.next().trim();
       System.out.println(name);

        //only print the character at whatever index you choose to print
        char city = input.next().trim().charAt(5);
        System.out.println(city);


        // .next() Splits the entire line-up to individual words, returning as Individual text Strings one at a time
        String name1 = input.next();
        // .nextLine() will print the entire line which we gave as input from terminal
        String last = input.nextLine();
        System.out.println(name1);
        System.out.println(last);*/


        //Task:- you have to identify whether it's an UpperCase or LowerCase

        char state = input.next().charAt(0);



        if(state >='a' && state <='z'){
            System.out.println("above mentioned state is lowercase");
        }
        else if(state >='A' && state <='Z'){
            System.out.println("above mentioned state is Uppercase");
        }
        else {
            System.out.println("it is failed");
        }






    }
}
