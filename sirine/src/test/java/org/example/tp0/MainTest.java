package org.example.tp0;

import org.example.tp0.Main;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    void addShouldReturnTheSumOfTwoNumbers() {
        // Arrange
        Main calculator = new Main();
        int a = 2;
        int b = 3;
        // Act
        int result = calculator.add(a, b);
        // Assert
        assertEquals(5, result);
    }
}