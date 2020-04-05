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
}
