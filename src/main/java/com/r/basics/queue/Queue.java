package com.r.basics.queue;

import com.r.basics.common.Node;

import java.util.StringJoiner;

public class Queue<T extends Comparable<T>> {

    private Node<T> firstNode;
    private Node<T> lastNode;
    private int count = 0;

    public boolean isEmpty() {
        return this.firstNode == null;
    }

    public int size() {
        return this.count;
    }

    public void enqueue(T data) {
        Node<T> item = new Node<T>(data);

        if (isEmpty()) {
            this.count++;
            this.firstNode = item;
            this.lastNode = item;
        } else {
            this.lastNode.setNextNode(item);
            this.lastNode = item;
            this.count++;
        }
    }

    public T dequeue() {
        if (this.firstNode != null) {
            Node<T> item = this.firstNode;

            this.firstNode = this.firstNode.getNextNode();
            this.count--;

            if (isEmpty()) {
                this.lastNode = this.lastNode.getNextNode();
            }
            return item.getData();
        }
        return null;
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", Queue.class.getSimpleName() + "[", "]")
                .add("firstNode=" + firstNode)
                .add("lastNode=" + lastNode)
                .add("count=" + count)
                .toString();
    }
}
