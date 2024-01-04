package arrays;

public class MajorityElement {
    public int majorityElement(int[] nums) {
        int count = 0;
        int result = 0;
        for (int i = 0; i < nums.length; i++) {
            if (count == 0)
                result = nums[i];
            count = (result == nums[i]) ? count + 1 : count - 1;
        }
        return result;
    }
}
