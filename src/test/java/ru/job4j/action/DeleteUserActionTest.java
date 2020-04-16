package ru.job4j.action;

import org.junit.Test;
import ru.job4j.input.Input;
import ru.job4j.input.StubInput;
import ru.job4j.input.ValidateInput;
import ru.job4j.model.database.Data;
import ru.job4j.model.database.util.DataHelper;
import ru.job4j.model.user.User;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.Arrays;
import java.util.StringJoiner;

import static org.junit.Assert.*;
import static org.hamcrest.Matchers.is;

/**
 * Test class for class
 * {@code DeleteUserAction}
 * @author Geraskin Yegor(yegeraskin13@gmail.com)
 */
public class DeleteUserActionTest {

    @Test
    public void getTitle() {
        UserAction action = new DeleteUserAction();
        assertThat(action.getTitle(), is("DELETE USER"));
    }

    @Test
    public void execute1() {
        UserAction action = new DeleteUserAction();
        Data data = new Data();
        User user = new User();
        DataHelper.addUser(data, user);
        Input input = new ValidateInput(new StubInput(Arrays.asList(
                ""+user.getId()
        )));
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        StringJoiner joiner = new StringJoiner(System.lineSeparator(), "", System.lineSeparator());
        PrintStream stdout = System.out;
        System.setOut(new PrintStream(baos));

        action.execute(input, data);
        joiner.add("===DELETE USER===");
        joiner.add("Enter user's id: ");

        System.setOut(stdout);
        assertThat(baos.toString(), is(joiner.toString()));
    }

    @Test
    public void execute2() {
        UserAction action = new DeleteUserAction();
        Data data = new Data();
        User user = new User();
        DataHelper.addUser(data, user);
        Input input = new ValidateInput(new StubInput(Arrays.asList(
                ""+user.getId()
        )));
        assertThat(action.execute(input, data), is(true));
    }
}