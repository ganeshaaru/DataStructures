package com.r.basics.linkedlist;

import java.util.StringJoiner;

public class Node<T extends Comparable<T>> {

    private T data;
    private Node<T> nextNode;

    public Node(T data) {
        this.data = data;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public Node<T> getNextNode() {
        return nextNode;
    }

    public void setNextNode(Node<T> node) {
        this.nextNode = node;
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", Node.class.getSimpleName() + "[", "]")
                .add("data=" + data)
                .add("nextNode=" + nextNode)
                .toString();
    }

}
