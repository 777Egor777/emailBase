package ru.job4j.input.exceptions;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Test class for class "InvalidIntegerException"
 * @author Geraskin Yegor(yegeraskin13@gmail.com)
 */
public class InvalidIntegerExceptionTest {
    @Test(expected = InvalidIntegerException.class)
    public void invalidIntegerExceptionTest() {
        throw new InvalidIntegerException("message");
    }
}