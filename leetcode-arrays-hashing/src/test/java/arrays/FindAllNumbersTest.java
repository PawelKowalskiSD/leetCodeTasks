package arrays;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class FindAllNumbersTest {

    @Test
    void shouldFindDisappearedNumbers() {
        //Given
        FindAllNumbers findAllNumbers = new FindAllNumbers();
        int[] input1 = {4,3,2,7,8,2,3,1};
        int[] input2 = {1,1};
        List<Integer> output1 = List.of(5,6);
        List<Integer> output2 = List.of(2);
        //When
        List<Integer> result1 = findAllNumbers.findDisappearedNumbers(input1);
        List<Integer> result2 = findAllNumbers.findDisappearedNumbers(input2);
        //Then
        assertEquals(output1, result1);
        assertEquals(output2, result2);
    }
}