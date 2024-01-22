package algorithms;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BubbleSortTest {

    @Test
    void shouldBubbleSortBasicForm() {
        //Given
        BubbleSort bubbleSort = new BubbleSort();
        int[] input1 = {4,3,11,2,6,7,1,5,8,10,9,12,20,13,14,15,17,18,19,16};
        int[] output1 = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};
        //When
        int[] result1 = bubbleSort.bubbleSortBasicForm(input1);
        //Then
        assertArrayEquals(output1, result1);
    }

    @Test
    void shouldBubbleSortAverageForm() {
        //Given
        BubbleSort bubbleSort = new BubbleSort();
        int[] input1 = {4,3,11,2,6,7,1,5,8,10,9,12,20,13,14,15,17,18,19,16};
        int[] output1 = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};
        //When
        int[] result1 = bubbleSort.bubbleSortAverageForm(input1);
        //Then
        assertArrayEquals(output1, result1);
    }

    @Test
    void shouldBubbleSortBestPractice() {
        //Given
        BubbleSort bubbleSort = new BubbleSort();
        int[] input1 = {4,3,11,2,6,7,1,5,8,10,9,12,20,13,14,15,17,18,19,16};
        int[] output1 = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};
        //When
        int[] result1 = bubbleSort.bubbleSortGoodPractice(input1);
        //Then
        assertArrayEquals(output1, result1);
    }

}