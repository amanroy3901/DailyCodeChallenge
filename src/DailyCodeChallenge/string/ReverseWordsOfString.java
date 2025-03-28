package DailyCodeChallenge.string;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ReverseWordsOfString {

    public static void main(String[] args) {
        String str = "the sky is blue";
        System.out.println(reverseWords(str));
    }

    public static String reverseWords(String s) {
        String[] words = s.split("\\s+");
        StringBuilder reversedString = new StringBuilder();
        for (int index = words.length-1; index >= 0; index--) {
            reversedString.append(words[index]);
            if(index != 0) {
                reversedString.append(" ");
            }
        }
    return reversedString.toString();
    }
}
