package com.thebigcsblog;

/**
 * Created by robinson on 12/01/2018.
 */
public class WeightedEdge<V, W> implements Edge<V, W> {
    private V from;
    private W to;
    private double weight;

    public WeightedEdge(V from, W to, double weight) {
        this.from = from;
        this.to = to;
        this.weight = weight;
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

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
}
