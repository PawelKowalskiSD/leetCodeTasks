package twoPointers;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ValidPalindromeTest {

    @Test
    void shouldIsPalindrome() {
        //Given
        ValidPalindrome validPalindrome = new ValidPalindrome();
        String input1 = "A man, a plan, a canal: Panama";
        String input2 = "race a car";
        String input3 = " ";
        //When
        boolean result1 = validPalindrome.isPalindrome(input1);
        boolean result2 = validPalindrome.isPalindrome(input2);
        boolean result3 = validPalindrome.isPalindrome(input3);
        //Then
        assertTrue(result1);
        assertFalse(result2);
        assertTrue(result3);
    }
}