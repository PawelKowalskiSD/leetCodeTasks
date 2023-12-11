package arrays;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class TwoSumTest {

    @Test
    void shouldReturnTwoIndexEqualsTarget() {
        //Given
        TwoSum twoSum = new TwoSum();
        int[] input1 = new int[]{2, 7, 11, 15};
        int[] input2 = new int[]{3, 2, 4};
        int[] input3 = new int[]{3, 3};
        int[] output1 = new int[]{0, 1};
        int[] output2 = new int[]{1, 2};
        int[] output3 = new int[]{0, 1};
        //When
        int[] result1 = twoSum.twoSum(input1, 9);
        int[] result2 = twoSum.twoSum(input2, 6);
        int[] result3 = twoSum.twoSum(input3, 6);
        //Then
        assertArrayEquals(output1, result1);
        assertArrayEquals(output2, result2);
        assertArrayEquals(output3, result3);
    }
}