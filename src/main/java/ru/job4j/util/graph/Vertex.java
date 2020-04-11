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

    /**
     * Constructor that
     * initialise "id"
     * field
     * @param id - initialise value
     *             for field {@code id}
     */
    public Vertex(int id) {
    }

    /**
     * Getter for field
     * {@code id}
     * @return value of field
     *         {@code id}
     */
    public int getId() {
        return -1;
    }

    /**
     * Getter for field
     * {@code getUsedStatus}
     * @return value of field
     *         {@code getUsedStatus}
     */
    public boolean getUsedStatus() {
        return true;
    }

    /**
     * Add new oriented
     * edge (this, vertex).
     * Add new reference
     * of type {@code Vertex}
     * to edges-list of
     * {@code this} vertex
     * @param vertex - reference of type
     *                 {@code Vertex} that
     *                 we add to {@code this}
     *                 {@code Vertex}
     *                 object's edge-list
     */
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
