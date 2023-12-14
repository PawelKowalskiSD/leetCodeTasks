package arrays;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LengthOfLastWordTest {

    @Test
    void shouldLengthOfLastWord() {
        //Given
        LengthOfLastWord lengthOfLastWord = new LengthOfLastWord();
        String input1 = "Hello World";
        String input2 = "   fly me   to   the moon  ";
        String input3 = "luffy is still joyboy";
        //When
        int result1 = lengthOfLastWord.lengthOfLastWord(input1);
        int result2 = lengthOfLastWord.lengthOfLastWord(input2);
        int result3 = lengthOfLastWord.lengthOfLastWord(input3);
        //Then
        assertEquals(5, result1);
        assertEquals(4, result2);
        assertEquals(6, result3);
    }

    @Test
    void shouldLengthOfLastWordSecondMethode() {
        //Given
        LengthOfLastWord lengthOfLastWord = new LengthOfLastWord();
        String input1 = "Hello World";
        String input2 = "   fly me   to   the moon  ";
        String input3 = "luffy is still joyboy";
        //When
        int result1 = lengthOfLastWord.secondLengthOfLastWord(input1);
        int result2 = lengthOfLastWord.secondLengthOfLastWord(input2);
        int result3 = lengthOfLastWord.secondLengthOfLastWord(input3);
        //Then
        assertEquals(5, result1);
        assertEquals(4, result2);
        assertEquals(6, result3);

    }
}