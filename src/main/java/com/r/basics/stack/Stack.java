package com.r.basics.stack;

import com.r.basics.common.Node;

public class Stack<T extends Comparable<T>> {

    private Node<T> root;
    private int count;

    public void push(T data) {
        Node<T> node = new Node<>(data);
        if (this.root == null) {
            this.root = node;
        } else {
            node.setNextNode(this.root);
            this.root = node;
        }
        this.count++;
    }

    public T pop() {

        if (null != this.root) {
            Node<T> popNode = this.root;
            this.root = this.root.getNextNode();
            this.count--;
            return popNode.getData();
        }

        return null;
    }

    public T peek() {
        return this.root.getData();
    }


    public int size() {
        return this.count;
    }
}
