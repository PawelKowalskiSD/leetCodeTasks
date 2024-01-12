package arrays;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProductOfArrayExceptSelfTest {

    @Test
    void shouldProductExceptSelf() {
        //Given
        ProductOfArrayExceptSelf productOfArrayExceptSelf = new ProductOfArrayExceptSelf();
        int[] input1 = {1,2,3,4};
        int[] input2 = {-1,1,0,-3,3};
        int[] output1 = {24,12,8,6};
        int[] output2 = {0,0,9,0,0};
        //When
        int[] result1 = productOfArrayExceptSelf.productExceptSelf(input1);
        int[] result2 = productOfArrayExceptSelf.productExceptSelf(input2);
        //Then
        assertArrayEquals(output1, result1);
        assertArrayEquals(output2, result2);
    }
}