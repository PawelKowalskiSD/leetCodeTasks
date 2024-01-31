package arrays;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class FindAllAnagramsInAStringTest {

    @Test
    void shouldFindAllAnagramsInAString() {
        //Given
        FindAllAnagramsInAString findAllAnagramsInAString = new FindAllAnagramsInAString();
        List<Integer> output1 = List.of(0, 6);
        List<Integer> output2 = List.of(0, 1, 2);
        //When
        List<Integer> result1 = findAllAnagramsInAString.findAllAnagrams("cbaebabacd", "abc");
        List<Integer> result2 = findAllAnagramsInAString.findAllAnagrams("abab", "ab");
        //Then
        assertEquals(output1, result1);
        assertEquals(output2, result2);
    }

}