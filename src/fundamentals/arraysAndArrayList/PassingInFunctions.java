package fundamentals.arraysAndArrayList;

import java.util.Arrays;

public class PassingInFunctions {
    public static void main(String[] args){
        int [] number = {3,7,9,77,34};
        System.out.println(Arrays.toString(number));
        passing(number);
        System.out.println(Arrays.toString(number));
    }

    static void passing(int [] arr){
        arr[0]  = 77; // this is called mutable behavior!
    }
}

// Notes:-
// Strings are immutable & Arrays are mutable
// mutable means you change the object even though if it's already created!
//
// important interview question:-
// Why Strings are immutable?
// Strings are immutable in Java to ensure security, thread safety, efficient caching, and predictable behavior in APIs.
//
// Security:- Strings are often used to store sensitive information like passwords and cryptographic keys.
// Immutability ensures that once a string is created, it cannot be modified, preventing unintentional changes or security breaches.
//
// Thread Safety: Immutability makes strings inherently thread-safe.
// Since strings cannot be changed once created, multiple threads can safely access
// and share string objects without the need for explicit synchronization.
//
// Caching: Java maintains a pool of string literals in a special memory area
// called the "string pool" to conserve memory and improve performance.
// When you create a new string with the same value as an existing one,
// Java can simply return a reference to the existing string from the pool,
// saving memory and reducing the overhead of creating new objects.
//
//API Design: Immutability simplifies the design of APIs and the behavior of methods that involve strings.
// You can pass strings around without worrying about their values changing unexpectedly,
// leading to more predictable and maintainable code.
