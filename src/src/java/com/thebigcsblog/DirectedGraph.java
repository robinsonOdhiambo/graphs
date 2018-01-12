package com.thebigcsblog;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * Created by robinson on 12/01/2018.
 */
public class DirectedGraph implements Graph {
    private HashMap<Integer, ArrayList<Edge>> adj = new HashMap<>();

    public void addEdge(Edge edge) {
        int from = edge.getFrom().hashCode();
        adj.putIfAbsent(from, new ArrayList<>());
        adj.get(from).add(edge);
    }

    public Iterable<Edge> adj(int nodeHashCode) {
        if(adj.containsKey(nodeHashCode)) {
            throw new IllegalArgumentException("The node does not exist");
        }

        return adj.get(nodeHashCode);
    }

    public int numberOfEdges() {
        int numOfEdges = 0;
        for(Integer key: adj.keySet()) {
            numOfEdges += adj.get(key).size();
        }

        return numOfEdges;
    }

    public int numberOfNodes() {
        return adj.size();
    }
}
