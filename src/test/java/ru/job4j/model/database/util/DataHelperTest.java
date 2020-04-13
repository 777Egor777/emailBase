package ru.job4j.model.database.util;

import org.junit.Test;
import ru.job4j.model.database.Data;
import ru.job4j.model.email.Email;
import ru.job4j.model.user.User;
import ru.job4j.model.user.util.Users;

import static org.junit.Assert.*;
import static org.hamcrest.Matchers.is;

/**
 * Test class for class "DataHelper"
 * @author Geraskin Yegor(yegeraskin13@gmail.com)
 */
public class DataHelperTest {

    @Test
    public void addUser1() {
        User user = new User();
        Data data = new Data();
        DataHelper.addUser(data, user);
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
        DataHelper.addUser(data, user);
        assertThat(data.getUser(user.getId()), is(user));
    }

    @Test
    public void addUser4() {
        User user = new User();
        user = new User();
        user = new User();
        user = new User();
        Data data = new Data();
        DataHelper.addUser(data, user);
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
        DataHelper.addUser(data, user);
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
        DataHelper.addUser(data, user);
        assertThat(data.getUser(user.getId()), is(user));
    }

    @Test
    public void addUser7() {
        User user = new User();
        for(int i=0; i < 100500; ++i) {
            user = new User();
        }
        Data data = new Data();
        DataHelper.addUser(data, user);
        assertThat(data.getUser(user.getId()), is(user));
    }

    @Test
    public void addUser8() {
        User[] users = new User[100500];
        Data data = new Data();
        for(int i=0; i < 100500; ++i) {
            users[i] = new User();
            DataHelper.addUser(data, users[i]);
        }
        assertThat(data.getUser(users[77777].getId()), is(users[77777]));
    }

    @Test
    public void clean1() {
        Data data = new Data();
        assertThat(data.getUserList().size(), is(0));
    }

    @Test
    public void clean2() {
        Data data = new Data();
        DataHelper.clean(data);
        assertThat(data.getUserList().size(), is(0));
    }

    @Test
    public void clean3() {
        Data data = new Data();
        DataHelper.addUser(data, new User());
        DataHelper.clean(data);
        assertThat(data.getUserList().size(), is(0));
    }

    @Test
    public void clean4() {
        Data data = new Data();
        DataHelper.addUser(data, new User());
        DataHelper.addUser(data, new User());
        DataHelper.clean(data);
        assertThat(data.getUserList().size(), is(0));
    }

    @Test
    public void clean5() {
        Data data = new Data();
        DataHelper.addUser(data, new User());
        DataHelper.addUser(data, new User());
        DataHelper.addUser(data, new User());
        DataHelper.clean(data);
        assertThat(data.getUserList().size(), is(0));
    }

    @Test
    public void clean6() {
        Data data = new Data();
        DataHelper.addUser(data, new User());
        DataHelper.addUser(data, new User());
        DataHelper.addUser(data, new User());
        DataHelper.addUser(data, new User());
        DataHelper.addUser(data, new User());
        DataHelper.addUser(data, new User());
        DataHelper.addUser(data, new User());
        DataHelper.addUser(data, new User());
        DataHelper.addUser(data, new User());
        DataHelper.clean(data);
        assertThat(data.getUserList().size(), is(0));
    }

    @Test
    public void clean7() {
        Data data = new Data();
        for(int i = 0; i < 100500; ++i) {
            DataHelper.addUser(data, new User());
        }
        DataHelper.clean(data);
        assertThat(data.getUserList().size(), is(0));
    }

    @Test
    public void clean8() {
        Data data = new Data();
        for(int i = 0; i < 100500; ++i) {
            User user = new User();
            for (int j = 0; j < 100; ++j) {
                Users.addEmail(user, new Email("EMail#" + (i*100 + j)));
            }
            DataHelper.addUser(data, user);
        }
        DataHelper.clean(data);
        assertThat(data.getUserList().size(), is(0));
    }

    @Test
    public void addEmail() {
        Data data = new Data();
        User user = new User();
        Email email = new Email("");
        DataHelper.addUser(data, user);
        DataHelper.addEmail(data, user.getId(), email);
        assertThat(data.getUser(user.getId()).getEmail(1), is(email));
    }

    @Test
    public void deleteUser() {
    }

    @Test
    public void deleteEmail() {
    }

    @Test
    public void compressBase() {
    }
}