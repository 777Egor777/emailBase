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

    /**
     * <p>
     *     Checks if param
     *     {@code value}
     *     could be correct
     *     {@code value}
     *     field of
     *     {@code Email}
     *     object.
     * </p>
     * <p>
     *     Method don't work
     *     with strings and
     *     characters.
     *     It just use the
     *     result of work
     *     of methods
     *     {@code isCorrectName},
     *     {@code isCorrectService},
     *     {@code isCorrectDomain}.
     *     If all af this results
     *     are {@code true} than
     *     result of work of this
     *     method if {@code true}
     *     too.
     *     Otherwise result of
     *     work of this method
     *     if {@code false}
     * </p>
     * @param value - {@code String} object
     *                that we check to be
     *                field {@code value}
     *                of correct
     *                {@code Email} object
     * @return true - if param {@code value}
     *                can be value of
     *                field {@code value}
     *                of correct
     *                {@code Email}
     *                object
     */
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

    //TODO JavaDoc
    public static boolean isCorrectDomain(String value) {
        return false;
    }
}
