package LeetCode.String;

import java.util.ArrayList;
import java.util.List;

public class findWordsContainingCharacter {
    public static void main(String[] args) {
        String[] words = {"Leet", "Code"};
        char x = 'e';
        System.out.println(findWords(words, x));

    }

    public static List<Integer> findWords(String[] words, char x){

        List<Integer> answer = new ArrayList<>();
        for(int i=0; i<words.length; i++){
            for(int j=0; j<words[i].length(); j++){
                if(words[i].charAt(j) == x){
                   answer.add(i);
                   break;
                }
            }
        }
        return answer;
    }
}
