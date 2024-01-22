package algorithms;

public class MergeSort {
    public int[] basicMergeSort(int[] nums, int start, int end) { // MERGE SORT (BEST (n (log n)), AVERAGE (n (log n)), WORST (n (log n)
        if (start < end) {
            int mid = (end - start) / 2 + start;
            basicMergeSort(nums, start, mid);
            basicMergeSort(nums, mid + 1, end);
            merge(nums, start, mid, end);
        }
        return nums;
    }

    private int[] merge(int[] nums, int start, int mid, int end) {
        int i = start;
        int j = mid + 1;
        int[] arrayTemp = new int[end - start + 1];
        for (int k = 0; k < (end - start + 1); k++) {
            if (i <= mid && (j > end || nums[i] <= nums[j])) {
                arrayTemp[k] = nums[i];
                i++;
            } else {
                arrayTemp[k] = nums[j];
                j++;
            }
        }
        return copyArray(arrayTemp, nums, start);
    }

    private int[] copyArray(int[] arrayTemp, int[] nums, int start) {
        for (int i = 0; i < arrayTemp.length; i++) {
            nums[start + i] = arrayTemp[i];
        }
        return nums;
    }
}
