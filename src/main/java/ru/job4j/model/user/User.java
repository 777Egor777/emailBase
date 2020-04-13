package ru.job4j.model.user;

import ru.job4j.model.email.Email;
import java.util.List;

/**
 * Data model for the
 * single user that
 * base consists from
 *
 * We can make this class
 * Immutable in future
 * @version 1.0.
 * @author Geraskin Yegor(yegeraskin13@gmail.com)
 */
public class User {
    /**
     * Email's list of {@code this} {@code User}
     * We will try not to allow duplicates
     * in this list.
     */
    private List<Email> emails;

    /**
     * Unique identifier of this user.
     * We initialise it on constructing
     * object and use while interact
     * with customer of the program
     */
    private int id;

    /**
     * Constructor of class.
     * Initialise all fields.
     */
    public User() {

    }

    /**
     * Constructor of class
     * that receive list
     * of email as param/
     * Need in future version
     * of class, when we will
     * make it Immutable
     * @param emails - initialise value of
     *                 field {@code emails}
     *                 of class
     */
    public User(List<Email> emails) {
    }

    /**
     * Method return {@code List}
     * of {@code Email} objects
     * - email's-list of this
     * user
     * @return email-s list
     *         of this user
     */
    public List<Email> getEmails() {
        return null;
    }

    /**
     * Getter for field {@code id}
     * @return value of field
     *         {@code id}
     */
    public int getId() {
        return -1;
    }

    /**
     * Make {@code emails} field empty.
     * Cleans it completely.
     */
    public void cleanEmailsList() {
    }

    /**
     * Return current number
     * of emails that this
     * user has
     * @return Current number
     * of emails
     */
    public int getNumberOfEmails() {
        return -1;
    }

    /**
     * Method return user's
     * email, that located on
     * the {@code index}
     * position in user's
     * email-list
     * @param index - position of email
     *                that we should
     *                return in user's
     *                email-list
     * @return {@code Email} object that
     *         located on position
     *         {@code index} in user's
     *         email-list
     */
    public Email getEmail(int index) {
        return null;
    }

    /**
     * Method delete user's
     * email, that located
     * on the {@code index}
     * position in user's
     * email-list
     * @param index - position of email
     *                , that we should
     *                delete, in user's
     *                email-list
     */
    public void deleteEmail(int index) {
    }

    /**
     * <p>
     *     If email's list not empty:
     *     Method return {@code String}
     *     representative of this
     *     {@code User} object
     *     Format is there:
     *     User#userId->email1, email2, ..., emailN;
     *     Where N - count of emails
     *     that this user has
     * </p>
     * <p>
     *     If email's list empty:
     *     User#userId;
     * </p>
     * @return {@code String}
     *      representative of this
     *      {@code User} object
     */
    @Override
    public String toString() {
        return super.toString();
    }

    /**
     * Method add new {@code Email}
     * object to user's email-list
     * {@code emails}.
     * Email add to the end of list.
     * @param email - object of {@code Email}
     *                {@code class}
     *                that we must add to
     *                user's email-list
     *                in this method
     */
    public void addEmail(Email email) {
    }

    /**
     * <p>
     *     Method checks if
     *     {@code param}
     *     {@code email}
     *     already contains
     *     in user's email-
     *     list.
     * </p>
     * @param email - {@code Email} object
     *                that we check to be
     *                part of {@code emails}
     *                field of this object
     * @return {@code true} - if {@code email} contains
     *                        in {@code emails} field of
     *                        {@code this} object
     *         {@code false} - otherwise
     */
    public boolean containsEmail(Email email) {
        return false;
    }
}
