package ru.job4j.input;

import ru.job4j.input.exceptions.InvalidEmailException;
import ru.job4j.input.exceptions.InvalidIntegerException;
import ru.job4j.input.exceptions.InvalidLineException;
import ru.job4j.input.exceptions.InvalidUserException;
import ru.job4j.model.database.Data;
import ru.job4j.model.email.Email;
import ru.job4j.model.email.util.Emails;
import ru.job4j.model.user.User;

import java.io.IOException;
import java.util.Arrays;

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
    String askLine() throws IOException;

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
    default String askLine(String message) throws IOException {
        System.out.print(message);
        return askLine();
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
     * @throws InvalidLineException -
     *         if array {@code possibleLines} isn't contains
     *         received {@code String} object
     * @return line - object of String
     *         class that we receive
     *         from user
     */
    default String askLine(String message, String... possibleLines) throws IOException {
        String result = askLine(message);
        boolean contains = false;
        for (String possible : possibleLines) {
            if (result.equals(possible)) {
                contains = true;
                break;
            }
        }
        if (!contains) {
            throw new InvalidLineException(
                    String.format("Line \"%s\" is incorrect!", result)
            );
        }
        return result;
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
     *
     * Spaces at begin and
     * spaces at end of line are
     * trims.
     * @throws InvalidIntegerException -
     *         if received line is not represent
     *         correct integer number
     * @return integer number, that
     *         we received from
     *         interact process with
     *         user
     */
    default int askInt() throws IOException {
        String line = askLine();
        int result = 0;
        try {
            result = Integer.parseInt(line);
        } catch (Exception ex) {
            throw new InvalidIntegerException(
                    String.format("Can't parse number from this line: \"%s\"", line)
            );
        }
        return result;
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
     * @throws InvalidIntegerException -
     *         if received line is not represent
     *         correct integer number
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
    default int askInt(String message) throws IOException {
        System.out.print(message);
        return askInt();
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
     * @throws InvalidIntegerException -
     * if received integer not contains in range [1, max]
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
    default int askInt(int max) throws IOException {
        int result = askInt();
        if (!(result >= 1 && result <= max)) {
            throw new InvalidIntegerException(
                    String.format("Number not from range [1, %d]", max)
            );
        }
        return result;
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
     * @throws InvalidIntegerException -
     * if received integer not contains in range [1, max]
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
    default int askInt(String message, int max) throws IOException {
        System.out.print(message);
        return askInt(max);
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
     * received number must be
     * in array acceptableNumbers,
     * that is one of parameters.
     * Otherwise, method will
     * throw exception.
     * @throws InvalidIntegerException -
     * if received integer not contains in {@code acceptableNumbers}
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
    default int askInt(String message, int... acceptableNumbers) throws IOException {
        System.out.print(message);
        int result = askInt(message);
        boolean contains = false;
        for (int acceptableNumber : acceptableNumbers) {
            if (result == acceptableNumber) {
                contains = true;
                break;
            }
        }
        if (!contains) {
            throw new InvalidIntegerException(
                    "No such id!"
            );
        }
        return result;
    }

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
     * @throws InvalidEmailException -
     * if received {@code Email} object is invalid
     * @return Email object that
     *         user enters.
     */
    default Email askEmail() throws IOException {
        Email result = new Email(askLine());
        if (!Emails.isCorrectEmail(result)) {
            throw new InvalidEmailException(
                    String.format("%s is incorrect",
                                  result.toString())
            );
        }
        return result;
    }

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
     * @throws InvalidEmailException -
     * if received {@code Email} object is invalid
     * @param message - String that consist
     *                  some information about
     *                  desired Email. For example
     *                  we can print it to console
     *                  and user can read it
     * @return Email object that
     *         user enters.
     */
    default Email askEmail(String message) throws IOException {
        System.out.print(message);
        return askEmail();
    }

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
     * @throws InvalidEmailException -
     * if received {@code Email} object is invalid
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
    default Email askEmail(String message, User user) throws IOException {
        Email result = askEmail(message);
        if (user.containsEmail(result)) {
            throw new InvalidEmailException(
                    String.format("User#%d already has this email",
                                  user.getId())
            );
        }
        return result;
    }

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
     * @throws ru.job4j.input.exceptions.InvalidUserException -
     * if received {@code User} object is invalid
     * @return User object that
     *         user enters.
     */
    default User askUser() throws IOException {
        User result = new User();
        try {
            int numberOfEmails = askInt(String.format(
                    "Enter number of emails of user#%d",
                    result.getId()
            ));
            for (int index = 0; index < numberOfEmails; ++index) {
                result.addEmail(
                        askEmail(String.format("user#%d email%d: ",
                                 result.getId(), (index + 1)),
                                result)
                );
            }
        } catch (Exception ex) {
            throw new InvalidUserException("Invalid User. Try again");
        }
        return result;
    }

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
     * @throws ru.job4j.input.exceptions.InvalidUserException -
     * if received {@code User} object is invalid
     * @param message - String that consist
     *                  some information about
     *                  desired User. For example
     *                  we can print it to console
     *                  and user can read it
     * @return User object that
     *         user enters.
     */
    default User askUser(String message) throws IOException {
        System.out.println(message);
        return askUser();
    }

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
     * @throws ru.job4j.input.exceptions.InvalidDataException -
     * if received {@code Data} object is invalid
     * @return Data object that
     *         user enters.
     */
    default Data askData() {
        return null;
    }
}
