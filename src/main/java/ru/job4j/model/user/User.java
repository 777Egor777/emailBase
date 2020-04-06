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

    public User(List<Email> emails) {
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
     * Method return {@code String}
     * representative of this
     * {@code User} object
     * Format is there:
     * User#userId->email1, email2, ..., emailN
     * Where N - count of emails
     * that this user has
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
     * @param email - object of {@Email} class
     *                that we must add to
     *                user's email-list
     *                in this method
     */
    public void addEmail(Email email) {
    }
}
