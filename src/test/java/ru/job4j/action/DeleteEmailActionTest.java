package ru.job4j.action;

import org.junit.Test;
import ru.job4j.input.Input;
import ru.job4j.input.StubInput;
import ru.job4j.input.ValidateInput;
import ru.job4j.model.database.Data;
import ru.job4j.model.database.util.DataHelper;
import ru.job4j.model.email.Email;
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
 * {@code DeleteEmailAction}
 * @author Geraskin Yegor(yegeraskin13@gmail.com)
 */
public class DeleteEmailActionTest {

    @Test
    public void getTitle() {
        UserAction action = new DeleteEmailAction();
        assertThat(action.getTitle(), is("DELETE EMAIL"));
    }

    @Test
    public void execute1() throws IOException {
        UserAction action = new DeleteEmailAction();
        Data data = new Data();
        User user = new User();
        Email email = new Email("terekhovvados31@yandex.ru");
        DataHelper.addUser(data, user);
        DataHelper.addEmail(data, user.getId(), email);
        Input input = new ValidateInput(new StubInput(Arrays.asList(
                "" + user.getId(),
                "1"
        )));
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        StringJoiner joiner = new StringJoiner(System.lineSeparator(), "", System.lineSeparator());
        PrintStream stdout = System.out;
        System.setOut(new PrintStream(baos));

        action.execute(input, data);
        joiner.add("===DELETE EMAIL===");
        joiner.add("Enter user's id: ");
        joiner.add("1.terekhovvados31@yandex.ru");
        joiner.add("Enter email's index: ");

        System.setOut(stdout);
        assertThat(baos.toString(), is(joiner.toString()));
    }

    @Test
    public void execute2() throws IOException {
        UserAction action = new DeleteEmailAction();
        Data data = new Data();
        User user = new User();
        Email email = new Email("terekhovvados31@yandex.ru");
        DataHelper.addUser(data, user);
        DataHelper.addEmail(data, user.getId(), email);
        Input input = new ValidateInput(new StubInput(Arrays.asList(
                "" + user.getId(),
                "1"
        )));
        assertThat(action.execute(input, data), is(true));
    }
}