package arrays;

public class ProductOfArrayExceptSelf {

    public int[] productExceptSelf(int[] nums) {
        int[] answer = new int[nums.length];
        int sum = 1;
        for (int i = 0; i < nums.length; i++) {
            answer[i] = sum;
            sum *= nums[i];
        }
        int result = 1;
        for (int i = nums.length - 1; i >= 0; i--) {
            answer[i] *= result;
            result *= nums[i];
        }
        return answer;
    }
}
