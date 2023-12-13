package arrays;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SubsequenceTest {

    @Test
    void shouldIsSubsequence() {
        //Given
        Subsequence subsequence = new Subsequence();
        String s = "abc";
        String s1 = "axc";
        String t = "ahbgdc";
        String t1 = "ahbgdc";
        //When
        boolean result = subsequence.isSubsequence(s, t);
        boolean result1 = subsequence.isSubsequence(s1, t1);
        //Then
        assertTrue(result);
        assertFalse(result1);
    }
}