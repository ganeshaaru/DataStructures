package com.r.basics.linkedlist;

public class LinkedLIst<T extends Comparable<T>> implements List<T> {

    private Node<T> root;
    private int sizeOfList = 0;

    @Override
    public void insert(T data) {
        if (null == root) {
            this.root = new Node<>(data);
            this.sizeOfList++;
        } else {
            insertAtBeginning(data);
        }

    }

    private void insertAtBeginning(T data) {
        Node<T> newNode = new Node<T>(data);
        newNode.setNextNode(this.root);
        this.root = newNode;
        this.sizeOfList++;
    }

    public void insertAtEnd(T data, Node<T> node) {

        if (null != node.getNextNode()) {
            insertAtEnd(data, node.getNextNode());
        } else {
            Node<T> newNode = new Node<>(data);
            node.setNextNode(newNode);

        }
    }

    @Override
    public void remove(T data) {

        if (null != this.root) {
            if (this.root.getData().compareTo(data) == 0) {
                this.root = this.root.getNextNode();
                this.sizeOfList--;
            } else {
                remove(data, root, root.getNextNode());
            }

        }

    }

    private void remove(T data, Node<T> previousNode, Node<T> currentNode) {
        if (currentNode != null) {
            if (currentNode.getData().compareTo(data) == 0) {
                previousNode.setNextNode(currentNode.getNextNode());
                System.out.println("Removed");
                this.sizeOfList--;
                System.out.println(this.sizeOfList);
            } else {
                remove(data, currentNode, currentNode.getNextNode());
            }
        }
    }

    @Override
    public void traverseList() {

        if(this.sizeOfList != 0){
            Node<T> currentNode = this.root;

            while(currentNode != null){
                System.out.println(currentNode.getData().toString() );
                currentNode =  currentNode.getNextNode();
            }

        }

    }

    @Override
    public int size() {
        return this.sizeOfList;
    }

    public Node<T> getRoot(){
        return this.root;
    }
}
