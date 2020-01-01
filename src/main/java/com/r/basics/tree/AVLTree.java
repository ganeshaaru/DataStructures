package com.r.basics.tree;

import com.r.basics.common.BinaryNode;

public class AVLTree<T extends Comparable<T>> implements Tree<T>
{
    private BinaryNode<T> rootNode;

    @Override
    public void traversal()
    {
        if (null != this.rootNode)
        {
            preOrderTRaversal(this.rootNode);
            //inorderTraversal(this.rootNode);
        }
    }

    private void preOrderTRaversal(BinaryNode<T> node)
    {

        System.out.println(node.printNode());

        if (null != node.getLeftChild())
        {
            preOrderTRaversal(node.getLeftChild());
        }

        if (null != node.getRightChild())
        {
            preOrderTRaversal(node.getRightChild());
        }
    }

    private void inorderTraversal(BinaryNode<T> node)
    {
        if (null != node.getLeftChild())
        {
            inorderTraversal(node.getLeftChild());
        }

        System.out.println(node.printNode());

        if (null != node.getRightChild())
        {
            inorderTraversal(node.getRightChild());
        }

    }

    private int getHeight(BinaryNode<T> node)
    {

        if (null == node)
        {
            return -1;
        }
        return node.getHeight();
    }

    private int calculateBalance(BinaryNode<T> node)
    {
        if (null == node)
        {
            return 0;
        }

        return getHeight(node.getLeftChild()) - getHeight(node.getRightChild());
    }

    private BinaryNode<T> rightRotation(BinaryNode<T> parentNode)
    {
        TreePrinter.printNode(parentNode);
        BinaryNode<T> leftChildNode = parentNode.getLeftChild();
        BinaryNode<T> grandChildNode = leftChildNode.getRightChild();

        parentNode.setLeftChild(grandChildNode);
        leftChildNode.setRightChild(parentNode);


        leftChildNode.setHeight(calculateHeight(leftChildNode));
        parentNode.setHeight(calculateHeight(parentNode));
        TreePrinter.printNode(leftChildNode);
        return leftChildNode;
        //new Parent Node

    }

    private BinaryNode<T> leftRotation(BinaryNode<T> parentNode)
    {
        TreePrinter.printNode(parentNode);
        BinaryNode<T> rightChildNOde = parentNode.getRightChild();
        BinaryNode<T> grandChildNode = rightChildNOde.getLeftChild();

        parentNode.setRightChild(grandChildNode);
        rightChildNOde.setLeftChild(parentNode);

        parentNode.setHeight(calculateHeight(parentNode));
        rightChildNOde.setHeight(calculateHeight(rightChildNOde));
        //new Parent Node
        TreePrinter.printNode(rightChildNOde);
        return rightChildNOde;
    }

    private int calculateHeight(BinaryNode<T> node)
    {
        return Math.max(getHeight(node.getLeftChild()), getHeight(node.getRightChild())) + 1;
    }


    @Override
    public void insert(T item)
    {
        this.rootNode = insertAtNode(item, this.rootNode);
    }


    private BinaryNode<T> insertAtNode(T item, BinaryNode<T> node)
    {
        if (null == node)
        {
            return new BinaryNode<>(item);
        }

        if (isGivenItemLessThanTheNode(item, node))
        {
            node.setLeftChild(insertAtNode(item, node.getLeftChild()));
        } else
        {
            node.setRightChild(insertAtNode(item, node.getRightChild()));
        }

        node.setHeight(calculateHeight(node));

        node = evaluateViolation(node, item);

        return node;
    }

    private BinaryNode<T> evaluateViolation(BinaryNode<T> node, T item)
    {

        int balance = calculateBalance(node);

        if (balance > 1 && node.getLeftChild().getItem().compareTo(item) > 0)
        {
            System.out.println("Left left " + node.printNode() + " Balance : " + balance + " item : " + item);
            return rightRotation(node);
        }

        if (balance < -1 && node.getRightChild().getItem().compareTo(item) < 0)
        {
            System.out.println("right  right " + node.printNode() + " Balance : " + balance + " item : " + item);
            return leftRotation(node);
        }

        if (balance > 1 && node.getLeftChild().getItem().compareTo(item) < 0)
        {
            System.out.println("Left right " + node.printNode() + " Balance : " + balance + " item : " + item);
            node.setLeftChild(leftRotation(node.getLeftChild()));

            return rightRotation(node);
        }

        if (balance < -1 && node.getRightChild().getItem().compareTo(item) > 0)
        {
            System.out.println("right  left " + node.printNode() + " Balance : " + balance + " item : " + item);
            node.setRightChild(rightRotation(node.getRightChild()));

            return leftRotation(node);
        }

        return node;
    }

    private boolean isGivenItemLessThanTheNode(T item, BinaryNode<T> node)
    {
        return node.getItem().compareTo(item) > 0;
    }

    @Override
    public void delete(T item)
    {
        deleteAtNode(this.rootNode, item);
    }

    private BinaryNode<T> deleteAtNode(BinaryNode<T> node, T item)
    {
        if (null != node)
        {
            if (node.getItem().compareTo(item) > 0)
            {
                node.setLeftChild(deleteAtNode(node.getLeftChild(), item));
            } else if (node.getItem().compareTo(item) < 0)
            {
                node.setRightChild(deleteAtNode(node.getRightChild(), item));
            } else if (node.getItem().compareTo(item) == 0)
            {
                if (null != node.getLeftChild() && null != node.getRightChild())
                {
                    BinaryNode<T> predecessor = getPredecessor(node.getLeftChild());
                    T temp = node.getItem();
                    node.setItem(predecessor.getItem());
                    predecessor.setItem(temp);
                    node.setLeftChild(deleteAtNode(node.getLeftChild(), item));
                    return node;
                } else if (null != node.getLeftChild())
                {
                    BinaryNode<T> temp = node.getLeftChild();
                    node.setLeftChild(null);
                    return temp;
                } else if (null != node.getRightChild())
                {
                    BinaryNode<T> temp = node.getRightChild();
                    node.setLeftChild(null);
                    return temp;
                } else
                {
                    return null;
                }
            }

            node.setHeight(calculateHeight(node));

            node = evaluateViolation(node, item);

            return node;
        }
        return null;
    }

    private BinaryNode<T> getPredecessor(BinaryNode<T> node)
    {
        return getRightNode(node);
    }

    private BinaryNode<T> getRightNode(BinaryNode<T> node)
    {
        if (null == node.getRightChild())
        {
            return node;
        }
        return getRightNode(node.getRightChild());
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
        return this.rootNode;
    }
}
