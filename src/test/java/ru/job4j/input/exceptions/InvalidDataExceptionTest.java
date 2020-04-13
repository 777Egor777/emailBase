package ru.job4j.input.exceptions;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Test class for class "InvalidDataException"
 * @author Geraskin Yegor(yegeraskin13@gmail.com)
 */
public class InvalidDataExceptionTest {
    @Test(expected = InvalidDataException.class)
    public void InvalidDataExceptionTest() {
        throw new InvalidDataException("message");
    }
}