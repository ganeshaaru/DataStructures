package com.r.list;

import com.r.basics.linkedlist.Node;

public class MiddleNodeInList<T extends Comparable<T>> {

    public T MiddleOfTheList(Node<T> rootNode) {
        Node<T> fastPointer;
        Node<T> slowPointer;

        if (null == rootNode) {
            return null;
        }

        slowPointer = rootNode;
        fastPointer = rootNode;

        while (fastPointer.getNextNode() != null && fastPointer.getNextNode().getNextNode() != null) {
            fastPointer = fastPointer.getNextNode().getNextNode();
            slowPointer = slowPointer.getNextNode();

        }

        return slowPointer.getData();
    }

}
