package arrays;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SignOfTheProductOfAnArrayTest {

    @Test
    void shouldArraySign() {
        //Given
        SignOfTheProductOfAnArray signOfTheProductOfAnArray = new SignOfTheProductOfAnArray();
        int[] input1 = {-1,-2,-3,-4,3,2,1};
        int[] input2 = {1,5,0,2,-3};
        int[] input3 = {-1,1,-1,1,-1};
        int[] input4 = {41,65,14,80,20,10,55,58,24,56,28,86,96,10,3,84,4,41,13,32,42,43,83,78,82,70,15,-41};
        int[] input5 = {9,72,34,29,-49,-22,-77,-17,-66,-75,-44,-30,-24};
        //When
        int result1 = signOfTheProductOfAnArray.arraySign(input1);
        int result2 = signOfTheProductOfAnArray.arraySign(input2);
        int result3 = signOfTheProductOfAnArray.arraySign(input3);
        int result4 = signOfTheProductOfAnArray.arraySign(input4);
        int result5 = signOfTheProductOfAnArray.arraySign(input5);
        //Then
        assertEquals(1, result1);
        assertEquals(0, result2);
        assertEquals(-1, result3);
        assertEquals(-1, result4);
        assertEquals(-1, result5);
    }
}