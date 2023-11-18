package basics.MethodsOrFunctions;


public class Overloading {
    public static void main(String[] args){
        //add(17);
        //add("Venu");
        int deb = sum(3, 5,7); // based on the number of values you passed here will pick the method which it needs to execute
        System.out.println(deb);
    }

    // Method overloading can happen by passing different number/ type of arguments with same method name
    static void add(int a){
        System.out.println(a);
    }

    static void add(String name){
        System.out.println(name);
    }

    static int sum(int a, int b){
       return a+b;
    }
    static int sum(int a, int b, int c){
        return a+b+c;
    }


}

