package LeetCode.arrays;

//https://leetcode.com/problems/number-of-employees-who-met-the-target/description/


public class NumberOfEmployees {

    public static void main(String[] args) {
        int [] nums = {5,1,4,2,2};
        int target = 6;
        System.out.println(numberOfEmployeesWhoMetTarget(nums, target));


    }

    public static int numberOfEmployeesWhoMetTarget(int[] hours, int target) {
        int employee = 0;

        for(int i=0; i<hours.length; i++ ){
            if(hours[i] >= target){
                employee++;
            }
        }
        return employee;
    }

}

