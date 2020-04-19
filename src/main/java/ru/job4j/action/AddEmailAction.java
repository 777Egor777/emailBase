package ru.job4j.action;

import ru.job4j.input.Input;
import ru.job4j.model.database.Data;
import ru.job4j.model.database.util.DataHelper;
import ru.job4j.model.email.Email;

import java.io.IOException;

/**
 * This class execute process
 * of adding new Email into
 * data base.
 * @author Geraskin Yegor(yegeraskin13@gmail.com)
 */
public class AddEmailAction implements UserAction {
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
        return "ADD EMAIL";
    }

    /**
     * Inside this method
     * performs all needed
     * operations on the
     * process of adding
     * new Email to data
     * base.
     *
     * @param input - instance of object,
     *              that we use to read
     *              new Email
     * @param data  - instance of Data
     *              object, that we will
     *              add new Email to
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
        Email email = input.askEmail("Enter new email: ", data.getUser(id));
        DataHelper.addEmail(data, id, email);
        return true;
    }
}
