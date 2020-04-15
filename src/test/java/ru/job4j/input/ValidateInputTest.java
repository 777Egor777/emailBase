package ru.job4j.input;

import org.junit.Test;

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
    public void askInt1() {
        Input input = new StubInput(Arrays.asList(
                "-1000000"
        ));
        assertThat(input.askInt(),is(-1000000));
    }

    @Test
    public void askInt2() {
        Input input = new StubInput(Arrays.asList(
                "-55"
        ));
        assertThat(input.askInt(),is(-55));
    }

    @Test
    public void askInt3() {
        Input input = new StubInput(Arrays.asList(
                "0"
        ));
        assertThat(input.askInt(),is(0));
    }

    @Test
    public void askInt4() {
        Input input = new StubInput(Arrays.asList(
                "1"
        ));
        assertThat(input.askInt(),is(1));
    }

    @Test
    public void askInt5() {
        Input input = new StubInput(Arrays.asList(
                "2"
        ));
        assertThat(input.askInt(),is(2));
    }

    @Test
    public void askInt6() {
        Input input = new StubInput(Arrays.asList(
                "3"
        ));
        assertThat(input.askInt(),is(3));
    }

    @Test
    public void askInt7() {
        Input input = new StubInput(Arrays.asList(
                "7"
        ));
        assertThat(input.askInt(),is(7));
    }

    @Test
    public void askInt8() {
        Input input = new StubInput(Arrays.asList(
                "100"
        ));
        assertThat(input.askInt(),is(100));
    }

    @Test
    public void askInt9() {
        Input input = new StubInput(Arrays.asList(
                "1000000"
        ));
        assertThat(input.askInt(),is(1000000));
    }

    @Test
    public void askInt10() {
        Input input = new StubInput(Arrays.asList(
                " 1000000 "
        ));
        assertThat(input.askInt(),is(1000000));
    }

    @Test
    public void askInt11() {
        Input input = new StubInput(Arrays.asList(
                " 0 "
        ));
        assertThat(input.askInt(),is(0));
    }

    @Test()
    public void askInt12() {
        Input input = new StubInput(Arrays.asList(
                "",
                "-1000000"
        ));
        assertThat(input.askInt(),is(-1000000));
    }

    @Test
    public void askInt13() {
        Input input = new StubInput(Arrays.asList(
                "555,555",
                "-1000000"
        ));
        assertThat(input.askInt(),is(-1000000));
    }

    @Test
    public void askInt14() {
        Input input = new StubInput(Arrays.asList(
                "null",
                "-1000000"
        ));
        assertThat(input.askInt(),is(-1000000));
    }

    @Test
    public void askInt15() {
        Input input = new StubInput(Arrays.asList(
                "10 000",
                "-1000000"
        ));
        assertThat(input.askInt(),is(-1000000));
    }

    @Test
    public void askInt16() {
        Input input = new StubInput(Arrays.asList(
                "yegeraskin13@gmail.com",
                "-1000000"
        ));
        assertThat(input.askInt(),is(-1000000));
    }

    @Test
    public void askInt17() {
        Input input = new StubInput(Arrays.asList(
                "1e",
                "yegeraskin13@gmail.com",
                "-1000000"
        ));
        assertThat(input.askInt(),is(-1000000));
    }

    @Test
    public void askInt18() {
        List<String> list = new ArrayList<>();
        for(int i = 0; i < 100500; ++i) {
            list.add("xxx" + i);
        }
        list.add("49");
        list.add("xxx");
        list.add("were");
        list.add("dhwet");
        Input input = new StubInput(list);
        assertThat(input.askInt(),is(49));
    }

    @Test
    public void testAskIntMessage() {
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