package com.r.basics.tree;

public interface Tree<T extends Comparable<T>>
{
    void traversal();

    void insert(T item);

    void delete(T item);

    T getMax();

    T getMin();
}
