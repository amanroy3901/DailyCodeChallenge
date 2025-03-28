package DailyCodeChallenge.string;

public class IsSubsquence {
    public static void main(String[] args) {
        String s = "axc", t = "ahbgdc";
        System.out.println(isSubsequence(s, t));
    }

    public static boolean isSubsequence(String s, String t) {
        if(s.length() == 0) {
            return true;
        }
        int index = 0;
        int subsIndex = 0;
        while (index < t.length() && subsIndex != s.length()) {
            if(s.charAt(subsIndex) == t.charAt(index)) {
                subsIndex++;
            }
            index++;
        }
        if(subsIndex == s.length()) {
            return true;
        } else {
            return false;
        }
    }
}

