package com.r.stack;

import java.util.Stack;

public class ImplementQueueUsingStacks<T extends Comparable<T>> {

    private Stack<T> enqueueStack;
    private Stack<T> dequeueStack;

    public ImplementQueueUsingStacks() {
        this.enqueueStack = new Stack<>();
        this.dequeueStack = new Stack<>();
    }

    public void enqueue(T data) {
        enqueueStack.push(data);
    }

    public T dequeue() {
        T item = null;
        if (this.dequeueStack.isEmpty() && !this.enqueueStack.isEmpty()) {
            while (!this.enqueueStack.isEmpty()) {
                this.dequeueStack.push(this.enqueueStack.pop());
            }
        }

        if (!this.dequeueStack.isEmpty()) {
            item = this.dequeueStack.pop();
        }

        return item;
    }
}
