package ru.job4j.model.user;

import org.junit.Test;
import ru.job4j.model.email.Email;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;
import static org.hamcrest.Matchers.is;

public class UserTest {

    @Test
    public void getEmails1() {
        User user = new User();
        List<Email> emails = new ArrayList<>();
        assertThat(user.getEmails(),
                   is(emails));
    }

    @Test
    public void getEmails2() {
        User user = new User();
        Email[] q = new Email[]{
                new Email("email1@yandex.ru"),
                new Email("email2@gmail.com"),
                new Email("email10@rambler.net")
        };

        for(Email email : q) {
            user.addEmail(email);
        }

        List<Email> emails = new ArrayList<>(Arrays.asList(q));
        assertThat(user.getEmails(),
                is(emails));
    }

    @Test
    public void getId1() {
        User user = new User();
        assertThat(user.getId(), is(1));
    }

    @Test
    public void getId2() {
        User user1 = new User();
        User user2 = new User();
        User user3 = new User();
        assertThat(user3.getId(), is(3));
    }

    @Test
    public void getId3() {
        User user = null;
        for(int index = 0; index < 7; ++index) {
            user = new User();
        }
        assertThat(user.getId(), is(7));
    }

    @Test
    public void getId4() {
        User user = null;
        for(int index = 0; index < 7; ++index) {
            user = new User();
        }
        assertThat(user.getId(), is(7));
    }

    @Test
    public void getId5() {
        User[] users = new User[100500];
        for(int index = 0; index < 7; ++index) {
            users[index] = new User();
        }
        assertThat(users[7777].getId(), is(7777));
    }

    @Test
    public void cleanEmailsList1() {
        User user = new User();
        user.cleanEmailsList();
        assertThat(user.getEmails(),
                   is(new ArrayList<Email>()));
    }

    @Test
    public void cleanEmailsList2() {
        User user = new User();
        user.addEmail(new Email("topJavaDev777777@gmail.com"));
        user.cleanEmailsList();
        assertThat(user.getEmails(),
                is(new ArrayList<Email>()));
    }

    @Test
    public void cleanEmailsList3() {
        User user = new User();
        user.addEmail(new Email("topJavaDev777777@gmail.com"));
        user.addEmail(new Email("topJavaDev777777@yandex.ru"));
        user.addEmail(new Email("topJavaDev777777@derevnya.net"));
        user.addEmail(new Email("iamnot@qwerty.com"));
        user.cleanEmailsList();
        assertThat(user.getEmails(),
                is(new ArrayList<Email>()));
    }

    @Test
    public void cleanEmailsList4() {
        User user = new User();
        for(int index = 0; index < 100500; ++index) {
            user.addEmail(new Email("JavaDeveloperNumber" + index +
                                     "@yandex.ru"));
        }
        user.cleanEmailsList();
        assertThat(user.getEmails(),
                is(new ArrayList<Email>()));
    }

    @Test
    public void getNumberOfEmails() {

    }

    @Test
    public void getEmail() {
    }

    @Test
    public void deleteEmail() {
    }

    @Test
    public void testToString() {
    }

    @Test
    public void addEmail() {
    }
}