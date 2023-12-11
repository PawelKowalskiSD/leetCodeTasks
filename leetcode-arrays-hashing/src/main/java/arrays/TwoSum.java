package arrays;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> result = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int sum = target - nums[i];
            if (result.containsKey(sum)) {
                return new int[]{result.get(sum), i};
            }
            result.put(nums[i], i);
        }
        throw new IllegalArgumentException("N");
    }
}
