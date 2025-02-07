package fr.ensai; // Adjust this to match your project's actual package

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class PasswordTest {

    @Test
    public void testStrongPassword() {
        assertTrue("Should be strong", Password.isStrongPassword("StrongPass123"));
        assertTrue("Should be strong", Password.isStrongPassword("Valid123Pass"));
    }

    @Test
    public void testTooShortPassword() {
        assertFalse("Should be weak (too short)", Password.isStrongPassword("Short1"));
    }

    @Test
    public void testNoUpperCase() {
        assertFalse("Should be weak (no uppercase)", Password.isStrongPassword("weakpassword1"));
    }

    @Test
    public void testNoLowerCase() {
        assertFalse("Should be weak (no lowercase)", Password.isStrongPassword("WEAKPASSWORD1"));
    }

    @Test
    public void testNoDigit() {
        assertFalse("Should be weak (no digit)", Password.isStrongPassword("NoDigitsHere"));
    }

    @Test
    public void testContainsWhitespace() {
        assertFalse("Should be weak (contains whitespace)", Password.isStrongPassword("Strong Pass1"));
    }
}