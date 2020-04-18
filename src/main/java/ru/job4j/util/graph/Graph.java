package ru.job4j.util.graph;

import ru.job4j.model.database.Data;

import java.util.ArrayList;
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
        this.numberOfVertex = numberOfVertex;
        vertexes = new ArrayList<>();
        for (int index = 0; index < numberOfVertex; ++index) {
            vertexes.add(new Vertex(index));
        }
    }

    /**
     * Method that add new
     * edge into graph.
     * This type of graph is
     * non-oriented, so
     * we must add two
     * oriented edges
     * into graph:
     * (firstV, secondV)
     * and
     * (secondV, firstV)
     * @param firstVertexIndex - one vertex of new edge
     *                           in this graph
     * @param secondVertexIndex - another vertex of new edge
     *                            in this graph
     */
    public void addEdge(int firstVertexIndex, int secondVertexIndex) {
        vertexes.get(firstVertexIndex).addEdge(
                vertexes.get(secondVertexIndex)
        );
        vertexes.get(secondVertexIndex).addEdge(
                vertexes.get(firstVertexIndex)
        );
    }

    /**
     * <p>
     * Method return
     * "sources {@code array}
     * of graph. We can make
     * this array after
     * compression process.
     * </p><p>
     * Firstly we find
     * connection-components
     * of the graph.
     * </p><p>
     * Next step we put
     * in accordance
     * to each component
     * number of one
     * vertex from
     * this component.
     * </p><p>
     * Next we create
     * {@code array} -
     * for each vertux
     * value in this array will
     * be number of vertux
     * that put in accordance
     * to connected-component
     * of this vertex.
     * </p><p>
     * {@code Array} that we
     * get finally -
     * "source array".
     * We return it
     * @return "source array"
     */
    public int[] getSources() {
        int[] result = new int[numberOfVertex];
        for (int index = 0; index < numberOfVertex; ++index) {
            Vertex vertex = vertexes.get(index);
            if (!vertex.getUsedStatus()) {
                vertex.dfs(vertex);
            }
        }
        for (int index = 0; index < numberOfVertex; ++index) {
            result[0] = vertexes.get(index).getSource().getId();
        }
        return result;
    }
}
