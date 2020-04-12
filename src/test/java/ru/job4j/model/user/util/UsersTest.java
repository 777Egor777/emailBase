package ru.job4j.model.user.util;

import org.junit.Test;
import ru.job4j.model.email.Email;
import ru.job4j.model.user.User;

import static org.junit.Assert.*;
import static org.hamcrest.Matchers.is;

/**
 * Test class for class "Users"
 * @author Geraskin Yegor(yegeraskin13@gmail.com)
 */
public class UsersTest {
    @Test
    public void cleanEmailsList1() {
        User user = new User();
        Users.cleanEmailsList(user);
        assertThat(user.getNumberOfEmails(), is(0));
    }

    @Test
    public void cleanEmailsList2() {
        User user = new User();
        Users.addEmail(user, new Email("yegerasskin13@gmail.com"));
        Users.cleanEmailsList(user);
        assertThat(user.getNumberOfEmails(), is(0));
    }

    @Test
    public void cleanEmailsList3() {
        User user = new User();
        Users.addEmail(user, new Email("yegerasskin13@gmail.com"));
        Users.addEmail(user, new Email("tiptop123@rambler.ru"));
        Users.cleanEmailsList(user);
        assertThat(user.getNumberOfEmails(), is(0));
    }

    @Test
    public void cleanEmailsList4() {
        User user = new User();
        Users.addEmail(user, new Email("yegerasskin13@gmail.com"));
        Users.addEmail(user, new Email("tiptop123@rambler.ru"));
        Users.addEmail(user, new Email("ivanraptor@yandex.ru"));
        Users.cleanEmailsList(user);
        assertThat(user.getNumberOfEmails(), is(0));
    }

    @Test
    public void cleanEmailsList5() {
        User user = new User();
        Users.addEmail(user, new Email("yegerasskin13@gmail.com"));
        Users.addEmail(user, new Email("tiptop123@rambler.ru"));
        Users.addEmail(user, new Email("ivanraptor@yandex.ru"));
        Users.addEmail(user, new Email("ivanraptor@yandex.ru"));
        Users.addEmail(user, new Email("asdasdas@yandex.ru"));
        Users.addEmail(user, new Email("xcvbdfgsd@yandex.ru"));
        Users.addEmail(user, new Email("srrthjdfh@werqe.edu"));
        Users.addEmail(user, new Email("ghjjfghfs@rambler.org"));
        Users.cleanEmailsList(user);
        assertThat(user.getNumberOfEmails(), is(0));
    }

    @Test
    public void cleanEmailsList6() {
        User user = new User();
        Users.addEmail(user, new Email("yegerasskin13@gmail.com"));
        Users.addEmail(user, new Email("tiptop123@rambler.ru"));
        Users.addEmail(user, new Email("ivanraptor@yandex.ru"));
        Users.addEmail(user, new Email("ivanraptor@yandex.ru"));
        Users.addEmail(user, new Email("asdasdas@yandex.ru"));
        Users.addEmail(user, new Email("xcvbdfgsd@yandex.ru"));
        Users.addEmail(user, new Email("srrthjdfh@werqe.edu"));
        Users.addEmail(user, new Email("ghjjfghfs@rambler.org"));
        for(int index = 0; index < 100500; ++index) {
            Users.addEmail(user, new Email("user" + index + "@yandex.ru"));
        }
        Users.cleanEmailsList(user);
        assertThat(user.getNumberOfEmails(), is(0));
    }

    @Test
    public void printEmails() {
    }

    @Test
    public void deleteEmail() {
    }

    @Test
    public void addEmail() {
    }
}