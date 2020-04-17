package ru.job4j.model.email;

import java.util.Objects;

/**
 * Data model for the
 * single Email of
 * some user
 *
 * All objects of this
 * {@code class} are Immutable.
 * @author Geraskin Yegor(yegeraskin13@gmail.com)
 */
public final class Email {
    /**
     * String value of email
     * For example: "yegeraskin13@gmail.com"
     */
    private final String value;

    /**
     * First part of email's
     * {@code String}
     * representation.
     * For example:
     * name@yandex.ru
     */
    private String name;

    /**
     * second part of email's
     * {@code String}
     * representation.
     * For example:
     * egor@service.ru
     */
    private String service;

    /**
     * Third part of email's
     * {@code String}
     * representation.
     * For example:
     * egor@yandex.domain
     */
    private String domain;

    /**
     * Constructor of class.
     * Has one parameter -
     * String value of
     * this Email.
     * @param value - String value
     *                of this Email
     */
    public Email(String value) {
        this.value = value;
        name = "";
        service = "";
        domain = "";
        int posDog = value.indexOf('@');
        if (posDog >= 0) {
            name = value.substring(0, posDog);
            int posDot = value.indexOf('.', posDog);
            if (posDot >= 0) {
                service = value.substring(posDog + 1, posDot);
                domain = value.substring(posDot + 1);
            }
        }
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
        return String.format("Email{%s}", value);
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
        return value.hashCode();
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
     * @return              {@code true} -  if {@code obj} - not {@code null} reference and
     *                      object by reference {@code obj} -
     *                      instance of {@code Email}
     *                      class and field {@code value}
     *                      of object by reference {@code obj}
     *                      equals to field {@code value} of
     *                      {@code this} object as {@code String} object.
     *                      {@code false} -  Otherwise
     */
    @Override
    public boolean equals(Object obj) {
        boolean result = false;
        if (obj != null
        &&  obj.getClass() == this.getClass()) {
            Email email = (Email) obj;
            result = value.equals(email.getValue());
        }
        return result;
    }

    /**
     * Getter for field "value"
     * @return field "value" of
     *         this class
     */
    public String getValue() {
        return value;
    }

    /**
     * Getter for field "name"
     * @return field "name" of
     *         this class
     */
    public String getName() {
        return name;
    }

    /**
     * Getter for field "service"
     * @return field "service" of
     *         this class
     */
    public String getService() {
        return service;
    }

    /**
     * Getter for field "domain"
     * @return field "domain" of
     *         this class
     */
    public String getDomain() {
        return domain;
    }
}
