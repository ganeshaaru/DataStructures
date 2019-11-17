package com.r.tree;

import com.r.basics.common.BinaryNode;

public class CompareTwoBST<T extends Comparable<T>>
{
    public boolean compare(BinaryNode<T> leftNode, BinaryNode<T> rightNode)
    {
        if (leftNode == null && rightNode == null)
        {
            return true;
        }

        if (null != leftNode && null != rightNode && null != leftNode.getItem() && null != rightNode.getItem() && leftNode.getItem().compareTo(rightNode.getItem()) == 0)
        {
            return compare(leftNode.getLeftChild(), rightNode.getLeftChild()) && compare(leftNode.getRightChild(), rightNode.getRightChild());
        }

        return false;
    }
}
