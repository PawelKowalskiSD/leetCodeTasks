package arrays;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class LongestConsecutiveSequence {
    public int longestConsecutive(int[] nums) {
        Set<Integer> result = new HashSet<>();
        int count = 0;
        for(Integer sets : nums) {
            result.add(sets);
        }
        for(int i = 0; i < nums.length; i++) {
            if(!result.contains(nums[i] - 1)) {
                int size = 0;
                while(result.contains(nums[i] + size)) {
                    size += 1;
                    count = Math.max(size, count);
                }
            }
        }
        return count;
    }
}
