package fundamentals.ConditionsAndLoops;

public class CountingOccuranceTask2 {
    public static void main(String[] args) {

        //reverse the given number
        //given number is 23597  and answer should be 79532

        int  num = 123456789;
        int  answer = 0;

        while(num>0){
            int remainder = num%10;
            answer = answer * 10 + remainder;
            num = num/10;
        }
        System.out.println("The reverse of given number is " + answer);

        int n = 123323133;
        int count = 0;

        while (n > 0) {
            int remainder = n%10;
            if(remainder ==3){
                count++;
            }
            n =n /10;
        }
        System.out.println("The counting occurance of number 3 is " + count + " times");
    }
}
