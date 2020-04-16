package ru.job4j.action;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.hamcrest.Matchers.is;

/**
 * Test class for class
 * {@code OverwriteDataAction}
 * @author Geraskin Yegor(yegeraskin13@gmail.com)
 */
public class OverwriteDataActionTest {

    @Test
    public void getTitle() {
        UserAction action = new PrintDataAction();
        assertThat(action.getTitle(), is("OVERWRITE"));
    }

    @Test
    public void execute() {
    }
}