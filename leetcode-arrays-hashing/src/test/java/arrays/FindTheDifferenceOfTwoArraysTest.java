package arrays;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class FindTheDifferenceOfTwoArraysTest {

    @Test
    void shouldDisplayDifferenceOfTwoArrays() {
        //Given
        FindTheDifferenceOfTwoArrays findTheDifferenceOfTwoArrays = new FindTheDifferenceOfTwoArrays();
        int[] input1 = {1,2,3};
        int[] input2 = {2,4,6};
        int[] input3 = {1,2,3,3};
        int[] input4 = {1,1,2,2};
        int[] input5 = {-68,-80,-19,-94,82,21,-43};
        int[] input6 = {-63};
        int[] input7 = {80,5,-20,33,26,29};
        int[] input8 = {-69,0,-36,52,-84,-34,-67,-100,80};
        int[] input9 = {52,-21};
        int[] input10 = {22,66,89,52,-56,5,22,-70,99};
        List<List<Integer>> output1 = List.of(List.of(1,3), List.of(4,6));
        List<List<Integer>> output2 = List.of(List.of(3), List.of());
        List<List<Integer>> output3 = List.of(List.of(-94,-80,-68,-43,-19,21,82), List.of(-63));
        List<List<Integer>> output4 = List.of(List.of(-20,5,26,29,33), List.of(-100,-84,-69,-67,-36,-34,0,52));
        List<List<Integer>> output5 = List.of(List.of(-21), List.of(-70,-56,5,22,66,89,99));
        //When
        List<List<Integer>> result1 = findTheDifferenceOfTwoArrays.findTheDifference(input1, input2);
        List<List<Integer>> result2 = findTheDifferenceOfTwoArrays.findTheDifference(input3, input4);
        List<List<Integer>> result3 = findTheDifferenceOfTwoArrays.findTheDifference(input5, input6);
        List<List<Integer>> result4 = findTheDifferenceOfTwoArrays.findTheDifference(input7, input8);
        List<List<Integer>> result5 = findTheDifferenceOfTwoArrays.findTheDifference(input9, input10);
        //Then
        assertEquals(output1, result1);
        assertEquals(output2, result2);
        assertEquals(output3, result3);
        assertEquals(output4, result4);
        assertEquals(output5, result5);
    }

}