package DailyCodeChallenge.string;

public class RemoveStarFromString {


    public static void main(String[] args) {
        System.out.println(removeStars("erase*****"));
    }

    public static String removeStars(String s) {
        StringBuilder newString = new StringBuilder();

        for(int index = 0; index < s.length(); index++) {
            if(s.charAt(index) != '*' ) {
                newString.append(s.charAt(index));
            } else {
                newString.deleteCharAt(newString.length()-1);
            }
        }
        return newString.toString();
    }
}
