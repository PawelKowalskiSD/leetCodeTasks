package arrays;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FindTheIndexOfTheFirstOccurrenceInAStringTest {

    @Test
    void shouldStrStr() {
        //Given
        FindTheIndexOfTheFirstOccurrenceInAString findTheIndexOfTheFirstOccurrenceInAString = new FindTheIndexOfTheFirstOccurrenceInAString();
        //When
        int result1 = findTheIndexOfTheFirstOccurrenceInAString.strStr("sadbutsad", "sad");
        int result2 = findTheIndexOfTheFirstOccurrenceInAString.strStr("leetcode", "leeto");
        int result3 = findTheIndexOfTheFirstOccurrenceInAString.strStr("hello", "ll");
        int result4 = findTheIndexOfTheFirstOccurrenceInAString.strStr("mississippi", "issip");
        int result5 = findTheIndexOfTheFirstOccurrenceInAString.strStr("a", "a");
        int result6 = findTheIndexOfTheFirstOccurrenceInAString.strStr("abc", "c");
        //Then
        assertEquals(0, result1);
        assertEquals(-1, result2);
        assertEquals(2, result3);
        assertEquals(4, result4);
        assertEquals(0, result5);
        assertEquals(2, result6);
    }
}