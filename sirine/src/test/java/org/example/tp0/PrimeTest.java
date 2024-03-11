package org.example.tp0;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class PrimeTest {
    private Prime p;
    @BeforeEach
    void setup() {
        p =new Prime();
    }

    @Test
    public void testIsPrime() {
        assertTrue(p.isPrime(2));
        assertTrue(p.isPrime(3));
        assertTrue(p.isPrime(5));
        assertTrue(p.isPrime(7));
        assertTrue(p.isPrime(11));
        assertTrue(p.isPrime(13));
        assertTrue(p.isPrime(17));
        assertTrue(p.isPrime(19));
        assertTrue(p.isPrime(23));
        assertTrue(p.isPrime(29));
        assertTrue(p.isPrime(31));

        assertFalse(p.isPrime(0));
        assertFalse(p.isPrime(1));
        assertFalse(p.isPrime(4));
        assertFalse(p.isPrime(6));
        assertFalse(p.isPrime(8));
        assertFalse(p.isPrime(9));
        assertFalse(p.isPrime(10));
        assertFalse(p.isPrime(12));
        assertFalse(p.isPrime(14));
        assertFalse(p.isPrime(15));
        assertFalse(p.isPrime(16));
        assertFalse(p.isPrime(18));
        assertFalse(p.isPrime(20));
        assertFalse(p.isPrime(21));
        assertFalse(p.isPrime(22));
        assertFalse(p.isPrime(24));
        assertFalse(p.isPrime(25));
        assertFalse(p.isPrime(26));
        assertFalse(p.isPrime(27));
        assertFalse(p.isPrime(28));
        assertFalse(p.isPrime(30));
    }
    @Test
    public void testNegativeNumber() {
        assertFalse(Prime.isPrime(-5));
    }

    @Test
    public void testLargePrimeNumber() {
        assertTrue(Prime.isPrime(999983)); // Large prime number
    }

    @Test
    public void testLargeNonPrimeNumber() {
        assertFalse(Prime.isPrime(999980)); // Large non-prime number
    }
}