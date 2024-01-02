package arrays;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CanPlaceFlowersTest {

    @Test
    void shouldCanPlaceFlowers() {
        //Given
        CanPlaceFlowers canPlaceFlowers = new CanPlaceFlowers();
        int[] input1 = {1,0,0,0,1};
        int[] input2 = {1,0,0,0,1};
        //When
        boolean result1 = canPlaceFlowers.canPlaceFlowers(input1, 1);
        boolean result2 = canPlaceFlowers.canPlaceFlowers(input2, 2);
        //Then
        assertTrue(result1);
        assertFalse(result2);
    }
}