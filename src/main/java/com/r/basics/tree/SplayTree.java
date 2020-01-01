package com.r.basics.tree;

import com.r.basics.common.BinaryNode;

public class SplayTree<T extends Comparable<T>> implements Tree<T>
{
    private int size;
    private BinaryNode<T> rootNode;


    @Override
    public void traversal()
    {

    }

    @Override
    public void insert(T item)
    {
            BinaryNode<T> tempNode =  this.rootNode;

    }

    @Override
    public void delete(T item)
    {

    }

    @Override
    public T getMax()
    {
        return null;
    }

    @Override
    public T getMin()
    {
        return null;
    }

    @Override
    public BinaryNode<T> getRoot()
    {
        return null;
    }
}
