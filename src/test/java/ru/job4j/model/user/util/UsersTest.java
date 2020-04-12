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
    public static final PrintStream stdout = System.out;
    public static final ByteArrayOutputStream baos = new ByteArrayOutputStream();

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
    public void printEmails1() {
        baos.reset();
        System.setOut(new PrintStream(baos));

        StringJoiner joiner = new StringJoiner(System.lineSeparator(), "",
                                               System.lineSeparator());
        User user = new User();
        Users.printEmails(user);
        joiner.add("EMPTY EMAILS LIST");

        String result = baos.toString();
        String expected = joiner.toString();

        System.setOut(stdout);
    }

    @Test
    public void printEmails2() {
        baos.reset();
        System.setOut(new PrintStream(baos));

        StringJoiner joiner = new StringJoiner(System.lineSeparator(), "",
                System.lineSeparator());
        User user = new User();
        user.addEmail(new Email("yegeraskin13@gmail.com"));
        Users.printEmails(user);
        joiner.add("USER'S ID#" + user.getId() + " EMAIL LIST:");
        joiner.add("1. yegeraskin13@gmail.com");

        String result = baos.toString();
        String expected = joiner.toString();

        System.setOut(stdout);
    }

    @Test
    public void printEmails3() {
        baos.reset();
        System.setOut(new PrintStream(baos));

        StringJoiner joiner = new StringJoiner(System.lineSeparator(), "",
                System.lineSeparator());
        User user = new User();
        user.addEmail(new Email("yegeraskin13@gmail.com"));
        user.addEmail(new Email("vasiliupypkin@gmail.com"));
        Users.printEmails(user);
        joiner.add("USER'S ID#" + user.getId() + " EMAIL LIST:");
        joiner.add("1. yegeraskin13@gmail.com");
        joiner.add("2. vasiliupypkin@gmail.com");

        String result = baos.toString();
        String expected = joiner.toString();

        System.setOut(stdout);
    }

    @Test
    public void printEmails4() {
        baos.reset();
        System.setOut(new PrintStream(baos));

        StringJoiner joiner = new StringJoiner(System.lineSeparator(), "",
                System.lineSeparator());
        User user = new User();
        user.addEmail(new Email("yegeraskin13@gmail.com"));
        user.addEmail(new Email("vasiliupypkin@gmail.com"));
        user.addEmail(new Email("vasiliupypkin@gmail.com"));
        Users.printEmails(user);
        joiner.add("USER'S ID#" + user.getId() + " EMAIL LIST:");
        joiner.add("1. yegeraskin13@gmail.com");
        joiner.add("2. vasiliupypkin@gmail.com");
        joiner.add("3. vasiliupypkin@gmail.com");

        String result = baos.toString();
        String expected = joiner.toString();

        System.setOut(stdout);
    }

    @Test
    public void printEmails5() {
        baos.reset();
        System.setOut(new PrintStream(baos));

        StringJoiner joiner = new StringJoiner(System.lineSeparator(), "",
                System.lineSeparator());
        User user = new User();
        user.addEmail(new Email("yegeraskin13@gmail.com"));
        user.addEmail(new Email("vasiliupypkin@gmail.com"));
        user.addEmail(new Email("vasiliupypkin@gmail.com"));
        user.addEmail(new Email("vanyapetrov@angarsk.net"));
        user.addEmail(new Email("egor@saratov.edu"));
        user.addEmail(new Email("geraskin@phystech.edu"));
        user.addEmail(new Email("nikepro@rambler.net"));
        user.addEmail(new Email("xxx@xxx.org"));
        user.addEmail(new Email("xxx@xxx.edu"));
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

        String result = baos.toString();
        String expected = joiner.toString();

        System.setOut(stdout);
    }

    @Test
    public void printEmails6() {
        baos.reset();
        System.setOut(new PrintStream(baos));

        StringJoiner joiner = new StringJoiner(System.lineSeparator(), "",
                System.lineSeparator());
        User user = new User();
        joiner.add("USER'S ID#" + user.getId() + " EMAIL LIST:");
        for(int index = 0; index < 100500; ++index) {
            Email email = new Email("email" + (index+1) + "@yandex.ru");
            user.addEmail(email);
            joiner.add((index+1) + ". email" + (index + 1) + "@yandex.ru");
        }
        Users.printEmails(user);

        String result = baos.toString();
        String expected = joiner.toString();

        System.setOut(stdout);
    }

    @Test
    public void deleteEmail() {
    }

    @Test
    public void addEmail() {
    }
}