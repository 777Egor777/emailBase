package ru.job4j.model.database;

import org.junit.Test;
import ru.job4j.model.email.Email;
import ru.job4j.model.user.User;

import java.util.ArrayList;
import java.util.Arrays;
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
        data.addUser(user);
        assertThat(data.getUser(user.getId()), is(user));
    }

    @Test
    public void addUser4() {
        User user = new User();
        user = new User();
        user = new User();
        user = new User();
        Data data = new Data();
        data.addUser(user);
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
        data.addUser(user);
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
        data.addUser(user);
        assertThat(data.getUser(user.getId()), is(user));
    }

    @Test
    public void addUser7() {
        User user = new User();
        for (int i = 0; i < 100500; ++i) {
            user = new User();
        }
        Data data = new Data();
        data.addUser(user);
        assertThat(data.getUser(user.getId()), is(user));
    }

    @Test
    public void addUser8() {
        User[] users = new User[100500];
        Data data = new Data();
        for (int i = 0; i < 100500; ++i) {
            users[i] = new User();
            data.addUser(users[i]);
        }
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
        StringJoiner joiner = new StringJoiner(System.lineSeparator(), "", "");
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
        for (int i = 0; i < 100500; ++i) {
            users[i] = new User();
        }
        StringJoiner joiner = new StringJoiner(System.lineSeparator(), "", "");
        for (int i = 0; i < 100500; ++i) {
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
        for (int i = 0; i < 100500; ++i) {
            users[i] = new User();
            for (int j = 0; j < 10; ++j) {
                users[i].addEmail(new Email("user#" + users[i].getId() + "email#" + j));
            }
        }
        StringJoiner joiner = new StringJoiner(System.lineSeparator(), "", "");
        for (int i = 0; i < 100500; ++i) {
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
        for (int i = 0; i < 100500; ++i) {
            users[i] = new User();
            if (i % 3 == 0) {
                for (int j = 0; j < 10; ++j) {
                    users[i].addEmail(new Email("user#" + users[i].getId() + "email#" + j));
                }
            }
        }
        StringJoiner joiner = new StringJoiner(System.lineSeparator(), "", "");
        for (int i = 0; i < 100500; ++i) {
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
        for (int i = 0; i < 100500; ++i) {
            data.addUser(new User());
        }
        data.clean();
        assertThat(data.getUserList().size(), is(0));
    }

    @Test
    public void clean8() {
        Data data = new Data();
        for (int i = 0; i < 100500; ++i) {
            User user = new User();
            for (int j = 0; j < 100; ++j) {
                user.addEmail(new Email("EMail#" + (i * 100 + j)));
            }
            data.addUser(user);
        }
        data.clean();
        assertThat(data.getUserList().size(), is(0));
    }

    @Test
    public void addEmail() {
        Data data = new Data();
        User user = new User();
        Email email = new Email("");
        data.addUser(user);
        data.addEmail(user.getId(), email);
        assertThat(data.getUser(user.getId()).getEmail(1), is(email));
    }

    @Test
    public void allId1() {
        Data data = new Data();
        assertThat(data.allId(), is(new int[]{}));
    }

    @Test
    public void allId2() {
        Data data = new Data();
        User user = new User();
        data.addUser(user);
        assertThat(data.allId(), is(new int[]{
                user.getId()
        }));
    }

    @Test
    public void allId3() {
        Data data = new Data();
        User user1 = new User();
        User user2 = new User();
        data.addUser(user1);
        data.addUser(user2);
        assertThat(data.allId(), is(new int[]{
                user1.getId(),
                user2.getId()
        }));
    }

    @Test
    public void allId4() {
        Data data = new Data();
        User user1 = new User();
        User user2 = new User();
        User user3 = new User();
        data.addUser(user1);
        data.addUser(user2);
        data.addUser(user3);
        assertThat(data.allId(), is(new int[]{
                user1.getId(),
                user2.getId(),
                user3.getId()
        }));
    }

    @Test
    public void allId5() {
        Data data = new Data();
        User user1 = new User();
        User user2 = new User();
        User user3 = new User();
        User user4 = new User();
        User user5 = new User();
        User user6 = new User();
        User user7 = new User();
        data.addUser(user1);
        data.addUser(user2);
        data.addUser(user3);
        data.addUser(user4);
        data.addUser(user5);
        data.addUser(user6);
        data.addUser(user7);
        assertThat(data.allId(), is(new int[]{
                user1.getId(),
                user2.getId(),
                user3.getId(),
                user4.getId(),
                user5.getId(),
                user6.getId(),
                user7.getId()
        }));
    }

    @Test
    public void allId6() {
        Data data = new Data();
        User user1 = new User();
        User user2 = new User();
        User user3 = new User();
        User user4 = new User();
        User user5 = new User();
        User user6 = new User();
        User user7 = new User();
        data.addUser(user1);
        data.addUser(user2);
        data.addUser(user3);
        data.addUser(user4);
        data.addUser(user5);
        data.addUser(user6);
        data.addUser(user7);
        data.deleteUser(user3.getId());
        assertThat(data.allId(), is(new int[]{
                user1.getId(),
                user2.getId(),
                user4.getId(),
                user5.getId(),
                user6.getId(),
                user7.getId()
        }));
    }

    @Test
    public void allId7() {
        Data data = new Data();
        User[] users = new User[100500];
        int[] ids = new int[100500];
        for (int i = 0; i < 100500; ++i) {
            users[i] = new User();
            ids[i] = users[i].getId();
            data.addUser(users[i]);
        }
        assertThat(data.allId(), is(ids));
    }

    @Test
    public void allId8() {
        Data data = new Data();
        User[] users = new User[100500];
        for (int i = 0; i < 100500; ++i) {
            users[i] = new User();
            data.addUser(users[i]);
        }
        data.deleteUser(users[77777].getId());
        int[] ids = new int[100499];
        int pos = 0;
        for (int i = 0; i < 77777; ++i) {
            ids[pos++] = users[i].getId();
        }
        for (int i = 77778; i < 100500; ++i) {
            ids[pos++] = users[i].getId();
        }
        assertThat(data.allId(), is(ids));
    }

    @Test
    public void allId9() {
        Data data = new Data();
        User user1 = new User();
        User user2 = new User();
        user1.addEmail(new Email("yegeraskin13@gmail.com"));
        user2.addEmail(new Email("yegeraskin13@gmail.com"));
        data.addUser(user1);
        data.addUser(user2);
        data.compressBase();
        assertThat(data.allId(), is(new int[]{
                user1.getId()
        }));
    }

    @Test
    public void allId10() {
        Data data = new Data();
        User user1 = new User();
        User user2 = new User();
        User user3 = new User();
        user1.addEmail(new Email("yegeraskin13@gmail.com"));
        user2.addEmail(new Email("yegeraskin13@gmail.com"));
        data.addUser(user1);
        data.addUser(user2);
        data.addUser(user3);
        data.compressBase();
        assertThat(data.allId(), is(new int[]{
                user1.getId(),
                user3.getId()
        }));
    }

    @Test
    public void allId11() {
        Data data = new Data();
        User user1 = new User();
        User user2 = new User();
        User user3 = new User();
        User user4 = new User();
        user1.addEmail(new Email("yegeraskin13@gmail.com"));
        user2.addEmail(new Email("yegeraskin13@gmail.com"));
        user3.addEmail(new Email("geraskin@phystech.edu"));
        user4.addEmail(new Email("geraskin@phystech.edu"));
        data.addUser(user1);
        data.addUser(user2);
        data.addUser(user3);
        data.addUser(user4);
        data.compressBase();
        assertThat(data.allId(), is(new int[]{
                user1.getId(),
                user3.getId()
        }));
    }

    @Test
    public void allId12() {
        Data data = new Data();
        User user1 = new User();
        User user2 = new User();
        User user3 = new User();
        User user4 = new User();
        User user5 = new User();
        User user6 = new User();
        User user7 = new User();
        user1.addEmail(new Email("yegeraskin13@gmail.com"));
        user1.addEmail(new Email("petrov13@mail.ru"));
        user1.addEmail(new Email("geraskin@phystech.edu"));
        user2.addEmail(new Email("yegeraskin13@gmail.com"));
        user3.addEmail(new Email("geraskin@phystech.edu"));
        user4.addEmail(new Email("geraskin@phystech.edu"));
        user7.addEmail(new Email("petrov13@mail.ru"));
        data.addUser(user1);
        data.addUser(user2);
        data.addUser(user3);
        data.addUser(user4);
        data.addUser(user5);
        data.addUser(user6);
        data.addUser(user7);
        data.compressBase();
        assertThat(data.allId(), is(new int[]{
                user1.getId(),
                user5.getId(),
                user6.getId()
        }));
    }

    @Test
    public void deleteUser() {
        Data data = new Data();
        User user = new User();
        data.addUser(user);
        int[] ids = data.allId();
        User existingUser = data.getUser(ids[0]);
        data.deleteUser(existingUser.getId());
        assertThat(data.getUser(ids[0]), is(Data.EMPTY_USER));
    }

    @Test
    public void getUser1() {
        Data data = new Data();
        int id = -1;
        User result = data.getUser(id);
        User expected = Data.EMPTY_USER;
        assertThat(result, is(expected));
    }

    @Test
    public void getUser2() {
        Data data = new Data();
        int id = 100500000;
        User result = data.getUser(id);
        User expected = Data.EMPTY_USER;
        assertThat(result, is(expected));
    }

    @Test
    public void getUser3() {
        Data data = new Data();
        User user = new User();
        data.addUser(user);
        int id = user.getId();
        User result = data.getUser(id);
        User expected = user;
        assertThat(result, is(expected));
    }

    @Test
    public void getUser4() {
        Data data = new Data();
        User[] users = new User[100500];
        for (int i = 0; i < 100500; ++i) {
            users[i] = new User();
            data.addUser(users[i]);
        }
        int[] ids = data.allId();
        User result = data.getUser(ids[8888]);
        User expected = users[8888];
        assertThat(result, is(expected));
    }

    @Test
    public void deleteEmail() {
        Data data = new Data();
        User user = new User();
        Email email = new Email("auto@mail.ru");
        user.addEmail(email);
        data.addUser(user);
        int expected = data.getUser(user.getId()).getNumberOfEmails() - 1;
        data.deleteEmail(user.getId(), 1);
        int result = data.getUser(user.getId()).getNumberOfEmails();
        assertThat(result, is(expected));
    }

    @Test
    public void compressBase1() {
        Data data = new Data();
        data.compressBase();
        assertThat(data.allId(), is(new int[]{}));
    }

    @Test
    public void compressBase2() {
        Data data = new Data();
        User user1 = new User();
        User user2 = new User();
        data.addUser(user1);
        data.addUser(user2);
        data.compressBase();
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
        data.addUser(user1);
        data.addUser(user2);
        data.addUser(user3);
        data.addUser(user4);
        data.addUser(user5);
        data.addUser(user6);
        data.addUser(user7);
        data.compressBase();
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
        user1.addEmail(new Email("yegeraskin13@gmail.com"));
        User user2 = new User();
        User user3 = new User();
        User user4 = new User();
        User user5 = new User();
        user5.addEmail(new Email("yegeraskin13@gmail.com"));
        User user6 = new User();
        User user7 = new User();
        data.addUser(user1);
        data.addUser(user2);
        data.addUser(user3);
        data.addUser(user4);
        data.addUser(user5);
        data.addUser(user6);
        data.addUser(user7);
        data.compressBase();
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
        user1.addEmail(new Email("yegeraskin13@gmail.com"));
        user1.addEmail(new Email("oppo@gmail.com"));
        user1.addEmail(new Email("popovalex@mail.ru"));
        User user2 = new User();
        User user3 = new User();
        User user4 = new User();
        User user5 = new User();
        user5.addEmail(new Email("yegeraskin13@gmail.com"));
        user5.addEmail(new Email("petrarsentev@yandex.ru"));
        user5.addEmail(new Email("xxx@yyy.com"));
        User user6 = new User();
        User user7 = new User();
        user7.addEmail(new Email("yegeraskin13@gmail.com"));
        data.addUser(user1);
        data.addUser(user2);
        data.addUser(user3);
        data.addUser(user4);
        data.addUser(user5);
        data.addUser(user6);
        data.addUser(user7);
        data.compressBase();
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
        user1.addEmail(new Email("yegeraskin13@gmail.com"));
        user1.addEmail(new Email("oppo@gmail.com"));
        user1.addEmail(new Email("popovalex@mail.ru"));
        User user2 = new User();
        user2.addEmail(new Email("geraskin@phystech.edu"));
        user2.addEmail(new Email("kuzma@gop.org"));
        User user3 = new User();
        User user4 = new User();
        user4.addEmail(new Email("geraskin@phystech.edu"));
        User user5 = new User();
        user5.addEmail(new Email("yegeraskin13@gmail.com"));
        user5.addEmail(new Email("petrarsentev@yandex.ru"));
        user5.addEmail(new Email("xxx@yyy.com"));
        User user6 = new User();
        User user7 = new User();
        user7.addEmail(new Email("yegeraskin13@gmail.com"));
        data.addUser(user1);
        data.addUser(user2);
        data.addUser(user3);
        data.addUser(user4);
        data.addUser(user5);
        data.addUser(user6);
        data.addUser(user7);
        data.compressBase();
        assertThat(data.allId(), is(new int[]{
                user1.getId(),
                user2.getId(),
                user3.getId(),
                user6.getId(),
        }));
    }

    @Test
    public void getUserList1() {
        Data data = new Data();
        assertThat(
                data.getUserList(),
                is(new ArrayList<User>())
        );
    }

    @Test
    public void getUserList2() {
        Data data = new Data();
        User user1 = new User();
        User user2 = new User();
        data.addUser(user1);
        data.addUser(user2);
        assertThat(
                data.getUserList(),
                is(new ArrayList<User>(Arrays.asList(
                        user1,
                        user2
                )))
        );
    }
}