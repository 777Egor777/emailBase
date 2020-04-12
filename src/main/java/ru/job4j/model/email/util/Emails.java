package ru.job4j.model.email.util;

import ru.job4j.model.email.Email;

/**
 * Help utility class for
 * data model "Email"
 * @author Geraskin Yegor(yegeraskin13@gmail.com)
 */
public class Emails {
    /**
     * <p>
     *     Method checks if received
     *     Email object is
     *     acceptable.
     * </p>
     * <p>
     *     Email acceptable,
     *     if it's {@code value}
     *     field has type:
     *     "name@service.domain",
     *     where:
     *     1. name and service -
     *        {@code String}
     *        objects with
     *        {@code length() >= 3}
     *     2. domain - {@code String}
     *        from set:
     *        {"ru", "com", "net",
     *        "org", "edu"}
     * </p>
     *
     * @param email - verifiable Email
     *                object
     * @return true - if param -  correct Email object
     *         false - if param -  incorrect Email object
     */
    public static boolean isCorrectEmail(Email email) {
        boolean result = false;
        return false;
    }

    //TODO JavaDoc
    public static boolean isCorrectValue(String value) {
        return false;
    }

    //TODO JavaDoc
    public static boolean isCorrectName(String value) {
        return false;
    }

    //TODO JavaDoc
    public static boolean isCorrectService(String value) {
        return false;
    }
}
