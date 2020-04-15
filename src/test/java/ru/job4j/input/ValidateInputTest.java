package ru.job4j.input;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;
import static org.hamcrest.Matchers.is;

/**
 * Test class for class
 * {@code ValidateInput}
 * @author Geraskin Yegor(yegeraskin13@gmail.com)
 */
public class ValidateInputTest {

    @Test
    public void askLine() {
        Input input = new StubInput(Arrays.asList(
            "kkjjdkfwemwnfmndsbvo23iu4128u3e2erfnadfkv"
        ));
        assertThat(input.askLine(), is("kkjjdkfwemwnfmndsbvo23iu4128u3e2erfnadfkv"));
    }

    @Test
    public void testAskLineMessage() {
        Input input = new StubInput(Arrays.asList(
                "kkjjdkfwemwnfmndsbvo23iu4128u3e2erfnadfkv"
        ));
        assertThat(input.askLine("mesage"), is("kkjjdkfwemwnfmndsbvo23iu4128u3e2erfnadfkv"));
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