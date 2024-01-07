package arrays;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WordPatternTest {

    @Test
    void shouldWordPattern() {
        //Given
        WordPattern wordPattern = new WordPattern();
        String pattern1 = "abba";
        String pattern2 = "abba";
        String pattern3 = "aaaa";
        String pattern4 = "aba";
        String s1 = "dog cat cat dog";
        String s2 = "dog cat cat fish";
        String s3 = "dog cat cat dog";
        String s4 = "dog cat cat";
        //When
        boolean result1 = wordPattern.wordPattern(pattern1, s1);
        boolean result2 = wordPattern.wordPattern(pattern2, s2);
        boolean result3 = wordPattern.wordPattern(pattern3, s3);
        boolean result4 = wordPattern.wordPattern(pattern4, s4);
        //Then
        assertTrue(result1);
        assertFalse(result2);
        assertFalse(result3);
        assertFalse(result4);
    }
}