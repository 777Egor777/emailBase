package ru.job4j.action;

import org.junit.Test;
import ru.job4j.input.Input;
import ru.job4j.model.database.Data;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.util.StringJoiner;

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
    public void execute1() throws IOException {
        UserAction action = new StubAction();
        Input input = null;
        Data data = null;
        assertThat(action.execute(input, data), is(false));
    }

    @Test
    public void execute2() throws IOException {
        UserAction action = new StubAction();
        Input input = null;
        Data data = null;
        PrintStream stdout = System.out;
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        System.setOut(new PrintStream(baos));
        StringJoiner joiner = new StringJoiner(System.lineSeparator(), "", System.lineSeparator());
        action.execute(input, data);
        joiner.add("===STUBACTION===");
        System.setOut(stdout);
        assertThat(baos.toString(), is(joiner.toString()));
    }
}
