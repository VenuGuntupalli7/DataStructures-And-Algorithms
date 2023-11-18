package basics.ConditionsAndLoops;

import java.util.Scanner;

public class CalculatorProgram {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Take the input from user until user does not use x or X
        int n = 0;

        while (true){

            System.out.print("Enter the Operator: ");
            char ch = input.next().trim().charAt(0);

            if(ch == '+' || ch == '-' || ch == '*' || ch == '/' || ch == '%'){

                System.out.print("Enter two numbers: ");
                int num1 = input.nextInt();
                int num2 = input.nextInt();

                if( ch == '+'){
                    n = num1 + num2;
                    break;
                }
                if( ch == '-'){
                    n = num1 - num2;
                    break;
                }
                if( ch == '*'){
                    n = num1 * num2;
                    break;
                }
                if( ch == '/'){
                    if(num2 != 0){
                        n = num1 / num2;
                        break;
                    }
                }
                if( ch == '%'){
                    n = num1 % num2;
                    break;
                }
            } else if (ch == 'x' || ch =='X'){
                break;
            }else {
                System.out.println("Invalid Operator");
            }
        }
        System.out.println(n);
    }
}
