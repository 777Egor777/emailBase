package ru.job4j.model.user.util;

import ru.job4j.model.email.Email;
import ru.job4j.model.user.User;

/**
 * Help utility class for
 * data model "User".
 *
 * This class be very helpful when
 * we decide to make class {@code User}
 * Immutable, because here only
 * wrappers for methods of class
 * {@code User}, that modifying
 * object.
 * @version 1.0
 * @author Geraskin Yegor(yegeraskin13@gmail.com)
 */
public class Users {
    /**
     * This variable keeps number
     * of next {@code User} object
     * that we will create
     */
    public static Integer nextUserId = 1;

    /**
     * Method clean {@code List}
     * of {@code Email} object -
     * field {@code emails}
     * of object {@code user}
     * @param user - method clean
     *               email-list
     *               of this user
     */
    public static void cleanEmailsList(User user) {
    }

    /**
     * Method print email-list
     * of {@code User} object
     * {@code user} at this
     * type:
     * 1. Email1
     * 2. Email2
     * ...
     * n. Emailn
     * @param user - {@code User} object
     *               whose email-list
     *               we print with numeration
     *               to standard output
     */
    public static void printEmails(User user) {
    }

    /**
     * Method delete from
     * user's email-list
     * email, that has
     * index {@code index - 1}
     * @param user - {@code User} object
     *               that we delete email
     *               from
     * @param index - index of email,
     *                that we should delete,
     *                in user's email list.
     *                <p>
     *                      {@code index <= 100} in
     *                      version 1.0 of class
     *                </p>
     */
    public static void deleteEmail(User user, int index) {
        user.deleteEmail(index);
    }

    /**
     * Add email to user's
     * email-list
     * @param user - {@code User} object
     *               to whose email-list
     *               we add new email
     * @param email - {@code Email}-object
     *                that we add to
     *                user's {@code user}
     *                email-list
     */
    public static void addEmail(User user, Email email) {
        user.addEmail(email);
    }
}
