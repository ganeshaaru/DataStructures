package com.r.basics.tree;

import com.r.basics.common.BinaryNode;

public interface Tree<T extends Comparable<T>>
{
    void traversal();

    void insert(T item);

    void delete(T item);

    T getMax();

    T getMin();

    BinaryNode<T> getRoot();
}
