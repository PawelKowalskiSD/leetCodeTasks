package arrays;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class PascalTriangleTest {

    @Test
    void shouldGenerate() {
        //Given
        PascalTriangle pascalTriangle = new PascalTriangle();
        List<List<Integer>> output1 = List.of(
                List.of(1),
                List.of(1, 1),
                List.of(1, 2, 1),
                List.of(1, 3, 3, 1),
                List.of(1, 4, 6, 4, 1)
        );
        List<List<Integer>> output2 = List.of(
                List.of(1)
        );
        //When
        List<List<Integer>> result1 = pascalTriangle.generate(5);
        List<List<Integer>> result2 = pascalTriangle.generate(1);

        //Then
        assertEquals(output1, result1);
        assertEquals(output2, result2);
    }
}