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

    /**
     * Add {@code Email} object
     * {@code email} to email-
     * list of {@code User}
     * object with id
     * {@code userId}
     * in database {@code data}
     * @param data - database that we
     *               modify user from
     * @param userId - id of user
     *                 that we add
     *                 email to
     * @param email -  {@code Email} object
     *                 that we add to email-
     *                 list of user with
     *                 id {@code userId}
     */
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

    /**
     * Delete {@code Email} object
     * {@code email} from email-
     * list of {@code User}
     * object with id
     * {@code userId}
     * in database {@code data}
     * @param data - database that we
     *               modify user from
     * @param userId - id of user
     *                 that we delete
     *                 email from
     * @param emailIndex -  index of
     *                      {@code Email} object
     *                      in email-list of user with
     *                      id {@code userId}.
     *                      We will delete this
     *                      {@code Email} object
     */
    public static void deleteEmail(Data data, int userId, int emailIndex) {
    }

    //TODO JavaDoc
    public static void compressBase(Data data) {
    }
}
