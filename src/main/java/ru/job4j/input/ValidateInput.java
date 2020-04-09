package ru.job4j.input;

import ru.job4j.input.exceptions.InvalidUserException;
import ru.job4j.model.email.Email;
import ru.job4j.model.user.User;

//TODO JavaDoc
public class ValidateInput implements Input {
    //TODO JavaDoc
    private Input input;

    //TODO JavaDoc
    public ValidateInput(Input input) {
    }

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

    //TODO Override methods

    /**
     * Method receive String
     * from some input essence
     * and return it,
     * if line contains
     * in array "possibleLines"
     * <p>
     * Method also can use
     * "message" that consist
     * some information about
     * desired line
     * <p>
     * Method has validation.

     * Method will ask lines
     * until it receive valid
     * line
     *
     * @param message       - String that consist
     *                      some information about
     *                      desired line. For example
     *                      we can print it to console
     *                      and user can read it
     * @param possibleLines - array of lines, that
     *                      we can return in this
     *                      method. So we can return
     *                      line only if it contains
     *                      in this array.
     *                      Method will receive new
     *                      lines until it receive
     *                      valid line
     * @return line - object of String
     * class that we receive
     * from user
     */
    @Override
    public String askLine(String message, String... possibleLines) {
        return null;
    }

    //TODO Fix JavaDoc
    /**
     * Method receive Integer
     * number from some input
     * essence and return it.
     * <p>
     * Method has no validation.
     * If user enter not an
     * integer number, it will
     * throw exception
     *
     * @return integer number, that
     * we received from
     * interact process with
     * user
     * @throws ru.job4j.input.exceptions.InvalidIntegerException -
     *                                 if received line is not represent
     *                                 correct integer number
     */
    @Override
    public int askInt() {
        return 0;
    }

    //TODO Fix JavaDoc
    /**
     * Method receive Integer
     * number from some input
     * essence and return it.
     * <p>
     * Method also can use
     * "message" that consist
     * some information about
     * desired number
     * <p>
     * Method has no validation.
     * If user enter not an
     * integer number, it will
     * throw exception
     *
     * @param message - String that consist
     *                some information about
     *                desired line. For example
     *                we can print it to console
     *                and user can read it
     * @return integer number, that
     * we received from
     * interact process with
     * user
     * @throws ru.job4j.input.exceptions.InvalidIntegerException -
     *                                 if received line is not represent
     *                                 correct integer number
     */
    @Override
    public int askInt(String message) {
        return 0;
    }

    //TODO Fix JavaDoc
    /**
     * Method receive Integer
     * number from some input
     * essence and return it.
     * <p>
     * Method has no validation -
     * received number can be
     * only from diapason
     * [1, max].
     * Otherwise, method will
     * throw exception.
     *
     * @param max - upper border of the
     *            diapason, that
     *            returned value must
     *            be in.
     * @return integer number, that
     * we received from
     * interact process with
     * user. Number must be
     * from diapason [1, max].
     * If user enter number
     * not from this diapason,
     * exception will be thrown
     * @throws ru.job4j.input.exceptions.InvalidIntegerException -
     *                                 if received integer not contains in range [1, max]
     */
    @Override
    public int askInt(int max) {
        return 0;
    }

    //TODO Fix JavaDoc
    /**
     * Method receive Integer
     * number from some input
     * essence and return it.
     * <p>
     * Method also can use
     * "message" that consist
     * some information about
     * desired number
     * <p>
     * Method has no validation -
     * received number can be
     * only from diapason
     * [1, max].
     * Otherwise, method will
     * throw exception.
     *
     * @param message - String that consist
     *                some information about
     *                desired number. For example
     *                we can print it to console
     *                and user can read it
     * @param max     - upper border of the
     *                diapason, that
     *                returned value must
     *                be in.
     * @return integer number, that
     * we received from
     * interact process with
     * user. Number must be
     * from diapason [1, max].
     * If user enter number
     * not from this diapason,
     * exception will be thrown
     * @throws ru.job4j.input.exceptions.InvalidIntegerException -
     *                                 if received integer not contains in range [1, max]
     */
    @Override
    public int askInt(String message, int max) {
        return 0;
    }

    //TODO Fix JavaDoc
    /**
     * Method receive Integer
     * number from some input
     * essence and return it.
     * <p>
     * Method also can use
     * "message" that consist
     * some information about
     * desired number
     * <p>
     * Method has no validation -
     * received number must be
     * in array acceptableNumbers,
     * that is one of parameters.
     * Otherwise, method will
     * throw exception.
     *
     * @param message           - String that consist
     *                          some information about
     *                          desired number. For example
     *                          we can print it to console
     *                          and user can read it
     * @param acceptableNumbers - array of integer numbers.
     *                          Received number must be
     *                          in it. Otherwise method
     *                          throws exception.
     * @return integer number, that
     * we received from
     * interact process with
     * user. Number must be
     * from array
     * acceptableNumbers.
     * @throws ru.job4j.input.exceptions.InvalidIntegerException -
     *                                 if received integer not contains in {@code acceptableNumbers}
     */
    @Override
    public int askInt(String message, int... acceptableNumbers) {
        return 0;
    }

    //TODO Fix JavaDoc
    /**
     * Method receive Email
     * object from some
     * input essence and
     * return it.
     * <p>
     * Method has no
     * validation. If user
     * enter incorrect Email
     * method just throw
     * respective exception.
     *
     * @return Email object that
     * user enters.
     * @throws ru.job4j.input.exceptions.InvalidEmailException -
     *                               if received {@code Email} object is invalid
     */
    @Override
    public Email askEmail() {
        return null;
    }

    //TODO Fix JavaDoc
    /**
     * Method receive Email
     * object from some
     * input essence and
     * return it.
     * <p>
     * Method also can use
     * "message" that consist
     * some information about
     * desired Email
     * <p>
     * Method has no
     * validation. If user
     * enter incorrect Email
     * method just throw
     * respective exception.
     *
     * @param message - String that consist
     *                some information about
     *                desired Email. For example
     *                we can print it to console
     *                and user can read it
     * @return Email object that
     * user enters.
     * @throws ru.job4j.input.exceptions.InvalidEmailException -
     *                               if received {@code Email} object is invalid
     */
    @Override
    public Email askEmail(String message) {
        return null;
    }

    //TODO Fix JavaDoc
    /**
     * Method receive Email
     * object from some
     * input essence and
     * return it.
     * <p>
     * Method also checks if
     * this Email already
     * belong to that user
     * that came to method
     * as parameter.
     * If such Email already
     * exist, method throws
     * respective exception.
     * <p>
     * Method also can use
     * "message" that consist
     * some information about
     * desired Email
     * <p>
     * Method has no
     * validation. If user
     * enter incorrect Email
     * method just throw
     * respective exception.
     *
     * @param message - String that consist
     *                some information about
     *                desired Email. For example
     *                we can print it to console
     *                and user can read it
     * @param user    - if received e-mail already
     *                belong to this user,
     *                method throws respective
     *                exception
     * @return Email object that
     * user enters.
     * @throws ru.job4j.input.exceptions.InvalidEmailException -
     *                               if received {@code Email} object is invalid
     */
    @Override
    public Email askEmail(String message, User user) {
        return null;
    }

    //TODO Fix JavaDoc
    /**
     * Method receive User
     * object from some
     * input essence and
     * return it.
     * <p>
     * Method has no
     * validation. If user
     * enter incorrect User
     * object,
     * method just throw
     * respective exception.
     *
     * @return User object that
     * user enters.
     * @throws InvalidUserException -
     *                              if received {@code User} object is invalid
     */
    @Override
    public User askUser() {
        return null;
    }

    //TODO Fix JavaDoc
    /**
     * Method receive User
     * object from some
     * input essence and
     * return it.
     * <p>
     * Method also can use
     * "message" that consist
     * some information about
     * desired User
     * <p>
     * Method has no
     * validation. If user
     * enter incorrect User
     * method just throw
     * respective exception.
     *
     * @param message - String that consist
     *                some information about
     *                desired User. For example
     *                we can print it to console
     *                and user can read it
     * @return User object that
     * user enters.
     * @throws InvalidUserException -
     *                              if received {@code User} object is invalid
     */
    @Override
    public User askUser(String message) {
        return null;
    }
}
