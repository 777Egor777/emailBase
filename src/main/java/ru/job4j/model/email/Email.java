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
public final class Email implements Comparable<Email> {
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

    /**
     * Compares this object with the specified object for order.  Returns a
     * negative integer, zero, or a positive integer as this object is less
     * than, equal to, or greater than the specified object.
     *
     * <p>The implementor must ensure
     * {@code sgn(x.compareTo(y)) == -sgn(y.compareTo(x))}
     * for all {@code x} and {@code y}.  (This
     * implies that {@code x.compareTo(y)} must throw an exception iff
     * {@code y.compareTo(x)} throws an exception.)
     *
     * <p>The implementor must also ensure that the relation is transitive:
     * {@code (x.compareTo(y) > 0 && y.compareTo(z) > 0)} implies
     * {@code x.compareTo(z) > 0}.
     *
     * <p>Finally, the implementor must ensure that {@code x.compareTo(y)==0}
     * implies that {@code sgn(x.compareTo(z)) == sgn(y.compareTo(z))}, for
     * all {@code z}.
     *
     * <p>It is strongly recommended, but <i>not</i> strictly required that
     * {@code (x.compareTo(y)==0) == (x.equals(y))}.  Generally speaking, any
     * class that implements the {@code Comparable} interface and violates
     * this condition should clearly indicate this fact.  The recommended
     * language is "Note: this class has a natural ordering that is
     * inconsistent with equals."
     *
     * <p>In the foregoing description, the notation
     * {@code sgn(}<i>expression</i>{@code )} designates the mathematical
     * <i>signum</i> function, which is defined to return one of {@code -1},
     * {@code 0}, or {@code 1} according to whether the value of
     * <i>expression</i> is negative, zero, or positive, respectively.
     *
     * @param o the object to be compared.
     * @return a negative integer, zero, or a positive integer as this object
     * is less than, equal to, or greater than the specified object.
     * @throws NullPointerException if the specified object is null
     * @throws ClassCastException   if the specified object's type prevents it
     *                              from being compared to this object.
     */
    @Override
    public int compareTo(Email o) {
        return value.compareTo(o.getValue());
    }
}
