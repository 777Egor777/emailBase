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

    //TODO JavaDoc
    public void deleteEmail(int id, int emailIndex) {
    }

    //TODO JavaDoc
    public void compressBase() {
    }
}
