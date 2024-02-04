package arrays;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class StringEncodeAndDecodeTest {

    @Test
    void shouldEncode() {
        //Given
        StringEncodeAndDecode stringEncodeAndDecode = new StringEncodeAndDecode();
        List<String> input1 = List.of("neet", "code", "love", "you");
        List<String> input2 = List.of("we", "say", ":", "yes");
        //When
        String result1 = stringEncodeAndDecode.encode(input1);
        String result2 = stringEncodeAndDecode.encode(input2);
        //Then
        assertEquals("4#neet4#code4#love3#you", result1);
        assertEquals("2#we3#say1#:3#yes", result2);
    }

    @Test
    void shouldDecode() {
        //Given
        StringEncodeAndDecode stringEncodeAndDecode = new StringEncodeAndDecode();
        List<String> output1 = List.of("neet", "code", "love", "you");
        List<String> output2 = List.of("we", "say", ":", "yes");
        //When
        List<String> result1 = stringEncodeAndDecode.decode("4#neet4#code4#love3#you");
        List<String> result2 = stringEncodeAndDecode.decode("2#we3#say1#:3#yes");
        //Then
        assertEquals(output1, result1);
        assertEquals(output2, result2);
    }
}