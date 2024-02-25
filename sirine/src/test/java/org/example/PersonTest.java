package org.example;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class PersonTest {

    @Test
    public void testGetTheFullName() {
        Person person = new Person("Sirine", "Ramdani", 22);
        assertEquals("Sirine Ramdani", person.getFullName());
    }

    @Test
    public void testIfThPersonIsAdult() {
        Person adult = new Person("Sirine", "Ramdani", 22);
        assertTrue(adult.isAdult());

    }
    @Test
    public void testIfThPersonIsNotAdult() {

        Person minor= new Person("Sirine", "Ramdani",  17);
        assertFalse(minor.isAdult());
    }
}
