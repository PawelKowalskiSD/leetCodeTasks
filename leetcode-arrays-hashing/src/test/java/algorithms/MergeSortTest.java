package algorithms;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class MergeSortTest {

    @Test
    void shouldMergeSortBasic() {
        //Given
        MergeSort mergeSort = new MergeSort();
        int[] input1 = {2, 5, 8, 0, 1, 3, 6, 7, 9, 10, 20, 16, 13, 14, 15, 11, 12, 18, 19, 17, 4};
        int[] output1 = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20};
        //When
        int[] result1 = mergeSort.basicMergeSort(input1, 0, input1.length - 1);
        //Then
        assertArrayEquals(output1, result1);
    }

}