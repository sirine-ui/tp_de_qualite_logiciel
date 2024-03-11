package org.example.tp1;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class FizzBuzzTest {
    private FizzBuzz f;
    @BeforeEach
    void setup() {
        f =new FizzBuzz();
    }

    @Test
    public void testNegativeNumber() {

        assertThrows(IllegalArgumentException.class, () -> f.fizzBuzz(-1));
    }

    @Test
    public void testZero() {
        assertThrows(IllegalArgumentException.class, () -> f.fizzBuzz(0));
    }

    @Test
    public void testFizzBuzz() {
        assertEquals("FizzBuzz", f.fizzBuzz(15));
        assertEquals("FizzBuzz", f.fizzBuzz(30));
        assertEquals("FizzBuzz", f.fizzBuzz(45));
    }

    @Test
    public void testFizz() {
        assertEquals("Fizz", f.fizzBuzz(3));
        assertEquals("Fizz", f.fizzBuzz(6));
        assertEquals("Fizz", f.fizzBuzz(9));
    }

    @Test
    public void testBuzz() {
        assertEquals("Buzz", f.fizzBuzz(5));
        assertEquals("Buzz", f.fizzBuzz(10));
        assertEquals("Buzz", f.fizzBuzz(20));
    }

    @Test
    public void testRegularNumber() {
        assertEquals("1", f.fizzBuzz(1));
        assertEquals("2", f.fizzBuzz(2));
        assertEquals("4", f.fizzBuzz(4));
        assertEquals("7", f.fizzBuzz(7));
        assertEquals("11", f.fizzBuzz(11));
        assertEquals("13", f.fizzBuzz(13));
    }
}
