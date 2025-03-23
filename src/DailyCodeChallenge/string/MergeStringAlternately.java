package DailyCodeChallenge.string;

public class MergeStringAlternately {

    public static void main(String[] args) {
        System.out.println(mergeAlternately("ac","pqr"));
    }
    public static String mergeAlternately(String word1, String word2) {
        int length = Math.max(word1.length(), word2.length());
        StringBuilder newString = new StringBuilder();
        for(int index = 0; index < length ; index++) {
            if(word1.length() > index) {
                newString.append(word1.charAt(index));
            }
            if(word2.length() > index) {
                newString.append(word2.charAt(index));
            }
        }
        return newString.toString();
    }
}
