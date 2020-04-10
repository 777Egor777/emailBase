package ru.job4j.model.database;

import ru.job4j.model.email.Email;
import ru.job4j.model.user.User;

import java.util.List;

/**
 * Data model of the
 * user's email database.
 * For each user we keep
 * their unique email-list
 *
 * We can also "compress"
 * this database: join users
 * that have at least one
 * common email in their
 * lists.
 *
 * @author Geraskin Yegor(yegeraskin13@gmail.com)
 * @version 1.0
 */
public class Data {
    //TODO add JavaDoc
    public static final User EMPTY_USER = new User();

    /**
     * List of {@code User}
     * objects - users
     * in this database
     */
    private List<User> users;

    /**
     * Empty constructor
     * of class "Data".
     * Here we just
     * initialise field
     * {@code users} with
     * empty {@code List}
     * of {@code User}
     * objects.
     */
    public Data() {
    }

    /**
     * Constructor with {@code List}
     * of {@code User} objects.
     * We need it to make this
     * {@code class} final
     * in future version of
     * program.
     * @param users - {@code List} of {@code User}
     *                objects that we use to
     *                initialise field
     *                {@code users}
     */
    public Data(List<User> users) {
    }

    /**
     * Add new user
     * to this database
     * @param user - {@code User} object,
     *               new user that we add
     *               to this database
     */
    public void addUser(User user) {
    }

    /**
     * Returns a string representation of the object. In general, the
     * {@code toString} method returns a string that
     * "textually represents" this object. The result should
     * be a concise but informative representation that is easy for a
     * person to read.
     * Finally, string representation of this object will have
     * such format: User#id_1: Email1,Email2,...,EmailN_1
     *              User#id_2: Email1,Email2,...,EmailN_2
     *              ...
     *              User#id_n: Email1,Email2,...,EmailN_n
     *
     * @return a string representation of the object.
     */
    @Override
    public String toString() {
        return super.toString();
    }

    /**
     * Method cleans field
     * {@code users} of this
     * object.
     */
    public void clean() {
    }

    /**
     * Method add new {@code Email}
     * object - new email to user
     * with id {@code id},
     * that contains in
     * {@code users} list
     * @param id - ID of user that we
     *             modify - user new
     *             email to his
     *             email's list
     * @param email - {@code Email} object -
     *                new email that we add
     *                to user's with id {@code id}
     *                email-list
     */
    public void addEmail(int id, Email email) {
    }

    /**
     * Method return {@code array}
     * of ID of all user's in
     * {@code users} list.
     * @return {@code array} of
     *         all ID's in
     *         this database
     */
    public int[] allId() {
        return null;
    }

    /**
     * Method delete user
     * with id {@code id}
     * from this database -
     * delete it from
     * {@code users} list
     * @param id - id of {@code User}
     *             object that we delete
     *             from base
     */
    public void deleteUser(int id) {
    }

    /**
     * Method return user
     * with id {@code id},
     * if it contains in
     * {@code users} list.
     * Otherwise it return
     * {@code EMPTY_USER}
     * object.
     * @param id - id of user
     *             that we must
     *             return
     * @return - {@code User} object
     *           with id {@code id}
     */
    public User getUser(int id) {
        return null;
    }

    /**
     * Method delete email
     * on position
     * {@code emailIndex}
     * in email's list
     * of {@code User}
     * with id {@code id}
     * @param id - if of user
     *             whose email we
     *            must delete
     * @param emailIndex - index of email
     *                     in user's email-
     *                     list
     */
    public void deleteEmail(int id, int emailIndex) {
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
     */
    public void compressBase() {
    }
}
