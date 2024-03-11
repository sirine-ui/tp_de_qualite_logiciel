package org.example.tp1;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class RomanNumeralTest {
    private RomanNumeral r;
    @BeforeEach
    void setup() {
        r =new RomanNumeral();
    }

    @Test
    public void testOutOfRangeLow() {
        assertThrows(IllegalArgumentException.class, () -> r.toRoman(0));
    }

    @Test
    public void testOutOfRangeHigh() {
        assertThrows(IllegalArgumentException.class, () -> r.toRoman(4000));
    }

    @Test
    public void testBasicNumbers() {
        assertEquals("I", r.toRoman(1));
        assertEquals("IV", r.toRoman(4));
        assertEquals("V", r.toRoman(5));
        assertEquals("VIII", r.toRoman(8));
        assertEquals("IX", r.toRoman(9));
        assertEquals("X", r.toRoman(10));
        assertEquals("XIII", r.toRoman(13));
        assertEquals("XIV", r.toRoman(14));
    }

    @Test
    public void testLargeNumbers() {
        assertEquals("XL", r.toRoman(40));
        assertEquals("L", r.toRoman(50));
        assertEquals("XC", r.toRoman(90));
        assertEquals("C", r.toRoman(100));
        assertEquals("CD", r.toRoman(400));
        assertEquals("D", r.toRoman(500));
    }

    @Test
    public void testRandomNumbers() {
        assertEquals("XCIV", r.toRoman(94));
        assertEquals("MMMCMXCIX", r.toRoman(3999));
    }
}
