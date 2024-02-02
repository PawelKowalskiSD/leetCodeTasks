package stack;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ValidParenthesesTest {

    @Test
    void shouldValidParentheses() {
        //Given
        ValidParentheses validParentheses = new ValidParentheses();
        //When
        boolean result1 = validParentheses.isValid("()");
        boolean result2 = validParentheses.isValid("()[]{}");
        boolean result3 = validParentheses.isValid("(]");
        //Then
        assertTrue(result1);
        assertTrue(result2);
        assertFalse(result3);
    }

}