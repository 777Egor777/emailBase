package ru.job4j.action;

import ru.job4j.input.Input;
import ru.job4j.model.database.Data;
import ru.job4j.model.database.util.DataHelper;
import ru.job4j.model.user.User;

import java.io.IOException;

/**
 * This class execute process
 * of adding new User into
 * data base.
 * @author Geraskin Yegor(yegeraskin13@gmail.com)
 */
public class AddUserAction implements UserAction {
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
        return "ADD USER";
    }

    /**
     * Inside this method
     * performs all needed
     * operations on this
     * type of user's action
     *
     * @param input - instance of object,
     *              that we use to input
     *              new User object
     * @param data  - instance of Data
     *              object, that we will
     *              add new User to
     * @return boolean value that
     * reports, should
     * program stop or
     * continue work-
     * cycle after this
     * action.
     */
    @Override
    public boolean execute(Input input, Data data) throws IOException {
        User newUser = input.askUser();
        DataHelper.addUser(data, newUser);
        return true;
    }
}
