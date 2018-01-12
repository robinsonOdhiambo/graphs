package com.thebigcsblog;

/**
 * Created by robinson on 12/01/2018.
 */
public interface Edge<V, W> {
    V getFrom();
    void setFrom(V from);
    W getTo();
    void setTo(W to);
}
