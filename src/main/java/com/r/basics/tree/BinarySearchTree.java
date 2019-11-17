package com.r.basics.tree;

import com.r.basics.common.BinaryNode;

public class BinarySearchTree<T extends Comparable<T>> implements Tree<T>
{

    private BinaryNode<T> rootNode;

    public BinarySearchTree()
    {
        //Default Constructor
    }


    @Override
    public void traversal()
    {
        if (null != this.rootNode)
        {
            traverseNode(this.rootNode);
        }

    }

    private void traverseNode(BinaryNode<T> node)
    {
        if (null != node.getLeftChild())
        {
            traverseNode(node.getLeftChild());
        }

        System.out.println(node.toString());

        if (null != node.getRightChild())
        {
            traverseNode(node.getRightChild());
        }
    }

    @Override
    public void insert(T item)
    {
        if (null == this.rootNode)
        {
            this.rootNode = new BinaryNode<>(item);
        } else
        {
            insertAtNode(item, this.rootNode);
        }


    }

    private void insertAtNode(T item, BinaryNode<T> node)
    {
        if (isGivenItemLessThanTheNode(item, node) >= 0)
        {
            if (null == node.getLeftChild())
            {
                node.setLeftChild(new BinaryNode<>(item));
            } else
            {
                insertAtNode(item, node.getLeftChild());
            }
        } else
        {
            if (null == node.getRightChild())
            {
                node.setRightChild(new BinaryNode<>(item));
            } else
            {
                insertAtNode(item, node.getRightChild());
            }
        }
    }

    private int isGivenItemLessThanTheNode(T item, BinaryNode<T> node)
    {
        return node.getItem().compareTo(item);
    }

    @Override
    public void delete(T item)
    {
        if (null != this.rootNode)
        {
            BinaryNode<T> deletedNode = deleteAtNode(this.rootNode, item);
        }
    }

    private BinaryNode<T> deleteAtNode(BinaryNode<T> node, T item)
    {
        if (null != node)
        {
            if (item.compareTo(node.getItem()) > 0)
            {
                System.out.println("delete right");
                node.setRightChild(deleteAtNode(node.getRightChild(), item));
                return node;
            } else if (item.compareTo(node.getItem()) < 0)
            {
                System.out.println("delete left");
                node.setLeftChild(deleteAtNode(node.getLeftChild(), item));
                return node;
            } else if (item.compareTo(node.getItem()) == 0)
            {

                if (null == node.getLeftChild() && null == node.getRightChild())
                {
                    node = null;
                    return null;
                } else if (null == node.getLeftChild())
                {
                    System.out.println("Removing right child");
                    BinaryNode<T> replacingNode = node.getRightChild();
                    node = null;//remove reference
                    return replacingNode;

                } else if (null == node.getRightChild())
                {
                    System.out.println("Removing left child");
                    BinaryNode<T> replacingNode = node.getLeftChild();
                    node = null;//remove reference
                    return replacingNode;
                } else
                {
                    System.out.println("Removing item with 2 child");
                    BinaryNode<T> replacingNode;
                    if (null != getRightNode(node.getLeftChild()))
                    {
                        BinaryNode<T> predecessorNode = getRightNode(node.getLeftChild());
                        node.setItem(predecessorNode.getItem());
                        node.setLeftChild(deleteAtNode(node.getLeftChild(), predecessorNode.getItem()));
                        replacingNode = predecessorNode;
                    } else if (null != getLeftNode(node.getRightChild()))
                    {
                        BinaryNode<T> successorNode = getLeftNode(node.getRightChild());
                        node.setItem(successorNode.getItem());
                        node.setRightChild(deleteAtNode(node.getRightChild(), successorNode.getItem()));
                        replacingNode= successorNode;
                    } else
                    {
                        replacingNode = node;
                        node.setItem(node.getLeftChild().getItem());
                        node.setLeftChild(null);
                    }
                    return replacingNode;
                }

            }
        }
        return null;
    }

    @Override
    public T getMax()
    {
        if (null != this.rootNode)
        {
            BinaryNode<T> maxNode = getRightNode(this.rootNode);
            return maxNode.getItem();
        }
        return null;
    }

    private BinaryNode getRightNode(BinaryNode<T> node)
    {
        if (null == node.getRightChild())
        {
            return node;
        } else
        {
            return getRightNode(node.getRightChild());
        }

    }

    private BinaryNode<T> getLeftNode(BinaryNode<T> node)
    {
        if (null == node.getLeftChild())
        {
            return node;
        } else
        {
            return getLeftNode(node.getLeftChild());
        }

    }

    @Override
    public T getMin()
    {
        if (null != this.rootNode)
        {
            BinaryNode<T> minNode = getLeftNode(this.rootNode);
            return minNode.getItem();
        }
        return null;
    }
}
