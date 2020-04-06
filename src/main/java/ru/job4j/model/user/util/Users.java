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

    //TODO JavDoc
    public void cleanEmailsList(User user) {
    }

    //TODO JavaDoc
    public void printEmailsWithNumeration(User user) {
    }

    //TODO JavaDoc
    public void deleteEmail(User user, int index) {
    }
}
