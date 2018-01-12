package com.thebigcsblog;

/**
 * Created by robinson on 12/01/2018.
 */
public class UnweightedEdge<V, W> implements Edge<V, W> {
    private V from;
    private W to;

    public UnweightedEdge(V from, W to) {
        this.from = from;
        this.to = to;
    }

    public V getFrom() {
        return from;
    }

    public void setFrom(V from) {
        this.from = from;
    }

    public W getTo() {
        return to;
    }

    public void setTo(W to) {
        this.to = to;
    }
}
