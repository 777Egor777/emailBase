package ru.job4j;

import ru.job4j.input.Input;

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