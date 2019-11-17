package com.r.basics.common;

public class BinaryNode<T>
{
    private T item;
    private BinaryNode<T> leftChild;
    private BinaryNode<T> rightChild;

    public BinaryNode(T item)
    {
        this.item = item;
    }

    public T getItem()
    {
        return item;
    }

    public void setItem(T item)
    {
        this.item = item;
    }

    public BinaryNode<T> getLeftChild()
    {
        return leftChild;
    }

    public void setLeftChild(BinaryNode<T> leftChild)
    {
        this.leftChild = leftChild;
    }

    public BinaryNode<T> getRightChild()
    {
        return rightChild;
    }

    public void setRightChild(BinaryNode<T> rightChild)
    {
        this.rightChild = rightChild;
    }

    @Override
    public String toString()
    {
        return this.getItem().toString();
    }
}
