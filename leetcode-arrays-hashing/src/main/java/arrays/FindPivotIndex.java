package arrays;

public class FindPivotIndex {
    public int pivotIndex(int[] nums) {
        int sumLeft = 0;
        int total = 0;
        int pivot = -1;
        for(int i = 0; i < nums.length; i++) {
            total += nums[i];
        }
        for(int j = 0; j < nums.length; j++) {
            int sumRight = total - nums[j] - sumLeft;
            if(sumLeft == sumRight) {
                pivot = j;
                break;
            }
            sumLeft += nums[j];
        }
        return pivot;
    }
}
