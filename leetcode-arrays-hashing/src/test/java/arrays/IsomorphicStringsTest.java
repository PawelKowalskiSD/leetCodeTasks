package arrays;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class IsomorphicStringsTest {

    @Test
    void shouldIsIsomorphic() {
        //Given
        IsomorphicStrings isomorphicStrings = new IsomorphicStrings();
        String s1 = "egg";
        String s2 = "foo";
        String s3 = "paper";
        String t1 = "add";
        String t2 = "bar";
        String t3 = "title";
        //When
        boolean result1 = isomorphicStrings.isIsomorphic(s1, t1);
        boolean result2 = isomorphicStrings.isIsomorphic(s2, t2);
        boolean result3 = isomorphicStrings.isIsomorphic(s3, t3);
        //Then
        assertTrue(result1);
        assertFalse(result2);
        assertTrue(result3);
    }
}