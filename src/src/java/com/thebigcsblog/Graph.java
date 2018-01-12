package com.thebigcsblog;

/**
 * Created by robinson on 08/01/2018.
 */
public interface Graph {
    void addEdge(Edge edge);
    Iterable<Edge> adj(int nodeHashCode);
    int numberOfEdges();
    int numberOfNodes();
}
