package arrays;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MajorityElementTest {

    @Test
    void shouldMajorityElement() {
        //Given
        MajorityElement majorityElement = new MajorityElement();
        int[] input1 = {3,2,3};
        int[] input2 = {2,2,1,1,1,2,2};
        //When
        int result1 = majorityElement.majorityElement(input1);
        int result2 = majorityElement.majorityElement(input2);
        //Then
        assertEquals(3, result1);
        assertEquals(2, result2);
    }
}