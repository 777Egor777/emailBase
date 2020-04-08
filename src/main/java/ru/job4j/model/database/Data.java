package ru.job4j.model.database;

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
}
