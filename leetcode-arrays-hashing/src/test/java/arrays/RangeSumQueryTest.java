package arrays;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RangeSumQueryTest {

    @Test
    void shouldSumRange() {
        //Given
        int[] input1 = {-2, 0, 3, -5, 2, -1};
        RangeSumQuery rangeSumQuery = new RangeSumQuery(input1);
        //When
        int result1 = rangeSumQuery.sumRange(0,2);
        int result2 = rangeSumQuery.sumRange(2,5);
        int result3 = rangeSumQuery.sumRange(0,5);
        //Then
        assertEquals(1, result1);
        assertEquals(-1, result2);
        assertEquals(-3, result3);
    }
}