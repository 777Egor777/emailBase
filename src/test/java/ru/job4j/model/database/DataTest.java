package ru.job4j.model.database;

import org.junit.Test;
import ru.job4j.model.user.User;

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
    public void testToString() {
    }

    @Test
    public void clean() {
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
}