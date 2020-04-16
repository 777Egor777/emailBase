package ru.job4j.action;

import org.junit.Test;

import static org.junit.Assert.*;

import static org.hamcrest.Matchers.is;

/**
 * Test class for class
 * {@code CompressDataAction}
 * @author Geraskin Yegor(yegeraskin13@gmail.com)
 */
public class CompressDataActionTest {

    @Test
    public void getTitle() {
        UserAction action = new CompressDataAction();
        assertThat(action.getTitle(), is("COMPRESS"));
    }

    @Test
    public void execute() {
    }
}