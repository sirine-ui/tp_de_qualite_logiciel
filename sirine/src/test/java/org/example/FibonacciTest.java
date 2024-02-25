package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class FibonacciTest {
    private Fibonacci f;
    @BeforeEach
    void setup() {
        f =new Fibonacci();
    }

    @Test
    public void testFibonacciForZero() {
        assertEquals(0, f.fibonacci(0));
    }

    @Test
    public void testFibonacciForOne() {
        assertEquals(1, f.fibonacci(1));
    }

    @Test
    public void testFibonacciForPositiveNumber() {
        assertEquals(1, f.fibonacci(2));
        assertEquals(1, f.fibonacci(3));
        assertEquals(2, f.fibonacci(4));
        assertEquals(3, f.fibonacci(5));
        assertEquals(5, f.fibonacci(6));
        assertEquals(8, f.fibonacci(7));
        assertEquals(13, f.fibonacci(8));
        assertEquals(21, f.fibonacci(9));
        assertEquals(34, f.fibonacci(10));
    }

    @Test
    public void testFibonacciForNegativeNumber() {
        assertThrows(IllegalArgumentException.class, () -> f.fibonacci(-1));
    }
}