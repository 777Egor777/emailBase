package ru.job4j.action;

import org.junit.Test;

import static org.junit.Assert.*;

import static org.hamcrest.Matchers.is;

/**
 * Test class for class
 * {@code CleanBaseAction}
 * @author Geraskin Yegor(yegeraskin13@gmail.com)
 */
public class AddUserActionTest {

    @Test
    public void getTitle() {
        UserAction action = new AddUserAction();
        assertThat(action.getTitle(), is("ADD USER"));
    }

    @Test
    public void execute() {
    }
}