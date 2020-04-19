package ru.job4j.input.exceptions;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Test class for class "InvalidEmailException"
 * @author Geraskin Yegor(yegeraskin13@gmail.com)
 */
public class InvalidEmailExceptionTest {
    @Test(expected = InvalidEmailException.class)
    public void invalidEmailExceptionTest() {
        throw new InvalidEmailException("message");
    }
}