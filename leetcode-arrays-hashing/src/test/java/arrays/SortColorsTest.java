package arrays;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SortColorsTest {

    @Test
    void shouldSortColors() {
        //Given
        SortColors sortColors = new SortColors();
        int[] input1 = {2,0,2,1,1,0};
        int[] input2 = {2,0,1};
        //When & Then
        sortColors.sortColors(input1);
        sortColors.sortColors(input2);

    }
}