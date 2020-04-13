package ru.job4j.input;

import org.junit.Test;

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
    public void testAskLine() {
    }

    @Test
    public void testAskLine1() {
    }

    @Test
    public void askInt() {
    }

    @Test
    public void testAskInt() {
    }

    @Test
    public void testAskInt1() {
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