package ru.job4j.util.graph;

import ru.job4j.model.database.Data;

import java.util.List;

/**
 * Data model "Graph".
 * This is math model.
 * Graph has n vertex-es
 * and m edges.
 * Each edge connect
 * two vertex-ex of
 * graph.
 * @author Geraskin Yegor(yegeraskin13@gmail.com)
 */
public class Graph {
    /**
     * Integer number,
     * value - number of
     * vertexes in this
     * graph
     */
    private int numberOfVertex;

    /**
     * List of vertex'es
     * of this graph
     */
    private List<Vertex> vertexes;

    /**
     * Constructor of class.
     * Receive single param -
     * number of vertex in
     * graph.
     * Initialise field
     * {@code numberOfVertex}
     * @param numberOfVertex - initialise value
     *                         of field
     *                        {@code numberOfVertex}
     */
    public Graph(int numberOfVertex) {
    }
    //TODO JavDoc
    public void addEdge(int firstVertexIndex, int secondVertexIndex) {
    }
    //TODO JavaDoc
    public int[] getSources() {
        return null;
    }
}
