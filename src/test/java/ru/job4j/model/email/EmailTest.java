package ru.job4j.model.email;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.hamcrest.Matchers.is;

/**
 * Test class for class "Email"
 * @author Geraskin Yegor(yegeraskin13@gmail.com)
 */
public class EmailTest {

    @Test
    public void testToString1() {
        String value = "yegeraskin13@gmail.com";
        Email email = new Email(value);
        String result = email.toString();
        String expected = "Email{" + value + "}";
        assertThat(result, is(expected));
    }

    @Test
    public void testToString2() {
        String value = "";
        Email email = new Email(value);
        String result = email.toString();
        String expected = "Email{" + value + "}";
        assertThat(result, is(expected));
    }

    @Test
    public void testToString3() {
        String value = "yegeraskin13@rambler.com";
        Email email = new Email(value);
        String result = email.toString();
        String expected = "Email{" + value + "}";
        assertThat(result, is(expected));
    }

    @Test
    public void testToString4() {
        String value = "xxx@yyy.org";
        Email email = new Email(value);
        String result = email.toString();
        String expected = "Email{" + value + "}";
        assertThat(result, is(expected));
    }

    @Test
    public void testToString5() {
        String value = "xxx@yyy.edu";
        Email email = new Email(value);
        String result = email.toString();
        String expected = "Email{" + value + "}";
        assertThat(result, is(expected));
    }

    @Test
    public void testToString6() {
        String value = "qw@po.net";
        Email email = new Email(value);
        String result = email.toString();
        String expected = "Email{" + value + "}";
        assertThat(result, is(expected));
    }

    @Test
    public void testToString7() {
        String value = "eg@mipt.ru";
        Email email = new Email(value);
        String result = email.toString();
        String expected = "Email{" + value + "}";
        assertThat(result, is(expected));
    }

    @Test
    public void testToString8() {
        String value = "@serv.";
        Email email = new Email(value);
        String result = email.toString();
        String expected = "Email{" + value + "}";
        assertThat(result, is(expected));
    }

    @Test
    public void testToString9() {
        String value = "@";
        Email email = new Email(value);
        String result = email.toString();
        String expected = "Email{" + value + "}";
        assertThat(result, is(expected));
    }

    @Test
    public void testToString10() {
        String value = "fglsfgj ;lskj erioj reigj aeropi _";
        Email email = new Email(value);
        String result = email.toString();
        String expected = "Email{" + value + "}";
        assertThat(result, is(expected));
    }

    @Test
    public void testHashCode1() {
        String value = "yegeraskin13@gmail.com";
        Email email = new Email(value);
        int result = email.hashCode();
        int expected = value.hashCode();
        assertThat(result, is(expected));
    }

    @Test
    public void testHashCode2() {
        String value = "";
        Email email = new Email(value);
        int result = email.hashCode();
        int expected = value.hashCode();
        assertThat(result, is(expected));
    }

    @Test
    public void testHashCode3() {
        String value = "yegeraskin13@rambler.com";
        Email email = new Email(value);
        int result = email.hashCode();
        int expected = value.hashCode();
        assertThat(result, is(expected));
    }

    @Test
    public void testHashCode4() {
        String value = "xxx@yyy.org";
        Email email = new Email(value);
        int result = email.hashCode();
        int expected = value.hashCode();
        assertThat(result, is(expected));
    }

    @Test
    public void testHashCode5() {
        String value = "xxx@yyy.edu";
        Email email = new Email(value);
        int result = email.hashCode();
        int expected = value.hashCode();
        assertThat(result, is(expected));
    }

    @Test
    public void testHashCode6() {
        String value = "qw@po.net";
        Email email = new Email(value);
        int result = email.hashCode();
        int expected = value.hashCode();
        assertThat(result, is(expected));
    }

    @Test
    public void testHashCode7() {
        String value = "eg@mipt.ru";
        Email email = new Email(value);
        int result = email.hashCode();
        int expected = value.hashCode();
        assertThat(result, is(expected));
    }

    @Test
    public void testHashCode8() {
        String value = "@serv.";
        Email email = new Email(value);
        int result = email.hashCode();
        int expected = value.hashCode();
        assertThat(result, is(expected));
    }

    @Test
    public void testHashCode9() {
        String value = "@";
        Email email = new Email(value);
        int result = email.hashCode();
        int expected = value.hashCode();
        assertThat(result, is(expected));
    }

    @Test
    public void testHashCode10() {
        String value = "fglsfgj ;lskj erioj reigj aeropi _";
        Email email = new Email(value);
        int result = email.hashCode();
        int expected = value.hashCode();
        assertThat(result, is(expected));
    }

    @Test
    public void testEquals() {
    }

    @Test
    public void getValue() {
    }

    @Test
    public void getName() {
    }

    @Test
    public void getService() {
    }

    @Test
    public void getDomain() {
    }
}