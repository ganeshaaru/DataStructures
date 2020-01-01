package com.r.basics.common;

public class BinaryNode<T>
{
    private T item;
    private BinaryNode<T> leftChild;
    private BinaryNode<T> rightChild;
    private BinaryNode<T> parentNode;
    private int height;

    public BinaryNode(T item)
    {
        this.item = item;
        this.height = 0;
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

    public int getHeight()
    {
        return height;
    }

    public void setHeight(int height)
    {
        this.height = height;
    }

    public BinaryNode<T> getParentNode()
    {
        return parentNode;
    }

    public void setParentNode(BinaryNode<T> parentNode)
    {
        this.parentNode = parentNode;
    }

    public String printNode()
    {
        StringBuilder nodeString = new StringBuilder();
        nodeString.append("Node : " + this.getItem() + " ");
        if (null != this.leftChild)
        {
            nodeString.append(" Left : " + this.leftChild.getItem() + " ");
        }

        if (null != this.rightChild)
        {
            nodeString.append(" right  : " + this.rightChild.getItem() + " ");
        }

        nodeString.append(" height  : " + this.height + " ");


        return nodeString.toString();
    }

    @Override
    public String toString()
    {
        return this.getItem().toString();
    }
}
