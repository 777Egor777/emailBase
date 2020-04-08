package ru.job4j.model.email;

/**
 * Data model for the
 * single Email of
 * some user
 *
 * We can make it class immutable
 * in future.
 * @author Geraskin Yegor(yegeraskin13@gmail.com)
 */
public final class Email {
    /**
     * String value of email
     * For example: "yegeraskin13@gmail.com"
     */
    private String value;
    //TODO after implementing constructor, make this field final

    //TODO JavaDoc
    private String name;

    //TODO JavaDoc
    private String service;

    //TODO JavaDoc
    private String domain;

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

    /**
     * This object and object
     * by reference obj equals
     * if and only if their
     * fields "value" equals
     * as String objects
     *
     * If obj - null reference,
     * than objects not equals
     * and {@code false} will
     * be returned
     * @param obj - reference to object, that we compare
     *              with {@code this} object
     * @return {@code true} if {@code obj} - not {@code null} reference and
     *                      object by reference {@code obj} -
     *                      instance of {@code Email}
     *                      class and field {@code value}
     *                      of object by reference {@code obj}
     *                      equals to field {@code value} of
     *                      {@code this} object as {@code String} object.
     *          {@code false} Otherwise
     */
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

    //TODO JavaDoc
    public String getName() {
        return null;
    }

    //TODO JavaDoc
    public String getService() {
        return null;
    }
}
