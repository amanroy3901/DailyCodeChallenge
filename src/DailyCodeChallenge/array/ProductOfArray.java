package DailyCodeChallenge.array;

import java.util.Arrays;

public class ProductOfArray {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(productExceptSelf(new int[]{1,2,3,4})));
    }

    public static int[] productExceptSelf(int[] nums) {
        int[] productArray = new int[nums.length];
        int product = 1;
        for (int index = 0; index < nums.length; index++) {
            product *= nums[index];
        }
        for (int index = 0; index < nums.length; index++) {
            if(product !=0 && nums[index] !=0) {
                productArray[index] = product / nums[index];
            } else {
                productArray[index] =0;
            }
        }
        return productArray;
    }
}
