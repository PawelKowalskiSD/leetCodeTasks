package arrays;

import java.util.Arrays;

public class SortColors {
    public void sortColors(int[] nums) {
        sort(nums, 0, nums.length-1);
        System.out.println(Arrays.toString(nums));
    }

    private int[] sort(int[] array, int start, int end) {
        if(start < end) {
            int mid = (end - start) / 2 + start;
            sort(array, start, mid);
            sort(array, mid + 1, end);
            mergeArray(array, start, mid, end);
        }
        return array;
    }

    private int[] mergeArray(int[] array, int start, int mid, int end) {
        int i = start;
        int j = mid + 1;
        int[] arrayTemp = new int[end - start + 1];
        for(int k = 0; k < (end - start + 1); k++) {
            if(i <= mid && (j > end || array[i] <= array[j])) {
                arrayTemp[k] = array[i];
                i++;
            } else {
                arrayTemp[k] = array[j];
                j++;
            }
        }
        return copyArray(arrayTemp, array, start);
    }

    private int[] copyArray(int[] arrayTemp, int[] array, int start) {
        for(int i = 0; i < arrayTemp.length; i++) {
            array[start + i] = arrayTemp[i];
        }
        return array;
    }
}
