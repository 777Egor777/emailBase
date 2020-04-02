package ru.job4j;

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
    public List<UserAction> actions;

    {
        actions = Arrays.asList(
                null
        );
    }

    public static void main(String[] args) {
    }
}