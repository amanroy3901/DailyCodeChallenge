package DailyCodeChallenge.string;

public class GCDOfString {
    public static void main(String[] args) {
        System.out.println(gcdOfStrings("ABABAB" , "ABAB"));
    }

    public static String gcdOfStrings(String str1, String str2) {
        if(!(str1+str2).equals(str2+str1)) {
            return "";
        }

        int max =  str1.length();
        int min = str2.length();

        while (min !=0) {
         int reminder = max % min;
         max = min;
         min = reminder;
        }

        return str1.substring(0,max);
    }
}
