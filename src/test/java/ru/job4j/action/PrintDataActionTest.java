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
 * {@code PrintDataAction}
 * @author Geraskin Yegor(yegeraskin13@gmail.com)
 */
public class PrintDataActionTest {

    @Test
    public void getTitle() {
        UserAction action = new PrintDataAction();
        assertThat(action.getTitle(), is("PRINT"));
    }

    @Test
    public void execute1() throws IOException {
        UserAction action = new PrintDataAction();
        Input input = null;
        Data data = new Data();
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        StringJoiner joiner = new StringJoiner(System.lineSeparator(), "", System.lineSeparator());
        PrintStream stdout = System.out;
        System.setOut(new PrintStream(baos));

        action.execute(input, data);
        joiner.add("===PRINT===");
        joiner.add(data.toString());

        System.setOut(stdout);
        assertThat(baos.toString(), is(joiner.toString()));
    }

    @Test
    public void execute2() throws IOException {
        UserAction action = new PrintDataAction();
        Input input = null;
        Data data = new Data();
        action.execute(input, data);
        assertThat(action.execute(input, data), is(true));
    }
}