package arrays;

import java.math.BigDecimal;

public class SignOfTheProductOfAnArray {
    public int arraySign(int[] nums) {
        int output = 0;
        int multiply = 1;
        for(int i = 0; i < nums.length; i++) {
            multiply *= nums[i];

            if (multiply > 0) {
                multiply = 1;
            } else if (multiply < 0) {
                multiply = -1;
            }
        }
            if (multiply > 0) {
                output = 1;
            } else if (multiply < 0) {
                output = -1;
            }

        return output;
    }
}
