package ru.job4j.action;

import ru.job4j.input.Input;
import ru.job4j.model.database.Data;

/**
 * This class execute process
 * of compressing data base.
 * All users that has at least
 * one common emails merge into
 * one user.
 *
 * @author Geraskin Yegor(yegeraskin13@gmail.com)
 */
public class CompressDataAction implements UserAction {
    /**
     * Method give name of
     * this action.
     * This name need
     * during printing menu
     *
     * @return short name of this
     * action.
     */
    @Override
    public String getTitle() {
        return "COMPRESS";
    }

    /**
     * Inside this method
     * performs all needed
     * operations on
     * compressing base
     *
     * @param input - instance of object,
     *              that we use to input
     *              data into program
     * @param data  - instance of Data
     *              object, that we will
     *              compress
     * @return boolean value that
     * reports, should
     * program stop or
     * continue work-
     * cycle after this
     * action.
     */
    @Override
    public boolean execute(Input input, Data data) {
        return false;
    }
}
