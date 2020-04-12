package ru.job4j.model.database;

import org.junit.Test;
import ru.job4j.model.email.Email;
import ru.job4j.model.user.User;

import java.util.StringJoiner;

import static org.junit.Assert.*;
import static org.hamcrest.Matchers.is;

/**
 * Test class for class "Data"
 * @author Geraskin Yegor(yegeraskin13@gmail.com)
 */
public class DataTest {

    @Test
    public void addUser1() {
        User user = new User();
        Data data = new Data();
        data.addUser(user);
        assertThat(data.getUser(user.getId()), is(user));
    }

    @Test
    public void addUser2() {
        User user = new User();
        Data data = new Data();
        assertThat(data.getUser(user.getId()), is(Data.EMPTY_USER));
    }

    @Test
    public void addUser3() {
        User user = new User();
        user = new User();
        user = new User();
        Data data = new Data();
        assertThat(data.getUser(user.getId()), is(user));
    }

    @Test
    public void addUser4() {
        User user = new User();
        user = new User();
        user = new User();
        user = new User();
        Data data = new Data();
        assertThat(data.getUser(user.getId()), is(user));
    }

    @Test
    public void addUser5() {
        User user = new User();
        user = new User();
        user = new User();
        user = new User();
        user = new User();
        user = new User();
        user = new User();
        user = new User();
        Data data = new Data();
        assertThat(data.getUser(user.getId()), is(user));
    }

    @Test
    public void addUser6() {
        User user = new User();
        user = new User();
        user = new User();
        user = new User();
        user = new User();
        user = new User();
        user = new User();
        user = new User();
        user = new User();
        user = new User();
        user = new User();
        user = new User();
        user = new User();
        user = new User();
        user = new User();
        user = new User();
        user = new User();
        user = new User();
        user = new User();
        user = new User();
        user = new User();
        user = new User();
        user = new User();
        user = new User();
        user = new User();
        user = new User();
        Data data = new Data();
        assertThat(data.getUser(user.getId()), is(user));
    }

    @Test
    public void addUser7() {
        User user = new User();
        for(int i=0; i < 100500; ++i) {
            user = new User();
        }
        Data data = new Data();
        assertThat(data.getUser(user.getId()), is(user));
    }

    @Test
    public void addUser8() {
        User[] users = new User[100500];
        for(int i=0; i < 100500; ++i) {
            users[i] = new User();
        }
        Data data = new Data();
        assertThat(data.getUser(users[77777].getId()), is(users[77777]));
    }

    @Test
    public void testToString1() {
        Data data = new Data();
        String result = data.toString();
        String expected = "EMPTY EMAILS BASE";
        assertThat(result, is(expected));
    }

    @Test
    public void testToString2() {
        Data data = new Data();
        User user = new User();
        data.addUser(user);
        String result = data.toString();
        String expected = user.toString();
        assertThat(result, is(expected));
    }

    @Test
    public void testToString3() {
        Data data = new Data();
        User user1 = new User();
        User user2 = new User();
        data.addUser(user1);
        data.addUser(user2);
        StringJoiner joiner = new StringJoiner(System.lineSeparator(),"","");
        joiner.add(user1.toString());
        joiner.add(user2.toString());
        String result = data.toString();
        String expected = joiner.toString();
        assertThat(result, is(expected));
    }

    @Test
    public void testToString4() {
        Data data = new Data();
        User[] users = new User[100500];
        for(int i = 0; i < 100500; ++i) {
            users[i] = new User();
        }
        StringJoiner joiner = new StringJoiner(System.lineSeparator(),"","");
        for(int i = 0; i < 100500; ++i) {
            data.addUser(users[i]);
            joiner.add(users[i].toString());
        }
        String result = data.toString();
        String expected = joiner.toString();
        assertThat(result, is(expected));
    }

    @Test
    public void testToString5() {
        Data data = new Data();
        User[] users = new User[100500];
        for(int i = 0; i < 100500; ++i) {
            users[i] = new User();
            for(int j = 0; j < 10; ++j) {
                users[i].addEmail(new Email("user#" + users[i].getId() + "email#" + j));
            }
        }
        StringJoiner joiner = new StringJoiner(System.lineSeparator(),"","");
        for(int i = 0; i < 100500; ++i) {
            data.addUser(users[i]);
            joiner.add(users[i].toString());
        }
        String result = data.toString();
        String expected = joiner.toString();
        assertThat(result, is(expected));
    }

    @Test
    public void testToString6() {
        Data data = new Data();
        User[] users = new User[100500];
        for(int i = 0; i < 100500; ++i) {
            users[i] = new User();
            if (i % 3 == 0) {
                for (int j = 0; j < 10; ++j) {
                    users[i].addEmail(new Email("user#" + users[i].getId() + "email#" + j));
                }
            }
        }
        StringJoiner joiner = new StringJoiner(System.lineSeparator(),"","");
        for(int i = 0; i < 100500; ++i) {
            data.addUser(users[i]);
            joiner.add(users[i].toString());
        }
        String result = data.toString();
        String expected = joiner.toString();
        assertThat(result, is(expected));
    }

    @Test
    public void clean1() {
        Data data = new Data();
        assertThat(data.getUserList().size(), is(0));
    }

    @Test
    public void clean2() {
        Data data = new Data();
        data.clean();
        assertThat(data.getUserList().size(), is(0));
    }

    @Test
    public void clean3() {
        Data data = new Data();
        data.addUser(new User());
        data.clean();
        assertThat(data.getUserList().size(), is(0));
    }

    @Test
    public void clean4() {
        Data data = new Data();
        data.addUser(new User());
        data.addUser(new User());
        data.clean();
        assertThat(data.getUserList().size(), is(0));
    }

    @Test
    public void clean5() {
        Data data = new Data();
        data.addUser(new User());
        data.addUser(new User());
        data.addUser(new User());
        data.clean();
        assertThat(data.getUserList().size(), is(0));
    }

    @Test
    public void clean6() {
        Data data = new Data();
        data.addUser(new User());
        data.addUser(new User());
        data.addUser(new User());
        data.addUser(new User());
        data.addUser(new User());
        data.addUser(new User());
        data.addUser(new User());
        data.addUser(new User());
        data.addUser(new User());
        data.clean();
        assertThat(data.getUserList().size(), is(0));
    }

    @Test
    public void clean7() {
        Data data = new Data();
        for(int i = 0; i < 100500; ++i) {
            data.addUser(new User());
        }
        data.clean();
        assertThat(data.getUserList().size(), is(0));
    }

    @Test
    public void clean8() {
        Data data = new Data();
        for(int i = 0; i < 100500; ++i) {
            User user = new User();
            for (int j = 0; j < 100; ++j) {
                user.addEmail(new Email("EMail#" + (i*100 + j)));
            }
        }
        data.clean();
        assertThat(data.getUserList().size(), is(0));
    }

    @Test
    public void addEmail() {
    }

    @Test
    public void allId() {
    }

    @Test
    public void deleteUser() {
    }

    @Test
    public void getUser() {
    }

    @Test
    public void deleteEmail() {
    }

    @Test
    public void compressBase() {
    }

    @Test
    public void getUserList() {
    }
}