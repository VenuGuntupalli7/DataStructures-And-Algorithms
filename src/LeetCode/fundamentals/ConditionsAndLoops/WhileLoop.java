package LeetCode.fundamentals.ConditionsAndLoops;

public class WhileLoop {
    public static void main(String[] args) {

        // WE CAN USE WHILE-LOOP WHEN WE DON'T KNOW HOW MANY TIMES THE LOOP NEED TO RUN
        int age =10;
        while (age <= 20){
            System.out.println(age);
            age++;
        }

        // one more way to do while loop
        int age1 = 20;
        while (age1 <= 30) {
            System.out.println(age1);
            age1 +=2;
        }
    }
}
