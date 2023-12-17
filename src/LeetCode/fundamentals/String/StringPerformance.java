package LeetCode.fundamentals.String;

public class StringPerformance {
    public static void main(String[] args) {

        String series = "";
        for (int i = 0; i < 26; i++) {
            char literal = (char) ('a' + i);
            //System.out.println(literal);
            series = series + literal;
        }
        System.out.println(series);
    }
}
