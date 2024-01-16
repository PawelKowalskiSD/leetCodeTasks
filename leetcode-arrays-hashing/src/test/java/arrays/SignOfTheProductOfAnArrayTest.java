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
        //When
        int result1 = signOfTheProductOfAnArray.arraySign(input1);
        int result2 = signOfTheProductOfAnArray.arraySign(input2);
        int result3 = signOfTheProductOfAnArray.arraySign(input3);
        //Then
        assertEquals(1, result1);
        assertEquals(0, result2);
        assertEquals(-1, result3);
    }
}