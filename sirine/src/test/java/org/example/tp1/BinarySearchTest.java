package org.example.tp1;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class BinarySearchTest {
    private BinarySearch b;
    @BeforeEach
    void setup() {
        b =new BinarySearch();
    }

    @Test
    public void testNullArray() {
        assertThrows(NullPointerException.class, () -> b.binarySearch(null, 5));
    }

    @Test
    public void testElementNotFound() {
        int[] array = {1, 3, 5, 7, 9};
        assertEquals(-1, b.binarySearch(array, 4));
    }

    @Test
    public void testElementFound() {
        int[] array = {1, 3, 5, 7, 9};
        assertEquals(2, b.binarySearch(array, 5));
    }

    @Test
    public void testFirstElement() {
        int[] array = {1, 3, 5, 7, 9};
        assertEquals(0, b.binarySearch(array, 1));
    }

    @Test
    public void testLastElement() {
        int[] array = {1, 3, 5, 7, 9};
        assertEquals(4, b.binarySearch(array, 9));
    }

    @Test
    public void testMiddleElement() {
        int[] array = {1, 3, 5, 7, 9};
        assertEquals(2, b.binarySearch(array, 5));
    }

    @Test
    public void testElementNotInMiddle() {
        int[] array = {1, 3, 5, 7, 9};
        assertEquals(3, b.binarySearch(array, 7));
    }
}