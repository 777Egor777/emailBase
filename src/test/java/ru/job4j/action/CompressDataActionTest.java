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
import java.io.PrintStream;
import java.util.Arrays;
import java.util.StringJoiner;

import static org.junit.Assert.*;

import static org.hamcrest.Matchers.is;

/**
 * Test class for class
 * {@code CompressDataAction}
 * @author Geraskin Yegor(yegeraskin13@gmail.com)
 */
public class CompressDataActionTest {

    @Test
    public void getTitle() {
        UserAction action = new CompressDataAction();
        assertThat(action.getTitle(), is("COMPRESS"));
    }

    @Test
    public void execute1() {
        UserAction action = new CompressDataAction();
        Data data = new Data();
        User user1 = new User();
        User user2 = new User();
        Email email1 = new Email("terekhovvados31@yandex.ru");
        Email email2 = new Email("kuzinpavelxxx@rambler.ru");
        DataHelper.addUser(data, user1);
        DataHelper.addUser(data, user2);
        DataHelper.addEmail(data, user1.getId(), email1);
        DataHelper.addEmail(data, user1.getId(), email2);
        DataHelper.addEmail(data, user2.getId(), new Email("kuzinpavelxxx@rambler.ru"));
        Input input = new ValidateInput(new StubInput(Arrays.asList()));
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        StringJoiner joiner = new StringJoiner(System.lineSeparator(), "", System.lineSeparator());
        PrintStream stdout = System.out;
        System.setOut(new PrintStream(baos));

        action.execute(input, data);
        joiner.add("===COMPRESS===");

        System.setOut(stdout);
        assertThat(baos.toString(), is(joiner.toString()));
    }

    @Test
    public void execute2() {
        UserAction action = new CompressDataAction();
        Data data = new Data();
        User user1 = new User();
        User user2 = new User();
        Email email1 = new Email("terekhovvados31@yandex.ru");
        Email email2 = new Email("kuzinpavelxxx@rambler.ru");
        DataHelper.addUser(data, user1);
        DataHelper.addUser(data, user2);
        DataHelper.addEmail(data, user1.getId(), email1);
        DataHelper.addEmail(data, user1.getId(), email2);
        DataHelper.addEmail(data, user2.getId(), new Email("kuzinpavelxxx@rambler.ru"));
        Input input = new ValidateInput(new StubInput(Arrays.asList()));
        assertThat(action.execute(input, data), is(true));
    }
}