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
    public void getNumberOfEmails1() {
        User user = new User();
        assertThat(user.getNumberOfEmails(),
                is(0));
    }

    @Test
    public void getNumberOfEmails2() {
        User user = new User();
        user.addEmail(new Email("topJavaDev777777@gmail.com"));
        assertThat(user.getNumberOfEmails(),
                is(1));
    }

    @Test
    public void getNumberOfEmails3() {
        User user = new User();
        user.addEmail(new Email("topJavaDev777777@gmail.com"));
        user.addEmail(new Email("topJavaDev777777@yandex.ru"));
        user.addEmail(new Email("topJavaDev777777@derevnya.net"));
        user.addEmail(new Email("iamnot@qwerty.com"));
        assertThat(user.getNumberOfEmails(),
                is(4));
    }

    @Test
    public void getNumberOfEmails4() {
        User user = new User();
        for(int index = 0; index < 100500; ++index) {
            user.addEmail(new Email("JavaDeveloperNumber" + index +
                    "@yandex.ru"));
        }
        assertThat(user.getNumberOfEmails(),
                is(100500));
    }

    @Test
    public void getEmail1() {
        User user = new User();
        user.addEmail(new Email("yegeraskin13@gmail.com"));
        assertThat(user.getEmail(1), is(new Email("yegeraskin13@gmail.com")));
    }

    @Test
    public void getEmail2() {
        User user = new User();
        user.addEmail(new Email("yegeraskin13@gmail.com"));
        user.addEmail(new Email("vasyapupkin777@rambler.net"));
        user.addEmail(new Email("vasiliiPolegaev123@yandex.ru"));
        user.addEmail(new Email("batman@gmail.com"));
        user.addEmail(new Email("robin@gmail.com"));
        user.addEmail(new Email("alexey@gmail.com"));
        user.addEmail(new Email("viktorRahov@rambler.net"));
        assertThat(user.getEmail(1), is(new Email("yegeraskin13@gmail.com")));
    }

    @Test
    public void getEmail3() {
        User user = new User();
        user.addEmail(new Email("yegeraskin13@gmail.com"));
        user.addEmail(new Email("vasyapupkin777@rambler.net"));
        user.addEmail(new Email("vasiliiPolegaev123@yandex.ru"));
        user.addEmail(new Email("batman@gmail.com"));
        user.addEmail(new Email("robin@gmail.com"));
        user.addEmail(new Email("alexey@gmail.com"));
        user.addEmail(new Email("viktorRahov@rambler.net"));
        assertThat(user.getEmail(2), is(new Email("vasyapupkin777@rambler.net")));
    }

    @Test
    public void getEmail4() {
        User user = new User();
        user.addEmail(new Email("yegeraskin13@gmail.com"));
        user.addEmail(new Email("vasyapupkin777@rambler.net"));
        user.addEmail(new Email("vasiliiPolegaev123@yandex.ru"));
        user.addEmail(new Email("batman@gmail.com"));
        user.addEmail(new Email("robin@gmail.com"));
        user.addEmail(new Email("alexey@gmail.com"));
        user.addEmail(new Email("viktorRahov@rambler.net"));
        assertThat(user.getEmail(7), is(new Email("viktorRahov@rambler.net")));
    }

    @Test
    public void getEmail5() {
        User user = new User();
        for(int index = 0; index < 100500; ++index) {
            user.addEmail(new Email("egor" + (index+1) + "@yandex.ru"));
        }
        assertThat(user.getEmail(91234), is(new Email("egor91234@yandex.ru")));
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