package ru.job4j.util.graph;

import java.util.*;

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
     * <p>Set of all unique edges
     * from {@code edges} list.
     * We need to except
     * duplicates in this list.
     * Firstly we check if
     * vertux contains in this list.
     * If no - we add vertux
     * to set and to list.</p>
     * <p>
     *     Must be initialise with
     *     {@code HashSet} object.
     *     So we will have linear
     *     time and complexity of
     *     program will save as
     *     previous.
     * </p>
     */
    private Set<Vertex> uniqueEdges;

    /**
     * Reference to vertex -
     * source of connected-
     * component to which
     * this vertex belong
     */
    private Vertex source;

    /**
     * <p>
     *     Constructor that
     *     initialise "id"
     *     field.
     * </p>
     * <p>
     *     Initialise
     *     {@code source} field
     *     by {@code this}
     *     object's reference
     * </p>
     * <p>
     *     Initialise
     *     {@code uniqueEdges}
     *     field by
     *     {@code HashSet}
     *     object
     * </p>
     * @param id - initialise value
     *             for field {@code id}
     */
    public Vertex(int id) {
        this.id = id;
        usedStatus = false;
        edges = new ArrayList<>();
        uniqueEdges = new HashSet<>();
        source = this;
    }

    /**
     * Getter for field
     * {@code id}
     * @return value of field
     *         {@code id}
     */
    public int getId() {
        return id;
    }

    /**
     * Getter for field
     * {@code getUsedStatus}
     * @return value of field
     *         {@code getUsedStatus}
     */
    public boolean getUsedStatus() {
        return usedStatus;
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
        if (!uniqueEdges.contains(vertex)) {
            edges.add(vertex);
            uniqueEdges.add(vertex);
        }
    }

    /**
     * Getter for field
     * {@code source}
     * @return value of field
     *         {@code source}
     */
    public Vertex getSource() {
        return source;
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
        this.source = source;
        this.usedStatus = true;
        for (Vertex edge : edges) {
            if (!edge.getUsedStatus()) {
                edge.dfs(source);
            }
        }
    }

    /**
     * Returns a hash code value for the object. This method is
     * supported for the benefit of hash tables such as those provided by
     * {@link HashMap}.
     * <p>
     * The general contract of {@code hashCode} is:
     * <ul>
     * <li>Whenever it is invoked on the same object more than once during
     *     an execution of a Java application, the {@code hashCode} method
     *     must consistently return the same integer, provided no information
     *     used in {@code equals} comparisons on the object is modified.
     *     This integer need not remain consistent from one execution of an
     *     application to another execution of the same application.
     * <li>If two objects are equal according to the {@code equals(Object)}
     *     method, then calling the {@code hashCode} method on each of
     *     the two objects must produce the same integer result.
     * <li>It is <em>not</em> required that if two objects are unequal
     *     according to the {@link Object#equals(Object)}
     *     method, then calling the {@code hashCode} method on each of the
     *     two objects must produce distinct integer results.  However, the
     *     programmer should be aware that producing distinct integer results
     *     for unequal objects may improve the performance of hash tables.
     * </ul>
     *
     * @return a hash code value for this object.
     * @implSpec As far as is reasonably practical, the {@code hashCode} method defined
     * by class {@code Object} returns distinct integers for distinct objects.
     * @see Object#equals(Object)
     * @see System#identityHashCode
     */
    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }

    /**
     * Indicates whether some other object is "equal to" this one.
     * <p>
     * The {@code equals} method implements an equivalence relation
     * on non-null object references:
     * <ul>
     * <li>It is <i>reflexive</i>: for any non-null reference value
     *     {@code x}, {@code x.equals(x)} should return
     *     {@code true}.
     * <li>It is <i>symmetric</i>: for any non-null reference values
     *     {@code x} and {@code y}, {@code x.equals(y)}
     *     should return {@code true} if and only if
     *     {@code y.equals(x)} returns {@code true}.
     * <li>It is <i>transitive</i>: for any non-null reference values
     *     {@code x}, {@code y}, and {@code z}, if
     *     {@code x.equals(y)} returns {@code true} and
     *     {@code y.equals(z)} returns {@code true}, then
     *     {@code x.equals(z)} should return {@code true}.
     * <li>It is <i>consistent</i>: for any non-null reference values
     *     {@code x} and {@code y}, multiple invocations of
     *     {@code x.equals(y)} consistently return {@code true}
     *     or consistently return {@code false}, provided no
     *     information used in {@code equals} comparisons on the
     *     objects is modified.
     * <li>For any non-null reference value {@code x},
     *     {@code x.equals(null)} should return {@code false}.
     * </ul>
     * <p>
     * The {@code equals} method for class {@code Vertex} implements
     * the most discriminating possible equivalence relation on objects;
     * that is, for any non-null reference values {@code x} and
     * {@code y}, this method returns {@code true} if and only
     * if {@code x} and {@code y} has same value of {@code id} field
     * ({@code x.id == y.id} has the value {@code true}).
     * <p>
     * Note that it is generally necessary to override the {@code hashCode}
     * method whenever this method is overridden, so as to maintain the
     * general contract for the {@code hashCode} method, which states
     * that equal objects must have equal hash codes.
     *
     * @param o the reference object with which to compare.
     * @return {@code true} if this object is the same as the obj
     * argument; {@code false} otherwise.
     * @see #hashCode()
     * @see HashMap
     */
    @Override
    public boolean equals(Object o) {
        boolean result = false;
        if (o != null && getClass() == o.getClass()) {
            Vertex vertex = (Vertex) o;
            result = id == vertex.getId();
        }
        return result;
    }
}
