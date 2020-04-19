package ru.job4j.input;

import org.junit.Test;
import ru.job4j.input.exceptions.*;
import ru.job4j.model.database.Data;
import ru.job4j.model.database.util.DataHelper;
import ru.job4j.model.email.Email;
import ru.job4j.model.user.User;
import ru.job4j.model.user.util.Users;

import java.io.IOException;
import java.util.Arrays;

import static org.junit.Assert.*;
import static org.hamcrest.Matchers.is;

/**
 * Test class for interface
 * {@code Input}, that has
 * default realisations
 * of methods
 * @author Geraskin Yegor(yegeraskin13@gmail.com)
 */
public class InputTest {

    @Test
    public void askLine1() throws IOException {
        String line = "";
        Input input = new Input() {
            private Input input = new StubInput(Arrays.asList(
                new String(line)
            ));
            @Override
            public String askLine() throws IOException {
                return input.askLine();
            }
        };
        assertThat(input.askLine(), is(line));
    }

    @Test
    public void askLine2() throws IOException {
        String line = "ssdfasdfsaf";
        Input input = new Input() {
            private Input input = new StubInput(Arrays.asList(
                    new String(line)
            ));
            @Override
            public String askLine() throws IOException {
                return input.askLine();
            }
        };
        assertThat(input.askLine(), is(line));
    }

    @Test
    public void askLine3() throws IOException {
        String line = "";
        Input input = new Input() {
            private Input input = new StubInput(Arrays.asList(
                    new String(line),
                    "qwerty"
            ));
            @Override
            public String askLine() throws IOException {
                return input.askLine();
            }
        };
        input.askLine();
        assertThat(input.askLine(), is("qwerty"));
    }

    @Test
    public void askLine4() throws IOException {
        String line = "";
        Input input = new Input() {
            private Input input = new StubInput(Arrays.asList(
                    new String(line),
                    "qwerty",
                    "zxczxcsgfghhfgh"
            ));
            @Override
            public String askLine() throws IOException {
                return input.askLine();
            }
        };
        input.askLine();
        input.askLine();
        assertThat(input.askLine(), is("zxczxcsgfghhfgh"));
    }

    @Test
    public void askLine5() throws IOException {
        String[] lines = new String[100500];
        for (int i = 0; i < 100500; ++i) {
            lines[i] = "line#" + i;
        }
        Input input = new Input() {
            private Input input = new StubInput(Arrays.asList(
                    lines
            ));
            @Override
            public String askLine() throws IOException {
                return input.askLine();
            }
        };
        for (int i = 0; i < 33333; ++i) {
            input.askLine();
        }
        assertThat(input.askLine(), is(lines[33333]));
    }

    @Test
    public void testAskLineMessage() throws IOException {
        String line = "ssdfasdfsaf";
        Input input = new Input() {
            private Input input = new StubInput(Arrays.asList(
                    new String(line)
            ));
            @Override
            public String askLine() throws IOException {
                return input.askLine();
            }
        };
        assertThat(input.askLine("Enter line: "), is(line));
    }

    @Test
    public void testAskLine1() throws IOException {
        String line = "ssdfasdfsaf";
        Input input = new Input() {
            private Input input = new StubInput(Arrays.asList(
                    new String(line)
            ));
            @Override
            public String askLine() throws IOException {
                return input.askLine();
            }
        };
        assertThat(input.askLine("Enter line: ",
                                 new String[]{
                                         line
                                 }), is(line));
    }

    @Test(expected = InvalidLineException.class)
    public void testAskLine2() throws IOException {
        String line = "ssdfasdfsaf";
        Input input = new Input() {
            private Input input = new StubInput(Arrays.asList(
                    new String(line)
            ));
            @Override
            public String askLine() throws IOException {
                return input.askLine();
            }
        };
        assertThat(input.askLine("Enter line: ",
                new String[]{}), is(line));
    }

    @Test(expected = InvalidLineException.class)
    public void testAskLine3() throws IOException {
        String line = "ssdfasdfsaf";
        Input input = new Input() {
            private Input input = new StubInput(Arrays.asList(
                    new String(line)
            ));
            @Override
            public String askLine() throws IOException {
                return input.askLine();
            }
        };
        assertThat(input.askLine("Enter line: ",
                new String[]{
                        "Alex",
                        "Mike",
                        "Paul"
                }), is(line));
    }

    @Test
    public void testAskLine4() throws IOException {
        String line = "ssdfasdfsaf";
        Input input = new Input() {
            private Input input = new StubInput(Arrays.asList(
                    new String(line)
            ));
            @Override
            public String askLine() throws IOException {
                return input.askLine();
            }
        };
        assertThat(input.askLine("Enter line: ",
                new String[]{
                        "Alex",
                        "Mike",
                        line,
                        "Paul"
                }), is(line));
    }

    @Test
    public void askInt1() throws IOException {
        String line = "5398";
        Input input = new Input() {
            private Input input = new StubInput(Arrays.asList(
                    new String(line)
            ));
            @Override
            public String askLine() throws IOException {
                return input.askLine();
            }
        };
        assertThat(input.askInt(), is(5398));
    }

    @Test(expected = InvalidIntegerException.class)
    public void askInt2() throws IOException {
        String line = "5.398";
        Input input = new Input() {
            private Input input = new StubInput(Arrays.asList(
                    new String(line)
            ));
            @Override
            public String askLine() throws IOException {
                return input.askLine();
            }
        };
        assertThat(input.askInt(), is(5398));
    }

    @Test(expected = InvalidIntegerException.class)
    public void askInt3() throws IOException {
        String line = "egor";
        Input input = new Input() {
            private Input input = new StubInput(Arrays.asList(
                    new String(line)
            ));
            @Override
            public String askLine() throws IOException {
                return input.askLine();
            }
        };
        assertThat(input.askInt(), is(5398));
    }

    @Test
    public void askInt4() throws IOException {
        String line = " 5398";
        Input input = new Input() {
            private Input input = new StubInput(Arrays.asList(
                    new String(line)
            ));
            @Override
            public String askLine() throws IOException {
                return input.askLine();
            }
        };
        assertThat(input.askInt(), is(5398));
    }

    @Test
    public void askInt5() throws IOException {
        String line = "5398 ";
        Input input = new Input() {
            private Input input = new StubInput(Arrays.asList(
                    new String(line)
            ));
            @Override
            public String askLine() throws IOException {
                return input.askLine();
            }
        };
        assertThat(input.askInt(), is(5398));
    }

    @Test
    public void testAskIntMessage1() throws IOException {
        String line = "5398";
        Input input = new Input() {
            private Input input = new StubInput(Arrays.asList(
                    new String(line)
            ));
            @Override
            public String askLine() throws IOException {
                return input.askLine();
            }
        };
        assertThat(input.askInt("Enter number: "), is(5398));
    }

    @Test(expected = InvalidIntegerException.class)
    public void testAskIntMessage2() throws IOException {
        String line = "5 398";
        Input input = new Input() {
            private Input input = new StubInput(Arrays.asList(
                    new String(line)
            ));
            @Override
            public String askLine() throws IOException {
                return input.askLine();
            }
        };
        assertThat(input.askInt("Enter number: "), is(5398));
    }

    @Test
    public void testAskIntMessage3() throws IOException {
        String line = "0";
        Input input = new Input() {
            private Input input = new StubInput(Arrays.asList(
                    new String(line)
            ));
            @Override
            public String askLine() throws IOException {
                return input.askLine();
            }
        };
        assertThat(input.askInt("Enter number: "), is(0));
    }

    @Test
    public void testAskIntMessage4() throws IOException {
        String line = "-1";
        Input input = new Input() {
            private Input input = new StubInput(Arrays.asList(
                    new String(line)
            ));
            @Override
            public String askLine() throws IOException {
                return input.askLine();
            }
        };
        assertThat(input.askInt("Enter number: "), is(-1));
    }

    @Test
    public void testAskIntMessage5() throws IOException {
        String line = "-5398";
        Input input = new Input() {
            private Input input = new StubInput(Arrays.asList(
                    new String(line)
            ));
            @Override
            public String askLine() throws IOException {
                return input.askLine();
            }
        };
        assertThat(input.askInt("Enter number: "), is(-5398));
    }

    @Test
    public void testAskIntMax1() throws IOException {
        String line = "5";
        Input input = new Input() {
            private Input input = new StubInput(Arrays.asList(
                    new String(line)
            ));
            @Override
            public String askLine() throws IOException {
                return input.askLine();
            }
        };
        assertThat(input.askInt(5), is(5));
    }

    @Test
    public void testAskIntMax2() throws IOException {
        String line = "5";
        Input input = new Input() {
            private Input input = new StubInput(Arrays.asList(
                    new String(line)
            ));
            @Override
            public String askLine() throws IOException {
                return input.askLine();
            }
        };
        assertThat(input.askInt(6), is(5));
    }

    @Test(expected = InvalidIntegerException.class)
    public void testAskIntMax3() throws IOException {
        String line = "5";
        Input input = new Input() {
            private Input input = new StubInput(Arrays.asList(
                    new String(line)
            ));
            @Override
            public String askLine() throws IOException {
                return input.askLine();
            }
        };
        assertThat(input.askInt(4), is(5));
    }

    @Test(expected = InvalidIntegerException.class)
    public void testAskIntMax4() throws IOException {
        String line = "0";
        Input input = new Input() {
            private Input input = new StubInput(Arrays.asList(
                    new String(line)
            ));
            @Override
            public String askLine() throws IOException {
                return input.askLine();
            }
        };
        assertThat(input.askInt(4), is(0));
    }

    @Test(expected = InvalidIntegerException.class)
    public void testAskIntMax5() throws IOException {
        String line = "-1";
        Input input = new Input() {
            private Input input = new StubInput(Arrays.asList(
                    new String(line)
            ));
            @Override
            public String askLine() throws IOException {
                return input.askLine();
            }
        };
        assertThat(input.askInt(4), is(-1));
    }

    @Test
    public void testAskIntMessageMax1() throws IOException {
        String line = "5";
        Input input = new Input() {
            private Input input = new StubInput(Arrays.asList(
                    new String(line)
            ));
            @Override
            public String askLine() throws IOException {
                return input.askLine();
            }
        };
        assertThat(input.askInt("Enter number from 1 to 5: ", 5), is(5));
    }

    @Test(expected = InvalidIntegerException.class)
    public void testAskIntMessageMax2() throws IOException {
        String line = "5";
        Input input = new Input() {
            private Input input = new StubInput(Arrays.asList(
                    new String(line)
            ));
            @Override
            public String askLine() throws IOException {
                return input.askLine();
            }
        };
        assertThat(input.askInt("Enter number from 1 to 4: ", 4), is(5));
    }

    @Test
    public void testAskIntMessageAcceptableNumbers1() throws IOException {
        String line = "5";
        Input input = new Input() {
            private Input input = new StubInput(Arrays.asList(
                    new String(line)
            ));
            @Override
            public String askLine() throws IOException {
                return input.askLine();
            }
        };
        assertThat(input.askInt("Enter ID: ", new int[]{
                1, 7, 5, 100, -1
        }), is(5));
    }

    @Test(expected = InvalidIntegerException.class)
    public void testAskIntMessageAcceptableNumbers2() throws IOException {
        String line = "5";
        Input input = new Input() {
            private Input input = new StubInput(Arrays.asList(
                    new String(line)
            ));
            @Override
            public String askLine() throws IOException {
                return input.askLine();
            }
        };
        assertThat(input.askInt("Enter ID: ", new int[]{
                1, 7, 100, -1
        }), is(5));
    }

    @Test
    public void askEmail1() throws IOException {
        String line = "yegeraskin13@gmail.com";
        Input input = new Input() {
            private Input input = new StubInput(Arrays.asList(
                    new String(line)
            ));
            @Override
            public String askLine() throws IOException {
                return input.askLine();
            }
        };
        assertThat(input.askEmail(), is(new Email(line)));
    }

    @Test
    public void askEmail2() throws IOException {
        String line = "geraskin@phystech.edu";
        Input input = new Input() {
            private Input input = new StubInput(Arrays.asList(
                    new String(line)
            ));
            @Override
            public String askLine() throws IOException {
                return input.askLine();
            }
        };
        assertThat(input.askEmail(), is(new Email(line)));
    }

    @Test
    public void askEmail3() throws IOException {
        String line = "petrivanov777@mail.ru";
        Input input = new Input() {
            private Input input = new StubInput(Arrays.asList(
                    new String(line)
            ));
            @Override
            public String askLine() throws IOException {
                return input.askLine();
            }
        };
        assertThat(input.askEmail(), is(new Email(line)));
    }

    @Test(expected = InvalidEmailException.class)
    public void askEmail4() throws IOException {
        String line = "_petrivanov777@mail.ru";
        Input input = new Input() {
            private Input input = new StubInput(Arrays.asList(
                    new String(line)
            ));
            @Override
            public String askLine() throws IOException {
                return input.askLine();
            }
        };
        assertThat(input.askEmail(), is(new Email(line)));
    }

    @Test(expected = InvalidEmailException.class)
    public void askEmail5() throws IOException {
        String line = "petr_ivanov777@mail.ru";
        Input input = new Input() {
            private Input input = new StubInput(Arrays.asList(
                    new String(line)
            ));
            @Override
            public String askLine() throws IOException {
                return input.askLine();
            }
        };
        assertThat(input.askEmail(), is(new Email(line)));
    }

    @Test(expected = InvalidEmailException.class)
    public void askEmail6() throws IOException {
        String line = "petr ivanov777@mail.ru";
        Input input = new Input() {
            private Input input = new StubInput(Arrays.asList(
                    new String(line)
            ));
            @Override
            public String askLine() throws IOException {
                return input.askLine();
            }
        };
        assertThat(input.askEmail(), is(new Email(line)));
    }

    @Test(expected = InvalidEmailException.class)
    public void askEmail7() throws IOException {
        String line = "petrivanov_777@mail.ru";
        Input input = new Input() {
            private Input input = new StubInput(Arrays.asList(
                    new String(line)
            ));
            @Override
            public String askLine() throws IOException {
                return input.askLine();
            }
        };
        assertThat(input.askEmail(), is(new Email(line)));
    }

    @Test(expected = InvalidEmailException.class)
    public void askEmail8() throws IOException {
        String line = "petr_ivanov777@ mail.ru";
        Input input = new Input() {
            private Input input = new StubInput(Arrays.asList(
                    new String(line)
            ));
            @Override
            public String askLine() throws IOException {
                return input.askLine();
            }
        };
        assertThat(input.askEmail(), is(new Email(line)));
    }

    @Test(expected = InvalidEmailException.class)
    public void askEmail9() throws IOException {
        String line = "pe@mail.ru";
        Input input = new Input() {
            private Input input = new StubInput(Arrays.asList(
                    new String(line)
            ));
            @Override
            public String askLine() throws IOException {
                return input.askLine();
            }
        };
        assertThat(input.askEmail(), is(new Email(line)));
    }

    @Test(expected = InvalidEmailException.class)
    public void askEmail10() throws IOException {
        String line = "petr@ma.il.ru";
        Input input = new Input() {
            private Input input = new StubInput(Arrays.asList(
                    new String(line)
            ));
            @Override
            public String askLine() throws IOException {
                return input.askLine();
            }
        };
        assertThat(input.askEmail(), is(new Email(line)));
    }

    @Test(expected = InvalidEmailException.class)
    public void askEmail11() throws IOException {
        String line = "petr@mail.fr";
        Input input = new Input() {
            private Input input = new StubInput(Arrays.asList(
                    new String(line)
            ));
            @Override
            public String askLine() throws IOException {
                return input.askLine();
            }
        };
        assertThat(input.askEmail(), is(new Email(line)));
    }

    @Test
    public void testAskEmailMessage1() throws IOException {
        String line = "yegeraskin13@gmail.com";
        Input input = new Input() {
            private Input input = new StubInput(Arrays.asList(
                    new String(line)
            ));
            @Override
            public String askLine() throws IOException {
                return input.askLine();
            }
        };
        assertThat(input.askEmail("Enter email: "), is(new Email(line)));
    }

    public void testAskEmailMessage2() throws IOException {
        String line = " yegeraskin13@gmail.com";
        Input input = new Input() {
            private Input input = new StubInput(Arrays.asList(
                    new String(line)
            ));
            @Override
            public String askLine() throws IOException {
                return input.askLine();
            }
        };
        assertThat(input.askEmail("Enter email: "), is(new Email(line)));
    }

    @Test
    public void testAskEmailMessageUser1() throws IOException {
        String line = " yegeraskin13@gmail.com";
        Input input = new Input() {
            private Input input = new StubInput(Arrays.asList(
                    new String(line)
            ));
            @Override
            public String askLine() throws IOException {
                return input.askLine();
            }
        };
        User user = new User();
        Users.addEmail(user, new Email("geraskin@phystech.edu"));
        assertThat(input.askEmail("Enter email: ", user), is(new Email("yegeraskin13@gmail.com")));
    }

    @Test(expected = InvalidEmailException.class)
    public void testAskEmailMessageUser2() throws IOException {
        String line = " yegeraskin13@gmail.com";
        Input input = new Input() {
            private Input input = new StubInput(Arrays.asList(
                    new String(line)
            ));
            @Override
            public String askLine() throws IOException {
                return input.askLine();
            }
        };
        User user = new User();
        Users.addEmail(user, new Email("yegeraskin13@gmail.com"));
        assertThat(input.askEmail("Enter email: ", user), is(new Email(line)));
    }

    @Test
    public void askUser1() throws IOException {
        Input input = new Input() {
            private Input input = new StubInput(Arrays.asList(
                    "1",
                    "yegeraskin13@gmail.com"
            ));
            @Override
            public String askLine() throws IOException {
                return input.askLine();
            }
        };
        User result = input.askUser();
        User expected = new User();
        Users.addEmail(expected, new Email("yegeraskin13@gmail.com"));
        assertThat(result.getEmails(), is(expected.getEmails()));
    }

    @Test(expected = InvalidUserException.class)
    public void askUser2() throws IOException {
        Input input = new Input() {
            private Input input = new StubInput(Arrays.asList(
                    "0",
                    "yegeraskin13@gmail.com"
            ));
            @Override
            public String askLine() throws IOException {
                return input.askLine();
            }
        };
        User result = input.askUser();
        User expected = new User();
        Users.addEmail(expected, new Email("yegeraskin13@gmail.com"));
    }

    @Test(expected = InvalidUserException.class)
    public void askUser3() throws IOException {
        Input input = new Input() {
            private Input input = new StubInput(Arrays.asList(
                    "-1",
                    "yegeraskin13@gmail.com"
            ));
            @Override
            public String askLine() throws IOException {
                return input.askLine();
            }
        };
        User result = input.askUser();
        User expected = new User();
        Users.addEmail(expected, new Email("yegeraskin13@gmail.com"));
    }

    @Test(expected = InvalidUserException.class)
    public void askUser4() throws IOException {
        Input input = new Input() {
            private Input input = new StubInput(Arrays.asList(
                    "-3",
                    "yegeraskin13@gmail.com"
            ));
            @Override
            public String askLine() throws IOException {
                return input.askLine();
            }
        };
        User result = input.askUser();
        User expected = new User();
        Users.addEmail(expected, new Email("yegeraskin13@gmail.com"));
    }

    @Test(expected = InvalidUserException.class)
    public void askUser5() throws IOException {
        Input input = new Input() {
            private Input input = new StubInput(Arrays.asList(
                    "-90",
                    "yegeraskin13@gmail.com"
            ));
            @Override
            public String askLine() throws IOException {
                return input.askLine();
            }
        };
        User result = input.askUser();
        User expected = new User();
        Users.addEmail(expected, new Email("yegeraskin13@gmail.com"));
    }

    @Test(expected = InvalidUserException.class)
    public void askUser6() throws IOException {
        Input input = new Input() {
            private Input input = new StubInput(Arrays.asList(
                    "101",
                    "yegeraskin13@gmail.com"
            ));
            @Override
            public String askLine() throws IOException {
                return input.askLine();
            }
        };
        User result = input.askUser();
        User expected = new User();
        Users.addEmail(expected, new Email("yegeraskin13@gmail.com"));
    }

    @Test(expected = InvalidUserException.class)
    public void askUser7() throws IOException {
        Input input = new Input() {
            private Input input = new StubInput(Arrays.asList(
                    "1000",
                    "yegeraskin13@gmail.com"
            ));
            @Override
            public String askLine() throws IOException {
                return input.askLine();
            }
        };
        User result = input.askUser();
        User expected = new User();
        Users.addEmail(expected, new Email("yegeraskin13@gmail.com"));
    }

    @Test(expected = InvalidUserException.class)
    public void askUser8() throws IOException {
        Input input = new Input() {
            private Input input = new StubInput(Arrays.asList(
                    "1000000",
                    "yegeraskin13@gmail.com"
            ));
            @Override
            public String askLine() throws IOException {
                return input.askLine();
            }
        };
        User result = input.askUser();
        User expected = new User();
        Users.addEmail(expected, new Email("yegeraskin13@gmail.com"));
    }

    @Test(expected = InvalidUserException.class)
    public void askUser9() throws IOException {
        Input input = new Input() {
            private Input input = new StubInput(Arrays.asList(
                    "1",
                    "ye_geraskin13@gmail.com"
            ));
            @Override
            public String askLine() throws IOException {
                return input.askLine();
            }
        };
        User result = input.askUser();
        User expected = new User();
        Users.addEmail(expected, new Email("yegeraskin13@gmail.com"));
    }

    @Test(expected = InvalidUserException.class)
    public void askUser10() throws IOException {
        Input input = new Input() {
            private Input input = new StubInput(Arrays.asList(
                    "1",
                    "ye geraskin13@gmail.com"
            ));
            @Override
            public String askLine() throws IOException {
                return input.askLine();
            }
        };
        User result = input.askUser();
        User expected = new User();
        Users.addEmail(expected, new Email("yegeraskin13@gmail.com"));
    }

    @Test(expected = InvalidUserException.class)
    public void askUser11() throws IOException {
        Input input = new Input() {
            private Input input = new StubInput(Arrays.asList(
                    "1",
                    "ye@gmail.com"
            ));
            @Override
            public String askLine() throws IOException {
                return input.askLine();
            }
        };
        User result = input.askUser();
        User expected = new User();
        Users.addEmail(expected, new Email("yegeraskin13@gmail.com"));
    }

    @Test(expected = InvalidUserException.class)
    public void askUser12() throws IOException {
        Input input = new Input() {
            private Input input = new StubInput(Arrays.asList(
                    "1",
                    "yegeraskin@gmail13.com"
            ));
            @Override
            public String askLine() throws IOException {
                return input.askLine();
            }
        };
        User result = input.askUser();
        User expected = new User();
        Users.addEmail(expected, new Email("yegeraskin13@gmail.com"));
    }

    @Test(expected = InvalidUserException.class)
    public void askUser13() throws IOException {
        Input input = new Input() {
            private Input input = new StubInput(Arrays.asList(
                    "1",
                    "yegeraskin13@gmail.linux"
            ));
            @Override
            public String askLine() throws IOException {
                return input.askLine();
            }
        };
        User result = input.askUser();
        User expected = new User();
        Users.addEmail(expected, new Email("yegeraskin13@gmail.com"));
    }

    @Test
    public void askUser14() throws IOException {
        Input input = new Input() {
            private Input input = new StubInput(Arrays.asList(
                    "2",
                    "yegeraskin13@gmail.com",
                    "geraskin@phystech.edu"
            ));
            @Override
            public String askLine() throws IOException {
                return input.askLine();
            }
        };
        User result = input.askUser();
        User expected = new User();
        Users.addEmail(expected, new Email("yegeraskin13@gmail.com"));
        Users.addEmail(expected, new Email("geraskin@phystech.edu"));
        assertThat(result.getEmails(), is(expected.getEmails()));
    }

    @Test(expected = InvalidUserException.class)
    public void askUser15() throws IOException {
        Input input = new Input() {
            private Input input = new StubInput(Arrays.asList(
                    "3",
                    "yegeraskin13@gmail.com",
                    "kukulity898@tytytyt.net",
                    "yegeraskin13@gmail.com"
            ));
            @Override
            public String askLine() throws IOException {
                return input.askLine();
            }
        };
        User result = input.askUser();
        User expected = new User();
        Users.addEmail(expected, new Email("yegeraskin13@gmail.com"));
    }

    @Test
    public void testAskUserMessage1() throws IOException {
        Input input = new Input() {
            private Input input = new StubInput(Arrays.asList(
                    "1",
                    "yegeraskin13@gmail.com"
            ));
            @Override
            public String askLine() throws IOException {
                return input.askLine();
            }
        };
        User result = input.askUser("Enter user: ");
        User expected = new User();
        Users.addEmail(expected, new Email("yegeraskin13@gmail.com"));
        assertThat(result.getEmails(), is(expected.getEmails()));
    }

    @Test(expected = InvalidUserException.class)
    public void testAskUserMessage2() throws IOException {
        Input input = new Input() {
            private Input input = new StubInput(Arrays.asList(
                    "0",
                    "yegeraskin13@gmail.com"
            ));
            @Override
            public String askLine() throws IOException {
                return input.askLine();
            }
        };
        User result = input.askUser("Enter user: ");
        User expected = new User();
        Users.addEmail(expected, new Email("yegeraskin13@gmail.com"));
        assertThat(result, is(expected));
    }

    @Test(expected = InvalidUserException.class)
    public void testAskUserMessage3() throws IOException {
        Input input = new Input() {
            private Input input = new StubInput(Arrays.asList(
                    "101",
                    "yegeraskin13@gmail.com"
            ));
            @Override
            public String askLine() throws IOException {
                return input.askLine();
            }
        };
        User result = input.askUser("Enter user: ");
        User expected = new User();
        Users.addEmail(expected, new Email("yegeraskin13@gmail.com"));
        assertThat(result, is(expected));
    }

    @Test
    public void askData1() throws IOException {
        Input input = new Input() {
            private Input input = new StubInput(Arrays.asList(
                    "1",
                    "1",
                    "yegeraskin13@gmail.com"
            ));
            @Override
            public String askLine() throws IOException {
                return input.askLine();
            }
        };
        Data result = input.askData();
        Data expected = new Data();
        User user = new User();
        Users.addEmail(user, new Email("yegeraskin13@gmail.com"));
        DataHelper.addUser(expected, user);
        assertThat(result.getUserList().get(0).getEmails(),
                is(expected.getUserList().get(0).getEmails()));
    }

    @Test(expected = InvalidDataException.class)
    public void askData4() throws IOException {
        Input input = new Input() {
            private Input input = new StubInput(Arrays.asList(
                    "101",
                    "1",
                    "yegeraskin13@gmail.com"
            ));
            @Override
            public String askLine() throws IOException {
                return input.askLine();
            }
        };
        Data result = input.askData();
        Data expected = new Data();
        User user = new User();
        Users.addEmail(user, new Email("yegeraskin13@gmail.com"));
        DataHelper.addUser(expected, user);
        assertThat(result, is(expected));
    }

    @Test(expected = InvalidDataException.class)
    public void askData5() throws IOException {
        Input input = new Input() {
            private Input input = new StubInput(Arrays.asList(
                    "0",
                    "1",
                    "yegeraskin13@gmail.com"
            ));
            @Override
            public String askLine() throws IOException {
                return input.askLine();
            }
        };
        Data result = input.askData();
        Data expected = new Data();
        User user = new User();
        Users.addEmail(user, new Email("yegeraskin13@gmail.com"));
        DataHelper.addUser(expected, user);
        assertThat(result, is(expected));
    }

    @Test(expected = InvalidDataException.class)
    public void askData6() throws IOException {
        Input input = new Input() {
            private Input input = new StubInput(Arrays.asList(
                    "-5",
                    "1",
                    "yegeraskin13@gmail.com"
            ));
            @Override
            public String askLine() throws IOException {
                return input.askLine();
            }
        };
        Data result = input.askData();
        Data expected = new Data();
        User user = new User();
        Users.addEmail(user, new Email("yegeraskin13@gmail.com"));
        DataHelper.addUser(expected, user);
        assertThat(result, is(expected));
    }

    @Test(expected = InvalidDataException.class)
    public void askData7() throws IOException {
        Input input = new Input() {
            private Input input = new StubInput(Arrays.asList(
                    "1",
                    "101",
                    "yegeraskin13@gmail.com"
            ));
            @Override
            public String askLine() throws IOException {
                return input.askLine();
            }
        };
        Data result = input.askData();
        Data expected = new Data();
        User user = new User();
        Users.addEmail(user, new Email("yegeraskin13@gmail.com"));
        DataHelper.addUser(expected, user);
        assertThat(result, is(expected));
    }

    @Test(expected = InvalidDataException.class)
    public void askData8() throws IOException {
        Input input = new Input() {
            private Input input = new StubInput(Arrays.asList(
                    "1",
                    "0",
                    "yegeraskin13@gmail.com"
            ));
            @Override
            public String askLine() throws IOException {
                return input.askLine();
            }
        };
        Data result = input.askData();
        Data expected = new Data();
        User user = new User();
        Users.addEmail(user, new Email("yegeraskin13@gmail.com"));
        DataHelper.addUser(expected, user);
        assertThat(result, is(expected));
    }

    @Test(expected = InvalidDataException.class)
    public void askData9() throws IOException {
        Input input = new Input() {
            private Input input = new StubInput(Arrays.asList(
                    "1",
                    "-5",
                    "yegeraskin13@gmail.com"
            ));
            @Override
            public String askLine() throws IOException {
                return input.askLine();
            }
        };
        Data result = input.askData();
        Data expected = new Data();
        User user = new User();
        Users.addEmail(user, new Email("yegeraskin13@gmail.com"));
        DataHelper.addUser(expected, user);
        assertThat(result, is(expected));
    }

    @Test(expected = InvalidDataException.class)
    public void askData10() throws IOException {
        Input input = new Input() {
            private Input input = new StubInput(Arrays.asList(
                    "1",
                    "-5",
                    "yegeraskin13@gmail.com"
            ));
            @Override
            public String askLine() throws IOException {
                return input.askLine();
            }
        };
        Data result = input.askData();
        Data expected = new Data();
        User user = new User();
        Users.addEmail(user, new Email("yegeraskin13@gmail.com"));
        DataHelper.addUser(expected, user);
        assertThat(result, is(expected));
    }

    @Test(expected = InvalidDataException.class)
    public void askData11() throws IOException {
        Input input = new Input() {
            private Input input = new StubInput(Arrays.asList(
                    "1",
                    "1",
                    "ye geraskin13@gmail.com"
            ));
            @Override
            public String askLine() throws IOException {
                return input.askLine();
            }
        };
        Data result = input.askData();
        Data expected = new Data();
        User user = new User();
        Users.addEmail(user, new Email("yegeraskin13@gmail.com"));
        DataHelper.addUser(expected, user);
        assertThat(result, is(expected));
    }

    @Test(expected = InvalidDataException.class)
    public void askData12() throws IOException {
        Input input = new Input() {
            private Input input = new StubInput(Arrays.asList(
                    "1",
                    "1",
                    "Yegeraskin13@gmail.com"
            ));
            @Override
            public String askLine() throws IOException {
                return input.askLine();
            }
        };
        Data result = input.askData();
        Data expected = new Data();
        User user = new User();
        Users.addEmail(user, new Email("yegeraskin13@gmail.com"));
        DataHelper.addUser(expected, user);
        assertThat(result, is(expected));
    }

    @Test(expected = InvalidDataException.class)
    public void askData13() throws IOException {
        Input input = new Input() {
            private Input input = new StubInput(Arrays.asList(
                    "1",
                    "1",
                    "ye@gmail.com"
            ));
            @Override
            public String askLine() throws IOException {
                return input.askLine();
            }
        };
        Data result = input.askData();
        Data expected = new Data();
        User user = new User();
        Users.addEmail(user, new Email("yegeraskin13@gmail.com"));
        DataHelper.addUser(expected, user);
        assertThat(result, is(expected));
    }

    @Test(expected = InvalidDataException.class)
    public void askData14() throws IOException {
        Input input = new Input() {
            private Input input = new StubInput(Arrays.asList(
                    "1",
                    "1",
                    "yegeraskin13@gm.com"
            ));
            @Override
            public String askLine() throws IOException {
                return input.askLine();
            }
        };
        Data result = input.askData();
        Data expected = new Data();
        User user = new User();
        Users.addEmail(user, new Email("yegeraskin13@gmail.com"));
        DataHelper.addUser(expected, user);
        assertThat(result, is(expected));
    }

    @Test(expected = InvalidDataException.class)
    public void askData15() throws IOException {
        Input input = new Input() {
            private Input input = new StubInput(Arrays.asList(
                    "1",
                    "1",
                    "yegeraskin13@gmail.mipt"
            ));
            @Override
            public String askLine() throws IOException {
                return input.askLine();
            }
        };
        Data result = input.askData();
        Data expected = new Data();
        User user = new User();
        Users.addEmail(user, new Email("yegeraskin13@gmail.com"));
        DataHelper.addUser(expected, user);
        assertThat(result, is(expected));
    }
}