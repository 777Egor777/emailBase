package ru.job4j.action;

import ru.job4j.input.Input;
import ru.job4j.model.database.Data;

import java.io.IOException;

/**
 * This class execute process
 * of over-writing the data
 * base
 * @author Geraskin Yegor(yegeraskin13@gmail.com)
 */
public class OverwriteDataAction implements UserAction {
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
        return "OVERWRITE";
    }

    /**
     * Inside this method
     * performs all needed
     * operations on this
     * type of user's action
     *
     * @param input - instance of object,
     *              that we use to input
     *              new data base into
     *              program
     * @param data  - instance of Data
     *              object, that we will
     *              fill with new data
     *              base
     * @return boolean value that
     * reports, should
     * program stop or
     * continue work-
     * cycle after this
     * action.
     */
    @Override
    public boolean execute(Input input, Data data) throws IOException {
        System.out.println(String.format("===%s===", getTitle()));
        data = input.askData();
        return true;
    }
}
