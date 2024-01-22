package algorithms;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class QuickSortTest {

    @Test
    void shouldQuickSortBasic() {
        //Given
        QuickSort quickSort = new QuickSort();
        int[] input2 = {4, 5, 33, 17, 3, 21, 1, 16};
        //When
        int result2 = quickSort.sortBasic(input2, 0, input2.length - 1);
        //Then
        assertEquals(4, result2);
    }

    @Test
    void shouldQuickSortRecursive() {
        //Given
        QuickSort quickSort = new QuickSort();
        int[] input1 = {4, 5, 33, 17, 3, 21, 1, 16};
        //When & Then
        quickSort.sortRecursive(input1, 0, input1.length - 1);
    }

}