package ru.job4j.input;

import ru.job4j.input.exceptions.InvalidDataException;
import ru.job4j.input.exceptions.InvalidIntegerException;
import ru.job4j.input.exceptions.InvalidLineException;
import ru.job4j.input.exceptions.InvalidUserException;
import ru.job4j.model.database.Data;
import ru.job4j.model.email.Email;
import ru.job4j.model.user.User;

import java.io.IOException;

/**
 * Class-wrapper for objects of
 * {@code Input} interface,
 * provides validation for
 * all data scan process.
 * @author Geraskin Yegor(yegeraskin13@gmail.com)
 */
public class ValidateInput implements Input {
    /**
     * Object that implements
     * {@code Input} interface.
     * This class - wrapper
     * for this object.
     * Field initialise in
     * constructor.
     */
    private Input input;

    /**
     * Constructor of the class.
     * Here we initialise
     * {@code input} field
     * by object that impl
     * {@code Input} interface
     * @param input - received object,
     *               that impl {@code Input}
     *               interface and will
     *               initialise field
     *               {@code input} of this
     *               class.
     */
    public ValidateInput(Input input) {
        this.input = input;
    }

    /**
     * Method receive String
     * with help of method
     * {@code askLine} of object
     * {@code input}
     *
     * @return line - object of String
     * class, that we receive with help
     * {@code askLine} method
     * of object {@code input}
     */
    @Override
    public String askLine() throws IOException {
        return input.askLine();
    }

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
    public String askLine(String message, String... possibleLines) throws IOException {
        String result = null;
        boolean run = false;
        do {
            try {
                result = input.askLine(message, possibleLines);
            } catch (InvalidLineException exception) {
                run = true;
                System.out.println(exception.getMessage());
            }
        } while (run);
        return result;
    }

    /**
     * Method return integer
     * number that receive
     * from parsing line
     * that receive from
     * {@code askline} method
     * of the program.
     *
     * Method has validation.
     * If we can't parse
     * received line into
     * correct integer number,
     * we receive another lines
     * until successful
     * parse.
     *
     * @return integer number, that
     * we receive from {@code askLine}
     * method by parsin {@code String}
     * object into integer number
     */
    @Override
    public int askInt() throws IOException {
        int result = 0;
        boolean run = false;
        do {
            try {
                result = input.askInt();
            } catch (InvalidIntegerException exception) {
                run = true;
                System.out.println(exception.getMessage());
            }
        } while (run);
        return result;
    }

    /**
     *<p>
     *  Method return integer
     * number that receive
     * from parsing line
     * that receive from
     * {@code askLine} method
     * of the program.
     *</p>
     * <p>
     * Method has validation.
     * If we can't parse
     * received line into
     * correct integer number,
     * we receive another lines
     * until successful
     * parse.
     * </p>
     * <p>
     * Method also can use
     * "message" that consist
     * some information about
     * desired number
     * </p>
     * @param message - String that consist
     *                some information about
     *                desired line. For example
     *                we can print it to console
     *                and user can read it
     * @return integer number, that
     * we received as result of
     * parsing {@code String}
     * object from
     * {@code askLine} method
     */
    @Override
    public int askInt(String message) {
        return 0;
    }

     /**
     *<p>
     *  Method return integer
     * number that receive
     * from parsing line
     * that receive from
     * {@code askLine} method
     * of the program.
     *</p>
     * <p>
     * Method has validation.
     * If we can't parse
     * received line into
     * correct integer number or
     * result number is not
     * from range
     * [{@code 1}, {@code max}],
     * we receive another lines
     * until successful
     * parse.
     * </p>
     *
     * @param max - upper border of the
     *            diapason, that
     *            returned value must
     *            be in.
     * @return integer number, that
     * we received from
     * {@code askLine()} method. Number
     * from diapason [1, max].
     */
    @Override
    public int askInt(int max) {
        return 0;
    }

    /**
     *<p>
     *  Method return integer
     * number that receive
     * from parsing line
     * that receive from
     * {@code askLine} method
     * of the program.
     *</p>
     * <p>
     * Method has validation.
     * If we can't parse
     * received line into
     * correct integer number or
     * result number is not
     * from range
     * [{@code 1}, {@code max}],
     * we receive another lines
     * until successful
     * parse.
     * </p>
     * <p>
     * Method also can use
     * "message" that consist
     * some information about
     * desired number
     * </p>
     * @param max - upper border of the
     *            diapason, that
     *            returned value must
     *            be in.
     * @param message - String that consist
     *                some information about
     *                desired line. For example
     *                we can print it to console
     *                and user can read it
     * @return integer number, that
     * we received from
     * {@code askLine()} method. Number
     * from diapason [1, max].
     */
    @Override
    public int askInt(String message, int max) {
        return 0;
    }

    /**
     *<p>
     *  Method return integer
     * number that receive
     * from parsing line
     * that receive from
     * {@code askLine} method
     * of the program.
     *</p>
     * <p>
     * Method has validation.
     * If we can't parse
     * received line into
     * correct integer number or
     * result number is not
     * from {@code array}
     * {@code acceptableNumbers},
     * we receive another lines
     * until successful
     * parse.
     * </p>
     * <p>
     * Method also can use
     * "message" that consist
     * some information about
     * desired number
     * </p>
     * @param message - String that consist
     *                some information about
     *                desired line. For example
     *                we can print it to console
     *                and user can read it
     * @param acceptableNumbers - array of integer numbers.
     *                          Received number must be
     *                          in it.
     * @return integer number, that
     * we received from
     * {@code askline()} method.
     * Number contains
     *  in {@code array}
     * {@code acceptableNumbers}
     */
    @Override
    public int askInt(String message, int... acceptableNumbers) {
        return 0;
    }

    /**
     * <p>
     * Method receive Email
     * object from {@code input}
     * object's method
     * {@code askEmail}
     * </p>
     * <p>
     * Method has validation.
     * If received {@code Email}
     * object is invalid,
     * we receive another
     * until success.
     * </p>
     *
     * @return valid Email object
     * that we receive from
     * {@code input} object's
     * mathod {@code askEmail}
     */
    @Override
    public Email askEmail() {
        return null;
    }

    /**
     * <p>
     * Method receive Email
     * object from {@code input}
     * object's method
     * {@code askEmail}
     * </p>
     * <p>
     * Method has validation.
     * If received {@code Email}
     * object is invalid,
     * we receive another
     * until success.
     * </p>
     * <p>
     * Method also can use
     * "message" that consist
     * some information about
     * desired Email
     * </p>
     *
     * @param message - String that consist
     *                some information about
     *                desired Email. For example
     *                we can print it to console
     *                and user can read it
     * @return valid Email object
     * that we receive from
     * {@code input} object's
     * method {@code askEmail}
     */
    @Override
    public Email askEmail(String message) {
        return null;
    }

    /**
     * <p>
     * Method receive Email
     * object from {@code input}
     * object's method
     * {@code askEmail}
     * </p>
     * <p>
     * Method has validation.
     * If received {@code Email}
     * object is invalid or
     * already belong to
     * {@code user} param,
     * we receive another
     * {@code Email} object
     * until success.
     * </p>
     * <p>
     * Method also can use
     * "message" that consist
     * some information about
     * desired Email
     * </p>
     * Method also can use
     * "message" that consist
     * some information about
     * desired Email
     * <p>
     * <p>
     *     Method used to
     *     input {@code User}
     *     objects with
     *     {@code Email}-lists
     *     that has no duplicates
     * </p>
     * @param message - String that consist
     *                some information about
     *                desired Email. For example
     *                we can print it to console
     *                and user can read it
     * @param user    - returned {@code Email}
     *                object will not
     *                belong to this user
     * @return valid {@code Email} object
     * that we receive from
     * {@code input} object's
     * method {@code  askEmail},
     * and that belong
     * to {@code user} email-list
     */
    @Override
    public Email askEmail(String message, User user) {
        return null;
    }

    /**
     * <p>
     * Method receive {@code User}
     * object from {@code this}
     * object's method's
     * {@code askInt},
     * {@code askEmail}
     * </p>
     * <p>
     * Method has validation.
     * If received data
     * is invalid,
     * we receive another
     * until success.
     * </p>
     *
     * @return valid {@code User}
     * object that we receive
     * with help of
     * other methods of this
     * object
     */
    @Override
    public User askUser() {
        return null;
    }

    /**
     * <p>
     * Method receive {@code User}
     * object from {@code this}
     * object's method's
     * {@code askInt},
     * {@code askEmail}
     * </p>
     * <p>
     * Method has validation.
     * If received data
     * is invalid,
     * we receive another
     * until success.
     * </p>
     * <p>
     * Method also can use
     * "message" that consist
     * some information about
     * desired User
     * </p>
     * @param message - String that consist
     *                some information about
     *                desired User. For example
     *                we can print it to console
     *                and user can read it
     * @return valid {@code User}
     * object that we receive
     * with help of
     * other methods of this
     * object
     */
    @Override
    public User askUser(String message) {
        return null;
    }

    /**
     * <p>
     * Method receive {@code Data}
     * object from {@code this}
     * object's method's
     * {@code askInt},
     * {@code askUser}
     * </p>
     * <p>
     * Method has validation.
     * If received {@code Data}
     * object is invalid,
     * we receive another
     * until success.
     * </p>
     *
     * @return valid {@code Data}
     * object that we receive from
     * {@code this}
     * object's method's
     * {@code askInt},
     * {@code askUser}
     */
    @Override
    public Data askData() {
        return null;
    }
}
