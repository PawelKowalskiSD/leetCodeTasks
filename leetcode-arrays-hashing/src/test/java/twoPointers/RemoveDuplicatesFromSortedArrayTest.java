package twoPointers;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RemoveDuplicatesFromSortedArrayTest {

    @Test
    void shouldRemoveDuplicates() {
        //Given
        RemoveDuplicatesFromSortedArray removeDuplicatesFromSortedArray = new RemoveDuplicatesFromSortedArray();
        int[] input1 = {1,1,2};
        int[] input2 = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        //When
//        int result1 = removeDuplicatesFromSortedArray.removeDuplicates(input1);
        int result2 = removeDuplicatesFromSortedArray.removeDuplicates(input2);
        //Then
//        assertEquals(2, result1);
        assertEquals(5, result2);
    }
}