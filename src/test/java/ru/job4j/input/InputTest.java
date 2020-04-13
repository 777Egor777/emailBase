package ru.job4j.input;

import org.junit.Test;
import ru.job4j.input.exceptions.InvalidIntegerException;
import ru.job4j.input.exceptions.InvalidLineException;

import java.util.Arrays;

import static org.junit.Assert.*;
import static org.hamcrest.Matchers.is;

/**
 * Test class for interface
 * {@code Input}, that has
 * default realisations
 * of methods
 * @auhtor Geraskin Yegor(yegeraskin13@gmail.com)
 */
public class InputTest {

    @Test
    public void askLine1() {
        String line = "";
        Input input = new Input() {
            private Input input = new StubInput(Arrays.asList(
                new String(line)
            ));
            @Override
            public String askLine() {
                return input.askLine();
            }
        };
        assertThat(input.askLine(), is(line));
    }

    @Test
    public void askLine2() {
        String line = "ssdfasdfsaf";
        Input input = new Input() {
            private Input input = new StubInput(Arrays.asList(
                    new String(line)
            ));
            @Override
            public String askLine() {
                return input.askLine();
            }
        };
        assertThat(input.askLine(), is(line));
    }

    @Test
    public void askLine3() {
        String line = "";
        Input input = new Input() {
            private Input input = new StubInput(Arrays.asList(
                    new String(line),
                    "qwerty"
            ));
            @Override
            public String askLine() {
                return input.askLine();
            }
        };
        input.askLine();
        assertThat(input.askLine(), is("qwerty"));
    }

    @Test
    public void askLine4() {
        String line = "";
        Input input = new Input() {
            private Input input = new StubInput(Arrays.asList(
                    new String(line),
                    "qwerty",
                    "zxczxcsgfghhfgh"
            ));
            @Override
            public String askLine() {
                return input.askLine();
            }
        };
        input.askLine();
        input.askLine();
        assertThat(input.askLine(), is("zxczxcsgfghhfgh"));
    }

    @Test
    public void askLine5() {
        String[] lines = new String[100500];
        for(int i = 0; i < 100500; ++i) {
            lines[i] = "line#" + i;
        }
        Input input = new Input() {
            private Input input = new StubInput(Arrays.asList(
                    lines
            ));
            @Override
            public String askLine() {
                return input.askLine();
            }
        };
        for(int i = 0; i < 33333; ++i) {
            input.askLine();
        }
        assertThat(input.askLine(), is(lines[33334]));
    }

    @Test
    public void testAskLineMessage() {
        String line = "ssdfasdfsaf";
        Input input = new Input() {
            private Input input = new StubInput(Arrays.asList(
                    new String(line)
            ));
            @Override
            public String askLine() {
                return input.askLine();
            }
        };
        assertThat(input.askLine("Enter line: "), is(line));
    }

    @Test
    public void testAskLine1() {
        String line = "ssdfasdfsaf";
        Input input = new Input() {
            private Input input = new StubInput(Arrays.asList(
                    new String(line)
            ));
            @Override
            public String askLine() {
                return input.askLine();
            }
        };
        assertThat(input.askLine("Enter line: ",
                                 new String[]{
                                         line
                                 }), is(line));
    }

    @Test(expected = InvalidLineException.class)
    public void testAskLine2() {
        String line = "ssdfasdfsaf";
        Input input = new Input() {
            private Input input = new StubInput(Arrays.asList(
                    new String(line)
            ));
            @Override
            public String askLine() {
                return input.askLine();
            }
        };
        assertThat(input.askLine("Enter line: ",
                new String[]{}), is(line));
    }

    @Test(expected = InvalidLineException.class)
    public void testAskLine3() {
        String line = "ssdfasdfsaf";
        Input input = new Input() {
            private Input input = new StubInput(Arrays.asList(
                    new String(line)
            ));
            @Override
            public String askLine() {
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
    public void testAskLine4() {
        String line = "ssdfasdfsaf";
        Input input = new Input() {
            private Input input = new StubInput(Arrays.asList(
                    new String(line)
            ));
            @Override
            public String askLine() {
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
    public void askInt1() {
        String line = "5398";
        Input input = new Input() {
            private Input input = new StubInput(Arrays.asList(
                    new String(line)
            ));
            @Override
            public String askLine() {
                return input.askLine();
            }
        };
        assertThat(input.askInt(), is(5398));
    }

    @Test(expected = InvalidIntegerException.class)
    public void askInt2() {
        String line = "5.398";
        Input input = new Input() {
            private Input input = new StubInput(Arrays.asList(
                    new String(line)
            ));
            @Override
            public String askLine() {
                return input.askLine();
            }
        };
        assertThat(input.askInt(), is(5398));
    }

    @Test(expected = InvalidIntegerException.class)
    public void askInt3() {
        String line = "egor";
        Input input = new Input() {
            private Input input = new StubInput(Arrays.asList(
                    new String(line)
            ));
            @Override
            public String askLine() {
                return input.askLine();
            }
        };
        assertThat(input.askInt(), is(5398));
    }

    @Test
    public void askInt4() {
        String line = " 5398";
        Input input = new Input() {
            private Input input = new StubInput(Arrays.asList(
                    new String(line)
            ));
            @Override
            public String askLine() {
                return input.askLine();
            }
        };
        assertThat(input.askInt(), is(5398));
    }

    @Test
    public void askInt5() {
        String line = "5398 ";
        Input input = new Input() {
            private Input input = new StubInput(Arrays.asList(
                    new String(line)
            ));
            @Override
            public String askLine() {
                return input.askLine();
            }
        };
        assertThat(input.askInt(), is(5398));
    }

    @Test
    public void testAskIntMessage1() {
        String line = "5398";
        Input input = new Input() {
            private Input input = new StubInput(Arrays.asList(
                    new String(line)
            ));
            @Override
            public String askLine() {
                return input.askLine();
            }
        };
        assertThat(input.askInt("Enter number: "), is(5398));
    }

    @Test(expected = InvalidIntegerException.class)
    public void testAskIntMessage2() {
        String line = "5 398";
        Input input = new Input() {
            private Input input = new StubInput(Arrays.asList(
                    new String(line)
            ));
            @Override
            public String askLine() {
                return input.askLine();
            }
        };
        assertThat(input.askInt("Enter number: "), is(5398));
    }

    @Test
    public void testAskIntMessage3() {
        String line = "0";
        Input input = new Input() {
            private Input input = new StubInput(Arrays.asList(
                    new String(line)
            ));
            @Override
            public String askLine() {
                return input.askLine();
            }
        };
        assertThat(input.askInt("Enter number: "), is(0));
    }

    @Test
    public void testAskIntMessage4() {
        String line = "-1";
        Input input = new Input() {
            private Input input = new StubInput(Arrays.asList(
                    new String(line)
            ));
            @Override
            public String askLine() {
                return input.askLine();
            }
        };
        assertThat(input.askInt("Enter number: "), is(-1));
    }

    @Test
    public void testAskIntMessage5() {
        String line = "-5398";
        Input input = new Input() {
            private Input input = new StubInput(Arrays.asList(
                    new String(line)
            ));
            @Override
            public String askLine() {
                return input.askLine();
            }
        };
        assertThat(input.askInt("Enter number: "), is(-5398));
    }

    @Test
    public void testAskIntMax1() {
        String line = "5";
        Input input = new Input() {
            private Input input = new StubInput(Arrays.asList(
                    new String(line)
            ));
            @Override
            public String askLine() {
                return input.askLine();
            }
        };
        assertThat(input.askInt(5), is(5));
    }

    @Test
    public void testAskIntMax2() {
        String line = "5";
        Input input = new Input() {
            private Input input = new StubInput(Arrays.asList(
                    new String(line)
            ));
            @Override
            public String askLine() {
                return input.askLine();
            }
        };
        assertThat(input.askInt(6), is(5));
    }

    @Test(expected = InvalidIntegerException.class)
    public void testAskIntMax3() {
        String line = "5";
        Input input = new Input() {
            private Input input = new StubInput(Arrays.asList(
                    new String(line)
            ));
            @Override
            public String askLine() {
                return input.askLine();
            }
        };
        assertThat(input.askInt(4), is(5));
    }

    @Test(expected = InvalidIntegerException.class)
    public void testAskIntMax4() {
        String line = "0";
        Input input = new Input() {
            private Input input = new StubInput(Arrays.asList(
                    new String(line)
            ));
            @Override
            public String askLine() {
                return input.askLine();
            }
        };
        assertThat(input.askInt(4), is(0));
    }

    @Test(expected = InvalidIntegerException.class)
    public void testAskIntMax5() {
        String line = "-1";
        Input input = new Input() {
            private Input input = new StubInput(Arrays.asList(
                    new String(line)
            ));
            @Override
            public String askLine() {
                return input.askLine();
            }
        };
        assertThat(input.askInt(4), is(-1));
    }

    @Test
    public void testAskInt2() {
    }

    @Test
    public void testAskInt3() {
    }

    @Test
    public void askEmail() {
    }

    @Test
    public void testAskEmail() {
    }

    @Test
    public void testAskEmail1() {
    }

    @Test
    public void askUser() {
    }

    @Test
    public void testAskUser() {
    }

    @Test
    public void askData() {
    }
}