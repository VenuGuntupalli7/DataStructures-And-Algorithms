package LeetCode.fundamentals.classes;

import java.util.Arrays;

public class ThisKeyWord {
    public static void main(String[] args) {

        Car car = new Car("Highland", 2024, 35555.99);
        System.out.println(car.model);
        System.out.println(car.yearOfMake);
        System.out.println(car.price);
    }

    public static class Car{
        String model;
        int yearOfMake;
        double price;

        Car(String m, int y, double p){
            this.model = m;
            this.yearOfMake = y;
            this.price = p;
        }

    }

}
