package DailyCodeChallenge.array;


import java.lang.reflect.Array;
import java.util.Arrays;

public class MoveZeros {
    public static void main(String[] args) {
        int[] array = {1, 0, 8, 4, 0, 2};
        moveZeroes(array);
        for (int num : array) {
            System.out.print(num + " ");
        }
    }


    public static void moveZeroes(int[] nums) {
        int zeroIndex = 0;
        for (int index = 0; index < nums.length; index++) {
            System.out.println(Arrays.toString(nums));
            if(nums[index] != 0) {
                //swap the element and increase nonzeroindex
                int tmp = nums[index] ;
                nums[index] = nums[zeroIndex];
                nums[zeroIndex] = tmp;
                zeroIndex++;
            }
        }
    }

}
