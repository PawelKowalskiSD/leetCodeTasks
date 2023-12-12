package arrays;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ReplaceElementsTest {

    @Test
    void shouldReplaceElements() {
        //Given
        ReplaceElements replaceElements = new ReplaceElements();
        int[] arr1 = new int[] {17,18,5,4,6,1};
        int[] arr2 = new int[] {400};
        //When
        int[] result1 = replaceElements.replaceElements(arr1);
        int[] result2 = replaceElements.replaceElements(arr2);
        //Then
        assertArrayEquals(new int[]{18,6,6,6,1,-1}, result1);
        assertArrayEquals(new int[]{-1}, result2);
    }
}