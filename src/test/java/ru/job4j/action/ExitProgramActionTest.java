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
 * {@code ExitProgramAction}
 * @author Geraskin Yegor(yegeraskin13@gmail.com)
 */
public class ExitProgramActionTest {

    @Test
    public void getTitle() {
        UserAction action = new ExitProgramAction();
        assertThat(action.getTitle(), is("EXIT"));
    }

    @Test
    public void execute1() {
        UserAction action = new ExitProgramAction();
        Input input = new ValidateInput(new StubInput(Arrays.asList()));
        Data data = new Data();
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        StringJoiner joiner = new StringJoiner(System.lineSeparator(), "", System.lineSeparator());
        PrintStream stdout = System.out;
        System.setOut(new PrintStream(baos));

        action.execute(input, data);
        joiner.add("===EXIT===");
        System.setOut(stdout);
        assertThat(baos.toString(), is(joiner.toString()));
    }

    @Test
    public void execute2() {
        UserAction action = new ExitProgramAction();
        Input input = new ValidateInput(new StubInput(Arrays.asList()));
        Data data = new Data();
        action.execute(input, data);
        assertThat(action.execute(input, data), is(false));
    }
}