package ru.job4j.util.graph;

import java.util.List;

/**
 * @author Geraskin Yegor(yegeraskin13@gmail.com)
 */
public class Vertex {
    /**
     * Unique id of this
     * vertex in graph.
     */
    private int id;

    /**
     * {@code boolean} value
     * that mark dfs entry
     * to this vertex.
     * If this field "false" -
     * dfs algorithm was not
     * in this vertex.
     * If this field "true" -
     * dfs algorithm was
     * in this vertex
     */
    private boolean usedStatus;

    /**
     * List of edges.
     * In this list - references
     * to all {@code Vertex}
     * object's that have
     * edge with {@code this}
     * vertex
     */
    private List<Vertex> edges;

    /**
     * Reference to vertex -
     * source of connected-
     * component to which
     * this vertex belong
     */
    private Vertex source;

    //TODO JavaDoc
    public Vertex(int id) {
    }
    //TODO JavaDoc
    public int getId() {
        return -1;
    }
    //TODO JavaDoc
    public boolean getUsedStatus() {
        return true;
    }
    //TODO JavaDoc
    public void addEdge(Vertex vertex) {
    }
    //TODO JavaDoc
    public Vertex getSource() {
        return null;
    }
    //TODO JavaDoc
    public void dfs(Vertex source) {
    }
}
