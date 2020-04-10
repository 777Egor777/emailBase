package ru.job4j.model.user.util;

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

    //TODO JavaDoc
    public static void printEmailsWithNumeration(User user) {
    }

    //TODO JavaDoc
    public static void deleteEmail(User user, int index) {
    }

    //TODO JavaDoc
    public static void addEmail(User user, int index) {
    }
}
