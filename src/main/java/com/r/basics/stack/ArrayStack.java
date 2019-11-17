package com.r.basics.stack;

public class ArrayStack<T> {

    private T[] stack;
    private int noOfItems;

    public ArrayStack() {
        stack = (T[]) new Object[1];
    }

    public int size() {
        return this.noOfItems;
    }

    public void push(T data) {
        this.stack[this.noOfItems++] = data;

        if (noOfItems == this.stack.length) {
            resize(2 * noOfItems);
        }
    }

    private void resize(int capacityNew) {

        T[] stackCopy = (T[]) new Object[capacityNew];

        for (int i = 0; i < this.noOfItems; i++) {
            stackCopy[i] = this.stack[i];
        }
        this.stack = stackCopy;
    }

    public T pop() {
        T popItem = this.stack[--noOfItems];

        if (this.noOfItems > 0 && noOfItems < this.stack.length / 4) {
            resize(this.stack.length / 4);
        }
        return popItem;
    }
}
