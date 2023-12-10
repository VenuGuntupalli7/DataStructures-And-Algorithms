package basics.String;

public class StringComparsion {
    public static void main(String[] args) {
        //use case 1
        String name1 = "Venu";
        String name2 = "Venu";
        System.out.println(name1 == name2);  // true because name1 and name2 both pointed to same, the string object stored in String pool of a heap memory

        //use case 2
        String name3 = new String ("Venu");
        String name4 = new String("Venu");
        System.out.println(name3 == name4);  // this is false because even though we created two objects outside of String pool via using new keyword which
                                             // can create objects in heap memory. but the == will only be true if the bo th reference variables are pointed to single object


        System.out.println(name1.equals(name2));
        System.out.println(name1.charAt(3));

    }
}
