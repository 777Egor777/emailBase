package ru.job4j;
/**
 * Interface that describes
 * input operations.
 * In this program we need
 * to get follow types of data:
 * String, number, e-mail,
 * User model
 *
 * This interface - part of
 * pattern "Strategy".
 * We use this pattern to
 * organise input-output
 * in the program,
 * and test it.
 *
 * We will make some
 * implementaions of it.
 *
 * @author Geraskin Egor(yegeraskin13@gmail.com)
 */
public interface Input {
    /**
     * Method receive String
     * from some input essence
     * and return it.
     *
     * Method has no validation.
     * It receive line in
     * "fresh" condition
     * @return line - object of String
     *         class
     */
    String askLine();
    String askLine(String message);
    int askInt();
    int askInt(String message);
    int askInt(int max);
    int askInt(String message, int max);
    Email askEmail();
    User askUser();
    Data askData();
}
