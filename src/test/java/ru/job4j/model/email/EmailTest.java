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
        Email email = new Email(value+"");
        int result = email.hashCode();
        int expected = value.hashCode();
        assertThat(result, is(expected));
    }

    @Test
    public void testHashCode3() {
        String value = "yegeraskin13@rambler.com";
        Email email = new Email(value+"");
        int result = email.hashCode();
        int expected = value.hashCode();
        assertThat(result, is(expected));
    }

    @Test
    public void testHashCode4() {
        String value = "xxx@yyy.org";
        Email email = new Email(value+"");
        int result = email.hashCode();
        int expected = value.hashCode();
        assertThat(result, is(expected));
    }

    @Test
    public void testHashCode5() {
        String value = "xxx@yyy.edu";
        Email email = new Email(value+"");
        int result = email.hashCode();
        int expected = value.hashCode();
        assertThat(result, is(expected));
    }

    @Test
    public void testHashCode6() {
        String value = "qw@po.net";
        Email email = new Email(""+value);
        int result = email.hashCode();
        int expected = value.hashCode();
        assertThat(result, is(expected));
    }

    @Test
    public void testHashCode7() {
        String value = "eg@mipt.ru";
        Email email = new Email(""+value);
        int result = email.hashCode();
        int expected = value.hashCode();
        assertThat(result, is(expected));
    }

    @Test
    public void testHashCode8() {
        String value = "@serv.";
        Email email = new Email(""+value);
        int result = email.hashCode();
        int expected = value.hashCode();
        assertThat(result, is(expected));
    }

    @Test
    public void testHashCode9() {
        String value = "@";
        Email email = new Email(""+value);
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
    public void testEquals1() {
        String value = "yegeraskin13@gmail.com";
        Email email1 = new Email(value);
        Email email2 = new Email(""+value);
        boolean result = email1.equals(email2);
        boolean expected = true;
        assertThat(result, is(expected));
    }

    @Test
    public void testEquals2() {
        String value = "";
        Email email1 = new Email(value);
        Email email2 = new Email(""+value);
        boolean result = email1.equals(email2);
        boolean expected = true;
        assertThat(result, is(expected));
    }

    @Test
    public void testEquals3() {
        String value = "yegeraskin13@rambler.com";
        Email email1 = new Email(value);
        Email email2 = new Email(""+value);
        boolean result = email1.equals(email2);
        boolean expected = true;
        assertThat(result, is(expected));
    }

    @Test
    public void testEquals4() {
        String value = "xxx@yyy.org";
        Email email1 = new Email(""+value);
        Email email2 = new Email(value);
        boolean result = email1.equals(email2);
        boolean expected = true;
        assertThat(result, is(expected));
    }

    @Test
    public void testEquals5() {
        String value = "xxx@yyy.edu";
        Email email1 = new Email(""+value);
        Email email2 = new Email(value);
        boolean result = email1.equals(email2);
        boolean expected = true;
        assertThat(result, is(expected));
    }

    @Test
    public void testEquals6() {
        String value = "qw@po.net";
        Email email1 = new Email(value);
        Email email2 = new Email(""+value);
        boolean result = email1.equals(email2);
        boolean expected = true;
        assertThat(result, is(expected));
    }

    @Test
    public void testEquals7() {
        String value = "eg@mipt.ru";
        Email email1 = new Email(""+value);
        Email email2 = new Email(value);
        boolean result = email1.equals(email2);
        boolean expected = true;
        assertThat(result, is(expected));
    }

    @Test
    public void testEquals8() {
        String value = "@serv.";
        Email email1 = new Email(""+value);
        Email email2 = new Email(value);
        boolean result = email1.equals(email2);
        boolean expected = true;
        assertThat(result, is(expected));
    }

    @Test
    public void testEquals9() {
        String value = "@";
        Email email1 = new Email(value);
        Email email2 = new Email(value);
        boolean result = email1.equals(email2);
        boolean expected = true;
        assertThat(result, is(expected));
    }

    @Test
    public void testEquals10() {
        String value = "fglsfgj ;lskj erioj reigj aeropi _";
        Email email1 = new Email(value);
        Email email2 = new Email(value);
        boolean result = email1.equals(email2);
        boolean expected = true;
        assertThat(result, is(expected));
    }

    @Test
    public void testEquals11() {
        String value = "yegeraskin13@gmail.com";
        Email email1 = new Email(value);
        Email email2 = new Email("");
        boolean result = email1.equals(email2);
        boolean expected = false;
        assertThat(result, is(expected));
    }

    @Test
    public void testEquals12() {
        String value = "";
        Email email1 = new Email(value);
        Email email2 = new Email(value+".");
        boolean result = email1.equals(email2);
        boolean expected = true;
        assertThat(result, is(expected));
    }

    @Test
    public void testEquals13() {
        String value = "yegeraskin13@rambler.com";
        Email email1 = new Email(value+".");
        Email email2 = new Email(value);
        boolean result = email1.equals(email2);
        boolean expected = false;
        assertThat(result, is(expected));
    }

    @Test
    public void testEquals14() {
        String value = "xxx@yyy.org";
        Email email1 = new Email(value);
        Email email2 = new Email("xxx@yxy.org");
        boolean result = email1.equals(email2);
        boolean expected = false;
        assertThat(result, is(expected));
    }

    @Test
    public void testEquals15() {
        String value = "xxx@yyy.edu";
        Email email1 = new Email("yxx@yyy.edu");
        Email email2 = new Email(value);
        boolean result = email1.equals(email2);
        boolean expected = false;
        assertThat(result, is(expected));
    }

    @Test
    public void testEquals16() {
        String value = "qw@po.net";
        Email email1 = new Email(value);
        Email email2 = new Email("qw@po.edu");
        boolean result = email1.equals(email2);
        boolean expected = false;
        assertThat(result, is(expected));
    }

    @Test
    public void testEquals17() {
        String value = "eg@mipt.ru";
        Email email1 = new Email("eg@diht.ru");
        Email email2 = new Email(value);
        boolean result = email1.equals(email2);
        boolean expected = false;
        assertThat(result, is(expected));
    }

    @Test
    public void testEquals18() {
        String value = "@serv.";
        Email email1 = new Email(value);
        Email email2 = new Email("@serv");
        boolean result = email1.equals(email2);
        boolean expected = false;
        assertThat(result, is(expected));
    }

    @Test
    public void testEquals19() {
        String value = "@";
        Email email1 = new Email(value);
        Email email2 = new Email(".");
        boolean result = email1.equals(email2);
        boolean expected = false;
        assertThat(result, is(expected));
    }

    @Test
    public void testEquals20() {
        String value = "fglsfgj ;lskj erioj reigj aeropi _";
        Email email1 = new Email(value);
        Email email2 = new Email("fglsfgj ;lskj erioj reigj aropi _");
        boolean result = email1.equals(email2);
        boolean expected = false;
        assertThat(result, is(expected));
    }

    @Test
    public void getValue1() {
        String value = "";
        Email email = new Email(value);
        String result = email.getValue();
        String expected = ""+value;
        assertThat(result, is(expected));
    }

    @Test
    public void getValue2() {
        String value = "31123132";
        Email email = new Email(value);
        String result = email.getValue();
        String expected = ""+value;
        assertThat(result, is(expected));
    }

    @Test
    public void getValue3() {
        String value = "asadsd@";
        Email email = new Email(value);
        String result = email.getValue();
        String expected = ""+value;
        assertThat(result, is(expected));
    }

    @Test
    public void getValue4() {
        String value = "yegeraskin13@gmail.com";
        Email email = new Email(value);
        String result = email.getValue();
        String expected = ""+value;
        assertThat(result, is(expected));
    }

    @Test
    public void getValue5() {
        String value = "@@@";
        Email email = new Email(value);
        String result = email.getValue();
        String expected = ""+value;
        assertThat(result, is(expected));
    }

    @Test
    public void getValue6() {
        String value = "dllffg j;seo jpeigj ek....";
        Email email = new Email(value);
        String result = email.getValue();
        String expected = ""+value;
        assertThat(result, is(expected));
    }

    @Test
    public void getValue7() {
        String value = "geraskin@phystech.edu";
        Email email = new Email(value);
        String result = email.getValue();
        String expected = ""+value;
        assertThat(result, is(expected));
    }

    @Test
    public void getValue8() {
        String value = "ya@.org";
        Email email = new Email(value);
        String result = email.getValue();
        String expected = ""+value;
        assertThat(result, is(expected));
    }

    @Test
    public void getValue9() {
        String value = "kuzen.net";
        Email email = new Email(value);
        String result = email.getValue();
        String expected = ""+value;
        assertThat(result, is(expected));
    }

    @Test
    public void getValue10() {
        String value = "@@egor@@@@@@77777";
        Email email = new Email(value);
        String result = email.getValue();
        String expected = ""+value;
        assertThat(result, is(expected));
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