package arrays;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class GroupAnagramsTest {

    @Test
    void shouldGroupAnagrams() {
        //Given
        GroupAnagrams groupAnagrams = new GroupAnagrams();
        String[] strs1 = new String[]{"eat","tea","tan","ate","nat","bat"};
        String[] strs2 = new String[]{"a"};
        String[] strs3 = new String[]{""};
        //When
        List<List<String>> result1 = groupAnagrams.groupAnagrams(strs1);
        List<List<String>> result2 = groupAnagrams.groupAnagrams(strs2);
        List<List<String>> result3 = groupAnagrams.groupAnagrams(strs3);
        //Then
        assertEquals(List.of(List.of("eat", "tea", "ate"), List.of("bat"), List.of("tan", "nat")), result1);
        assertEquals(List.of(List.of("a")), result2);
        assertEquals(List.of(List.of("")), result3);
    }
}