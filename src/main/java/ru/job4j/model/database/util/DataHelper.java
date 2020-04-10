package ru.job4j.model.database.util;

import ru.job4j.model.database.Data;
import ru.job4j.model.email.Email;
import ru.job4j.model.user.User;

/**
 * Help {@code class} for {@code Data}
 * model {@code class}.
 *
 * With this {@code class} we
 * will make all {@code Data} objects
 * in the program {@code Immutable} .
 * @author Geraskin Yegor(yegeraskin13@gmail.com)
 */
public class DataHelper {
    /**
     * Add object {@code user}
     * of class {@code User}
     * to user's list of
     * object {@code data}
     * @param data - object of class {@code Data}
     *               that we will modify -
     *               add new user(object of
     *               class {@code User})
     *               for it
     * @param user - object of class {@code User}
     *              that we add to dataBase
     *              {@code data}
     */
    public static void addUser(Data data, User user) {
    }

    /**
     * Delete all users
     * from {@code data}
     * user's list
     * @param data - {@code Data} object
     *               that we delete all
     *               user's from.
     *               After it size of
     *               {@code data}'s
     *               user-list is
     *               {@code 0}.
     */
    public static void clean(Data data) {
    }

    //TODO JavaDoc
    public static void addEmail(Data data, int userId, Email email) {
    }

    /**
     * Delete object
     * of class {@code User}
     * with id {@code userId}
     * from {@code data}'s user list
     * @param data - object of class {@code Data}
     *               that we will modify -
     *               delete user from it
     * @param userId - id of user that we
     *                 should delete from
     *                 {@code data}'s
     *                 user list
     */
    public static void deleteUser(Data data, int userId) {
    }

    //TODO JavaDoc
    public static void deleteEmail(Data data, int userID, int emailIndex) {
    }

    //TODO JavaDoc
    public static void compressBase(Data data) {
    }
}
