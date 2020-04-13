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
        Data data = new Data();
        User user = new User();
        DataHelper.addUser(data, user);
        int[] ids = data.allId();
        User existingUser = data.getUser(ids[0]);
        DataHelper.deleteUser(data, existingUser.getId());
        assertThat(data.getUser(ids[0]), is(Data.EMPTY_USER));
    }

    @Test
    public void deleteEmail() {
        Data data = new Data();
        User user = new User();
        Email email = new Email("auto@mail.ru");
        Users.addEmail(user, email);
        DataHelper.addUser(data, user);
        int expected = data.getUser(user.getId()).getNumberOfEmails() - 1;
        DataHelper.deleteEmail(data, user.getId(), 1);
        int result = data.getUser(user.getId()).getNumberOfEmails();
        assertThat(result, is(expected));
    }

    @Test
    public void compressBase1() {
        Data data = new Data();
        DataHelper.compressBase(data);
        assertThat(data.allId(), is(new int[]{}));
    }

    @Test
    public void compressBase2() {
        Data data = new Data();
        User user1 = new User();
        User user2 = new User();
        DataHelper.addUser(data, user1);
        DataHelper.addUser(data, user2);
        DataHelper.compressBase(data);
        assertThat(data.allId(), is(new int[]{
                user1.getId(),
                user2.getId()
        }));
    }

    @Test
    public void compressBase3() {
        Data data = new Data();
        User user1 = new User();
        User user2 = new User();
        User user3 = new User();
        User user4 = new User();
        User user5 = new User();
        User user6 = new User();
        User user7 = new User();
        DataHelper.addUser(data, user1);
        DataHelper.addUser(data, user2);
        DataHelper.addUser(data, user3);
        DataHelper.addUser(data, user4);
        DataHelper.addUser(data, user5);
        DataHelper.addUser(data, user6);
        DataHelper.addUser(data, user7);
        DataHelper.compressBase(data);
        assertThat(data.allId(), is(new int[]{
                user1.getId(),
                user2.getId(),
                user3.getId(),
                user4.getId(),
                user5.getId(),
                user6.getId(),
                user7.getId(),
        }));
    }

    @Test
    public void compressBase4() {
        Data data = new Data();
        User user1 = new User();
        Users.addEmail(user1, new Email("yegeraskin13@gmail.com"));
        User user2 = new User();
        User user3 = new User();
        User user4 = new User();
        User user5 = new User();
        Users.addEmail(user5, new Email("yegeraskin13@gmail.com"));
        User user6 = new User();
        User user7 = new User();
        DataHelper.addUser(data, user1);
        DataHelper.addUser(data, user2);
        DataHelper.addUser(data, user3);
        DataHelper.addUser(data, user4);
        DataHelper.addUser(data, user5);
        DataHelper.addUser(data, user6);
        DataHelper.addUser(data, user7);
        DataHelper.compressBase(data);
        assertThat(data.allId(), is(new int[]{
                user1.getId(),
                user2.getId(),
                user3.getId(),
                user4.getId(),
                user6.getId(),
                user7.getId(),
        }));
    }

    @Test
    public void compressBase5() {
        Data data = new Data();
        User user1 = new User();
        Users.addEmail(user1, new Email("yegeraskin13@gmail.com"));
        Users.addEmail(user1, new Email("oppo@gmail.com"));
        Users.addEmail(user1, new Email("popovalex@mail.ru"));
        User user2 = new User();
        User user3 = new User();
        User user4 = new User();
        User user5 = new User();
        Users.addEmail(user5, new Email("yegeraskin13@gmail.com"));
        Users.addEmail(user5, new Email("petrarsentev@yandex.ru"));
        Users.addEmail(user5, new Email("xxx@yyy.com"));
        User user6 = new User();
        User user7 = new User();
        Users.addEmail(user7, new Email("yegeraskin13@gmail.com"));
        DataHelper.addUser(data, user1);
        DataHelper.addUser(data, user2);
        DataHelper.addUser(data, user3);
        DataHelper.addUser(data, user4);
        DataHelper.addUser(data, user5);
        DataHelper.addUser(data, user6);
        DataHelper.addUser(data, user7);
        DataHelper.compressBase(data);
        assertThat(data.allId(), is(new int[]{
                user1.getId(),
                user2.getId(),
                user3.getId(),
                user4.getId(),
                user6.getId(),
        }));
    }

    @Test
    public void compressBase6() {
        Data data = new Data();
        User user1 = new User();
        Users.addEmail(user1, new Email("yegeraskin13@gmail.com"));
        Users.addEmail(user1, new Email("oppo@gmail.com"));
        Users.addEmail(user1, new Email("popovalex@mail.ru"));
        User user2 = new User();
        Users.addEmail(user2, new Email("geraskin@phystech.edu"));
        Users.addEmail(user2, new Email("kuzma@gop.org"));
        User user3 = new User();
        User user4 = new User();
        Users.addEmail(user4, new Email("geraskin@phystech.edu"));
        User user5 = new User();
        Users.addEmail(user5, new Email("yegeraskin13@gmail.com"));
        Users.addEmail(user5, new Email("petrarsentev@yandex.ru"));
        Users.addEmail(user5, new Email("xxx@yyy.com"));
        User user6 = new User();
        User user7 = new User();
        Users.addEmail(user7, new Email("yegeraskin13@gmail.com"));
        DataHelper.addUser(data, user1);
        DataHelper.addUser(data, user2);
        DataHelper.addUser(data, user3);
        DataHelper.addUser(data, user4);
        DataHelper.addUser(data, user5);
        DataHelper.addUser(data, user6);
        DataHelper.addUser(data, user7);
        DataHelper.compressBase(data);
        assertThat(data.allId(), is(new int[]{
                user1.getId(),
                user2.getId(),
                user3.getId(),
                user6.getId(),
        }));
    }
}