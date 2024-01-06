package arrays;

import java.util.ArrayList;
import java.util.List;

public class FindAllNumbers {

    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            int res = nums[i] - 1;
            if (nums[i] != nums[res]) {
                int temp = nums[i];
                nums[i] = nums[res];
                nums[res] = temp;
                i--;
            }
        }
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] - 1 != i)
                result.add(i + 1);
        }
        return result;
    }
}
