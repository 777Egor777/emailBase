package ru.job4j.action;

import ru.job4j.input.Input;
import ru.job4j.model.database.Data;
import ru.job4j.model.database.util.DataHelper;

/**
 * This class execute process
 * cleaning current data base.
 * @author Geraskin Yegor(yegeraskin13@gmail.com)
 */
public class CleanBaseAction implements UserAction {
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
        return "CLEAN";
    }

    /**
     * Inside this method
     * performs all needed
     * operations on
     * cleaning base process
     *
     * @param input - instance of object,
     *              that we use to input
     *              data into program
     * @param data  - instance of Data
     *              object, that we will
     *              clean
     * @return boolean value that
     * reports, should
     * program stop or
     * continue work-
     * cycle after this
     * action.
     */
    @Override
    public boolean execute(Input input, Data data) {
        System.out.println(String.format("===%s===", getTitle()));
        DataHelper.clean(data);
        return true;
    }
}
