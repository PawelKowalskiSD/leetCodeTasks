package arrays;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ValidAnagramTest {

    @Test
    void testIsAnagram() {
        //Given
        ValidAnagram validAnagram = new ValidAnagram();
        //When
        boolean result = validAnagram.isAnagram("asd", "ads");
        boolean result1 = validAnagram.isAnagram("anagram", "agraam");
        boolean result2 = validAnagram.isAnagram("home", "meho");
        //Then
        assertTrue(result);
        assertFalse(result1);
        assertTrue(result2);
    }
}