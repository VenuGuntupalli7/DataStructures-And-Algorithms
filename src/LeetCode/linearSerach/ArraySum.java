package LeetCode.linearSerach;

public class ArraySum {
    public static void main(String[] args) {
        int[][] accounts = {{1, 5},
                            {7, 3},
                            {3, 5}};
        System.out.println(maximumWealth(accounts));
    }

    //A customer's wealth is the amount of money they have in all their bank accounts.
    // The richest customer is the customer that has the maximum wealth.
    //Return the wealth that the richest customer has.
    public static int maximumWealth(int[][] accounts) {
        int answer = Integer.MIN_VALUE;
        for (int person = 0; person < accounts.length; person++) {
            int rowsum = 0;
            for (int bankAccount = 0; bankAccount < accounts[person].length; bankAccount++) {
                rowsum += accounts[person][bankAccount];
            }

            if(rowsum > answer){
                answer = rowsum;
            }
        }
        return answer;
    }

}

