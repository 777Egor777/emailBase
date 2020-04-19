package ru.job4j.input.exceptions;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Test class for class "InvalidLineException"
 * @author Geraskin Yegor(yegeraskin13@gmail.com)
 */
public class InvalidLineExceptionTest {
    @Test(expected = InvalidLineException.class)
    public void invalidLineExceptionTest() {
        throw new InvalidLineException("message");
    }
}