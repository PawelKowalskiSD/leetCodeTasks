package arrays;

import java.util.HashMap;
import java.util.Map;

public class FibonacciSolve {

    public int fibonacci(int n) {
        if (n <= 1) {
            return n;
        } else
            return fibonacci(n - 1) + fibonacci(n - 2);
    }

    public int fasterFibonacci(int n, Map<Integer, Integer> memo) {
        if(n <= 1) {
            return 1;
        }
        return fasterFibonacci(n -1) + fasterFibonacci(n -2);
    }

    private int fasterFibonacci(int n) {
        return fasterFibonacci(n, new HashMap<>());
    }
}
