package org.example.tp0;

import org.example.tp0.Fibonacci;
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
    public void testFibonacciForPositiveNumber() {
        assertEquals(0, f.fibonacci(0));
        assertEquals(1, f.fibonacci(1));
        assertEquals(1, f.fibonacci(2));
        assertEquals(2, f.fibonacci(3));
        assertEquals(3, f.fibonacci(4));
        assertEquals(5, f.fibonacci(5));
        assertEquals(8, f.fibonacci(6));
        assertEquals(13, f.fibonacci(7));
        assertEquals(21, f.fibonacci(8));
        assertEquals(34, f.fibonacci(9));
        assertEquals(55, f.fibonacci(10));
    }

    @Test
    public void testFibonacciForNegativeNumber() {
        assertThrows(IllegalArgumentException.class, () -> f.fibonacci(-1));
    }
}