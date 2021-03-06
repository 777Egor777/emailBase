package ru.job4j.input;

import java.util.List;

/**
 * Input interface implementation
 * Need for testing.
 * Here we send {@code String} {@code array}
 * to constructor and then work with this.
 * @author Geraskin Yegor(yegeraskin13@gmail.com)
 */
public class StubInput implements Input {
    /**
     * {@code Array} of {@code String}
     * objects that receive from
     * constructor
     */
    private List<String> lines;

    /**
     * Position of the next line
     * in {@code lines} list
     * that we will get in
     * method "askLine()"
     */
    private int position = -1;

    /**
     * Constructor of class.
     * Here we receive {@code array}
     * of {@code String} objects
     * that we will use in
     * {@code askLine} method
     * @param lines - initial state of
     *                {@code lines} field
     */
    public StubInput(List<String> lines) {
        this.lines = lines;
    }

    /**
     * Method receive String
     * from {@code String}
     * {@code array} that
     * was initial with
     * constructor
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
        System.out.println();
        position++;
        return lines.get(position).trim();
    }
}
