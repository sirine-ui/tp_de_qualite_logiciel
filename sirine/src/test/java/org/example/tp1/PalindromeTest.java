package org.example.tp1;
import org.example.tp0.Factorial;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class PalindromeTest {
    private Palindrome p;
    @BeforeEach
    void setup() {
        p =new Palindrome();
    }
    @Test
    public void testIsPalindrome() {
        assertTrue(p.isPalindrome("kayak"));
        assertTrue(p.isPalindrome("Esope reste ici et se repose"));

        assertFalse(p.isPalindrome("This is not a palindrome"));
    }

    @Test
    public void testIsPalindromeWithNull() {
        assertThrows(NullPointerException.class, () -> p.isPalindrome(null));
    }
    @Test
    public void testEmptyString() {
        assertTrue(Palindrome.isPalindrome(""));
    }
}