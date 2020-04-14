package ru.job4j.model.user;

import ru.job4j.model.email.Email;

import java.util.HashMap;
import java.util.List;
import java.util.Set;

/**
 * Data model for the
 * single user that
 * base consists from
 *
 * We can make this class
 * Immutable in future
 * @version 1.0.
 * @author Geraskin Yegor(yegeraskin13@gmail.com)
 */
public class User {
    /**
     * Email's list of {@code this} {@code User}
     * We will try not to allow duplicates
     * in this list.
     * <p>
     *     Max size of this list
     *     is 100.
     *     (In version 1.0 of class)
     * </p>
     */
    private List<Email> emails;

    /**
     * <p>
     *     Set of all {@code Email} objects
     *     from {@code emails}-list.
     * </p>
     * <p>
     *     We need it to except duplicates
     *     in {@code emails}-list.
     * </p>
     * <p>
     *     Must be initialize with
     *     {@code HashSet}-object.
     *     So it will works for
     *     O(1) time and will not
     *     change complexity of
     *     algorithms in program.
     * </p>
     * <p>
     *     Max size of this set
     *     is 100.
     *     (In version 1.0 of class)
     * </p>
     */
    private Set<Email> emailsSet; //TODO initialize by HashSet

    /**
     * Unique identifier of this user.
     * We initialise it on constructing
     * object and use while interact
     * with customer of the program.
     */
    private int id;

    /**
     * Constructor of class.
     * Initialise all fields.
     */
    public User() {

    }

    /**
     * Constructor of class
     * that receive list
     * of email as param.
     * Need in future version
     * of class, when we will
     * make it Immutable
     * @param emails - initialise value of
     *                 field {@code emails}
     *                 of class.
     *                 <p>
     *                      Mas size if 100.
     *                      (In version 1.0 of class)
     *                 </p>
     */
    public User(List<Email> emails) {
    }

    /**
     * Method return {@code List}
     * of {@code Email} objects
     * - email's-list of this
     * user
     * @return email-s list
     *         of this user
     *         <p>
     *             Max size of list
     *             is 100. (In version
     *             1.0 of class)
     *         </p>
     */
    public List<Email> getEmails() {
        return null;
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

    /**
     * Return current number
     * of emails that this
     * user has
     * @return Current number
     * of emails
     */
    public int getNumberOfEmails() {
        return -1;
    }

    /**
     * Method return user's
     * email, that located on
     * the {@code index}
     * position in user's
     * email-list
     * @param index - position of email
     *                that we should
     *                return in user's
     *                email-list.
     *                <p>
     *                      {@code index <= 100}
     *                      in version 1.0 of class
     *                </p>
     * @return {@code Email} object that
     *         located on position
     *         {@code index} in user's
     *         email-list
     */
    public Email getEmail(int index) {
        return null;
    }

    /**
     * Method delete user's
     * email, that located
     * on the {@code index}
     * position in user's
     * email-list
     * @param index - position of email
     *                , that we should
     *                delete, in user's
     *                email-list
     *                <p>
     *                      {@code index <= 100}
     *                      in version 1.0 of class
     *                </p>
     */
    public void deleteEmail(int index) {
    }

    /**
     * <p>
     *     If email's list not empty:
     *     Method return {@code String}
     *     representative of this
     *     {@code User} object
     *     Format is there:
     *     User#userId->email1, email2, ..., emailN;
     *     Where N - count of emails
     *     that this user has
     * </p>
     * <p>
     *     If email's list empty:
     *     User#userId;
     * </p>
     * @return {@code String}
     *      representative of this
     *      {@code User} object
     */
    @Override
    public String toString() {
        return super.toString();
    }

    /**
     * Method add new {@code Email}
     * object to user's email-list
     * {@code emails}.
     * Email add to the end of list.
     * @param email - object of {@code Email}
     *                {@code class}
     *                that we must add to
     *                user's email-list
     *                in this method
     */
    public void addEmail(Email email) {
    }

    /**
     * <p>
     *     Method checks if
     *     {@code param}
     *     {@code email}
     *     already contains
     *     in user's email-
     *     list.
     * </p>
     * @param email - {@code Email} object
     *                that we check to be
     *                part of {@code emails}
     *                field of this object
     * @return {@code true} - if {@code email} contains
     *                        in {@code emails} field of
     *                        {@code this} object
     *         {@code false} - otherwise
     */
    public boolean containsEmail(Email email) {
        return false;
    }

    /**
     * <p>
     *     Method asks if
     *     {@code this} object
     *     of class {@code User}
     *     equals to {@code obj}
     *     object if class
     *     {@code User}
     * </p>
     * <p>
     *     If {@code obj} is not
     *     object of class
     *     {@code User},
     *     method returns
     *     {@code false} value
     * </p>
     * @param obj - object that we compare
     *              with {@code this} object
     *              to find if they equals
     *              or not
     * @return {@code true} - if objects {@code this}
     *                        and {@code obj} are
     *                        equals.
     *         {@code false} - if objects {@code this}
     *                         and {@code obj} are not
     *                         equals.
     */
    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    /**
     * Returns a hash code value for the object. This method is
     * supported for the benefit of hash tables such as those provided by
     * {@link HashMap}.
     * <p>
     * The general contract of {@code hashCode} is:
     * <ul>
     * <li>Whenever it is invoked on the same object more than once during
     *     an execution of a Java application, the {@code hashCode} method
     *     must consistently return the same integer, provided no information
     *     used in {@code equals} comparisons on the object is modified.
     *     This integer need not remain consistent from one execution of an
     *     application to another execution of the same application.
     * <li>If two objects are equal according to the {@code equals(Object)}
     *     method, then calling the {@code hashCode} method on each of
     *     the two objects must produce the same integer result.
     * <li>It is <em>not</em> required that if two objects are unequal
     *     according to the {@link Object#equals(Object)}
     *     method, then calling the {@code hashCode} method on each of the
     *     two objects must produce distinct integer results.  However, the
     *     programmer should be aware that producing distinct integer results
     *     for unequal objects may improve the performance of hash tables.
     * </ul>
     *
     * @return a hash code value for this object.
     * @implSpec As far as is reasonably practical, the {@code hashCode} method defined
     * by class {@code Object} returns distinct integers for distinct objects.
     * @see Object#equals(Object)
     * @see System#identityHashCode
     */
    @Override
    public int hashCode() {
        return super.hashCode();
    }
}
