package arrays;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SimplePigLatinTest {

    @Test
    void shouldPigIt() {
        //Given
        SimplePigLatin simplePigLatin = new SimplePigLatin();
        String input1 = "Pig latin is cool";
        String input2 = "This is my string";
        //When
        String result1 = simplePigLatin.pigIt(input1);
        String result2 = simplePigLatin.pigIt(input2);
        //Then
        assertEquals("igPay atinlay siay oolcay", result1);
        assertEquals("hisTay siay ymay tringsay", result2);
    }
}