package arrays;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Duplicate {
    public boolean containsDuplicate(int[] nums) {
        Integer[] result = new Integer[nums.length];
        boolean duplicate = true;
        for(int n = 0; n < nums.length; n++) {
            result[n] = nums[n];
        }
        Set<Integer> resultSet = new HashSet<>(Arrays.asList(result));
        if (resultSet.size() == nums.length)
            duplicate = false;
        return duplicate;
    }
}
