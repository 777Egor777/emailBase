package ru.job4j.action;

import ru.job4j.input.Input;
import ru.job4j.model.database.Data;
import ru.job4j.model.database.util.DataHelper;

import java.io.IOException;

/**
 * This class execute process
 * of deleting User from
 * data base
 * @author Geraskin Yegor(yegeraskin13@gmail.com)
 */
public class DeleteUserAction implements UserAction {
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
        return "DELETE USER";
    }

    /**
     * Inside this method
     * performs all needed
     * operations on this
     * type of user's action
     *
     * @param input - instance of object,
     *              that we use to input
     *              id of user, that
     *              we should delete
     * @param data  - instance of Data
     *              object, that we will
     *              delete user from
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
        int id = input.askInt("Enter user's id: ",
                data.allId());
        DataHelper.deleteUser(data, id);
        return true;
    }
}
