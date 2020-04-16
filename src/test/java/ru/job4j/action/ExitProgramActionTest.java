package ru.job4j.action;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.hamcrest.Matchers.is;

/**
 * Test class for class
 * {@code ExitProgramAction}
 * @author Geraskin Yegor(yegeraskin13@gmail.com)
 */
public class ExitProgramActionTest {

    @Test
    public void getTitle() {
        UserAction action = new OverwriteDataAction();
        assertThat(action.getTitle(), is("EXIT"));
    }

    @Test
    public void execute() {
    }
}