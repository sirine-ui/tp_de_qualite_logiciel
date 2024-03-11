package org.example.tp1;
import org.example.tp0.Prime;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class AnagramTest {
    private Anagram a;
    @BeforeEach
    void setup() {
        a =new Anagram();
    }

    @Test
    public void testIsAnagram() {
        assertTrue(a.isAnagram("listen", "silent"));
        assertTrue(a.isAnagram("anagram", "nag a ram"));

        assertFalse(a.isAnagram("hello", "world"));
        assertFalse(a.isAnagram("open", "closed"));
    }

    @Test
    public void testNullInput() {
        assertThrows(NullPointerException.class, () -> a.isAnagram(null, "silent"));
    }
}