package ru.job4j.util.graph;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.hamcrest.Matchers.is;

/**
 * Test class for class "Vertex"
 * @author Geraskin Yegor(yegeraskin13@gmail.com)
 */
public class VertexTest {

    @Test
    public void getId1() {
        Vertex vertex = new Vertex(0);
        int result = vertex.getId();
        int expected = 0;
        assertThat(result, is(expected));
    }

    @Test
    public void getId2() {
        Vertex vertex = new Vertex(0);
        vertex = new Vertex(911);
        int result = vertex.getId();
        int expected = 911;
        assertThat(result, is(expected));
    }

    @Test
    public void getUsedStatus1() {
        Vertex vertex = new Vertex(0);
        boolean result = vertex.getUsedStatus();
        boolean expected = false;
        assertThat(result, is(expected));
    }

    @Test
    public void getUsedStatus2() {
        Vertex vertex = new Vertex(0);
        vertex.dfs(vertex);
        boolean result = vertex.getUsedStatus();
        boolean expected = true;
        assertThat(result, is(expected));
    }

    @Test
    public void addEdge() {
    }

    @Test
    public void getSource() {
    }

    @Test
    public void dfs() {
    }
}