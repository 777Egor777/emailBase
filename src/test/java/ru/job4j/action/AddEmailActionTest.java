package ru.job4j.action;

import org.junit.Test;

import static org.junit.Assert.*;
import static org.hamcrest.Matchers.is;

/**
 * Test class for class
 * {@code AddEmailAction}
 * @author Geraskin Yegor(yegeraskin13@gmail.com)
 */
public class AddEmailActionTest {

    @Test
    public void getTitle() {
        UserAction action = new AddEmailAction();
        assertThat(action.getTitle(), is("ADD EMAIL"));
    }

    @Test
    public void execute() {
    }
}