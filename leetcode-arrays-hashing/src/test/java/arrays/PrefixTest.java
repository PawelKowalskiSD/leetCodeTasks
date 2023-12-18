package arrays;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PrefixTest {

    @Test
    void shouldLongestCommonPrefix() {
        //Given
        String[] strs = new String[]{"flower", "flow", "flight"};
        String[] strs1 = new String[]{"dog, racecar", "car"};
        Prefix prefix = new Prefix();
        //When
        String result = prefix.longestCommonPrefix(strs);
        String result1 = prefix.longestCommonPrefix(strs1);
        //Then
        assertEquals("fl", result);
        assertEquals("", result1);
    }

    @Test
    void shouldLongestCommonPrefixFaster() {
        //Given
        String[] strs = new String[]{"flower", "flow", "flight"};
        String[] strs1 = new String[]{"dog, racecar", "car"};
        Prefix prefix = new Prefix();
        //When
        String result = prefix.longestCommonPrefixFaster(strs);
        String result1 = prefix.longestCommonPrefixFaster(strs1);
        //Then
        assertEquals("fl", result);
        assertEquals("", result1);
    }
}