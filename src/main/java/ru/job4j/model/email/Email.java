package ru.job4j.model.email;

/**
 * Data model for the
 * single Email of
 * some user
 *
 * @author Egor Geraskin(yegeraskin13@gmail.com)
 */
public final class Email {
    /**
     * String value of email
     * For example: "yegeraskin13@gmail.com"
     */
    private String value;

    /**
     * Constructor of class.
     * Has one parameter -
     * String value of
     * this Email.
     * If value is incorrect,
     * method throw special
     * exception
     * //TODO Make special Exception class in this package
     * @param value - String value
     *                of this Email
     */
    public Email(String value) {
    }

    @Override
    public String toString() {
        return super.toString();
    }

    /**
     * Getter for field "value"
     * @return field "value" of
     *         this class
     */
    public String getValue() {
        return null;
    }
}
