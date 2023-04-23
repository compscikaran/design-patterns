package com.testing.isbntools;

import org.apache.commons.lang3.StringUtils;

public class ValidateISBN {

    public static final String ISBN_NUMBER_SHOULD_HAVE_10_DIGITS = "ISBN Number should have 10 digits";
    public static final String ISBN_NUMBER_SHOULD_ONLY_HAVE_NUMBERS = "ISBN Number should only have numbers";
    public static final String ISBN_CAN_ONLY_END_WITH_X_AS_LAST_CHARACTERS = "ISBN Can only end with X as last characters";
    public static final char VALID_ISBN_CHARACTER = 'X';
    public static final int SHORT_ISBN_LENGTH = 10;
    public static final int LONG_ISBN_LENGTH = 13;
    public static final int MODULO_SHORT_ISBN = 11;
    public static final int MODULE_LONG_ISBN = 10;

    public boolean checkISBN(String isbn) {
        if(isbn.length() == LONG_ISBN_LENGTH) return checkISBN13Digit(isbn);
        else if(isbn.length() == SHORT_ISBN_LENGTH) return checkISBN10Digit(isbn);
        else throw new NumberFormatException(ISBN_NUMBER_SHOULD_HAVE_10_DIGITS);
    }

    private boolean checkISBN10Digit(String isbn) {
        if(!StringUtils.isNumeric(isbn.substring(0,9))) {
            throw new NumberFormatException(ISBN_NUMBER_SHOULD_ONLY_HAVE_NUMBERS);
        }
        if(!StringUtils.isNumeric(isbn) && StringUtils.isNumeric(isbn.substring(0,9)) && isbn.charAt(9) != 'X') {
            throw new NumberFormatException(ISBN_CAN_ONLY_END_WITH_X_AS_LAST_CHARACTERS);
        }
        int multiplier = SHORT_ISBN_LENGTH;
        int total = 0;
        for (int i = 0; i < isbn.length(); i++) {
            char digit = isbn.charAt(i);
            total += calculateValueForPosition(multiplier, digit);
            multiplier--;
        }
        return total % MODULO_SHORT_ISBN == 0;
    }

    private int calculateValueForPosition(int multiplier, char digit) {
        int total = 0;
        if(digit == VALID_ISBN_CHARACTER) {
            total = SHORT_ISBN_LENGTH;
        } else {
            total = Character.getNumericValue(digit) * multiplier;
        }
        return total;
    }

    private boolean checkISBN13Digit(String isbn) {
        int multiplier = 1;
        int total = 0;
        for (int i = 0; i < isbn.length(); i++) {
            char digit = isbn.charAt(i);
            total += Character.getNumericValue(digit) * multiplier;
            multiplier = multiplier == 3 ? 1 : 3;
        }
        return total % MODULE_LONG_ISBN == 0;
    }
}
