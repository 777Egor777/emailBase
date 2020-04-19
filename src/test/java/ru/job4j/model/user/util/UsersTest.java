package ru.job4j.model.user.util;

import org.junit.Test;
import ru.job4j.model.email.Email;
import ru.job4j.model.user.User;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.StringJoiner;

import static org.junit.Assert.*;
import static org.hamcrest.Matchers.is;

/**
 * Test class for class "Users"
 * @author Geraskin Yegor(yegeraskin13@gmail.com)
 */
public class UsersTest {
    public static final PrintStream STDOUT = System.out;
    public static final ByteArrayOutputStream BAOS = new ByteArrayOutputStream();

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
        for (int index = 0; index < 100500; ++index) {
            Users.addEmail(user, new Email("user" + index + "@yandex.ru"));
        }
        Users.cleanEmailsList(user);
        assertThat(user.getNumberOfEmails(), is(0));
    }

    @Test
    public void printEmails1() {
        BAOS.reset();
        System.setOut(new PrintStream(BAOS));

        StringJoiner joiner = new StringJoiner(System.lineSeparator(), "",
                                               System.lineSeparator());
        User user = new User();
        Users.printEmails(user);
        joiner.add("EMPTY EMAILS LIST");

        String result = BAOS.toString();
        String expected = joiner.toString();

        System.setOut(STDOUT);
    }

    @Test
    public void printEmails2() {
        BAOS.reset();
        System.setOut(new PrintStream(BAOS));

        StringJoiner joiner = new StringJoiner(System.lineSeparator(), "",
                System.lineSeparator());
        User user = new User();
        Users.addEmail(user, new Email("yegeraskin13@gmail.com"));
        Users.printEmails(user);
        joiner.add("USER'S ID#" + user.getId() + " EMAIL LIST:");
        joiner.add("1. yegeraskin13@gmail.com");

        String result = BAOS.toString();
        String expected = joiner.toString();

        System.setOut(STDOUT);
    }

    @Test
    public void printEmails3() {
        BAOS.reset();
        System.setOut(new PrintStream(BAOS));

        StringJoiner joiner = new StringJoiner(System.lineSeparator(), "",
                System.lineSeparator());
        User user = new User();
        Users.addEmail(user, new Email("yegeraskin13@gmail.com"));
        Users.addEmail(user, new Email("vasiliupypkin@gmail.com"));
        Users.printEmails(user);
        joiner.add("USER'S ID#" + user.getId() + " EMAIL LIST:");
        joiner.add("1. yegeraskin13@gmail.com");
        joiner.add("2. vasiliupypkin@gmail.com");

        String result = BAOS.toString();
        String expected = joiner.toString();

        System.setOut(STDOUT);
    }

    @Test
    public void printEmails4() {
        BAOS.reset();
        System.setOut(new PrintStream(BAOS));

        StringJoiner joiner = new StringJoiner(System.lineSeparator(), "",
                System.lineSeparator());
        User user = new User();
        Users.addEmail(user, new Email("yegeraskin13@gmail.com"));
        Users.addEmail(user, new Email("vasiliupypkin@gmail.com"));
        Users.addEmail(user, new Email("vasiliupypkin@gmail.com"));
        Users.printEmails(user);
        joiner.add("USER'S ID#" + user.getId() + " EMAIL LIST:");
        joiner.add("1. yegeraskin13@gmail.com");
        joiner.add("2. vasiliupypkin@gmail.com");
        joiner.add("3. vasiliupypkin@gmail.com");

        String result = BAOS.toString();
        String expected = joiner.toString();

        System.setOut(STDOUT);
    }

    @Test
    public void printEmails5() {
        BAOS.reset();
        System.setOut(new PrintStream(BAOS));

        StringJoiner joiner = new StringJoiner(System.lineSeparator(), "",
                System.lineSeparator());
        User user = new User();
        Users.addEmail(user, new Email("yegeraskin13@gmail.com"));
        Users.addEmail(user, new Email("vasiliupypkin@gmail.com"));
        Users.addEmail(user, new Email("vasiliupypkin@gmail.com"));
        Users.addEmail(user, new Email("vanyapetrov@angarsk.net"));
        Users.addEmail(user, new Email("egor@saratov.edu"));
        Users.addEmail(user, new Email("geraskin@phystech.edu"));
        Users.addEmail(user, new Email("nikepro@rambler.net"));
        Users.addEmail(user, new Email("xxx@xxx.org"));
        Users.addEmail(user, new Email("xxx@xxx.edu"));
        Users.printEmails(user);
        joiner.add("USER'S ID#" + user.getId() + " EMAIL LIST:");
        joiner.add("1. yegeraskin13@gmail.com");
        joiner.add("2. vasiliupypkin@gmail.com");
        joiner.add("3. vasiliupypkin@gmail.com");
        joiner.add("4. vanyapetrov@angarsk.net");
        joiner.add("5. egor@saratov.edu");
        joiner.add("6. geraskin@phystech.edu");
        joiner.add("7. nikepro@rambler.net");
        joiner.add("8. xxx@xxx.org");
        joiner.add("9. xxx@xxx.edu");

        String result = BAOS.toString();
        String expected = joiner.toString();

        System.setOut(STDOUT);
    }

    @Test
    public void printEmails6() {
        BAOS.reset();
        System.setOut(new PrintStream(BAOS));

        StringJoiner joiner = new StringJoiner(System.lineSeparator(), "",
                System.lineSeparator());
        User user = new User();
        joiner.add("USER'S ID#" + user.getId() + " EMAIL LIST:");
        for (int index = 0; index < 100500; ++index) {
            Email email = new Email("email" + (index + 1) + "@yandex.ru");
            Users.addEmail(user, email);
            joiner.add((index + 1) + ". email" + (index + 1) + "@yandex.ru");
        }
        Users.printEmails(user);

        String result = BAOS.toString();
        String expected = joiner.toString();

        System.setOut(STDOUT);
    }

    @Test
    public void deleteEmail1() {
        User user = new User();
        Users.addEmail(user, new Email("yegeraskin13@gmail.com"));
        Users.deleteEmail(user, 0);
        assertThat(user.getNumberOfEmails(), is(0));
    }

    @Test
    public void deleteEmail2() {
        User user = new User();
        Users.addEmail(user, new Email("yegeraskin13@gmail.com"));
        Users.addEmail(user, new Email("vasyapupkin777@rambler.net"));
        Users.addEmail(user, new Email("vasiliiPolegaev123@yandex.ru"));
        Users.addEmail(user, new Email("batman@gmail.com"));
        Users.addEmail(user, new Email("robin@gmail.com"));
        Users.addEmail(user, new Email("alexey@gmail.com"));
        Users.addEmail(user, new Email("viktorRahov@rambler.net"));
        Users.deleteEmail(user, 2);
        assertThat(user.getEmail(2), is(new Email("batman@gmail.com")));
    }

    @Test
    public void deleteEmail3() {
        User user = new User();
        Users.addEmail(user, new Email("yegeraskin13@gmail.com"));
        Users.addEmail(user, new Email("vasyapupkin777@rambler.net"));
        Users.addEmail(user, new Email("vasiliiPolegaev123@yandex.ru"));
        Users.addEmail(user, new Email("batman@gmail.com"));
        Users.addEmail(user, new Email("robin@gmail.com"));
        Users.addEmail(user, new Email("alexey@gmail.com"));
        Users.addEmail(user, new Email("viktorRahov@rambler.net"));
        Users.deleteEmail(user, 3);
        assertThat(user.getNumberOfEmails(), is(6));
    }

    @Test
    public void deleteEmail4() {
        User user = new User();
        for (int index = 0; index < 100500; ++index) {
            Users.addEmail(user, new Email("egor" + (index + 1) + "@yandex.ru"));
        }
        Users.deleteEmail(user, 77777);
        assertThat(user.getEmail(77777), is(new Email("egor77779@yandex.ru")));
    }

    @Test
    public void deleteEmail5() {
        User user = new User();
        for (int index = 0; index < 100500; ++index) {
            Users.addEmail(user, new Email("egor" + (index + 1) + "@yandex.ru"));
        }
        Users.deleteEmail(user, 77777);
        assertThat(user.getNumberOfEmails(), is(100499));
    }

    @Test
    public void addEmail() {
        User user = new User();
        Users.addEmail(user, new Email("xxx@xxx.net"));
        assertThat(user.getEmail(0),
                is(new Email("xxx@xxx.net")));
    }
}