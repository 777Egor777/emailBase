package ru.job4j.model.user;

import org.junit.Test;
import ru.job4j.model.email.Email;
import ru.job4j.model.user.util.Users;

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

        for (Email email : q) {
            user.addEmail(email);
        }

        List<Email> emails = new ArrayList<>(Arrays.asList(q));
        assertThat(user.getEmails(),
                is(emails));
    }

    @Test
    public void getId1() {
        int expected = Users.nextUserId;
        User user = new User();
        assertThat(user.getId(), is(expected));
    }

    @Test
    public void getId2() {
        User user1 = new User();
        User user2 = new User();
        int expected = Users.nextUserId;
        User user3 = new User();
        assertThat(user3.getId(), is(expected));
    }

    @Test
    public void getId3() {
        User user = null;
        int expected = Users.nextUserId;
        for (int index = 0; index < 7; ++index) {
            expected = Users.nextUserId;
            user = new User();
        }
        assertThat(user.getId(), is(expected));
    }

    @Test
    public void getId4() {
        User user = null;
        int expected = Users.nextUserId;
        for (int index = 0; index < 7; ++index) {
            expected = Users.nextUserId;
            user = new User();
        }
        assertThat(user.getId(), is(expected));
    }

    @Test
    public void getId5() {
        User[] users = new User[100500];
        int expected = Users.nextUserId;
        for (int index = 0; index < 7778; ++index) {
            expected = Users.nextUserId;
            users[index] = new User();
        }
        assertThat(users[7777].getId(), is(expected));
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
        for (int index = 0; index < 100500; ++index) {
            user.addEmail(new Email("JavaDeveloperNumber" + index
                    + "@yandex.ru"));
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
        for (int index = 0; index < 100500; ++index) {
            user.addEmail(new Email("JavaDeveloperNumber" + index
                    + "@yandex.ru"));
        }
        assertThat(user.getNumberOfEmails(),
                is(100500));
    }

    @Test
    public void getEmail1() {
        User user = new User();
        user.addEmail(new Email("yegeraskin13@gmail.com"));
        assertThat(user.getEmail(0), is(new Email("yegeraskin13@gmail.com")));
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
        assertThat(user.getEmail(0), is(new Email("yegeraskin13@gmail.com")));
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
        assertThat(user.getEmail(1), is(new Email("vasyapupkin777@rambler.net")));
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
        assertThat(user.getEmail(6), is(new Email("viktorRahov@rambler.net")));
    }

    @Test
    public void getEmail5() {
        User user = new User();
        for (int index = 0; index < 100500; ++index) {
            user.addEmail(new Email("egor" + (index + 1) + "@yandex.ru"));
        }
        assertThat(user.getEmail(91234), is(new Email("egor91235@yandex.ru")));
    }

    @Test
    public void deleteEmail1() {
        User user = new User();
        user.addEmail(new Email("yegeraskin13@gmail.com"));
        user.deleteEmail(0);
        assertThat(user.getNumberOfEmails(), is(0));
    }

    @Test
    public void deleteEmail2() {
        User user = new User();
        user.addEmail(new Email("yegeraskin13@gmail.com"));
        user.addEmail(new Email("vasyapupkin777@rambler.net"));
        user.addEmail(new Email("vasiliiPolegaev123@yandex.ru"));
        user.addEmail(new Email("batman@gmail.com"));
        user.addEmail(new Email("robin@gmail.com"));
        user.addEmail(new Email("alexey@gmail.com"));
        user.addEmail(new Email("viktorRahov@rambler.net"));
        user.deleteEmail(2);
        assertThat(user.getEmail(2), is(new Email("batman@gmail.com")));
    }

    @Test
    public void deleteEmail3() {
        User user = new User();
        user.addEmail(new Email("yegeraskin13@gmail.com"));
        user.addEmail(new Email("vasyapupkin777@rambler.net"));
        user.addEmail(new Email("vasiliiPolegaev123@yandex.ru"));
        user.addEmail(new Email("batman@gmail.com"));
        user.addEmail(new Email("robin@gmail.com"));
        user.addEmail(new Email("alexey@gmail.com"));
        user.addEmail(new Email("viktorRahov@rambler.net"));
        user.deleteEmail(3);
        assertThat(user.getNumberOfEmails(), is(6));
    }

    @Test
    public void deleteEmail4() {
        User user = new User();
        for (int index = 0; index < 100500; ++index) {
            user.addEmail(new Email("egor" + (index + 1) + "@yandex.ru"));
        }
        user.deleteEmail(77777);
        assertThat(user.getEmail(77777), is(new Email("egor77779@yandex.ru")));
    }

    @Test
    public void deleteEmail5() {
        User user = new User();
        for (int index = 0; index < 100500; ++index) {
            user.addEmail(new Email("egor" + (index + 1) + "@yandex.ru"));
        }
        user.deleteEmail(77777);
        assertThat(user.getNumberOfEmails(), is(100499));
    }

    @Test
    public void testToString1() {
        User user = new User();
        String result = user.toString();
        String expected = String.format("User#%s;", user.getId());
        assertThat(result, is(expected));
    }

    @Test
    public void testToString2() {
        User user = new User();
        user = new User();
        user = new User();
        user.addEmail(new Email("yegeraskin13@gmail.com"));
        String result = user.toString();
        String expected = String.format("User#%s->yegeraskin13@gmail.com;", user.getId());
        assertThat(result, is(expected));
    }

    @Test
    public void testToString3() {
        User user = new User();
        user = new User();
        user = new User();
        user = new User();
        user = new User();
        user = new User();
        user = new User();
        user.addEmail(new Email("yegeraskin13@gmail.com"));
        user.addEmail(new Email("vasyapupkin@yandex.ru"));
        user.addEmail(new Email("ivanivanov@rambler.net"));
        String result = user.toString();
        String expected = String.format("User#%s->yegeraskin13@gmail.com, vasyapupkin@yandex.ru, ivanivanov@rambler.net;",
                user.getId());
        assertThat(result, is(expected));
    }

    @Test
    public void addEmail() {
        User user = new User();
        user.addEmail(new Email("xxx@xxx.net"));
        assertThat(user.getEmail(0),
                   is(new Email("xxx@xxx.net")));
    }

    @Test
    public void containsEmail1() {
        User user = new User();
        Email email1 = new Email("yegeraskin13@gmail.com");
        Email email2 = new Email("geraskin@phystech.edu");
        Users.addEmail(user, email1);
        Users.addEmail(user, email2);
        assertThat(user.containsEmail(new Email("geraskin@phystech.edu")), is(true));
    }

    @Test
    public void containsEmail2() {
        User user = new User();
        Email email1 = new Email("yegeraskin13@gmail.com");
        Email email2 = new Email("geraskin@phystech.edu");
        Users.addEmail(user, email1);
        Users.addEmail(user, email2);
        assertThat(user.containsEmail(new Email("geraskin@phytech.edu")), is(false));
    }
}