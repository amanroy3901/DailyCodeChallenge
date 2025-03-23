package DailyCodeChallenge.onLecturePractice.recursion.questions_basic;

public class SumOfDigits {
    public static void main(String[] args) {
        System.out.println(sumOfDigit(5340));
    }

    static int sumOfDigit(int n) {//5340
        if(n <= 1) {
            return n;
        }
        return sumOfDigit(n /10) + n%10;
    }
}
