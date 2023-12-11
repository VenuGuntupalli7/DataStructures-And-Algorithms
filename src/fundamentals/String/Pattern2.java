package fundamentals.String;

public class Pattern2 {
    public static void main(String[] args) {

         pattern2(4);
         pattern3(4);
         pattern4(4);
    }
    public static void pattern2(int n){
        for (int row = 0; row <=n; row++) {
            for (int column = 0; column <=n-row; column++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }

    public static void pattern3(int n){
        for(int row=0; row<=n; row++){
            for(int column=0; column<=row; column++){
                System.out.print('*');
            }
            System.out.println();
        }
    }

    public static void pattern4(int n){
        for (int row = 1; row <=n; row++) {
            for (int column = 1; column<=row; column++) {
                System.out.print(column);
            }
            System.out.println();
        }

    }

}
