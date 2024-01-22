package algorithms;

import java.util.Arrays;

public class QuickSort {

    public int sortBasic(int[] nums, int start, int end) {
        int pivot = nums[end];
        int x = start - 1;
        for (int i = start; i < end; i++) {
            if (nums[i] < pivot) {
                x++;
                swap(nums, x, i);
            }
        }
        swap(nums, x + 1, end);
        return x + 1;
    }

    public void sortRecursive(int[] nums, int start, int end) {
        if (start < end) {
            int p = sortBasic(nums, start, end);
            sortRecursive(nums, start, p - 1);
            sortRecursive(nums, start + 1, p);
        }
        System.out.println(Arrays.toString(nums));
    }

    private void swap(int[] nums, int start, int end) {
        int temp = nums[start];
        nums[start] = nums[end];
        nums[end] = temp;
    }
}
