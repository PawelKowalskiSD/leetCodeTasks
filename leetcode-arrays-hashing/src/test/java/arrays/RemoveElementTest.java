package arrays;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RemoveElementTest {

    @Test
    void ShouldRemoveElement() {
        //Given
        RemoveElement removeElement = new RemoveElement();
        int[] input1 = new int[]{3,2,2,3};
        int[] input2 = new int[]{0,1,2,2,3,0,4,2};
        //When
        int result1 = removeElement.removeElement(input1, 3);
        int result2 = removeElement.removeElement(input2, 2);
        //Then
        assertEquals(2, result1);
        assertEquals(5, result2);
    }
}