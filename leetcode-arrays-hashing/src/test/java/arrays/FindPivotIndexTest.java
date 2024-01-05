package arrays;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FindPivotIndexTest {

    @Test
    void shouldPivotIndex() {
        //Given
        FindPivotIndex findPivotIndex = new FindPivotIndex();
        int[] input1 ={1,7,3,6,5,6};
        int[] input2 ={1,2,3};
        int[] input3 ={2,1,-1};
        //When
        int result1 = findPivotIndex.pivotIndex(input1);
        int result2 = findPivotIndex.pivotIndex(input2);
        int result3 = findPivotIndex.pivotIndex(input3);
        //Then
        assertEquals(3, result1);
        assertEquals(-1, result2);
        assertEquals(0, result3);
    }
}