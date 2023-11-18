package basics.ConditionsAndLoops;

public class CountingOccuranceTask {
    public static void main(String[] args) {

        //find the 7's counting occurrences of a given number
        // given number = 1765787

        int n = 454647;

        int count =0;
        while (n>0){
            int remainder = n%10;
            if(remainder == 4){
                count++;
            }
            n = n/10;
        }
        System.out.println(count);
    }
}