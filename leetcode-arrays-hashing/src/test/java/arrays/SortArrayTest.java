package arrays;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SortArrayTest {

    @Test
    void shouldSort() {
        //Given
        SortArray sortArray = new SortArray();
        int[] input1 = {5,2,3,1};
        int[] input2 = {5,1,1,2,0,0};
        int[] output1 = {1,2,3,5};
        int[] output2 = {0,0,1,1,2,5};
        //When
//        int[] result1 = sortArray.sort(input1);
        int[] result2 = sortArray.sort(input2);
        //Then
//        assertArrayEquals(output1, result1);
        assertArrayEquals(output2, result2);
    }
}