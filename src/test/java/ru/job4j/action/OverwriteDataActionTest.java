package ru.job4j.action;

import org.junit.Test;
import ru.job4j.input.Input;
import ru.job4j.input.StubInput;
import ru.job4j.input.ValidateInput;
import ru.job4j.model.database.Data;
import ru.job4j.model.user.User;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.Arrays;
import java.util.StringJoiner;

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
        UserAction action = new OverwriteDataAction();
        assertThat(action.getTitle(), is("OVERWRITE"));
    }

    @Test
    public void execute1() {
        UserAction action = new OverwriteDataAction();
        Input input = new ValidateInput(new StubInput(Arrays.asList(
            "1",
            "1",
            "yegeraskin13@gmail.com"
        )));
        Data data = new Data();
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        StringJoiner joiner = new StringJoiner(System.lineSeparator(), "", System.lineSeparator());
        PrintStream stdout = System.out;
        System.setOut(new PrintStream(baos));

        action.execute(input, data);
        joiner.add("===OVERWRITE===");
        joiner.add("Enter user's count: ");
        joiner.add("Enter user's(1) email's count: ");
        joiner.add("Enter user's(1) email#1: ");
        System.setOut(stdout);
        assertThat(baos.toString(), is(joiner.toString()));
    }

    @Test
    public void execute2() {
        UserAction action = new OverwriteDataAction();
        Input input = new ValidateInput(new StubInput(Arrays.asList(
                "1",
                "1",
                "yegeraskin13@gmail.com"
        )));
        Data data = new Data();
        action.execute(input, data);
        assertThat(action.execute(input, data), is(true));
    }
}