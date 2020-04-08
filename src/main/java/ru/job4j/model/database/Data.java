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
 * @author Egor Geraskin(yegeraskin13@gmail.com)
 */
public class Data {
    //TODO JavaDoc
    private List<User> users;

    //TODO JavaDoc
    public void addUser(User user) {
    }

    //TODO change JavaDoc
    /**
     * Returns a string representation of the object. In general, the
     * {@code toString} method returns a string that
     * "textually represents" this object. The result should
     * be a concise but informative representation that is easy for a
     * person to read.
     * It is recommended that all subclasses override this method.
     * <p>
     * The {@code toString} method for class {@code Object}
     * returns a string consisting of the name of the class of which the
     * object is an instance, the at-sign character `{@code @}', and
     * the unsigned hexadecimal representation of the hash code of the
     * object. In other words, this method returns a string equal to the
     * value of:
     * <blockquote>
     * <pre>
     * getClass().getName() + '@' + Integer.toHexString(hashCode())
     * </pre></blockquote>
     *
     * @return a string representation of the object.
     */
    @Override
    public String toString() {
        return super.toString();
    }

    //TODO JavaDoc
    public void clean() {
    }

    //TODO JavaDoc
    public void addEmail(int id, Email email) {
    }

    //TODO JavaDoc
    public int[] allId() {
        return null;
    }

    //TODO JavaDoc
    public void deleteUser(int id) {
    }

    //TODO JavaDoc
    public User getUser(int id) {
        return null;
    }
}
