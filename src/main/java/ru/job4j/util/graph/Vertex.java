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
    //TODO JavDoc
    private boolean usedStatus;
    //TODO JavaDoc
    private List<Vertex> edges;
    //TODO JavaDoc
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
