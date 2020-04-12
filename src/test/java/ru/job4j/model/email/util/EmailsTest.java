package ru.job4j.model.email.util;

import org.junit.Test;
import ru.job4j.model.email.Email;

import static org.junit.Assert.*;
import static org.hamcrest.Matchers.is;

/**
 * Test class for class "Emails"
 * @author Geraskin Yegor(yegeraskin13@gmail.com)
 */
public class EmailsTest {

    @Test
    public void isCorrectEmail1() {
        String value = "yegeraskin13@gmail.com";
        Email email = new Email(value);
        boolean result = Emails.isCorrectEmail(email);
        boolean expected = true;
        assertThat(result, is(expected));
    }

    @Test
    public void isCorrectEmail2() {
        String value = "geraskin@phystech.edu";
        Email email = new Email(value);
        boolean result = Emails.isCorrectEmail(email);
        boolean expected = true;
        assertThat(result, is(expected));
    }

    @Test
    public void isCorrectEmail3() {
        String value = "vasek7@rambler.ru";
        Email email = new Email(value);
        boolean result = Emails.isCorrectEmail(email);
        boolean expected = true;
        assertThat(result, is(expected));
    }

    @Test
    public void isCorrectEmail4() {
        String value = "egor@yandex.ru";
        Email email = new Email(value);
        boolean result = Emails.isCorrectEmail(email);
        boolean expected = true;
        assertThat(result, is(expected));
    }

    @Test
    public void isCorrectEmail5() {
        String value = "kyrpatov777@mail.ru";
        Email email = new Email(value);
        boolean result = Emails.isCorrectEmail(email);
        boolean expected = true;
        assertThat(result, is(expected));
    }

    @Test
    public void isCorrectEmail6() {
        String value = "ivanovalex@rambler.ru";
        Email email = new Email(value);
        boolean result = Emails.isCorrectEmail(email);
        boolean expected = true;
        assertThat(result, is(expected));
    }

    @Test
    public void isCorrectEmail7() {
        String value = "petrovsasha@qqq.com";
        Email email = new Email(value);
        boolean result = Emails.isCorrectEmail(email);
        boolean expected = true;
        assertThat(result, is(expected));
    }

    @Test
    public void isCorrectEmail8() {
        String value = "pp@yandex.ru";
        Email email = new Email(value);
        boolean result = Emails.isCorrectEmail(email);
        boolean expected = false;
        assertThat(result, is(expected));
    }

    @Test
    public void isCorrectEmail9() {
        String value = "p7@yandex.ru";
        Email email = new Email(value);
        boolean result = Emails.isCorrectEmail(email);
        boolean expected = false;
        assertThat(result, is(expected));
    }

    @Test
    public void isCorrectEmail10() {
        String value = "77@yandex.ru";
        Email email = new Email(value);
        boolean result = Emails.isCorrectEmail(email);
        boolean expected = false;
        assertThat(result, is(expected));
    }

    @Test
    public void isCorrectEmail11() {
        String value = "as.@yandex.ru";
        Email email = new Email(value);
        boolean result = Emails.isCorrectEmail(email);
        boolean expected = false;
        assertThat(result, is(expected));
    }

    @Test
    public void isCorrectEmail12() {
        String value = "Ass@gmail.com";
        Email email = new Email(value);
        boolean result = Emails.isCorrectEmail(email);
        boolean expected = false;
        assertThat(result, is(expected));
    }

    @Test
    public void isCorrectEmail13() {
        String value = "sAs@gmail.com";
        Email email = new Email(value);
        boolean result = Emails.isCorrectEmail(email);
        boolean expected = false;
        assertThat(result, is(expected));
    }

    @Test
    public void isCorrectEmail14() {
        String value = "ooO@mail.ru";
        Email email = new Email(value);
        boolean result = Emails.isCorrectEmail(email);
        boolean expected = false;
        assertThat(result, is(expected));
    }

    @Test
    public void isCorrectEmail15() {
        String value = "ZZZ@gmail.com";
        Email email = new Email(value);
        boolean result = Emails.isCorrectEmail(email);
        boolean expected = false;
        assertThat(result, is(expected));
    }

    @Test
    public void isCorrectEmail16() {
        String value = "asdasdsZaqwqwwqw@mail.ru";
        Email email = new Email(value);
        boolean result = Emails.isCorrectEmail(email);
        boolean expected = false;
        assertThat(result, is(expected));
    }

    @Test
    public void isCorrectEmail17() {
        String value = "mmm9XXXasasaqweq@rambler.net";
        Email email = new Email(value);
        boolean result = Emails.isCorrectEmail(email);
        boolean expected = false;
        assertThat(result, is(expected));
    }

    @Test
    public void isCorrectEmail18() {
        String value = "petrKuznetsov@rambler.net";
        Email email = new Email(value);
        boolean result = Emails.isCorrectEmail(email);
        boolean expected = false;
        assertThat(result, is(expected));
    }

    @Test
    public void isCorrectEmail19() {
        String value = "petr.kuznetsov@rambler.net";
        Email email = new Email(value);
        boolean result = Emails.isCorrectEmail(email);
        boolean expected = false;
        assertThat(result, is(expected));
    }

    @Test
    public void isCorrectEmail20() {
        String value = "yegeraskin13@gm.com";
        Email email = new Email(value);
        boolean result = Emails.isCorrectEmail(email);
        boolean expected = false;
        assertThat(result, is(expected));
    }

    @Test
    public void isCorrectEmail21() {
        String value = "yegeraskin13@gm1.com";
        Email email = new Email(value);
        boolean result = Emails.isCorrectEmail(email);
        boolean expected = false;
        assertThat(result, is(expected));
    }

    @Test
    public void isCorrectEmail22() {
        String value = "yegeraskin13@7gm.com";
        Email email = new Email(value);
        boolean result = Emails.isCorrectEmail(email);
        boolean expected = false;
        assertThat(result, is(expected));
    }

    @Test
    public void isCorrectEmail23() {
        String value = "yegeraskin13@gmAil.com";
        Email email = new Email(value);
        boolean result = Emails.isCorrectEmail(email);
        boolean expected = false;
        assertThat(result, is(expected));
    }

    @Test
    public void isCorrectEmail24() {
        String value = "yegeraskin13@Gmail.com";
        Email email = new Email(value);
        boolean result = Emails.isCorrectEmail(email);
        boolean expected = false;
        assertThat(result, is(expected));
    }

    @Test
    public void isCorrectEmail25() {
        String value = "yegeraskin13@@mak.ru";
        Email email = new Email(value);
        boolean result = Emails.isCorrectEmail(email);
        boolean expected = false;
        assertThat(result, is(expected));
    }

    @Test
    public void isCorrectEmail26() {
        String value = "yegeraskin13@gm@il.ru";
        Email email = new Email(value);
        boolean result = Emails.isCorrectEmail(email);
        boolean expected = false;
        assertThat(result, is(expected));
    }

    @Test
    public void isCorrectEmail27() {
        String value = "yegeraskin13@gmaiL.ru";
        Email email = new Email(value);
        boolean result = Emails.isCorrectEmail(email);
        boolean expected = false;
        assertThat(result, is(expected));
    }

    @Test
    public void isCorrectEmail28() {
        String value = "yegeraskin13@hh.ru";
        Email email = new Email(value);
        boolean result = Emails.isCorrectEmail(email);
        boolean expected = false;
        assertThat(result, is(expected));
    }

    @Test
    public void isCorrectEmail29() {
        String value = "yegeraskin13@bk.ru";
        Email email = new Email(value);
        boolean result = Emails.isCorrectEmail(email);
        boolean expected = false;
        assertThat(result, is(expected));
    }

    @Test
    public void isCorrectEmail30() {
        String value = "yegeraskin13@gmail..com";
        Email email = new Email(value);
        boolean result = Emails.isCorrectEmail(email);
        boolean expected = false;
        assertThat(result, is(expected));
    }

    @Test
    public void isCorrectEmail31() {
        String value = "petrivanov@yandex..ru";
        Email email = new Email(value);
        boolean result = Emails.isCorrectEmail(email);
        boolean expected = false;
        assertThat(result, is(expected));
    }

    @Test
    public void isCorrectEmail32() {
        String value = "vasyarevtov22@gmail.orgg";
        Email email = new Email(value);
        boolean result = Emails.isCorrectEmail(email);
        boolean expected = false;
        assertThat(result, is(expected));
    }

    @Test
    public void isCorrectEmail33() {
        String value = "tveri4anin@gmail.c0m";
        Email email = new Email(value);
        boolean result = Emails.isCorrectEmail(email);
        boolean expected = false;
        assertThat(result, is(expected));
    }

    @Test
    public void isCorrectEmail34() {
        String value = "1math@yandex.eduu";
        Email email = new Email(value);
        boolean result = Emails.isCorrectEmail(email);
        boolean expected = false;
        assertThat(result, is(expected));
    }

    @Test
    public void isCorrectEmail35() {
        String value = "yegeraskin13@gmail.Com";
        Email email = new Email(value);
        boolean result = Emails.isCorrectEmail(email);
        boolean expected = false;
        assertThat(result, is(expected));
    }

    @Test
    public void isCorrectEmail36() {
        String value = "uiuiiu123@asdasd.cOm";
        Email email = new Email(value);
        boolean result = Emails.isCorrectEmail(email);
        boolean expected = false;
        assertThat(result, is(expected));
    }

    @Test
    public void isCorrectEmail37() {
        String value = "iamaher33o@yandex.Ru";
        Email email = new Email(value);
        boolean result = Emails.isCorrectEmail(email);
        boolean expected = false;
        assertThat(result, is(expected));
    }

    @Test
    public void isCorrectEmail38() {
        String value = "redhotch1lid0g@saratov.org";
        Email email = new Email(value);
        boolean result = Emails.isCorrectEmail(email);
        boolean expected = false;
        assertThat(result, is(expected));
    }

    @Test
    public void isCorrectEmail39() {
        String value = "q1w2e3r4t5y6@mail777..org";
        Email email = new Email(value);
        boolean result = Emails.isCorrectEmail(email);
        boolean expected = false;
        assertThat(result, is(expected));
    }

    @Test
    public void isCorrectEmail40() {
        String value = "papanya@qweqweqw.ru";
        Email email = new Email(value);
        boolean result = Emails.isCorrectEmail(email);
        boolean expected = true;
        assertThat(result, is(expected));
    }

    @Test
    public void isCorrectEmail41() {
        String value = "egor5@service.com";
        Email email = new Email(value);
        boolean result = Emails.isCorrectEmail(email);
        boolean expected = true;
        assertThat(result, is(expected));
    }

    @Test
    public void isCorrectEmail42() {
        String value = "geraskin@phystech.edu";
        Email email = new Email(value);
        boolean result = Emails.isCorrectEmail(email);
        boolean expected = true;
        assertThat(result, is(expected));
    }

    @Test
    public void isCorrectEmail43() {
        String value = "geraskin4@rambler.org";
        Email email = new Email(value);
        boolean result = Emails.isCorrectEmail(email);
        boolean expected = true;
        assertThat(result, is(expected));
    }

    @Test
    public void isCorrectValue() {
    }

    @Test
    public void isCorrectName1() {
        String name = "..";
        boolean result = Emails.isCorrectService(name);
        boolean expected = false;
        assertThat(result, is(expected));
    }

    @Test
    public void isCorrectName2() {
        String name = "@@";
        boolean result = Emails.isCorrectService(name);
        boolean expected = false;
        assertThat(result, is(expected));
    }

    @Test
    public void isCorrectName3() {
        String name = "@.";
        boolean result = Emails.isCorrectService(name);
        boolean expected = false;
        assertThat(result, is(expected));
    }

    @Test
    public void isCorrectName4() {
        String name = ".@";
        boolean result = Emails.isCorrectService(name);
        boolean expected = false;
        assertThat(result, is(expected));
    }

    @Test
    public void isCorrectName5() {
        String name = "__";
        boolean result = Emails.isCorrectService(name);
        boolean expected = false;
        assertThat(result, is(expected));
    }

    @Test
    public void isCorrectName6() {
        String name = "_@";
        boolean result = Emails.isCorrectService(name);
        boolean expected = false;
        assertThat(result, is(expected));
    }

    @Test
    public void isCorrectName7() {
        String name = "@_";
        boolean result = Emails.isCorrectService(name);
        boolean expected = false;
        assertThat(result, is(expected));
    }

    @Test
    public void isCorrectName8() {
        String name = "._";
        boolean result = Emails.isCorrectService(name);
        boolean expected = false;
        assertThat(result, is(expected));
    }

    @Test
    public void isCorrectName9() {
        String name = "_.";
        boolean result = Emails.isCorrectService(name);
        boolean expected = false;
        assertThat(result, is(expected));
    }

    @Test
    public void isCorrectName10() {
        String name = "a.";
        boolean result = Emails.isCorrectService(name);
        boolean expected = false;
        assertThat(result, is(expected));
    }

    @Test
    public void isCorrectName11() {
        String name = "a@";
        boolean result = Emails.isCorrectService(name);
        boolean expected = false;
        assertThat(result, is(expected));
    }

    @Test
    public void isCorrectName12() {
        String name = "@c";
        boolean result = Emails.isCorrectService(name);
        boolean expected = false;
        assertThat(result, is(expected));
    }

    @Test
    public void isCorrectName13() {
        String name = "_a";
        boolean result = Emails.isCorrectService(name);
        boolean expected = false;
        assertThat(result, is(expected));
    }

    @Test
    public void isCorrectName14() {
        String name = "a#";
        boolean result = Emails.isCorrectService(name);
        boolean expected = false;
        assertThat(result, is(expected));
    }

    @Test
    public void isCorrectName15() {
        String name = "Ax";
        boolean result = Emails.isCorrectService(name);
        boolean expected = false;
        assertThat(result, is(expected));
    }

    @Test
    public void isCorrectName16() {
        String name = "xH";
        boolean result = Emails.isCorrectService(name);
        boolean expected = false;
        assertThat(result, is(expected));
    }

    @Test
    public void isCorrectName17() {
        String name = "pD";
        boolean result = Emails.isCorrectService(name);
        boolean expected = false;
        assertThat(result, is(expected));
    }

    @Test
    public void isCorrectName18() {
        String name = "VV";
        boolean result = Emails.isCorrectService(name);
        boolean expected = false;
        assertThat(result, is(expected));
    }

    @Test
    public void isCorrectName19() {
        String name = "WQ";
        boolean result = Emails.isCorrectService(name);
        boolean expected = false;
        assertThat(result, is(expected));
    }

    @Test
    public void isCorrectName20() {
        String name = "kk";
        boolean result = Emails.isCorrectService(name);
        boolean expected = false;
        assertThat(result, is(expected));
    }

    @Test
    public void isCorrectName21() {
        String name = "k1";
        boolean result = Emails.isCorrectService(name);
        boolean expected = false;
        assertThat(result, is(expected));
    }

    @Test
    public void isCorrectName22() {
        String name = "k2";
        boolean result = Emails.isCorrectService(name);
        boolean expected = false;
        assertThat(result, is(expected));
    }

    @Test
    public void isCorrectName23() {
        String name = "7c";
        boolean result = Emails.isCorrectService(name);
        boolean expected = false;
        assertThat(result, is(expected));
    }

    @Test
    public void isCorrectName24() {
        String name = "x5";
        boolean result = Emails.isCorrectService(name);
        boolean expected = false;
        assertThat(result, is(expected));
    }

    @Test
    public void isCorrectName25() {
        String name = "54";
        boolean result = Emails.isCorrectService(name);
        boolean expected = false;
        assertThat(result, is(expected));
    }

    @Test
    public void isCorrectName26() {
        String name = "11";
        boolean result = Emails.isCorrectService(name);
        boolean expected = false;
        assertThat(result, is(expected));
    }

    @Test
    public void isCorrectName27() {
        String name = "x5";
        boolean result = Emails.isCorrectService(name);
        boolean expected = false;
        assertThat(result, is(expected));
    }

    @Test
    public void isCorrectName28() {
        String name = "zxc";
        boolean result = Emails.isCorrectService(name);
        boolean expected = true;
        assertThat(result, is(expected));
    }

    @Test
    public void isCorrectName29() {
        String name = "1sd";
        boolean result = Emails.isCorrectService(name);
        boolean expected = true;
        assertThat(result, is(expected));
    }

    @Test
    public void isCorrectName30() {
        String name = "kj23kj2";
        boolean result = Emails.isCorrectService(name);
        boolean expected = true;
        assertThat(result, is(expected));
    }

    @Test
    public void isCorrectName31() {
        String name = "yegeraskin13";
        boolean result = Emails.isCorrectService(name);
        boolean expected = true;
        assertThat(result, is(expected));
    }

    @Test
    public void isCorrectName32() {
        String name = "geraskin";
        boolean result = Emails.isCorrectService(name);
        boolean expected = true;
        assertThat(result, is(expected));
    }

    @Test
    public void isCorrectName33() {
        String name = "petrov11";
        boolean result = Emails.isCorrectService(name);
        boolean expected = true;
        assertThat(result, is(expected));
    }

    @Test
    public void isCorrectName34() {
        String name = "ivanov";
        boolean result = Emails.isCorrectService(name);
        boolean expected = true;
        assertThat(result, is(expected));
    }

    @Test
    public void isCorrectName35() {
        String name = "sidorov";
        boolean result = Emails.isCorrectService(name);
        boolean expected = true;
        assertThat(result, is(expected));
    }

    @Test
    public void isCorrectName36() {
        String name = "alex777";
        boolean result = Emails.isCorrectService(name);
        boolean expected = true;
        assertThat(result, is(expected));
    }

    @Test
    public void isCorrectName37() {
        String name = "kypriyanov";
        boolean result = Emails.isCorrectService(name);
        boolean expected = true;
        assertThat(result, is(expected));
    }

    @Test
    public void isCorrectName38() {
        String name = "pupkimnvasiliy";
        boolean result = Emails.isCorrectService(name);
        boolean expected = true;
        assertThat(result, is(expected));
    }

    @Test
    public void isCorrectName39() {
        String name = "xleb7wek";
        boolean result = Emails.isCorrectService(name);
        boolean expected = true;
        assertThat(result, is(expected));
    }

    @Test
    public void isCorrectName40() {
        String name = "1egor";
        boolean result = Emails.isCorrectService(name);
        boolean expected = true;
        assertThat(result, is(expected));
    }

    @Test
    public void isCorrectName41() {
        String name = "egor7";
        boolean result = Emails.isCorrectService(name);
        boolean expected = true;
        assertThat(result, is(expected));
    }

    @Test
    public void isCorrectName42() {
        String name = "c00ler";
        boolean result = Emails.isCorrectService(name);
        boolean expected = true;
        assertThat(result, is(expected));
    }

    @Test
    public void isCorrectName43() {
        String name = "kryt1wka";
        boolean result = Emails.isCorrectService(name);
        boolean expected = true;
        assertThat(result, is(expected));
    }

    @Test
    public void isCorrectName44() {
        String name = "777egor777";
        boolean result = Emails.isCorrectService(name);
        boolean expected = true;
        assertThat(result, is(expected));
    }

    @Test
    public void isCorrectName46() {
        String name = "777EGOR777";
        boolean result = Emails.isCorrectService(name);
        boolean expected = false;
        assertThat(result, is(expected));
    }

    @Test
    public void isCorrectName47() {
        String name = "777Egor777";
        boolean result = Emails.isCorrectService(name);
        boolean expected = false;
        assertThat(result, is(expected));
    }

    @Test
    public void isCorrectName48() {
        String name = "777egOr";
        boolean result = Emails.isCorrectService(name);
        boolean expected = false;
        assertThat(result, is(expected));
    }

    @Test
    public void isCorrectName49() {
        String name = "777eg0r";
        boolean result = Emails.isCorrectService(name);
        boolean expected = true;
        assertThat(result, is(expected));
    }

    @Test
    public void isCorrectName50() {
        String name = "asdasdYasdasdd";
        boolean result = Emails.isCorrectService(name);
        boolean expected = false;
        assertThat(result, is(expected));
    }

    @Test
    public void isCorrectName51() {
        String name = "Qasdasdads";
        boolean result = Emails.isCorrectService(name);
        boolean expected = false;
        assertThat(result, is(expected));
    }

    @Test
    public void isCorrectName52() {
        String name = "asddasdasG";
        boolean result = Emails.isCorrectService(name);
        boolean expected = false;
        assertThat(result, is(expected));
    }

    @Test
    public void isCorrectName53() {
        String name = "Yegeraskin";
        boolean result = Emails.isCorrectService(name);
        boolean expected = false;
        assertThat(result, is(expected));
    }

    @Test
    public void isCorrectName54() {
        String name = "Genevacity";
        boolean result = Emails.isCorrectService(name);
        boolean expected = false;
        assertThat(result, is(expected));
    }

    @Test
    public void isCorrectName55() {
        String name = "genevaCity";
        boolean result = Emails.isCorrectService(name);
        boolean expected = false;
        assertThat(result, is(expected));
    }

    @Test
    public void isCorrectName56() {
        String name = "coolGirl";
        boolean result = Emails.isCorrectService(name);
        boolean expected = false;
        assertThat(result, is(expected));
    }

    @Test
    public void isCorrectName57() {
        String name = "Bravo777";
        boolean result = Emails.isCorrectService(name);
        boolean expected = false;
        assertThat(result, is(expected));
    }

    @Test
    public void isCorrectName59() {
        String name = "asdas.asasdsad";
        boolean result = Emails.isCorrectService(name);
        boolean expected = false;
        assertThat(result, is(expected));
    }

    @Test
    public void isCorrectName60() {
        String name = ".qweqw..";
        boolean result = Emails.isCorrectService(name);
        boolean expected = false;
        assertThat(result, is(expected));
    }

    @Test
    public void isCorrectName61() {
        String name = ",qweqw";
        boolean result = Emails.isCorrectService(name);
        boolean expected = false;
        assertThat(result, is(expected));
    }

    @Test
    public void isCorrectName62() {
        String name = ".qweqew";
        boolean result = Emails.isCorrectService(name);
        boolean expected = false;
        assertThat(result, is(expected));
    }

    @Test
    public void isCorrectName63() {
        String name = "tyuyt.";
        boolean result = Emails.isCorrectService(name);
        boolean expected = false;
        assertThat(result, is(expected));
    }

    @Test
    public void isCorrectName64() {
        String name = "egor.";
        boolean result = Emails.isCorrectService(name);
        boolean expected = false;
        assertThat(result, is(expected));
    }

    @Test
    public void isCorrectName65() {
        String name = "egor#";
        boolean result = Emails.isCorrectService(name);
        boolean expected = false;
        assertThat(result, is(expected));
    }

    @Test
    public void isCorrectName66() {
        String name = "$egor";
        boolean result = Emails.isCorrectService(name);
        boolean expected = false;
        assertThat(result, is(expected));
    }

    @Test
    public void isCorrectName67() {
        String name = "eg$or";
        boolean result = Emails.isCorrectService(name);
        boolean expected = false;
        assertThat(result, is(expected));
    }

    @Test
    public void isCorrectName68() {
        String name = "eg.or";
        boolean result = Emails.isCorrectService(name);
        boolean expected = false;
        assertThat(result, is(expected));
    }

    @Test
    public void isCorrectService1() {
        String service = "";
        boolean result = Emails.isCorrectService(service);
        boolean expected = false;
        assertThat(result, is(expected));
    }

    @Test
    public void isCorrectService2() {
        String service = "..";
        boolean result = Emails.isCorrectService(service);
        boolean expected = false;
        assertThat(result, is(expected));
    }

    @Test
    public void isCorrectService3() {
        String service = "._";
        boolean result = Emails.isCorrectService(service);
        boolean expected = false;
        assertThat(result, is(expected));
    }

    @Test
    public void isCorrectService4() {
        String service = "__";
        boolean result = Emails.isCorrectService(service);
        boolean expected = false;
        assertThat(result, is(expected));
    }

    @Test
    public void isCorrectService5() {
        String service = "_.";
        boolean result = Emails.isCorrectService(service);
        boolean expected = false;
        assertThat(result, is(expected));
    }

    @Test
    public void isCorrectService6() {
        String service = "@@";
        boolean result = Emails.isCorrectService(service);
        boolean expected = false;
        assertThat(result, is(expected));
    }

    @Test
    public void isCorrectService7() {
        String service = "@.";
        boolean result = Emails.isCorrectService(service);
        boolean expected = false;
        assertThat(result, is(expected));
    }

    @Test
    public void isCorrectService8() {
        String service = ".@";
        boolean result = Emails.isCorrectService(service);
        boolean expected = false;
        assertThat(result, is(expected));
    }

    @Test
    public void isCorrectService9() {
        String service = "#!";
        boolean result = Emails.isCorrectService(service);
        boolean expected = false;
        assertThat(result, is(expected));
    }

    @Test
    public void isCorrectService10() {
        String service = "!@";
        boolean result = Emails.isCorrectService(service);
        boolean expected = false;
        assertThat(result, is(expected));
    }

    @Test
    public void isCorrectService11() {
        String service = "a@";
        boolean result = Emails.isCorrectService(service);
        boolean expected = false;
        assertThat(result, is(expected));
    }

    @Test
    public void isCorrectService12() {
        String service = ".A";
        boolean result = Emails.isCorrectService(service);
        boolean expected = false;
        assertThat(result, is(expected));
    }

    @Test
    public void isCorrectService13() {
        String service = "AA";
        boolean result = Emails.isCorrectService(service);
        boolean expected = false;
        assertThat(result, is(expected));
    }

    @Test
    public void isCorrectService14() {
        String service = "aa";
        boolean result = Emails.isCorrectService(service);
        boolean expected = false;
        assertThat(result, is(expected));
    }

    @Test
    public void isCorrectService15() {
        String service = "ad";
        boolean result = Emails.isCorrectService(service);
        boolean expected = false;
        assertThat(result, is(expected));
    }

    @Test
    public void isCorrectService16() {
        String service = "gj";
        boolean result = Emails.isCorrectService(service);
        boolean expected = false;
        assertThat(result, is(expected));
    }

    @Test
    public void isCorrectService17() {
        String service = "zi";
        boolean result = Emails.isCorrectService(service);
        boolean expected = false;
        assertThat(result, is(expected));
    }

    @Test
    public void isCorrectService18() {
        String service = "ae";
        boolean result = Emails.isCorrectService(service);
        boolean expected = false;
        assertThat(result, is(expected));
    }

    @Test
    public void isCorrectService19() {
        String service = "2e";
        boolean result = Emails.isCorrectService(service);
        boolean expected = false;
        assertThat(result, is(expected));
    }

    @Test
    public void isCorrectService20() {
        String service = "bb";
        boolean result = Emails.isCorrectService(service);
        boolean expected = false;
        assertThat(result, is(expected));
    }
    @Test
    public void isCorrectService21() {
        String service = "ag";
        boolean result = Emails.isCorrectService(service);
        boolean expected = false;
        assertThat(result, is(expected));
    }

    @Test
    public void isCorrectService22() {
        String service = "zx";
        boolean result = Emails.isCorrectService(service);
        boolean expected = false;
        assertThat(result, is(expected));
    }

    @Test
    public void isCorrectService23() {
        String service = "zxc.";
        boolean result = Emails.isCorrectService(service);
        boolean expected = false;
        assertThat(result, is(expected));
    }

    @Test
    public void isCorrectService24() {
        String service = "zx.";
        boolean result = Emails.isCorrectService(service);
        boolean expected = false;
        assertThat(result, is(expected));
    }

    @Test
    public void isCorrectService25() {
        String service = "@.@.";
        boolean result = Emails.isCorrectService(service);
        boolean expected = false;
        assertThat(result, is(expected));
    }

    @Test
    public void isCorrectService26() {
        String service = "ru@";
        boolean result = Emails.isCorrectService(service);
        boolean expected = false;
        assertThat(result, is(expected));
    }

    @Test
    public void isCorrectService27() {
        String service = "ru@.ass,s;kdfjsdil";
        boolean result = Emails.isCorrectService(service);
        boolean expected = false;
        assertThat(result, is(expected));
    }

    @Test
    public void isCorrectService28() {
        String service = "asd_assdasdas";
        boolean result = Emails.isCorrectService(service);
        boolean expected = false;
        assertThat(result, is(expected));
    }

    @Test
    public void isCorrectService29() {
        String service = "asd<asdads";
        boolean result = Emails.isCorrectService(service);
        boolean expected = false;
        assertThat(result, is(expected));
    }

    @Test
    public void isCorrectService30() {
        String service = "ghj,qweqwew";
        boolean result = Emails.isCorrectService(service);
        boolean expected = false;
        assertThat(result, is(expected));
    }

    @Test
    public void isCorrectService31() {
        String service = ",asd,asd,asd,as,das,d";
        boolean result = Emails.isCorrectService(service);
        boolean expected = false;
        assertThat(result, is(expected));
    }

    @Test
    public void isCorrectService32() {
        String service = "";
        boolean result = Emails.isCorrectService(service);
        boolean expected = false;
        assertThat(result, is(expected));
    }

    @Test
    public void isCorrectService33() {
        String service = "autodrive_";
        boolean result = Emails.isCorrectService(service);
        boolean expected = false;
        assertThat(result, is(expected));
    }

    @Test
    public void isCorrectService34() {
        String service = "autodrive.";
        boolean result = Emails.isCorrectService(service);
        boolean expected = false;
        assertThat(result, is(expected));
    }

    @Test
    public void isCorrectService35() {
        String service = "socksoc1ker";
        boolean result = Emails.isCorrectService(service);
        boolean expected = false;
        assertThat(result, is(expected));
    }

    @Test
    public void isCorrectService36() {
        String service = "1xxx";
        boolean result = Emails.isCorrectService(service);
        boolean expected = false;
        assertThat(result, is(expected));
    }

    @Test
    public void isCorrectService37() {
        String service = "asDD)qweqew";
        boolean result = Emails.isCorrectService(service);
        boolean expected = false;
        assertThat(result, is(expected));
    }

    @Test
    public void isCorrectService38() {
        String service = "asFasas";
        boolean result = Emails.isCorrectService(service);
        boolean expected = false;
        assertThat(result, is(expected));
    }

    @Test
    public void isCorrectService39() {
        String service = "aspas?";
        boolean result = Emails.isCorrectService(service);
        boolean expected = false;
        assertThat(result, is(expected));
    }

    @Test
    public void isCorrectService40() {
        String service = "asd#asd";
        boolean result = Emails.isCorrectService(service);
        boolean expected = false;
        assertThat(result, is(expected));
    }

    @Test
    public void isCorrectService41() {
        String service = "asd:asd";
        boolean result = Emails.isCorrectService(service);
        boolean expected = false;
        assertThat(result, is(expected));
    }

    @Test
    public void isCorrectService42() {
        String service = "asd:";
        boolean result = Emails.isCorrectService(service);
        boolean expected = false;
        assertThat(result, is(expected));
    }

    @Test
    public void isCorrectService43() {
        String service = "asd;";
        boolean result = Emails.isCorrectService(service);
        boolean expected = false;
        assertThat(result, is(expected));
    }

    @Test
    public void isCorrectService44() {
        String service = "qwerty'";
        boolean result = Emails.isCorrectService(service);
        boolean expected = false;
        assertThat(result, is(expected));
    }

    @Test
    public void isCorrectService45() {
        String service = "asdasasd3";
        boolean result = Emails.isCorrectService(service);
        boolean expected = false;
        assertThat(result, is(expected));
    }

    @Test
    public void isCorrectService46() {
        String service = "1egor";
        boolean result = Emails.isCorrectService(service);
        boolean expected = false;
        assertThat(result, is(expected));
    }

    @Test
    public void isCorrectService47() {
        String service = "yandex2";
        boolean result = Emails.isCorrectService(service);
        boolean expected = false;
        assertThat(result, is(expected));
    }

    @Test
    public void isCorrectService48() {
        String service = "ya2ndex";
        boolean result = Emails.isCorrectService(service);
        boolean expected = false;
        assertThat(result, is(expected));
    }

    @Test
    public void isCorrectService49() {
        String service = "sdasdasdadasdasd9asdasdasdasds";
        boolean result = Emails.isCorrectService(service);
        boolean expected = false;
        assertThat(result, is(expected));
    }

    @Test
    public void isCorrectService50() {
        String service = "asdasdasdas5asdasdasdasdas";
        boolean result = Emails.isCorrectService(service);
        boolean expected = false;
        assertThat(result, is(expected));
    }

    @Test
    public void isCorrectService51() {
        String service = "asdas9asd9asd9as9ad9as9d";
        boolean result = Emails.isCorrectService(service);
        boolean expected = false;
        assertThat(result, is(expected));
    }

    @Test
    public void isCorrectService52() {
        String service = "1sh";
        boolean result = Emails.isCorrectService(service);
        boolean expected = false;
        assertThat(result, is(expected));
    }

    @Test
    public void isCorrectService53() {
        String service = "jh2";
        boolean result = Emails.isCorrectService(service);
        boolean expected = false;
        assertThat(result, is(expected));
    }

    @Test
    public void isCorrectService54() {
        String service = "kk2";
        boolean result = Emails.isCorrectService(service);
        boolean expected = false;
        assertThat(result, is(expected));
    }

    @Test
    public void isCorrectService55() {
        String service = "kk4";
        boolean result = Emails.isCorrectService(service);
        boolean expected = false;
        assertThat(result, is(expected));
    }

    @Test
    public void isCorrectService56() {
        String service = "jg45";
        boolean result = Emails.isCorrectService(service);
        boolean expected = false;
        assertThat(result, is(expected));
    }

    @Test
    public void isCorrectService57() {
        String service = "as888";
        boolean result = Emails.isCorrectService(service);
        boolean expected = false;
        assertThat(result, is(expected));
    }

    @Test
    public void isCorrectService58() {
        String service = "999ds";
        boolean result = Emails.isCorrectService(service);
        boolean expected = false;
        assertThat(result, is(expected));
    }

    @Test
    public void isCorrectService59() {
        String service = "999";
        boolean result = Emails.isCorrectService(service);
        boolean expected = false;
        assertThat(result, is(expected));
    }

    @Test
    public void isCorrectService60() {
        String service = "zxc1";
        boolean result = Emails.isCorrectService(service);
        boolean expected = false;
        assertThat(result, is(expected));
    }

    @Test
    public void isCorrectService61() {
        String service = "zzz8";
        boolean result = Emails.isCorrectService(service);
        boolean expected = false;
        assertThat(result, is(expected));
    }

    @Test
    public void isCorrectService62() {
        String service = "zx2n";
        boolean result = Emails.isCorrectService(service);
        boolean expected = false;
        assertThat(result, is(expected));
    }

    @Test
    public void isCorrectService63() {
        String service = "b5n";
        boolean result = Emails.isCorrectService(service);
        boolean expected = false;
        assertThat(result, is(expected));
    }

    @Test
    public void isCorrectService64() {
        String service = "aaa";
        boolean result = Emails.isCorrectService(service);
        boolean expected = true;
        assertThat(result, is(expected));
    }

    @Test
    public void isCorrectService65() {
        String service = "xyz";
        boolean result = Emails.isCorrectService(service);
        boolean expected = true;
        assertThat(result, is(expected));
    }

    @Test
    public void isCorrectService66() {
        String service = "mnq";
        boolean result = Emails.isCorrectService(service);
        boolean expected = true;
        assertThat(result, is(expected));
    }

    @Test
    public void isCorrectService67() {
        String service = "abs";
        boolean result = Emails.isCorrectService(service);
        boolean expected = true;
        assertThat(result, is(expected));
    }

    @Test
    public void isCorrectService68() {
        String service = "zob";
        boolean result = Emails.isCorrectService(service);
        boolean expected = true;
        assertThat(result, is(expected));
    }

    @Test
    public void isCorrectService69() {
        String service = "ppp";
        boolean result = Emails.isCorrectService(service);
        boolean expected = true;
        assertThat(result, is(expected));
    }

    @Test
    public void isCorrectService70() {
        String service = "mnq";
        boolean result = Emails.isCorrectService(service);
        boolean expected = true;
        assertThat(result, is(expected));
    }

    @Test
    public void isCorrectService71() {
        String service = "yyy";
        boolean result = Emails.isCorrectService(service);
        boolean expected = true;
        assertThat(result, is(expected));
    }

    @Test
    public void isCorrectService72() {
        String service = "yjs";
        boolean result = Emails.isCorrectService(service);
        boolean expected = true;
        assertThat(result, is(expected));
    }

    @Test
    public void isCorrectService73() {
        String service = "poz";
        boolean result = Emails.isCorrectService(service);
        boolean expected = true;
        assertThat(result, is(expected));
    }

    @Test
    public void isCorrectService74() {
        String service = "qfj";
        boolean result = Emails.isCorrectService(service);
        boolean expected = true;
        assertThat(result, is(expected));
    }

    @Test
    public void isCorrectService75() {
        String service = "ljh";
        boolean result = Emails.isCorrectService(service);
        boolean expected = true;
        assertThat(result, is(expected));
    }

    @Test
    public void isCorrectService76() {
        String service = "pjh";
        boolean result = Emails.isCorrectService(service);
        boolean expected = true;
        assertThat(result, is(expected));
    }
    @Test
    public void isCorrectService77() {
        String service = "pqy";
        boolean result = Emails.isCorrectService(service);
        boolean expected = true;
        assertThat(result, is(expected));
    }

    @Test
    public void isCorrectService78() {
        String service = "ppp";
        boolean result = Emails.isCorrectService(service);
        boolean expected = true;
        assertThat(result, is(expected));
    }

    @Test
    public void isCorrectService79() {
        String service = "xxx";
        boolean result = Emails.isCorrectService(service);
        boolean expected = true;
        assertThat(result, is(expected));
    }

    @Test
    public void isCorrectService80() {
        String service = "xxX";
        boolean result = Emails.isCorrectService(service);
        boolean expected = false;
        assertThat(result, is(expected));
    }

    @Test
    public void isCorrectService81() {
        String service = "xXx";
        boolean result = Emails.isCorrectService(service);
        boolean expected = false;
        assertThat(result, is(expected));
    }

    @Test
    public void isCorrectService82() {
        String service = "Xxx";
        boolean result = Emails.isCorrectService(service);
        boolean expected = false;
        assertThat(result, is(expected));
    }

    @Test
    public void isCorrectService83() {
        String service = "asdasdsDxxxx";
        boolean result = Emails.isCorrectService(service);
        boolean expected = false;
        assertThat(result, is(expected));
    }

    @Test
    public void isCorrectService84() {
        String service = "Qxcvdssdf";
        boolean result = Emails.isCorrectService(service);
        boolean expected = false;
        assertThat(result, is(expected));
    }

    @Test
    public void isCorrectService85() {
        String service = "Yandex";
        boolean result = Emails.isCorrectService(service);
        boolean expected = false;
        assertThat(result, is(expected));
    }

    @Test
    public void isCorrectService86() {
        String service = "yandeX";
        boolean result = Emails.isCorrectService(service);
        boolean expected = false;
        assertThat(result, is(expected));
    }

    @Test
    public void isCorrectService87() {
        String service = "Gmail";
        boolean result = Emails.isCorrectService(service);
        boolean expected = false;
        assertThat(result, is(expected));
    }

    @Test
    public void isCorrectService88() {
        String service = "gMail";
        boolean result = Emails.isCorrectService(service);
        boolean expected = false;
        assertThat(result, is(expected));
    }

    @Test
    public void isCorrectService89() {
        String service = "Mail";
        boolean result = Emails.isCorrectService(service);
        boolean expected = false;
        assertThat(result, is(expected));
    }

    @Test
    public void isCorrectService91() {
        String service = "asdjaskjdhaskjdha";
        boolean result = Emails.isCorrectService(service);
        boolean expected = true;
        assertThat(result, is(expected));
    }

    @Test
    public void isCorrectService92() {
        String service = "yandex";
        boolean result = Emails.isCorrectService(service);
        boolean expected = true;
        assertThat(result, is(expected));
    }

    @Test
    public void isCorrectService93() {
        String service = "gmail";
        boolean result = Emails.isCorrectService(service);
        boolean expected = true;
        assertThat(result, is(expected));
    }

    @Test
    public void isCorrectService94() {
        String service = "rambler";
        boolean result = Emails.isCorrectService(service);
        boolean expected = true;
        assertThat(result, is(expected));
    }

    @Test
    public void isCorrectService95() {
        String service = "yahoo";
        boolean result = Emails.isCorrectService(service);
        boolean expected = true;
        assertThat(result, is(expected));
    }

    @Test
    public void isCorrectService96() {
        String service = "mail";
        boolean result = Emails.isCorrectService(service);
        boolean expected = true;
        assertThat(result, is(expected));
    }

    @Test
    public void isCorrectService97() {
        String service = "hotbox";
        boolean result = Emails.isCorrectService(service);
        boolean expected = true;
        assertThat(result, is(expected));
    }

    @Test
    public void isCorrectService98() {
        String service = "asdasgnbvdahsgdva";
        boolean result = Emails.isCorrectService(service);
        boolean expected = true;
        assertThat(result, is(expected));
    }

    @Test
    public void isCorrectService99() {
        String service = "ertieorteirpto";
        boolean result = Emails.isCorrectService(service);
        boolean expected = true;
        assertThat(result, is(expected));
    }

    @Test
    public void isCorrectService100() {
        String service = "popper";
        boolean result = Emails.isCorrectService(service);
        boolean expected = true;
        assertThat(result, is(expected));
    }

    @Test
    public void isCorrectService101() {
        String service = "proper";
        boolean result = Emails.isCorrectService(service);
        boolean expected = true;
        assertThat(result, is(expected));
    }

    @Test
    public void isCorrectService102() {
        String service = "vinyl";
        boolean result = Emails.isCorrectService(service);
        boolean expected = true;
        assertThat(result, is(expected));
    }

    @Test
    public void isCorrectService103() {
        String service = "stas";
        boolean result = Emails.isCorrectService(service);
        boolean expected = true;
        assertThat(result, is(expected));
    }

    @Test
    public void isCorrectService104() {
        String service = "viktor";
        boolean result = Emails.isCorrectService(service);
        boolean expected = true;
        assertThat(result, is(expected));
    }

    @Test
    public void isCorrectService105() {
        String service = "qwerty";
        boolean result = Emails.isCorrectService(service);
        boolean expected = true;
        assertThat(result, is(expected));
    }

    @Test
    public void isCorrectService106() {
        String service = "oiu";
        boolean result = Emails.isCorrectService(service);
        boolean expected = true;
        assertThat(result, is(expected));
    }

    @Test
    public void isCorrectService107() {
        String service = "iop";
        boolean result = Emails.isCorrectService(service);
        boolean expected = true;
        assertThat(result, is(expected));
    }

    @Test
    public void isCorrectService108() {
        String service = "ioip";
        boolean result = Emails.isCorrectService(service);
        boolean expected = true;
        assertThat(result, is(expected));
    }

    @Test
    public void isCorrectService109() {
        String service = "java";
        boolean result = Emails.isCorrectService(service);
        boolean expected = true;
        assertThat(result, is(expected));
    }

    @Test
    public void isCorrectService110() {
        String service = "jobs";
        boolean result = Emails.isCorrectService(service);
        boolean expected = true;
        assertThat(result, is(expected));
    }

    @Test
    public void isCorrectService111() {
        String service = "hhh";
        boolean result = Emails.isCorrectService(service);
        boolean expected = true;
        assertThat(result, is(expected));
    }

    @Test
    public void isCorrectService112() {
        String service = "zyxel";
        boolean result = Emails.isCorrectService(service);
        boolean expected = true;
        assertThat(result, is(expected));
    }

    @Test
    public void isCorrectService113() {
        String service = "zxcvb";
        boolean result = Emails.isCorrectService(service);
        boolean expected = true;
        assertThat(result, is(expected));
    }

    @Test
    public void isCorrectService114() {
        String service = "cvbnn";
        boolean result = Emails.isCorrectService(service);
        boolean expected = true;
        assertThat(result, is(expected));
    }

    @Test
    public void isCorrectService115() {
        String service = "cannabis";
        boolean result = Emails.isCorrectService(service);
        boolean expected = true;
        assertThat(result, is(expected));
    }

    @Test
    public void isCorrectService116() {
        String service = "mari";
        boolean result = Emails.isCorrectService(service);
        boolean expected = true;
        assertThat(result, is(expected));
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