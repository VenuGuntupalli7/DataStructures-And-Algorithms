package LeetCode.fundamentals.String;

public class Stream {
    public static void main(String[] args) {
        stream("", "banana");
    }

    static void stream(String processed, String unProcessed){

        //base condition
        if(unProcessed.isEmpty()){
            System.out.println(processed);
            return;
        }

        char ch = unProcessed.charAt(0);

        if (ch == 'a') {
            // skip it
            //recursion here
            stream(processed, unProcessed.substring(1));
        }
        else{
            //add it
            stream(processed+ch, unProcessed.substring(1));
        }
    }
}
