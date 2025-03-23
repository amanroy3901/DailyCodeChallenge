package DailyCodeChallenge.onLecturePractice.recursion.questions_basic;

public class ProductOfDigit {
    public static void main(String[] args) {
        System.out.println(productOfDigit(55));
    }

    static int productOfDigit(int n) {
        if(n%10 == n) {
            return n;
        }
        return productOfDigit(n/10) * (n%10) ;
    }
}
