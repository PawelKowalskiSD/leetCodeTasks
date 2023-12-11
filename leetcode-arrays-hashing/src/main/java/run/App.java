package run;

import arrays.TwoSum;

import java.util.Arrays;

public class App {
    public static void main(String[] args) {
        int[] nums = new int[] {4,3,2};
        TwoSum twoSum = new TwoSum();
        System.out.println(Arrays.toString(twoSum.twoSum(nums, 6)));
    }
}
