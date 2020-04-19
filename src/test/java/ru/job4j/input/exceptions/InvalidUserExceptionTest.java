package ru.job4j.input.exceptions;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Test class for class "InvalidUserException"
 * @author Geraskin Yegor(yegeraskin13@gmail.com)
 */
public class InvalidUserExceptionTest {
    @Test(expected = InvalidUserException.class)
    public void invalidUserExceptionTest() {
        throw new InvalidUserException("message");
    }
}