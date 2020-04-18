package ru.job4j.input.exceptions;

/**
 * This exception throw, when
 * received line is invalid
 * @author Geraskin Yegor(yegeraskin13@gmail.com)
 */
public class InvalidLineException extends IllegalArgumentException {
    /**
     * Constructor just call same
     * constructor of super-class
     * @param message - {@code String} object that
     *                  we send for super-class
     *                  as message of this
     *                  {@code Exception}
     */
    public InvalidLineException(String message) {
        super(message);
    }
}
