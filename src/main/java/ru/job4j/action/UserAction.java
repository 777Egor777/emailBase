package ru.job4j.action;

import ru.job4j.input.Input;
import ru.job4j.model.Data;

/**
 * Single action that
 * user calls.
 * For example, user
 * can call "Add user"
 * action to add new
 * user to base.
 *
 * @author Geraskin Yegor(yegeraskin13@gmail.com)
 */
public interface UserAction {
    String getTitle();
    boolean execute(Input input, Data data);
}
