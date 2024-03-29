package twoPointers;

import org.junit.jupiter.api.Test;
import twoPointers.MergeStringsAlternately;

import static org.junit.jupiter.api.Assertions.*;

class MergeStringsAlternatelyTest {

    @Test
    void shouldMergeAlternately() {
        //Given
        MergeStringsAlternately mergeStringsAlternately = new MergeStringsAlternately();
        //When
        String result1 = mergeStringsAlternately.mergeAlternately("abc", "pqr");
        String result2 = mergeStringsAlternately.mergeAlternately("ab", "pqrs");
        String result3 = mergeStringsAlternately.mergeAlternately("abcd", "pq");
        //Then
        assertEquals("apbqcr", result1);
        assertEquals("apbqrs", result2);
        assertEquals("apbqcd", result3);
    }

    @Test
    void shouldMergeFasterAlternately() {
        //Given
        MergeStringsAlternately mergeStringsAlternately = new MergeStringsAlternately();
        //When
        String result1 = mergeStringsAlternately.mergeFasterAlternately("abc", "pqr");
        String result2 = mergeStringsAlternately.mergeFasterAlternately("ab", "pqrs");
        String result3 = mergeStringsAlternately.mergeFasterAlternately("abcd", "pq");
        //Then
        assertEquals("apbqcr", result1);
        assertEquals("apbqrs", result2);
        assertEquals("apbqcd", result3);
    }
}