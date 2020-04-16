package ru.job4j.action;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.hamcrest.Matchers.is;

/**
 * Test class for class
 * {@code StubAction}
 * @author Geraskin Yegor(yegeraskin13@gmail.com)
 */
public class StubActionTest {

    @Test
    public void getTitle() {
        UserAction action = new StubAction();
        assertThat(action.getTitle(), is("STUBACTION"));
    }

    @Test
    public void execute() {
    }
}
