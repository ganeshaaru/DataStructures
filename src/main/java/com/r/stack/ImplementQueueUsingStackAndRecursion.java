package com.r.stack;

import java.util.Stack;

public class ImplementQueueUsingStackAndRecursion<T extends Comparable<T>> {

    Stack<T> stack;

    public ImplementQueueUsingStackAndRecursion() {
        this.stack = new Stack<>();
    }

    public void enqueue(T data) {
        this.stack.push(data);
    }

    public T dequeue() {
        T dequeueItem = null;
        T temp = this.stack.pop();
        if (this.stack.isEmpty()) {
            dequeueItem = temp;
            return dequeueItem;
        } else {
            dequeueItem = dequeue();
            this.stack.push(temp);
        }

        return dequeueItem;
    }

}
