package basics.switchCasesAndNestedLoops;

import java.util.Scanner;

public class SwitchCases {
    public static void main(String[] args){



        Scanner input = new Scanner(System.in);
        System.out.println("please enter the car name: ");
        String cars = input.next();

        // optimized way of writing switch cases
        switch (cars) {
            case "Tesla" -> System.out.println("World's best EV car!");
            case "Ferrari" -> System.out.println("World's best dream car!");
            case "BMW" -> System.out.println("World's best pickup car");
            default -> System.out.println("please enter a valid car name");
        }



        System.out.println("please enter the day number: " );
        int days = input.nextInt();

        //old way of writing switch cases
        switch (days) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("please enter a valid number");
                break;
        }


        //writing the same above program as weekdays and weekends

        switch (days){

            case 1,2,3,4,5 -> System.out.println("Happy weekday");
            case 6,7 -> System.out.println("Happy Weekend");
        }

    }
}

