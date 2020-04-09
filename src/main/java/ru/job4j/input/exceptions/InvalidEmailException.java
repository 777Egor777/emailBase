package ru.job4j.input.exceptions;

/**
 * This exception throw, when
 * received {@code Email} object
 * is invalid
 * @author Geraskin Yegor(yegeraskin13@gmail.com)
 */
public class InvalidEmailException extends IllegalArgumentException {
    /**
     * Constructor just call same
     * constructor of super-class
     * @param message - {@code String} object that
     *                  we send for super-class
     *                  as message of this
     *                  {@code Exception}
     */
    public InvalidEmailException(String message) {
    }
}
