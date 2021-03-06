package ru.job4j;

import ru.job4j.action.*;
import ru.job4j.input.ConsoleInput;
import ru.job4j.input.Input;
import ru.job4j.input.ValidateInput;
import ru.job4j.model.database.Data;

import java.io.IOException;
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

    /*
     * In this non-static block we
     * initialize actions variable.
     * We use construction
     * Arrays.asList(...) to do it.
     */
    {
        actions = Arrays.asList(
                new PrintDataAction(),
                new OverwriteDataAction(),
                new CleanBaseAction(),
                new AddUserAction(),
                new AddEmailAction(),
                new DeleteUserAction(),
                new DeleteEmailAction(),
                new CompressDataAction(),
                new ExitProgramAction()
        );
    }

    /**
     * This method print all
     * menu items with
     * numeration to standard
     * output.
     * @param menu - list of menu items,
     *               that we print to
     *               standard1 output
     */
    public void showMenu(List<UserAction> menu) {
        System.out.println("MENU");
        for (int index = 0; index < menu.size(); ++index) {
            System.out.println(String.format(
                    "%d.%s",
                    (index + 1),
                    menu.get(index).getTitle()
            ));
        }
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
     * @param actions - List of all possible
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
    public void start(List<UserAction> actions, Input input, Data data) throws IOException {
        boolean run = true;
        while (run) {
            showMenu(actions);
            int menuItemIndex = input.askInt("Enter menu's item number: ", actions.size()) - 1;
            run = actions.get(menuItemIndex).execute(input, data);
            System.out.println();
        }
    }

    /**
     * Main class, entry-point of the program.
     * We create here all necessary
     * objects and start to
     * interact with user.
     * @param args - standard compiler args
     */
    public static void main(String[] args) throws IOException {
        Data data = new Data();
        Input input = new ValidateInput(new ConsoleInput());
        StartUI ui = new StartUI();
        ui.start(ui.actions, input, data);
    }
}