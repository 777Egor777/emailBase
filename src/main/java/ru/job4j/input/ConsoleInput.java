package ru.job4j.input;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * This class - implementation of
 * interface "Input", in which we
 * receive data from standard
 * console input
 * @author Geraskin Yegor(yegeraskin13@gmail.com)
 */
public class ConsoleInput implements Input {
    /**
     * {@code BufferedReader} object
     * that we use to input data
     * from standard console
     * input
     */
    private BufferedReader reader;

    /**
     * Constructor of class.
     * Here we initialise
     * field "reader" by
     * object that scan
     * data from standard
     * output
     */
    public ConsoleInput() {
        reader = new BufferedReader(new InputStreamReader(System.in));
    }

    /**
     * Method receive String
     * from standard output
     * <p>
     * Method has no validation.
     * It receive line in
     * "fresh" condition
     *
     * @return line - object of String
     * class
     */
    @Override
    public String askLine() {
        return null;
    }
}
