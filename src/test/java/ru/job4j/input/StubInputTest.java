package ru.job4j.input;

import org.junit.Test;

import java.io.IOException;
import java.util.Arrays;

import static org.junit.Assert.*;
import static org.hamcrest.Matchers.is;

/**
 * Test class for class
 * {@code StubInput}
 * @author Geraskin Yegor(yegeraskin13@gmail.com)
 */
public class StubInputTest {
    @Test
    public void askLine1() throws IOException {
        Input input = new StubInput(Arrays.asList(
                "Egor"
        ));
        assertThat(input.askLine(), is("Egor"));
    }

    @Test
    public void askLine2() throws IOException {
        Input input = new StubInput(Arrays.asList(
                "Egor",
                "Ivan"
        ));
        input.askLine();
        assertThat(input.askLine(), is("Ivan"));
    }

    @Test
    public void askLine3() throws IOException {
        Input input = new StubInput(Arrays.asList(
                "Egor",
                "Ivan",
                "Petr",
                "Petr",
                "Alex",
                "Serg"
        ));
        input.askLine();
        input.askLine();
        input.askLine();
        input.askLine();
        assertThat(input.askLine(), is("Alex"));
    }
}