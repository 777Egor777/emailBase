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
    public void getId() {
    }

    @Test
    public void cleanEmailsList() {
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