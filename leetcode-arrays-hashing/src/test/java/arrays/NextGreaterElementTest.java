package arrays;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NextGreaterElementTest {

    @Test
    void shouldNextGreaterElement() {
        //Given
        NextGreaterElement nextGreaterElement = new NextGreaterElement();
        int[] input1 = {4,1,2};
        int[] input2 = {1,3,4,2};
        int[] input3 = {2,4};
        int[] input4 = {1,2,3,4};
        int[] output1 = {-1,3,-1};
        int[] output2 = {3,-1};
        //When
        int[] result1 = nextGreaterElement.nextGreaterElement(input1, input2);
        int[] result2 = nextGreaterElement.nextGreaterElement(input3, input4);
        //Then
        assertArrayEquals(output1, result1);
        assertArrayEquals(output2, result2);
    }
}