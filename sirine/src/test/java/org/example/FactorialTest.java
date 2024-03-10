package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class FactorialTest {
    private Factorial f;
    @BeforeEach
    void setup() {
        f =new Factorial();
    }
    @Test
    public void testFactorial() {
        assertEquals(1, f.factorial(0));
        assertEquals(1, f.factorial(1));
        assertEquals(2, f.factorial(2));
        assertEquals(6, f.factorial(3));
        assertEquals(24, f.factorial(4));
        assertEquals(120, f.factorial(5));
        assertEquals(720, f.factorial(6));
        assertEquals(5040, f.factorial(7));
        assertEquals(40320, f.factorial(8));
        assertEquals(362880, f.factorial(9));
        assertEquals(3628800, f.factorial(10));
    }

        @Test
        public void testFibonacciForNegativeNumber() {
            assertThrows(IllegalArgumentException.class, () -> f.factorial(-1));
        }
}