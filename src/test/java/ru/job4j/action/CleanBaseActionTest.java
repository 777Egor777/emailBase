package ru.job4j.action;

import org.junit.Test;
import ru.job4j.input.Input;
import ru.job4j.model.database.Data;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.StringJoiner;

import static org.junit.Assert.*;

import static org.hamcrest.Matchers.is;

/**
 * Test class for class
 * {@code CleanBaseAction}
 * @author Geraskin Yegor(yegeraskin13@gmail.com)
 */
public class CleanBaseActionTest {

    @Test
    public void getTitle() {
        UserAction action = new CleanBaseAction();
        assertThat(action.getTitle(), is("CLEAN"));
    }

    @Test
    public void execute1() {
        Input input = null;
        Data data = new Data();
        UserAction action = new CleanBaseAction();
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        StringJoiner joiner = new StringJoiner(System.lineSeparator(), "", System.lineSeparator());
        PrintStream stdout = System.out;
        System.setOut(new PrintStream(baos));

        action.execute(input, data);
        joiner.add("===CLEAN===");

        System.setOut(stdout);
        assertThat(baos.toString(), is(joiner.toString()));
    }

    @Test
    public void execute2() {
        Input input = null;
        Data data = new Data();
        UserAction action = new CleanBaseAction();
        assertThat(action.execute(input, data), is(true));
    }
}