package fundamentals.ConditionsAndLoops;


public class Conditions {
    public static void main(String[] args) {

        /*
         come on you know how if else conditions work
        */

        int age  = 50;

        //Multiple if/else if conditions
        if ( age<10 || age<15 ){
            System.out.println("You're a Child");
        }
        else if (age<18 && age<24){
            System.out.println("You're an adlut");
        }
        else if (age<25){
            System.out.println("You're a grown up");
        }
        else if(age<40){
            System.out.println("You're getting old!");
        }
        else{
            age+=15;
            System.out.println("I'm going to Mars at the age of " + age);
        }

    }
}
