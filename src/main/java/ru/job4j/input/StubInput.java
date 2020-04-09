package ru.job4j.input;

/**
 * Input interface implementation
 * Need for testing.
 * Here we send {@code String} {@code array}
 * to constructor and then work with this.
 * @author Geraskin Yegor(yegeraskin13@gmail.com)
 */
public class StubInput implements Input {
    //TODO Fix JavaDoc
    /**
     * Method receive String
     * from some input essence
     * and return it.
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
