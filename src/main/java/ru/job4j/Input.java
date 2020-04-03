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

    /**
     * Method receive String
     * from some input essence
     * and return it.
     * Method also can use
     * "message" that consist
     * some information about
     * desired line
     *
     * Method has no validation.
     * It receive line in
     * "fresh" condition
     * @param message - String that consist
     *                  some information about
     *                  desired line. For example
     *                  we can print it to console
     *                  and user can read it
     * @return line - object of String
     *         class that we receive
     *         from user
     */
    String askLine(String message);

    /**
     * Method receive Integer
     * number from some input
     * essence and return it.
     *
     * Method has no validation.
     * If user enter not an
     * integer number, it will
     * throw exception
     * @return integer number, that
     *         we received from
     *         interact process with
     *         user
     */
    int askInt();

    /**
     * Method receive Integer
     * number from some input
     * essence and return it.
     *
     * Method also can use
     * "message" that consist
     * some information about
     * desired number
     *
     * Method has no validation.
     * If user enter not an
     * integer number, it will
     * throw exception
     * @param message - String that consist
     *                  some information about
     *                  desired line. For example
     *                  we can print it to console
     *                  and user can read it
     * @return integer number, that
     *         we received from
     *         interact process with
     *         user
     */
    int askInt(String message);

    /**
     * Method receive Integer
     * number from some input
     * essence and return it.
     *
     * Method has no validation -
     * received number can be
     * only from diapason
     * [1, max].
     * Otherwise, method will
     * throw exception.
     * @param max - upper border of the
     *              diapason, that
     *              returned value must
     *              be in.
     * @return integer number, that
     *         we received from
     *         interact process with
     *         user. Number must be
     *         from diapason [1, max].
     *         If user enter number
     *         not from this diapason,
     *         exception will be thrown
     */
    int askInt(int max);
    int askInt(String message, int max);
    Email askEmail();
    User askUser();
    Data askData();
}
