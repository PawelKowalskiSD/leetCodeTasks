package arrays;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MaximumNumberOfBalloonsTest {

    @Test
    void shouldCounterNumberOfBalloon() {
        //Given
        MaximumNumberOfBalloons maximumNumberOfBalloons = new MaximumNumberOfBalloons();
        String input1 = "nlaebolko";
        String input2 = "loonbalxballpoon";
        String input3 = "leetcode";
        //When
        int result1 = maximumNumberOfBalloons.counterNumberOfBalloon(input1);
        int result2 = maximumNumberOfBalloons.counterNumberOfBalloon(input2);
        int result3 = maximumNumberOfBalloons.counterNumberOfBalloon(input3);
        //Then
        assertEquals(1, result1);
        assertEquals(2, result2);
        assertEquals(0, result3);
    }
}