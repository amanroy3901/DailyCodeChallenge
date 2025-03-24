package DailyCodeChallenge.array;

public class GreatestCommonDivisor {

    public static void main(String[] args) {
        System.out.println(findGCD(new int[] {2,5,6,9,10}));
    }

    public static int findGCD(int[] nums) {
        int gcd = 0;

        //finding min and max
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (int index = 0; index < nums.length; index++) {
            if(nums[index] > max) {
                max = nums[index];
            }
            if(nums[index] < min) {
                min = nums[index];
            }
        }
        System.out.println(max);
        System.out.println(min);


        return getGcd(max, min);
    }

    public static int getGcd(int max , int min) {
        while(min != 0 ) {
            int reminder = max % min;
            max = min;
            min = reminder;
        }
        return max;
    }

}
