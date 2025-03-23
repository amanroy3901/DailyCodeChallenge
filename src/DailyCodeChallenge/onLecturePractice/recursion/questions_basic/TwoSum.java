package DailyCodeChallenge.onLecturePractice.recursion.questions_basic;

import java.util.Arrays;
import java.util.HashMap;

public class TwoSum {

    public static void main(String[] args) {
        int arr[]  = twoSum(new int[] {2,7,11,15}, 9);
        System.out.println(Arrays.toString(arr));
    }

    public static int[] twoSum(int[] nums, int target) {
        HashMap<Integer , Integer> map  = new HashMap<>();
        for(int index= 0; index < nums.length; index++) {
            int compliment = target - nums[index];
            if(map.containsKey(compliment)) {
                return new int[]{map.get(compliment) , index};
            }
            map.put(nums[index] , index);
        }
        return new int[] {-1, -1};
    }
}
