package ru.job4j.action;

import ru.job4j.input.Input;
import ru.job4j.model.database.Data;

/**
 * Class implements "UserAction" interface.
 * Will be used in testing
 * @author Geraskin Yegor(yegeraskin13@gmail.com)
 */
public class StubAction implements UserAction {
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
        return "STUBACTION";
    }

    /**
     * This action end work-
     * cycle of the program.
     * It just return false,
     * and work-cycle ends.
     *
     * @param input - instance of object,
     *              that we use to input
     *              data into program
     * @param data  - instance of Data
     *              object, that we will
     *              make operations with
     * @return always false. This action
     *         ends program execution
     */
    @Override
    public boolean execute(Input input, Data data) {
        return false;
    }
}
