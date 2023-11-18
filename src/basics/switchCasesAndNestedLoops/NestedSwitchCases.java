package basics.switchCasesAndNestedLoops;

import java.util.Scanner;

public class NestedSwitchCases {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        int empID = input.nextInt();
        String dep = input.next();

        switch (empID) {
            case 1 -> System.out.println("Venu Guntupalli");
            case 2 -> {
                switch (dep) {
                    case "DEV" -> System.out.println("Developers team");
                    case "QA" -> System.out.println("qa team");
                    default -> System.out.println("No Department");
                }
            }
        }
    }
}
