package twoPointers;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ReverseStringTest {

    @Test
    void shouldReverseString() {
        //Given
        ReverseString reverseString = new ReverseString();
        char[] input1 = {'h','e','l','l','o'};
        char[] input2 = {'H','a','n','n','a', 'h'};
        //When & Then
        reverseString.reverseString(input1);
        reverseString.reverseString(input2);
    }

    @Test
    void shouldReverseStringFaster() {
        //Given
        ReverseString reverseString = new ReverseString();
        char[] input1 = {'h','e','l','l','o'};
        char[] input2 = {'H','a','n','n','a', 'h'};
        //When & Then
        reverseString.reverseStringFaster(input1);
        reverseString.reverseStringFaster(input2);
    }
}