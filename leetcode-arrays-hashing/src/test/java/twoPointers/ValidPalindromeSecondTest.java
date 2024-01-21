package twoPointers;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ValidPalindromeSecondTest {

    @Test
    void shouldValidPalindrome() {
        //Given
        ValidPalindromeSecond validPalindromeSecond = new ValidPalindromeSecond();
        String input1 = "aba";
        String input2 = "abca";
        String input3 = "abc";
        String input4 = "eeccccbebaeeabebccceea";
        String input5 = "eedede";
        String input6 = "aguokepatgbnvfqmgmlcupuufxoohdfpgjdmysgvhmvffcnqxjjxqncffvmhvgsymdjgpfdhooxfuupuculmgmqfvnbgtapekouga";
        String input7 = "yd";
        String input8 = "acxcybycxcxa";
        String input9 = "ebcbbececabbacecbbcbe";
        String input10 = "aabdeenddbaagbddeedbaa";
        String input11 = "deeee";
        String input12 = "ebcbbececabbacecbbcbe";
        String input13 = "acjakebdccdeedccdbeaca";
        String input14 = "fagdlmisiftcgggevtxmkelpgomaofvfsupcbyiqntriolkkfzzfkkloirtnqiybcpuskfvfoamiogplekmxtvegggctfisimldgaf";
        String input15 = "tcaac";


        //When
        boolean result1 = validPalindromeSecond.validPalindrome(input1);
        boolean result2 = validPalindromeSecond.validPalindrome(input2);
        boolean result3 = validPalindromeSecond.validPalindrome(input3);
        boolean result4 = validPalindromeSecond.validPalindrome(input4);
        boolean result5 = validPalindromeSecond.validPalindrome(input5);
        boolean result6 = validPalindromeSecond.validPalindrome(input6);
        boolean result7 = validPalindromeSecond.validPalindrome(input7);
        boolean result8 = validPalindromeSecond.validPalindrome(input8);
        boolean result9 = validPalindromeSecond.validPalindrome(input9);
        boolean result10 = validPalindromeSecond.validPalindrome(input10);
        boolean result11 = validPalindromeSecond.validPalindrome(input11);
        boolean result12 = validPalindromeSecond.validPalindrome(input12);
        boolean result13 = validPalindromeSecond.validPalindrome(input13);
        boolean result14 = validPalindromeSecond.validPalindrome(input14);
        boolean result15 = validPalindromeSecond.validPalindrome(input15);

        //Then
        assertTrue(result1);
        assertTrue(result2);
        assertFalse(result3);
        assertFalse(result4);
        assertTrue(result5);
        assertTrue(result6);
        assertTrue(result7);
        assertTrue(result8);
        assertTrue(result9);
        assertFalse(result10);
        assertTrue(result11);
        assertTrue(result12);
        assertFalse(result13);
        assertFalse(result14);
        assertTrue(result15);

    }
}