package arrays;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ConcatenationOfArrayTest {

    @Test
    void getConcatenation() {
        //Given
        ConcatenationOfArray concatenationOfArray = new ConcatenationOfArray();
        int[] input1 = new int[] {1,2,1};
        int[] input2 = new int[] {1,3,2,1};
        //When
        int[] result1 = concatenationOfArray.getConcatenation(input1);
        int[] result2 = concatenationOfArray.getConcatenation(input2);
        //Then
        assertArrayEquals(new int[]{1,2,1,1,2,1}, result1);
        assertArrayEquals(new int[]{1,3,2,1,1,3,2,1}, result2);
    }
}