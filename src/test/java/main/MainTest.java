package main;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class MainTest {

    private static final int MAX_LENGTH = 20;

    @Test
    public void testValidPasswords() {
        assertTrue(Main.isValidLength("Password123!", MAX_LENGTH));
        assertTrue(Main.isValidLength("Aa1!", MAX_LENGTH));
        assertTrue(Main.isValidLength("StrongP@ssw0rd", MAX_LENGTH));
    }

    @Test
    public void testInvalidPasswords() {
        assertFalse(Main.isValidLength("password", MAX_LENGTH)); // no uppercase, digit or special character
        assertFalse(Main.isValidLength("Password", MAX_LENGTH)); // no digit or special character
        assertFalse(Main.isValidLength("Password123", MAX_LENGTH)); // no special character
        assertFalse(Main.isValidLength("Password!", MAX_LENGTH)); // no digit
        assertFalse(Main.isValidLength("P@ss", MAX_LENGTH)); // too short, depending on MAX_LENGTH
        assertFalse(Main.isValidLength(" ", MAX_LENGTH)); // whitespace not allowed
        assertFalse(Main.isValidLength("", MAX_LENGTH)); // empty string
        assertFalse(Main.isValidLength("AReallyLongPasswordThatExceedsTheGivenMaxLength!1", MAX_LENGTH)); // too long, depending on MAX_LENGTH
    }
}
