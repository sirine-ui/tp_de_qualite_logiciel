package org.example.tp0;

import org.example.tp0.RomanNumeral;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
class RomanNumeralTest {
    @Test
    public void complexNumbers() {
        RomanNumeral roman = new RomanNumeral();
        // Testing some complex Roman numerals
        // Assertions.assertEquals(4, roman.convert("IV"));

        Assertions.assertEquals(9, roman.convert("IX"));
        Assertions.assertEquals(40, roman.convert("XL"));
        Assertions.assertEquals(90, roman.convert("XC"));
        Assertions.assertEquals(400, roman.convert("CD"));
        Assertions.assertEquals(900, roman.convert("CM"));
    }

    @Test
    public void singleNumber() {
        RomanNumeral roman = new RomanNumeral();
        int result = roman.convert("I");
        Assertions.assertEquals(1, result);
    }
}