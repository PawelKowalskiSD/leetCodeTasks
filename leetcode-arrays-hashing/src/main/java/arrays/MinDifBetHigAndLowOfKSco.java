package arrays;

import java.util.Arrays;

public class MinDifBetHigAndLowOfKSco {
    public int minimumDifference(int[] nums, int k) {
        if(k == 1) {
            return 0;
        }
        Arrays.sort(nums);
        int result = Integer.MAX_VALUE;
        for(int i = 0; i < nums.length - k + 1; i++) {
            int diff = Math.abs(nums[i] - nums[i + k - 1]);
            result = Math.min(diff, result);
        }
        return result;
    }
}
