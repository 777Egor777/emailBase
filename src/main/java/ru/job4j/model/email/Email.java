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

    /**
     * Method return String
     * representation of
     * this Email-object.
     * It will have shape:
     * "Email{this.value}"
     * @return String of shape:
     *         "Email{this.value}"
     */
    @Override
    public String toString() {
        return super.toString();
    }

    /**
     * Hashcode of Email object =
     * hashcode of it's "value"
     * field, that has String
     * type
     * @return hashCode of "value"
     *         field
     */
    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
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
