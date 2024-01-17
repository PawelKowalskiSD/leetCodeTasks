package arrays;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FibonacciSolveTest {

    @Test
    void shouldFibonacci() {
        //Given
        FibonacciSolve fibonacciSolve = new FibonacciSolve();
        //When
        int result1 = fibonacciSolve.fibonacci(1);
        int result2 = fibonacciSolve.fibonacci(4);
        int result3 = fibonacciSolve.fibonacci(9);
        int result4 = fibonacciSolve.fibonacci(10);
        //Then
        assertEquals(1, result1);
        assertEquals(3, result2);
        assertEquals(34, result3);
        assertEquals(55, result4);
    }
}