package arrays;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MinDifBetHigAndLowOfKScoTest {

    @Test
    void shouldGetMinDiff() {
        //given
        MinDifBetHigAndLowOfKSco minDifBetHigAndLowOfKSco = new MinDifBetHigAndLowOfKSco();
        int[] input1 = {90};
        int[] input2 = {9, 4, 1, 7};
        int[] input3 = {87063,61094,44530,21297,95857,93551,9918};
        //When
        int result1 = minDifBetHigAndLowOfKSco.minimumDifference(input1, 1);
        int result2 = minDifBetHigAndLowOfKSco.minimumDifference(input2, 2);
        int result3 = minDifBetHigAndLowOfKSco.minimumDifference(input3, 6);
        //Then
        assertEquals(0, result1);
        assertEquals(2, result2);
        assertEquals(74560, result3);
    }

}