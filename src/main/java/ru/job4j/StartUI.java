package ru.job4j;

import ru.job4j.input.Input;
import ru.job4j.model.Data;

import java.util.Arrays;
import java.util.List;

/**
 * Start User Interface
 * We use this class to start
 * interact with user by Console
 * input - output.
 *
 * @author Geraskin Yegor(yegeraskin13@gmail.com)
 * @version 0.1, 01.04.2020
 */
public class StartUI {
    /**
     * Menu of the program based
     * on the pattern "Strategy"
     * Each action - object of the
     * class that implements
     * interface "UserAction"
     *
     * All available actions
     * are located in the List
     * "actions"
     */
    private List<UserAction> actions;

    /*
     * In this non-static block we
     * initialize actions variable.
     * We use construction
     * Arrays.asList(...) to do it.
     */
    {
        actions = Arrays.asList(
                null
        );
    }

    /**
     * This method start work-cycle
     * of the program.
     * 1) It show menu to user
     * 2) Then ask user to choose
     *    menu item
     * 3) Run process of this menu
     *    item
     * 4) Receive answer from user,
     *    should cycle break or
     *    it should continue
     * @param actions - Array of all possible
     *                  menu items, that user
     *                  can choose.
     * @param input - Object of Input interface,
     *                that we need to interact
     *                with user(get input data
     *                from him)
     * @param data - Object of type Data, in witch
     *               we save data base of users
     *               and their emails
     */
    public void start(UserAction[] actions, Input input, Data data) {
    }

    /**
     * Main class, entry-point of the program.
     * We create here all necessary
     * objects and start to
     * interact with user.
     * @param args - standard compiler args
     */
    public static void main(String[] args) {
    }
}