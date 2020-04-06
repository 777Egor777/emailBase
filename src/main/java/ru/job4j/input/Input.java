package ru.job4j.input;

import ru.job4j.model.database.Data;
import ru.job4j.model.email.Email;
import ru.job4j.model.user.User;

/**
 * Base interface that
 * describes input operations.
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
 * implementations of it.
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
     *
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
    default String askLine(String message) {
        return null;
    }

    /**
     * Method receive String
     * from some input essence
     * and return it,
     * if line contains
     * in array "possibleLines"
     *
     * Method also can use
     * "message" that consist
     * some information about
     * desired line
     *
     * Method has no validation.
     * It receive line in
     * "fresh" condition.
     * If line is incorrect
     * (not contains in
     * "possibleLines" array)
     * method throws special
     * exception.
     * @param message - String that consist
     *                  some information about
     *                  desired line. For example
     *                  we can print it to console
     *                  and user can read it
     * @param possibleLines - array of lines, that
     *                        we can return in this
     *                        method. So we can return
     *                        line only if it contains
     *                        in this array.
     *                        If line not contains
     *                        in this array, method
     *                        throws special exception
     * //TODO after implementing method add information about exception to JavaDoc
     * @return line - object of String
     *         class that we receive
     *         from user
     */
    default String askLine(String message, String... possibleLines) {
        return null;
    }

    /**
     * Method receive Integer
     * number from some input
     * essence and return it.
     *
     * Method has no validation.
     * If user enter not an
     * integer number, it will
     * throw exception
     * //TODO after implementing method add information about exception to JavaDoc
     * @return integer number, that
     *         we received from
     *         interact process with
     *         user
     */
    default int askInt() {
        return -1;
    }

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
     * //TODO after implementing method add information about exception to JavaDoc
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
    default int askInt(String message) {
        return -1;
    }

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
     * //TODO after implementing method add information about exception to JavaDoc
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
    default int askInt(int max) {
        return -1;
    }

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
     * Method has no validation -
     * received number can be
     * only from diapason
     * [1, max].
     * Otherwise, method will
     * throw exception.
     * //TODO after implementing method add information about exception to JavaDoc
     * @param max - upper border of the
     *              diapason, that
     *              returned value must
     *              be in.
     * @param message - String that consist
     *                  some information about
     *                  desired number. For example
     *                  we can print it to console
     *                  and user can read it
     * @return integer number, that
     *         we received from
     *         interact process with
     *         user. Number must be
     *         from diapason [1, max].
     *         If user enter number
     *         not from this diapason,
     *         exception will be thrown
     */
    int askInt(String message, int max); //TODO add default realization

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
     * Method has no validation -
     * received number must be
     * in array acceptableNumbers,
     * that is one of parameters.
     * Otherwise, method will
     * throw exception.
     * //TODO after implementing method add information about exception to JavaDoc
     * @param acceptableNumbers - array of integer numbers.
     *                            Received number must be
     *                            in it. Otherwise method
     *                            throws exception.
     * @param message - String that consist
     *                  some information about
     *                  desired number. For example
     *                  we can print it to console
     *                  and user can read it
     * @return integer number, that
     *         we received from
     *         interact process with
     *         user. Number must be
     *         from array
     *         acceptableNumbers.
     */
    int askInt(String message, int... acceptableNumbers); //TODO add default realization

    /**
     * Method receive Email
     * object from some
     * input essence and
     * return it.
     *
     * Method has no
     * validation. If user
     * enter incorrect Email
     * method just throw
     * respective exception.
     * //TODO after implementing method add information about exception to JavaDoc
     * @return Email object that
     *         user enters.
     */
    Email askEmail(); //TODO add default realization

    /**
     * Method receive Email
     * object from some
     * input essence and
     * return it.
     *
     * Method also can use
     * "message" that consist
     * some information about
     * desired Email
     *
     * Method has no
     * validation. If user
     * enter incorrect Email
     * method just throw
     * respective exception.
     * //TODO after implementing method add information about exception to JavaDoc
     * @param message - String that consist
     *                  some information about
     *                  desired Email. For example
     *                  we can print it to console
     *                  and user can read it
     * @return Email object that
     *         user enters.
     */
    Email askEmail(String message); //TODO add default realization

    /**
     * Method receive Email
     * object from some
     * input essence and
     * return it.
     *
     * Method also checks if
     * this Email already
     * belong to that user
     * that came to method
     * as parameter.
     * If such Email already
     * exist, method throws
     * respective exception.
     *
     * Method also can use
     * "message" that consist
     * some information about
     * desired Email
     *
     * Method has no
     * validation. If user
     * enter incorrect Email
     * method just throw
     * respective exception.
     * //TODO after implementing method add information about exception to JavaDoc
     * @param message - String that consist
     *                  some information about
     *                  desired Email. For example
     *                  we can print it to console
     *                  and user can read it
     * @param user - if received e-mail already
     *               belong to this user,
     *               method throws respective
     *               exception
     * @return Email object that
     *         user enters.
     */
    Email askEmail(String message, User user); //TODO add default realization

    /**
     * Method receive User
     * object from some
     * input essence and
     * return it.
     *
     * Method has no
     * validation. If user
     * enter incorrect User
     * object,
     * method just throw
     * respective exception.
     * //TODO after implementing method add information about exception to JavaDoc
     * @return User object that
     *         user enters.
     */
    User askUser(); //TODO add default realization

    /**
     * Method receive User
     * object from some
     * input essence and
     * return it.
     *
     * Method also can use
     * "message" that consist
     * some information about
     * desired User
     *
     * Method has no
     * validation. If user
     * enter incorrect User
     * method just throw
     * respective exception.
     * //TODO after implementing method add information about exception to JavaDoc
     * @param message - String that consist
     *                  some information about
     *                  desired User. For example
     *                  we can print it to console
     *                  and user can read it
     * @return User object that
     *         user enters.
     */
    User askUser(String message); //TODO add default realization

    /**
     * Method receive Data
     * object from some
     * input essence and
     * return it.
     *
     * Method has no
     * validation. If user
     * enter incorrect Data
     * object,
     * method just throw
     * respective exception.
     * //TODO after implementing method add information about exception to JavaDoc
     * @return Data object that
     *         user enters.
     */
    Data askData(); //TODO add default realization
}
