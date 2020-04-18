package ru.job4j.model.database;

import ru.job4j.model.email.Email;
import ru.job4j.model.user.User;
import ru.job4j.model.user.util.Users;

import java.util.*;

/**
 * Data model of the
 * user's email database.
 * For each user we keep
 * their unique email-list
 * <p>
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
    /**
     * Stub for object {@code User}
     * We use it to not to return
     * {@code null} - reference.
     * We return it when can't
     * return another valid
     * {@code User} - object
     */
    public static final User EMPTY_USER = new User();

    /**
     * List of {@code User}
     * objects - users
     * in this database
     * <p>
     * Size of this list
     * {@code <= 100} in version
     * 1.0 of class
     * </p>
     */
    private List<User> users;

    /**
     * <p>
     *     Map that helps to
     *     speed up work of
     *     program.
     * </p>
     * <p>
     *     Key - {@code id}
     *     fields of single
     *     user
     *     ({@code User} object).
     * </p>
     * <p>
     *     Value - user itself
     * </p>
     */
    private Map<Integer, User> idToUser;

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
        users = new ArrayList<>();
        idToUser = new HashMap<>();
    }

    /**
     * Constructor with {@code List}
     * of {@code User} objects.
     * We need it to make this
     * {@code class} final
     * in future version of
     * program.
     *
     * @param users - {@code List} of {@code User}
     *              objects that we use to
     *              initialise field
     *              {@code users}.
     *              <p>
     *              {@code Size} of this
     *              list {@code <= 100}
     *              (in version 1.0
     *              of class)
     *              </p>
     */
    public Data(List<User> users) {
        this.users = users;
        idToUser = new HashMap<>();
        for (User user : users) {
            idToUser.put(user.getId(), user);
        }
    }

    /**
     * Getter for field
     * {@code users}
     *
     * @return field {@code users}
     * value
     */
    public List<User> getUserList() {
        return users;
    }

    /**
     * Add new user
     * to this database
     *
     * @param user - {@code User} object,
     *             new user that we add
     *             to this database
     */
    public void addUser(User user) {
        users.add(user);
        idToUser.put(user.getId(), user);
    }

    /**
     * Returns a string representation of the object. In general, the
     * {@code toString} method returns a string that
     * "textually represents" this object. The result should
     * be a concise but informative representation that is easy for a
     * person to read.
     * Finally, string representation of this object will have
     * such format: User#id_1->Email1,Email2,...,EmailN_1
     * User#id_2->Email1,Email2,...,EmailN_2
     * ...
     * User#id_n->Email1,Email2,...,EmailN_n
     *
     * @return a string representation of the object.
     */
    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(System.lineSeparator(), "", "");
        for (User user : users) {
            joiner.add(user.toString());
        }
        return joiner.toString();
    }

    /**
     * Method cleans field
     * {@code users} of this
     * object.
     */
    public void clean() {
        users.clear();
        idToUser.clear();
    }

    /**
     * <p>
     * Method add new {@code Email}
     * object - new email to user
     * with id {@code id},
     * that contains in
     * {@code users} list
     *
     * @param id    - ID of user that we
     *              modify - user new
     *              email to his
     *              email's list
     * @param email - {@code Email} object -
     *              new email that we add
     *              to user's with id {@code id}
     *              email-list
     */
    public void addEmail(int id, Email email) {
        User user = getUser(id);
        Users.addEmail(user, email);
    }

    /**
     * Method return {@code array}
     * of ID of all user's in
     * {@code users} list.
     *
     * @return {@code array} of
     * all ID's in
     * this database
     */
    public int[] allId() {
        int[] result = new int[users.size()];
        for (int index = 0; index < users.size(); ++index) {
            result[index] = users.get(index).getId();
        }
        return result;
    }

    /**
     * Method delete user
     * with id {@code id}
     * from this database -
     * delete it from
     * {@code users} list
     *
     * @param id - id of {@code User}
     *           object that we delete
     *           from base
     */
    public void deleteUser(int id) {
        if (idToUser.containsKey(id)) {
            idToUser.remove(id);
            users.remove(Integer.valueOf(id));
        }
    }

    /**
     * Method return user
     * with id {@code id},
     * if it contains in
     * {@code users} list.
     * Otherwise it return
     * {@code EMPTY_USER}
     * object.
     *
     * @param id - id of user
     *           that we must
     *           return
     * @return - {@code User} object
     * with id {@code id}
     */
    public User getUser(int id) {
        User result = EMPTY_USER;
        if (idToUser.containsKey(id)) {
            result = idToUser.get(id);
        }
        return result;
    }

    /**
     * Method delete email
     * on position
     * {@code emailIndex}
     * in email's list
     * of {@code User}
     * with id {@code id}
     *
     * @param id         - if of user
     *                   whose email we
     *                   must delete
     * @param emailIndex - index of email
     *                   in user's email-
     *                   list
     *                   <p>
     *                   {@code index <= 100}
     *                   (in version 1.0)
     *                   of class
     *                   </p>
     */
    public void deleteEmail(int id, int emailIndex) {
        User user = getUser(id);
        if (!user.equals(EMPTY_USER)) {
            Users.deleteEmail(user, emailIndex);
        }
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
     * for j: i-emails)
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

    /**
     * <p>
     * Method asks if
     * {@code this} object
     * of class {@code Data}
     * equals to {@code obj}
     * object of class
     * {@code Data}
     * </p>
     * <p>
     * If {@code obj} is not
     * object of class
     * {@code Data},
     * method returns
     * {@code false} value
     * </p>
     *
     * @param obj - object that we compare
     *            with {@code this} object
     *            to find if they equals
     *            or not
     * @return {@code true} - if objects {@code this}
     * and {@code obj} are
     * equals.
     * {@code false} - if objects {@code this}
     * and {@code obj} are not
     * equals.
     */
    @Override
    public boolean equals(Object obj) {
        boolean result = false;
        if (obj != null && obj.getClass() == getClass()) {
            Data data = (Data) obj;
            result = users.equals(data.getUserList());
        }
        return result;
    }

    /**
     * Returns a hash code value for the object. This method is
     * supported for the benefit of hash tables such as those provided by
     * {@link HashMap}.
     * <p>
     * The general contract of {@code hashCode} is:
     * <ul>
     * <li>Whenever it is invoked on the same object more than once during
     *     an execution of a Java application, the {@code hashCode} method
     *     must consistently return the same integer, provided no information
     *     used in {@code equals} comparisons on the object is modified.
     *     This integer need not remain consistent from one execution of an
     *     application to another execution of the same application.
     * <li>If two objects are equal according to the {@code equals(Object)}
     *     method, then calling the {@code hashCode} method on each of
     *     the two objects must produce the same integer result.
     * <li>It is <em>not</em> required that if two objects are unequal
     *     according to the {@link Object#equals(Object)}
     *     method, then calling the {@code hashCode} method on each of the
     *     two objects must produce distinct integer results.  However, the
     *     programmer should be aware that producing distinct integer results
     *     for unequal objects may improve the performance of hash tables.
     * </ul>
     *
     * @return a hash code value for this object.
     * @implSpec As far as is reasonably practical, the {@code hashCode} method defined
     * by class {@code Object} returns distinct integers for distinct objects.
     * @see Object#equals(Object)
     * @see System#identityHashCode
     */
    @Override
    public int hashCode() {
        int result = 0;
        for (User user : users) {
            result += user.hashCode();
        }
        return result;
    }
}
