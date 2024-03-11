package org.example.tp1;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class QuadraticEquationTest {
    private QuadraticEquation q;
    @BeforeEach
    void setup() {
        q =new QuadraticEquation();
    }

    @Test
    public void testZeroA() {
        assertThrows(IllegalArgumentException.class, () -> q.solve(0, 5, 7));
    }

    @Test
    public void testNoRealRoots() {
        assertNull(q.solve(3, 4, 7));
    }

    @Test
    public void testOneRoot() {
        double[] roots = q.solve(1, -2, 1);
        assertEquals(1, roots.length);
        assertEquals(1.0, roots[0], 0.001);
    }

    @Test
    public void testTwoRoots() {
        double[] roots = q.solve(1, -3, 2);
        assertEquals(2, roots.length);
        assertEquals(2.0, roots[0], 0.001);
        assertEquals(1.0, roots[1], 0.001);
    }

    @Test
    public void testComplexRoots() {
        assertNull(q.solve(2, 1, 5));
    }
}
