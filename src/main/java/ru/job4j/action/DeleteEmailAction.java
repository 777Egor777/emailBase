package ru.job4j.action;

import ru.job4j.input.Input;
import ru.job4j.model.database.Data;
import ru.job4j.model.database.util.DataHelper;
import ru.job4j.model.user.User;
import ru.job4j.model.user.util.Users;

import java.io.IOException;

/**
 * This class execute process
 * of deleting email from
 * some user in data base
 *
 * @author Geraskin Yegor(yegeraskin13@gmail.com)
 */
public class DeleteEmailAction implements UserAction {
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
        return "DELETE EMAIL";
    }

    /**
     * Inside this method
     * performs all needed
     * operations on process of
     * deleting email from
     * some user's email-list
     * in data base
     *
     * @param input - instance of object,
     *              that we use to input
     *              user's id
     * @param data  - instance of Data
     *              object, that we will
     *              delete email from
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
        User user = data.getUser(id);
        Users.printEmails(user);
        int emailIndex = input.askInt("Enter email's index: ", user.getNumberOfEmails()) - 1;
        DataHelper.deleteEmail(data, id, emailIndex);
        return true;
    }
}
