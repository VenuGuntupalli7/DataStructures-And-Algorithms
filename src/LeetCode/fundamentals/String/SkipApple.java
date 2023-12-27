package LeetCode.fundamentals.String;

public class SkipApple {
    public static void main(String[] args) {
        System.out.println(skipApple("dapf"));
    }

    static String skipApple(String p){
        if(p.isEmpty()){
            return "";
        }

        if(p.startsWith("ap")){
            return skipApple(p.substring(2));
        }else{
            return  p.charAt(0) + skipApple(p.substring(1));
        }
    }
}
