package fundamentals.MethodsOrFunctions;

public class Swap {
    public static void main(String[] args) {

        int a = 30;
        int b = 60;

        //swap numbers code
//        int temp = a;
//        a=b;
//        b=temp;

        swap(a, b);
        System.out.println(a +" "+b);

//        String name = "Elon Musk";
//        ChangeName(name);
//        System.out.println(name);

    }

//    static void ChangeName(String numb){
//        numb = "Venu Guntupalli";
//        System.out.println("the value of numb is " + numb);
//    }

    static void swap(int num1, int num2){
        int temp = num1;
        num1=num2;
        num2=temp;
    }
}
