package arrays;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TopKFrequentElementsTest {

    @Test
    void shouldTopKFrequent() {
        //Given
        TopKFrequentElements topKFrequentElements = new TopKFrequentElements();
        int[] input1 = {1,1,1,2,2,3};
        int[] input2 = {1};
        int[] input3 = {3,0,1,0};
        int[] input4 = {4,1,-1,2,-1,2,3};
        int[] output1 = {1,2};
        int[] output2 = {1};
        int[] output3 = {0};
        int[] output4 = {-1,2};
        //When
        int[] result1 = topKFrequentElements.topKFrequent(input1, 2);
        int[] result2 = topKFrequentElements.topKFrequent(input2, 1);
        int[] result3 = topKFrequentElements.topKFrequent(input3, 1);
        int[] result4 = topKFrequentElements.topKFrequent(input4, 2);
        //Then
        assertArrayEquals(output1, result1);
        assertArrayEquals(output2, result2);
        assertArrayEquals(output3, result3);
        assertArrayEquals(output4, result4);
    }
}