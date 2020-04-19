package ru.job4j;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import ru.job4j.action.StubAction;
import ru.job4j.action.UserAction;
import ru.job4j.input.Input;
import ru.job4j.input.StubInput;
import ru.job4j.model.database.Data;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.StringJoiner;

import static org.junit.Assert.*;
import static org.hamcrest.Matchers.is;

/**
 * Test class for class "StartUI"
 * @author Geraskin Yegor(yegeraskin13@gmail.com)
 */
public class StartUITest {
    private static final PrintStream STDOUT = System.out;
    private static ByteArrayOutputStream baos;

    @Before
    public void beforeTest() {
        baos = new ByteArrayOutputStream();
        System.setOut(new PrintStream(baos));
    }

    @After
    public void afterTest() {
        System.setOut(STDOUT);
    }

    @Test
    public void showMenu1() {
        StartUI ui = new StartUI();
        ui.showMenu(Arrays.asList(
                new StubAction()
        ));
        StringJoiner joiner = new StringJoiner(System.lineSeparator(), "", System.lineSeparator());
        joiner.add("MENU");
        joiner.add("1.STUBACTION");

        String result = baos.toString();
        String expected = joiner.toString();
        assertThat(result, is(expected));
    }

    @Test
    public void showMenu2() {
        StartUI ui = new StartUI();
        ui.showMenu(Arrays.asList(
                new StubAction(),
                new StubAction(),
                new StubAction()
        ));
        StringJoiner joiner = new StringJoiner(System.lineSeparator(), "", System.lineSeparator());
        joiner.add("MENU");
        joiner.add("1.STUBACTION");
        joiner.add("2.STUBACTION");
        joiner.add("3.STUBACTION");

        String result = baos.toString();
        String expected = joiner.toString();
        assertThat(result, is(expected));
    }

    @Test
    public void showMenu3() {
        StartUI ui = new StartUI();
        ui.showMenu(Arrays.asList(
                new StubAction(),
                new StubAction(),
                new StubAction(),
                new StubAction(),
                new StubAction(),
                new StubAction(),
                new StubAction()
        ));
        StringJoiner joiner = new StringJoiner(System.lineSeparator(), "", System.lineSeparator());
        joiner.add("MENU");
        joiner.add("1.STUBACTION");
        joiner.add("2.STUBACTION");
        joiner.add("3.STUBACTION");
        joiner.add("4.STUBACTION");
        joiner.add("5.STUBACTION");
        joiner.add("6.STUBACTION");
        joiner.add("7.STUBACTION");

        String result = baos.toString();
        String expected = joiner.toString();
        assertThat(result, is(expected));
    }

    @Test
    public void showMenu4() {
        StartUI ui = new StartUI();
        List<UserAction> list = new ArrayList<>();
        StringJoiner joiner = new StringJoiner(System.lineSeparator(), "", System.lineSeparator());
        joiner.add("MENU");
        int size = 1020013;
        for (int index = 1; index <= size; ++index) {
            list.add(new StubAction());
            joiner.add(index + ".STUBACTION");
        }
        ui.showMenu(list);
        String result = baos.toString();
        String expected = joiner.toString();
        assertThat(result, is(expected));
    }

    @Test
    public void start1() throws IOException {
        StartUI ui = new StartUI();
        List<UserAction> actions = Arrays.asList(
                new StubAction()
        );
        Input input = new StubInput(Arrays.asList(
                "1"
        ));
        Data data = new Data();
        ui.start(actions, input, data);
        StringJoiner joiner = new StringJoiner(System.lineSeparator(), "", System.lineSeparator());
        joiner.add("MENU");
        joiner.add("1.STUBACTION");
        joiner.add("Enter menu's item number: ");
        joiner.add("===STUBACTION===");
        String result = baos.toString();
        String expected = joiner.toString();
        assertThat(result, is(expected));
    }

    @Test
    public void start2() throws IOException {
        StartUI ui = new StartUI();
        List<UserAction> actions = Arrays.asList(
                new StubAction(),
                new StubAction()
        );
        Input input = new StubInput(Arrays.asList(
                "2"
        ));
        Data data = new Data();
        ui.start(actions, input, data);
        StringJoiner joiner = new StringJoiner(System.lineSeparator(), "", System.lineSeparator());
        joiner.add("MENU");
        joiner.add("1.STUBACTION");
        joiner.add("2.STUBACTION");
        joiner.add("Enter menu's item number: ");
        joiner.add("===STUBACTION===");
        String result = baos.toString();
        String expected = joiner.toString();
        assertThat(result, is(expected));
    }

    @Test
    public void start3() throws IOException {
        StartUI ui = new StartUI();
        List<UserAction> actions = Arrays.asList(
                new StubAction(),
                new StubAction(),
                new StubAction(),
                new StubAction(),
                new StubAction(),
                new StubAction(),
                new StubAction()
        );
        Input input = new StubInput(Arrays.asList(
                "3"
        ));
        Data data = new Data();
        ui.start(actions, input, data);
        StringJoiner joiner = new StringJoiner(System.lineSeparator(), "", System.lineSeparator());
        joiner.add("MENU");
        joiner.add("1.STUBACTION");
        joiner.add("2.STUBACTION");
        joiner.add("3.STUBACTION");
        joiner.add("4.STUBACTION");
        joiner.add("5.STUBACTION");
        joiner.add("6.STUBACTION");
        joiner.add("7.STUBACTION");
        joiner.add("Enter menu's item number: ");
        joiner.add("===STUBACTION===");
        String result = baos.toString();
        String expected = joiner.toString();
        assertThat(result, is(expected));
    }

    @Test
    public void start4() throws IOException {
        StartUI ui = new StartUI();
        List<UserAction> actions = Arrays.asList(
                new StubAction(),
                new StubAction(),
                new StubAction(),
                new StubAction(),
                new StubAction(),
                new StubAction(),
                new StubAction()
        );
        Input input = new StubInput(Arrays.asList(
                "5"
        ));
        Data data = new Data();
        ui.start(actions, input, data);
        StringJoiner joiner = new StringJoiner(System.lineSeparator(), "", System.lineSeparator());
        joiner.add("MENU");
        joiner.add("1.STUBACTION");
        joiner.add("2.STUBACTION");
        joiner.add("3.STUBACTION");
        joiner.add("4.STUBACTION");
        joiner.add("5.STUBACTION");
        joiner.add("6.STUBACTION");
        joiner.add("7.STUBACTION");
        joiner.add("Enter menu's item number: ");
        joiner.add("===STUBACTION===");
        String result = baos.toString();
        String expected = joiner.toString();
        assertThat(result, is(expected));
    }

    @Test
    public void start5() throws IOException {
        StartUI ui = new StartUI();
        List<UserAction> actions = Arrays.asList(
                new StubAction(),
                new StubAction(),
                new StubAction(),
                new StubAction(),
                new StubAction(),
                new StubAction(),
                new StubAction()
        );
        Input input = new StubInput(Arrays.asList(
                "5"
        ));
        Data data = new Data();
        ui.start(actions, input, data);
        StringJoiner joiner = new StringJoiner(System.lineSeparator(), "", System.lineSeparator());
        joiner.add("MENU");
        joiner.add("1.STUBACTION");
        joiner.add("2.STUBACTION");
        joiner.add("3.STUBACTION");
        joiner.add("4.STUBACTION");
        joiner.add("5.STUBACTION");
        joiner.add("6.STUBACTION");
        joiner.add("7.STUBACTION");
        joiner.add("Enter menu's item number: ");
        joiner.add("===STUBACTION===");
        String result = baos.toString();
        String expected = joiner.toString();
        assertThat(result, is(expected));
    }

    @Test
    public void start6() throws IOException {
        StartUI ui = new StartUI();
        List<UserAction> actions = Arrays.asList(
                new StubAction(),
                new StubAction(),
                new StubAction(),
                new StubAction(),
                new StubAction(),
                new StubAction(),
                new StubAction()
        );
        Input input = new StubInput(Arrays.asList(
                "7"
        ));
        Data data = new Data();
        ui.start(actions, input, data);
        StringJoiner joiner = new StringJoiner(System.lineSeparator(), "", System.lineSeparator());
        joiner.add("MENU");
        joiner.add("1.STUBACTION");
        joiner.add("2.STUBACTION");
        joiner.add("3.STUBACTION");
        joiner.add("4.STUBACTION");
        joiner.add("5.STUBACTION");
        joiner.add("6.STUBACTION");
        joiner.add("7.STUBACTION");
        joiner.add("Enter menu's item number: ");
        joiner.add("===STUBACTION===");
        String result = baos.toString();
        String expected = joiner.toString();
        assertThat(result, is(expected));
    }

    @Test
    public void start7() throws IOException {
        StartUI ui = new StartUI();
        List<UserAction> actions = Arrays.asList(
                new StubAction(),
                new StubAction(),
                new StubAction(),
                new StubAction(),
                new StubAction(),
                new StubAction(),
                new StubAction()
        );
        Input input = new StubInput(Arrays.asList(
                "1"
        ));
        Data data = new Data();
        ui.start(actions, input, data);
        StringJoiner joiner = new StringJoiner(System.lineSeparator(), "", System.lineSeparator());
        joiner.add("MENU");
        joiner.add("1.STUBACTION");
        joiner.add("2.STUBACTION");
        joiner.add("3.STUBACTION");
        joiner.add("4.STUBACTION");
        joiner.add("5.STUBACTION");
        joiner.add("6.STUBACTION");
        joiner.add("7.STUBACTION");
        joiner.add("Enter menu's item number: ");
        joiner.add("===STUBACTION===");
        String result = baos.toString();
        String expected = joiner.toString();
        assertThat(result, is(expected));
    }

    @Test
    public void start8() throws IOException {
        StartUI ui = new StartUI();
        List<UserAction> actions = new ArrayList<>();
        StringJoiner joiner = new StringJoiner(System.lineSeparator(), "", System.lineSeparator());
        joiner.add("MENU");
        int size = 1174191;
        for (int index = 1; index <= size; ++index) {
            actions.add(new StubAction());
            joiner.add(index + ".STUBACTION");
        }
        Input input = new StubInput(Arrays.asList(
                "1"
        ));
        Data data = new Data();
        ui.start(actions, input, data);
        joiner.add("Enter menu's item number: ");
        joiner.add("===STUBACTION===");
        String result = baos.toString();
        String expected = joiner.toString();
        assertThat(result, is(expected));
    }

    @Test
    public void start9() throws IOException {
        StartUI ui = new StartUI();
        List<UserAction> actions = new ArrayList<>();
        StringJoiner joiner = new StringJoiner(System.lineSeparator(), "", System.lineSeparator());
        joiner.add("MENU");
        int size = 1174191;
        for (int index = 1; index <= size; ++index) {
            actions.add(new StubAction());
            joiner.add(index + ".STUBACTION");
        }
        Input input = new StubInput(Arrays.asList(
                "100000"
        ));
        Data data = new Data();
        ui.start(actions, input, data);
        joiner.add("Enter menu's item number: ");
        joiner.add("===STUBACTION===");
        String result = baos.toString();
        String expected = joiner.toString();
        assertThat(result, is(expected));
    }

    @Test
    public void start10() throws IOException {
        StartUI ui = new StartUI();
        List<UserAction> actions = new ArrayList<>();
        StringJoiner joiner = new StringJoiner(System.lineSeparator(), "", System.lineSeparator());
        joiner.add("MENU");
        int size = 1174191;
        for (int index = 1; index <= size; ++index) {
            actions.add(new StubAction());
            joiner.add(index + ".STUBACTION");
        }
        Input input = new StubInput(Arrays.asList(
                "" + size
        ));
        Data data = new Data();
        ui.start(actions, input, data);
        joiner.add("Enter menu's item number: ");
        joiner.add("===STUBACTION===");
        String result = baos.toString();
        String expected = joiner.toString();
        assertThat(result, is(expected));
    }
}