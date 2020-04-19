package ru.job4j.action;

import org.junit.Test;
import ru.job4j.input.Input;
import ru.job4j.input.StubInput;
import ru.job4j.input.ValidateInput;
import ru.job4j.model.database.Data;
import ru.job4j.model.database.util.DataHelper;
import ru.job4j.model.user.User;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Arrays;
import java.util.StringJoiner;

import static org.junit.Assert.*;

import static org.hamcrest.Matchers.is;

/**
 * Test class for class
 * {@code AddUserAction}
 * @author Geraskin Yegor(yegeraskin13@gmail.com)
 */
public class AddUserActionTest {

    @Test
    public void getTitle() {
        UserAction action = new AddUserAction();
        assertThat(action.getTitle(), is("ADD USER"));
    }

    @Test
    public void execute1() throws IOException {
        UserAction action = new AddUserAction();
        Data data = new Data();
        Input input = new ValidateInput(new StubInput(Arrays.asList(
                "2",
                "yegeraskin13@gmail.com",
                "geraskin@phystech.edu"
        )));
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        StringJoiner joiner = new StringJoiner(System.lineSeparator(), "", System.lineSeparator());
        PrintStream stdout = System.out;
        System.setOut(new PrintStream(baos));

        action.execute(input, data);

        joiner.add("===ADD USER===");
        joiner.add("Enter count of emails: ");
        joiner.add("Enter user's email#1: ");
        joiner.add("Enter user's email#2: ");

        System.setOut(stdout);
        assertThat(baos.toString(), is(joiner.toString()));
    }

    @Test
    public void execute2() throws IOException {
        UserAction action = new AddUserAction();
        Data data = new Data();
        Input input = new ValidateInput(new StubInput(Arrays.asList(
                "2",
                "yegeraskin13@gmail.com",
                "geraskin@phystech.edu"
        )));
        action.execute(input, data);
        assertThat(action.execute(input, data), is(true));
    }
}