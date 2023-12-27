package LeetCode.fundamentals.classes;

import java.util.Arrays;

public class ClassAndObject {

    public static void main(String[] args){
        //constructor is a special function/method, that returns when you create an object & it allocates some variables
        Student info = new Student();
        System.out.println(info.roll);
        System.out.println(info.name);
        System.out.println(info.marks);
    }

    // create a class & it should consist of every student info
    public static class Student{
        int roll; // here we just declared, not initialized
        String name;
        float marks;

        // we need a way to add the values of the above properties object by object
        // we need one word to access every object
        Student(){
            this.roll = 1;
            this.name = "Venu";
            this.marks = 77.7f;

        }

    }
}
