package ru.job4j.action;

import org.junit.Test;

import static org.junit.Assert.*;

import static org.hamcrest.Matchers.is;

/**
 * Test class for class
 * {@code DeleteEmailAction}
 * @author Geraskin Yegor(yegeraskin13@gmail.com)
 */
public class DeleteEmailActionTest {

    @Test
    public void getTitle() {
        UserAction action = new DeleteEmailAction();
        assertThat(action.getTitle(), is("DELETE USER"));
    }

    @Test
    public void execute() {
    }
}