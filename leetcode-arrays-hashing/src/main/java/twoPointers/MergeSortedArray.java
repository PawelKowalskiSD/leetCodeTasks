package twoPointers;

import java.util.Arrays;

public class MergeSortedArray {
    public void mergeAndSortedArray(int[] nums1, int m, int[] nums2, int n) {
        int count = 0;
        int size = m;
        while(count < m || count < n) {
            if(count < n) {
                nums1[size] = nums2[count];
                size++;
            }
            count++;
        }
        Arrays.sort(nums1);
        System.out.println(Arrays.toString(nums1));
    }
}
