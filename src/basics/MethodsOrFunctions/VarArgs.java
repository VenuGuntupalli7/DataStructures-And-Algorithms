package basics.MethodsOrFunctions;

import java.util.Arrays;

public class VarArgs {
    public static void main(String[] args) {
      arr(3,5,78,99,44,25,5);
      arrray2(34,34, "Venu", "Kalyan", "Jyothi", "Peddabbai");
    }
    static  void arr(int... v){
        System.out.println(Arrays.toString(v));
    }

    static void arrray2(int a, int b, String... v){
        System.out.println(Arrays.toString(v));
    }
}
