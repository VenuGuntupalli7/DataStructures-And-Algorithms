package LeetCode.fundamentals.arraysAndArrayList;

import java.util.ArrayList;


public class ExampleOfArrayList {
    public static void main(String[] args) {
        //syntax

        // ArrayList is not a fixed sized data structure,
        // we can increase or decrease the size of an ArrayList once even though it is created
        // when it comes to Array it is a fixed size data structure, we cannot increase the size once it is created
        // the best example for an ArrayList is Shopping Cart, we can increase the items in a list or remove the items if want to
        //in those type of cases ArrayList would be the best and more flexible


        ArrayList<String> list = new ArrayList<>();

        list.add("Tesla");
        list.add("Ferrari");
        list.add("Lambo");
        list.add("Merc");
        list.add("BMW");

        System.out.println(list); // Print all the elements stored in a list

        System.out.println(list.set(4, "Toyota")); //updated the 4th element in a list by using .set()
        System.out.println(list);

        System.out.println(list.add("Rivian")); // .add() used to add an element to the end of the ArrayList.
        System.out.println(list);

        System.out.println(list.size()); // retrives the size of an ArrayList

        System.out.println(list.contains("Rivian")); // check if the specified element is present or not in the ArrayList

        System.out.println(list.indexOf("Merc"));

        list.set(3, "buggati");
        System.out.println(list); // .set(index, element) will set the element at specified index in the Arryalist to specified value

    }
}
