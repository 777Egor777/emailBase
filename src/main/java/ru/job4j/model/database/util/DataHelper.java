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
 * @version 1.0
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
        data.addUser(user);
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
        data.clean();
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
        data.addEmail(userId, email);
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
        data.deleteUser(userId);
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
     *                      {@code Email} object.
     *                      <p>
     *                          {@code Size} of this list
     *                          {@code <= 100} (in version
     *                           1.0 of this class)
     *                      </p>
     */
    public static void deleteEmail(Data data, int userId, int emailIndex) {
    }

    /**
     * <p>
     * Compress database.
     * If user's have same
     * email in base, we will
     * join them. Unity object
     * will have id of
     * one of this {@code User}
     * objects (any of two).
     * We will do this process
     * until all emails in base
     * will belong to only one user.
     * </p><p>
     * This is simple algorithm,
     * that explain what this
     * method do.
     * </p><p>
     * In fact we will use
     * effective graph algorithm
     * that works in linear
     * time.
     * </p><p>
     * We build graph, where
     * each user is vertux,
     * and edge between two users
     * consist only if they
     * have common email in base.
     * </p><p>
     * But if user's have same
     * email in base they
     * not mandatary have edge
     * between each other.
     * We place edge only between
     * neighbour users by this email.
     * </p><p>
     * For examlpe:
     * user1: email1, email2, email10
     * user2: email3, email 4
     * user3: email1, email5
     * user4: email6
     * user5: email1
     * We will place edge between
     * user1 and user3
     * user3 and user5.
     * Couse the are neighbors
     * by common email "email1"
     * </p><p>
     * User1 and user5 has same
     * "email1".
     * We will not place edge
     * between user1 and user5,
     * cause exist user between them,
     * that has "email1" too
     * </p><p>
     * So next i write algorithm
     * of building graph:
     * Crate Map<Email, id>.
     * Start for-cycle throw database
     * (for i: users
     *   for j: i-emails)
     * if next email already contains
     * in base, make edge in graph
     * between two users:
     * this user and user map points
     * to.
     * </p><p>
     * We use hashMap, so building
     * of graph costs linear time
     * for us.
     * </p><p>
     * Now graph has N vertuxes(
     * N = number of users)
     * and M edges(M = sum of all
     * email-lists, of all users)
     * in the worst case.
     * </p><p>
     * We need to extract components
     * of connection in this graph.
     * We will make it with help of
     * algorithm DFS(Depth-First-
     * Search). It works in linear
     * time O(N+M).
     * </p><p>
     * Finally we get int array,
     * which gives information about
     * compression. Exactly in which
     * user we must merge this user.
     * @param data - database that compressed
     *               with algorithm described
     *               above
     */
    public static void compressBase(Data data) {
    }
}
