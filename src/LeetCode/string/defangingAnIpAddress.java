package LeetCode.string;

public class defangingAnIpAddress {

    //A defanged IP address replaces every period "." with "[.]".
    //https://leetcode.com/problems/defanging-an-ip-address/

    public static void main(String[] args) {
        String address = "1.1.1.1";
        System.out.println(address.replace(".", "[.]"));

    }

}
