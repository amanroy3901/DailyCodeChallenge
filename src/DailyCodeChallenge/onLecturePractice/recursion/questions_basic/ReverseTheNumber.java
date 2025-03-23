package DailyCodeChallenge.onLecturePractice.recursion.questions_basic;

public class ReverseTheNumber {
    public static void main(String[] args) {
        System.out.println(reverseNum(182));
    }

    static boolean ifPalin(int num) {
        return num == reverseNum(num);
    }

    private static int reverseNum(int num) {
        if(num < 10) {
            return num;
        }
        int numOfDigit = (int) Math.log10(num);
        int lastDigitOfNumber = num % 10;
        int remainingNumber = num / 10;
        return (int) (lastDigitOfNumber * Math.pow(10, numOfDigit) + reverseNum(remainingNumber));
    }


}
