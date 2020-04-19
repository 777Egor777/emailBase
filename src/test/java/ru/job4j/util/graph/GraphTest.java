package ru.job4j.util.graph;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.hamcrest.Matchers.is;

/**
 * Test class for class "Graph"
 * @author Geraskin Yegor(yegeraskin13@gmail.com)
 */
public class GraphTest {

    @Test
    public void addEdge() {
        Graph graph = new Graph(1);
        int[] sources = graph.getSources();
        assertThat(sources[0], is(0));
    }

    @Test
    public void getSources() {
        Graph graph = new Graph(22);
        graph.addEdge(1, 3);
        graph.addEdge(2, 3);
        graph.addEdge(3, 4);
        graph.addEdge(5, 3);
        graph.addEdge(13, 11);
        graph.addEdge(9, 13);
        graph.addEdge(13, 8);
        graph.addEdge(10, 13);
        graph.addEdge(12, 6);
        graph.addEdge(10, 12);
        graph.addEdge(7, 12);
        graph.addEdge(18, 19);
        graph.addEdge(18, 21);
        graph.addEdge(18, 17);
        graph.addEdge(14, 21);
        graph.addEdge(20, 21);
        graph.addEdge(16, 17);
        graph.addEdge(17, 15);
        int[] result = graph.getSources();
        int[] expected = new int[]{
                0,
                1, 1, 1, 1, 1,
                6, 6, 6, 6, 6, 6, 6, 6,
                14, 14, 14, 14, 14, 14, 14, 14
        };
        assertThat(result, is(expected));
    }
}