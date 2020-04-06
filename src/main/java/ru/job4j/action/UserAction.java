package ru.job4j.action;

import ru.job4j.input.Input;
import ru.job4j.model.database.Data;

/**
 * Single action that
 * user calls.
 * For example, user
 * can call "Add user"
 * action to add new
 * user to base.
 *
 * @author Geraskin Yegor(yegeraskin13@gmail.com)
 */
public interface UserAction {
    /**
     * Method give name of
     * this action.
     * This name need
     * during printing menu
     * @return short name of this
     *         action.
     */
    String getTitle();

    /**
     * Inside this method
     * performs all needed
     * operations on this
     * type of user's action
     * @param input - instance of object,
     *                that we use to input
     *                data into program
     * @param data - instance of Data
     *               object, that we will
     *               make operations with
     * @return boolean value that
     *         reports, should
     *         program stop or
     *         continue work-
     *         cycle after this
     *         action.
     */
    boolean execute(Input input, Data data);
}
