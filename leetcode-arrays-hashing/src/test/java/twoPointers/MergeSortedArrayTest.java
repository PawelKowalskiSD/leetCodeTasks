package twoPointers;

import org.junit.jupiter.api.Test;

class MergeSortedArrayTest {

    @Test
    void shouldMergeSortedArray() {
        //Given
        MergeSortedArray mergeSortedArray = new MergeSortedArray();
        int[] input1nums1 = {1, 2, 3, 0, 0, 0};
        int[] input1nums2 = {2, 5, 6};
        int[] input2nums1 = {1};
        int[] input2nums2 = {};
        int[] input3nums1 = {0};
        int[] input3nums2 = {1};
        //When & Then
        mergeSortedArray.mergeAndSortedArray(input1nums1, 3, input1nums2, 3);
        mergeSortedArray.mergeAndSortedArray(input2nums1, 1, input2nums2, 0);
        mergeSortedArray.mergeAndSortedArray(input3nums1, 0, input3nums2, 1);
    }

}