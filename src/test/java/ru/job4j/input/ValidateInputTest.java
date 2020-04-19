package ru.job4j.input;

import org.junit.Test;
import ru.job4j.model.database.Data;
import ru.job4j.model.database.util.DataHelper;
import ru.job4j.model.email.Email;
import ru.job4j.model.user.User;
import ru.job4j.model.user.util.Users;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;
import static org.hamcrest.Matchers.is;

/**
 * Test class for class
 * {@code ValidateInput}
 * @author Geraskin Yegor(yegeraskin13@gmail.com)
 */
public class ValidateInputTest {

    @Test
    public void askLine() throws IOException {
        Input input = new ValidateInput(new StubInput(Arrays.asList(
            "kkjjdkfwemwnfmndsbvo23iu4128u3e2erfnadfkv"
        )));
        assertThat(input.askLine(), is("kkjjdkfwemwnfmndsbvo23iu4128u3e2erfnadfkv"));
    }

    @Test
    public void testAskLineMessage() throws IOException {
        Input input = new ValidateInput(new StubInput(Arrays.asList(
                "kkjjdkfwemwnfmndsbvo23iu4128u3e2erfnadfkv"
        )));
        assertThat(input.askLine("mesage"), is("kkjjdkfwemwnfmndsbvo23iu4128u3e2erfnadfkv"));
    }

    @Test
    public void askInt1() throws IOException {
        Input input = new ValidateInput(new StubInput(Arrays.asList(
                "-1000000"
        )));
        assertThat(input.askInt(), is(-1000000));
    }

    @Test
    public void askInt2() throws IOException {
        Input input = new ValidateInput(new StubInput(Arrays.asList(
                "-55"
        )));
        assertThat(input.askInt(), is(-55));
    }

    @Test
    public void askInt3() throws IOException {
        Input input = new ValidateInput(new StubInput(Arrays.asList(
                "0"
        )));
        assertThat(input.askInt(), is(0));
    }

    @Test
    public void askInt4() throws IOException {
        Input input = new ValidateInput(new StubInput(Arrays.asList(
                "1"
        )));
        assertThat(input.askInt(), is(1));
    }

    @Test
    public void askInt5() throws IOException {
        Input input = new ValidateInput(new StubInput(Arrays.asList(
                "2"
        )));
        assertThat(input.askInt(), is(2));
    }

    @Test
    public void askInt6() throws IOException {
        Input input = new ValidateInput(new StubInput(Arrays.asList(
                "3"
        )));
        assertThat(input.askInt(), is(3));
    }

    @Test
    public void askInt7() throws IOException {
        Input input = new ValidateInput(new StubInput(Arrays.asList(
                "7"
        )));
        assertThat(input.askInt(), is(7));
    }

    @Test
    public void askInt8() throws IOException {
        Input input = new ValidateInput(new StubInput(Arrays.asList(
                "100"
        )));
        assertThat(input.askInt(), is(100));
    }

    @Test
    public void askInt9() throws IOException {
        Input input = new ValidateInput(new StubInput(Arrays.asList(
                "1000000"
        )));
        assertThat(input.askInt(), is(1000000));
    }

    @Test
    public void askInt10() throws IOException {
        Input input = new ValidateInput(new StubInput(Arrays.asList(
                " 1000000 "
        )));
        assertThat(input.askInt(), is(1000000));
    }

    @Test
    public void askInt11() throws IOException {
        Input input = new ValidateInput(new StubInput(Arrays.asList(
                " 0 "
        )));
        assertThat(input.askInt(), is(0));
    }

    @Test()
    public void askInt12() throws IOException {
        Input input = new ValidateInput(new StubInput(Arrays.asList(
                "",
                "-1000000"
                )));
        assertThat(input.askInt(), is(-1000000));
    }

    @Test
    public void askInt13() throws IOException {
        Input input = new ValidateInput(new StubInput(Arrays.asList(
                "555,555",
                "-1000000"
        )));
        assertThat(input.askInt(), is(-1000000));
    }

    @Test
    public void askInt14() throws IOException {
        Input input = new ValidateInput(new StubInput(Arrays.asList(
                "null",
                "-1000000"
        )));
        assertThat(input.askInt(), is(-1000000));
    }

    @Test
    public void askInt15() throws IOException {
        Input input = new ValidateInput(new StubInput(Arrays.asList(
                "10 000",
                "-1000000"
        )));
        assertThat(input.askInt(), is(-1000000));
    }

    @Test
    public void askInt16() throws IOException {
        Input input = new ValidateInput(new StubInput(Arrays.asList(
                "yegeraskin13@gmail.com",
                "-1000000"
        )));
        assertThat(input.askInt(), is(-1000000));
    }

    @Test
    public void askInt17() throws IOException {
        Input input = new ValidateInput(new StubInput(Arrays.asList(
                "1e",
                "yegeraskin13@gmail.com",
                "-1000000"
        )));
        assertThat(input.askInt(), is(-1000000));
    }

    @Test
    public void askInt18() throws IOException {
        List<String> list = new ArrayList<>();
        for (int i = 0; i < 100500; ++i) {
            list.add("xxx" + i);
        }
        list.add("49");
        list.add("xxx");
        list.add("were");
        list.add("dhwet");
        Input input = new ValidateInput(new StubInput(list));
        assertThat(input.
                askInt(), is(49));
    }

    @Test
    public void testAskIntMessage() throws IOException {
        Input input = new ValidateInput(new StubInput(Arrays.asList(
                "-1000000"
        )));
        assertThat(input.askInt("Enter number:"), is(-1000000));
    }

    @Test
    public void testAskIntMax1() throws IOException {
        Input input = new ValidateInput(new StubInput(Arrays.asList(
                "1"
        )));
        assertThat(input.askInt(1), is(1));
    }

    @Test
    public void testAskIntMax2() throws IOException {
        Input input = new ValidateInput(new StubInput(Arrays.asList(
                "1"
        )));
        assertThat(input.askInt(2), is(1));
    }

    @Test
    public void testAskIntMax3() throws IOException {
        Input input = new ValidateInput(new StubInput(Arrays.asList(
                "2"
        )));
        assertThat(input.askInt(2), is(2));
    }

    @Test
    public void testAskIntMax4() throws IOException {
        Input input = new ValidateInput(new StubInput(Arrays.asList(
                " 1  "
        )));
        assertThat(input.askInt(1), is(1));
    }


    @Test
    public void testAskIntMax5() throws IOException {
        Input input = new ValidateInput(new StubInput(Arrays.asList(
                "2"
        )));
        assertThat(input.askInt(3), is(2));
    }


    @Test
    public void testAskIntMax6() throws IOException {
        Input input = new ValidateInput(new StubInput(Arrays.asList(
                "1"
        )));
        assertThat(input.askInt(3), is(1));
    }


    @Test
    public void testAskIntMax7() throws IOException {
        Input input = new ValidateInput(new StubInput(Arrays.asList(
                "3"
        )));
        assertThat(input.askInt(3), is(3));
    }


    @Test
    public void testAskIntMax8() throws IOException {
        Input input = new ValidateInput(new StubInput(Arrays.asList(
                "7"
        )));
        assertThat(input.askInt(7), is(7));
    }

    @Test
    public void testAskIntMax9() throws IOException {
        Input input = new ValidateInput(new StubInput(Arrays.asList(
                "5"
        )));
        assertThat(input.askInt(7), is(5));
    }

    @Test
    public void testAskIntMax10() throws IOException {
        Input input = new ValidateInput(new StubInput(Arrays.asList(
                "3"
        )));
        assertThat(input.askInt(7), is(3));
    }

    @Test
    public void testAskIntMax11() throws IOException {
        Input input = new ValidateInput(new StubInput(Arrays.asList(
                "2"
        )));
        assertThat(input.askInt(7), is(2));
    }

    @Test
    public void testAskIntMax12() throws IOException {
        Input input = new ValidateInput(new StubInput(Arrays.asList(
                "1"
        )));
        assertThat(input.askInt(7), is(1));
    }

    @Test
    public void testAskIntMax13() throws IOException {
        Input input = new ValidateInput(new StubInput(Arrays.asList(
                "0",
                "1"
        )));
        assertThat(input.askInt(7), is(1));
    }

    @Test
    public void testAskIntMax14() throws IOException {
        Input input = new ValidateInput(new StubInput(Arrays.asList(
                "-1",
                "1"
        )));
        assertThat(input.askInt(7), is(1));
    }

    @Test
    public void testAskIntMax15() throws IOException {
        Input input = new ValidateInput(new StubInput(Arrays.asList(
                "-7",
                "1"
        )));
        assertThat(input.askInt(7), is(1));
    }

    @Test
    public void testAskIntMax16() throws IOException {
        Input input = new ValidateInput(new StubInput(Arrays.asList(
                "-11",
                "49",
                "3"
        )));
        assertThat(input.askInt(7), is(3));
    }

    @Test
    public void testAskIntMessageMax() throws IOException {
        Input input = new ValidateInput(new StubInput(Arrays.asList(
                "-11",
                "49",
                "3"
        )));
        assertThat(input.askInt("message", 7), is(3));
    }

    @Test
    public void testAskIntMessageAcceptableNumbers1() throws IOException {
        Input input = new ValidateInput(new StubInput(Arrays.asList(
                "1"
        )));
        int[] numbers = new int[]{
                1,
                2,
                3
        };
        assertThat(input.askInt("message", numbers), is(1));
    }

    @Test
    public void testAskIntMessageAcceptableNumbers3() throws IOException {
        Input input = new ValidateInput(new StubInput(Arrays.asList(
                "3"
        )));
        int[] numbers = new int[]{
                1,
                2,
                3
        };
        assertThat(input.askInt("message", numbers), is(3));
    }

    @Test
    public void testAskIntMessageAcceptableNumbers4() throws IOException {
        Input input = new ValidateInput(new StubInput(Arrays.asList(
                "49",
                "7",
                "asdasasdsa",
                "yegeraskin13@gmail.com",
                "2",
                "4",
                "7",
                "1",
                "3"
        )));
        int[] numbers = new int[]{
                1,
                5,
                13
        };
        assertThat(input.askInt("message: ", numbers), is(1));
    }

    @Test
    public void testAskIntMessageAcceptableNumbers6() throws IOException {
        Input input = new ValidateInput(new StubInput(Arrays.asList(
                "49",
                "7",
                "asdasasdsa",
                "yegeraskin13@gmail.com",
                "2",
                "13",
                "4",
                "5",
                "7",
                "1",
                "3"
        )));
        int[] numbers = new int[]{
                1,
                5,
                13
        };
        assertThat(input.askInt("message", numbers), is(13));
    }

    @Test
    public void testAskIntMessageAcceptableNumbers5() throws IOException {
        Input input = new ValidateInput(new StubInput(Arrays.asList(
                "49",
                "7",
                "asdasasdsa",
                "yegeraskin13@gmail.com",
                "2",
                "4",
                "5",
                "7",
                "1",
                "3"
        )));
        int[] numbers = new int[]{
                1,
                5,
                13
        };
        assertThat(input.askInt("message", numbers), is(5));
    }

    @Test
    public void testAskIntMessageAcceptableNumbers2() throws IOException {
        Input input = new ValidateInput(new StubInput(Arrays.asList(
                "2"
        )));
        int[] numbers = new int[]{
                1,
                2,
                3
        };
        assertThat(input.askInt("message", numbers), is(2));
    }

    @Test
    public void askEmail1() throws IOException {
        Input input = new ValidateInput(new StubInput(Arrays.asList(
                "barsik99@yahoo.com"
        )));
        Email result = input.askEmail();
        Email expected = new Email("barsik99@yahoo.com");

        assertThat(result, is(expected));
    }

    @Test
    public void askEmail2() throws IOException {
        Input input = new ValidateInput(new StubInput(Arrays.asList(
                "Barsik99@yahoo.com",
                "barsik99@yahoo.com"
        )));
        Email result = input.askEmail();
        Email expected = new Email("barsik99@yahoo.com");

        assertThat(result, is(expected));
    }

    @Test
    public void askEmail3() throws IOException {
        Input input = new ValidateInput(new StubInput(Arrays.asList(
                "barsik99@ yahoo.com",
                "barsik99@yahoo.com"
        )));
        Email result = input.askEmail();
        Email expected = new Email("barsik99@yahoo.com");

        assertThat(result, is(expected));
    }

    @Test
    public void askEmail4() throws IOException {
        Input input = new ValidateInput(new StubInput(Arrays.asList(
                "ba.rsik99@ ahoo.com",
                "barsik99@yahoo.com"
        )));
        Email result = input.askEmail();
        Email expected = new Email("barsik99@yahoo.com");

        assertThat(result, is(expected));
    }

    @Test
    public void askEmail5() throws IOException {
        Input input = new ValidateInput(new StubInput(Arrays.asList(
                "ba.rsik99@yahoo.com",
                "b@rsik99@yahoo.com",
                "barsik99@yahoo.com"
        )));
        Email result = input.askEmail();
        Email expected = new Email("barsik99@yahoo.com");

        assertThat(result, is(expected));
    }

    @Test
    public void askEmail6() throws IOException {
        Input input = new ValidateInput(new StubInput(Arrays.asList(
                "",
                "",
                "zxc",
                "",
                "barsik99@yahoo.com",
                "qwe"
        )));
        Email result = input.askEmail();
        Email expected = new Email("barsik99@yahoo.com");

        assertThat(result, is(expected));
    }

    @Test
    public void testAskEmailMessage() throws IOException {
        Input input = new ValidateInput(new StubInput(Arrays.asList(
                "ba.rsik99@yahoo.com",
                "Barsik99@yahoo.com",
                "barsik99@yahoo99.com",
                "barsik99@yahoo.entire",
                "b@rsik99@yahoo.com",
                "barsik99@yahoo.com"
        )));
        Email result = input.askEmail("Enter email: ");
        Email expected = new Email("barsik99@yahoo.com");

        assertThat(result, is(expected));
    }

    @Test
    public void testAskEmailMessageUser1() throws IOException {
        Input input = new ValidateInput(new StubInput(Arrays.asList(
                "barsik99@yahoo.com"
        )));
        User user = new User();
        Email result = input.askEmail("Enter email: ", user);
        Email expected = new Email("barsik99@yahoo.com");

        assertThat(result, is(expected));
    }

    @Test
    public void testAskEmailMessageUser2() throws IOException {
        Input input = new ValidateInput(new StubInput(Arrays.asList(
                "barsik99@yahoo.com",
                "yegeraskin13@gmail.com"
        )));
        User user = new User();
        Users.addEmail(user, new Email("barsik99@yahoo.com"));
        Email result = input.askEmail("Enter email: ", user);
        Email expected = new Email("yegeraskin13@gmail.com");

        assertThat(result, is(expected));
    }

    @Test
    public void askUser1() throws IOException {
        Input input = new ValidateInput(new StubInput(Arrays.asList(
                "1",
                "yegeraskin13@gmail.com"
        )));
        User result = input.askUser();
        User expected = new User();
        Users.addEmail(expected, new Email("yegeraskin13@gmail.com"));
        assertThat(result.getEmails(), is(expected.getEmails()));
    }

    @Test
    public void askUser2() throws IOException {
        Input input = new ValidateInput(new StubInput(Arrays.asList(
                "101",
                "0",
                "500",
                "1000",
                "-10",
                " 1 ",
                "yegeraskin13@gmail.com"
        )));
        User result = input.askUser();
        User expected = new User();
        Users.addEmail(expected, new Email("yegeraskin13@gmail.com"));
        assertThat(result.getEmails(), is(expected.getEmails()));
    }

    @Test
    public void testAskUserMessage() throws IOException {
        Input input = new ValidateInput(new StubInput(Arrays.asList(
                "1",
                "kolyabaksov@rambler.net"
        )));
        User result = input.askUser("message");
        User expected = new User();
        Users.addEmail(expected, new Email("kolyabaksov@rambler.net"));
        assertThat(result.getEmails(), is(expected.getEmails()));
    }
}