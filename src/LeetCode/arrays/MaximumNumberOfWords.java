package LeetCode.arrays;

public class MaximumNumberOfWords {
    public static void main(String[] args) {
        String [] sentences = {"alice and bob love leetcode", "i think so too", "this is great thanks very much"};
        mostWordsFound(sentences);
    }


        public static int mostWordsFound(String[] sentences) {
            int count = 0;
            for (String sentence:sentences) {
                int maxCount = sentence.split(" ").length;
                if(maxCount>count){
                    count = maxCount;
                }
            }
            return count;
        }
    }

