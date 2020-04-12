package ru.job4j.model.email.util;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.hamcrest.Matchers.is;

/**
 * Test class for class "Emails"
 * @author Geraskin Yegor(yegeraskin13@gmail.com)
 */
public class EmailsTest {

    @Test
    public void isCorrectEmail() {
    }

    @Test
    public void isCorrectValue() {
    }

    @Test
    public void isCorrectName() {
    }

    @Test
    public void isCorrectService() {
    }

    @Test
    public void isCorrectDomain1() {
        String domain = "";
        boolean result = Emails.isCorrectDomain(domain);
        boolean expected = false;
        assertThat(result, is(expected));
    }

    @Test
    public void isCorrectDomain2() {
        String domain = "ru";
        boolean result = Emails.isCorrectDomain(domain);
        boolean expected = true;
        assertThat(result, is(expected));
    }

    @Test
    public void isCorrectDomain3() {
        String domain = "com";
        boolean result = Emails.isCorrectDomain(domain);
        boolean expected = true;
        assertThat(result, is(expected));
    }

    @Test
    public void isCorrectDomain4() {
        String domain = "net";
        boolean result = Emails.isCorrectDomain(domain);
        boolean expected = true;
        assertThat(result, is(expected));
    }

    @Test
    public void isCorrectDomain5() {
        String domain = "org";
        boolean result = Emails.isCorrectDomain(domain);
        boolean expected = true;
        assertThat(result, is(expected));
    }

    @Test
    public void isCorrectDomain6() {
        String domain = "edu";
        boolean result = Emails.isCorrectDomain(domain);
        boolean expected = true;
        assertThat(result, is(expected));
    }

    @Test
    public void isCorrectDomain7() {
        String domain = ".ru";
        boolean result = Emails.isCorrectDomain(domain);
        boolean expected = false;
        assertThat(result, is(expected));
    }

    @Test
    public void isCorrectDomain8() {
        String domain = ".com";
        boolean result = Emails.isCorrectDomain(domain);
        boolean expected = false;
        assertThat(result, is(expected));
    }

    @Test
    public void isCorrectDomain9() {
        String domain = ".net";
        boolean result = Emails.isCorrectDomain(domain);
        boolean expected = false;
        assertThat(result, is(expected));
    }

    @Test
    public void isCorrectDomain10() {
        String domain = ".edu";
        boolean result = Emails.isCorrectDomain(domain);
        boolean expected = false;
        assertThat(result, is(expected));
    }

    @Test
    public void isCorrectDomain11() {
        String domain = ".org";
        boolean result = Emails.isCorrectDomain(domain);
        boolean expected = false;
        assertThat(result, is(expected));
    }

    @Test
    public void isCorrectDomain12() {
        String domain = ".";
        boolean result = Emails.isCorrectDomain(domain);
        boolean expected = false;
        assertThat(result, is(expected));
    }

    @Test
    public void isCorrectDomain13() {
        String domain = "@";
        boolean result = Emails.isCorrectDomain(domain);
        boolean expected = false;
        assertThat(result, is(expected));
    }

    @Test
    public void isCorrectDomain14() {
        String domain = "yandex.ru";
        boolean result = Emails.isCorrectDomain(domain);
        boolean expected = false;
        assertThat(result, is(expected));
    }

    @Test
    public void isCorrectDomain15() {
        String domain = "gmail.com";
        boolean result = Emails.isCorrectDomain(domain);
        boolean expected = false;
        assertThat(result, is(expected));
    }

    @Test
    public void isCorrectDomain16() {
        String domain = "ру";
        boolean result = Emails.isCorrectDomain(domain);
        boolean expected = false;
        assertThat(result, is(expected));
    }

    @Test
    public void isCorrectDomain17() {
        String domain = "qwe";
        boolean result = Emails.isCorrectDomain(domain);
        boolean expected = false;
        assertThat(result, is(expected));
    }

    @Test
    public void isCorrectDomain18() {
        String domain = "qw";
        boolean result = Emails.isCorrectDomain(domain);
        boolean expected = false;
        assertThat(result, is(expected));
    }
    @Test
    public void isCorrectDomain19() {
        String domain = "@ru";
        boolean result = Emails.isCorrectDomain(domain);
        boolean expected = false;
        assertThat(result, is(expected));
    }

    @Test
    public void isCorrectDomain20() {
        String domain = ",ru";
        boolean result = Emails.isCorrectDomain(domain);
        boolean expected = false;
        assertThat(result, is(expected));
    }

}