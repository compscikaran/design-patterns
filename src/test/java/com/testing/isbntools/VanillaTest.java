package com.testing.isbntools;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class VanillaTest {

    @Test
    public void checkValidISBN() {
        ValidateISBN validator = new ValidateISBN();
        boolean result = validator.checkISBN("0753552892");
        assertTrue(result, "first value");
        result = validator.checkISBN("0801075270");
        assertTrue(result, "second value");
    }

    @Test
    public void checkInvalidISBN() {
        ValidateISBN validator = new ValidateISBN();
        boolean result = validator.checkISBN("0753552893");
        assertFalse(result);
    }

    @Test
    public void nineDigitISBNInvalid() {
        ValidateISBN validator = new ValidateISBN();
        assertThrows(NumberFormatException.class, () -> validator.checkISBN("123456789"));
    }

    @Test
    public void nonNumericISBNInvalid() {
        ValidateISBN validator = new ValidateISBN();
        assertThrows(NumberFormatException.class, () -> validator.checkISBN("helloworld"));
    }

    @Test
    public void validISBNEndsWithX() {
        ValidateISBN validator = new ValidateISBN();
        boolean result = validator.checkISBN("012000030X");
        assertTrue(result, "first value");
    }

    @Test
    public void checkValidISBN13Digit() {
        ValidateISBN validator = new ValidateISBN();
        boolean result = validator.checkISBN("9780241958223");
        assertTrue(result, "first value");
    }

    @Test
    public void checkInvalidISBN13Digit() {
        ValidateISBN validator = new ValidateISBN();
        boolean result = validator.checkISBN("9780241958227");
        assertFalse(result, "first value");
    }

}