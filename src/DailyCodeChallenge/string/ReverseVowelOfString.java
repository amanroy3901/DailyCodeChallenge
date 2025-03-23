package DailyCodeChallenge.string;

public class ReverseVowelOfString {
    public static void main(String[] args) {
        // "leetcode"
        // "leotcede"
        System.out.println(reverseVowels("leetcode"));
    }

    public static String reverseVowels(String s) {
        int start = 0;
        int end = s.length() - 1;
        char[] reversedArray = s.toCharArray();
        while (start < end) {
            if (isVowel(reversedArray[start]) && isVowel(reversedArray[end])) {
                // Swap the vowels
                char tmp = reversedArray[start];
                reversedArray[start] = reversedArray[end];
                reversedArray[end] = tmp;
                start++;
                end--;
            } else if (isVowel(reversedArray[start])) {
                end--;
            } else if (isVowel(reversedArray[end])) {
                start++;
            } else {
                start++;
                end--;
            }
        }
        return new String(reversedArray);
    }

    static boolean isVowel(char ch) {
        ch = Character.toLowerCase(ch);
        return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
    }
}
