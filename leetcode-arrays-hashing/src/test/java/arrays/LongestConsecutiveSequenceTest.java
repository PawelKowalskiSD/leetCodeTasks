package arrays;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LongestConsecutiveSequenceTest {

    @Test
    void shouldLongestConsecutive() {
        //Given
        LongestConsecutiveSequence longestConsecutiveSequence = new LongestConsecutiveSequence();
        int[] input1 = {100,4,200,1,3,2};
        int[] input2 = {0,3,7,2,5,8,4,6,0,1};
        //When
        int result1 = longestConsecutiveSequence.longestConsecutive(input1);
        int result2 = longestConsecutiveSequence.longestConsecutive(input2);
        //Then
        assertEquals(4, result1);
        assertEquals(9, result2);
    }
}