package arrays;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PushDominoesTest {

    @Test
    void shouldPushDominoes() {
        //Given
        PushDominoes pushDominoes = new PushDominoes();
        //When
        String result1 = pushDominoes.pushDominoes("RR.L");
        String result2 = pushDominoes.pushDominoes(".LL.R...LR..L..");
        //Then
        assertEquals("RR.L", result1);
        assertEquals("LL.RR.LLRRLL..", result2);
    }
}