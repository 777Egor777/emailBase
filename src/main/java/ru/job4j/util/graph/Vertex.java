package ru.job4j.util.graph;

import java.util.List;

//TODO make Immutable
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

    /**
     * Getter for field
     * {@code source}
     * @return value of field
     *         {@code source}
     */
    public Vertex getSource() {
        return null;
    }

    /**
     * <p>
     * Method start dfs algorithm
     * from this vertex.
     * </p><p>
     * We iterate all edges of
     * this vertex and try to
     * start dfs algorithm from
     * them.
     * </p><p>
     * We can do it only if
     * vertex has {@code false}
     * {@code usedStatus} field.
     * </p><p>
     * We also set {@code source}
     * for all vertex from this
     * connected-component.
     * </p>
     * @param source - vertex that we
     *                 set as source
     *                 vertex to this
     *                 connected-component
     *                 in graph
     */
    public void dfs(Vertex source) {
    }
}
