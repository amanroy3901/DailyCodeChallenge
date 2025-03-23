package DailyCodeChallenge.onLecturePractice.recursion.questions_basic;

public class PrintNumber {
    public static void main(String[] args) {
        printnto1And1ton(5);
    }

    static void printNumber1ton(int n) {
        if(n==1) {
            System.out.println(1);
            return;
        }
        printNumber1ton(n-1);
        System.out.println(n);
    }

    static void printNumbernto1(int n) {
        if(n==1) {
            System.out.println(1);
            return;
        }
        System.out.println(n);
        printNumbernto1(n-1);
    }

    static void printnto1And1ton(int n) {
        if(n == 1) {
            System.out.println(1);
            return;
        }
        System.out.println(n);
        printnto1And1ton(n-1);
        System.out.println(n);
    }
}
