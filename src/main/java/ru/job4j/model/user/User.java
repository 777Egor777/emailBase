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

    private int id;
}
