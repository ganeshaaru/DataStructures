package com.r.stack;

import java.util.Stack;

public class MaxInStack<T extends Comparable<T>> {

    private Stack<T> mainStack;
    private Stack<T> maxTrackingStack;

    public MaxInStack() {
        this.mainStack = new Stack<>();
        this.maxTrackingStack = new Stack<>();
    }

    public void push(T data) {

        if (this.mainStack.empty()) {
            this.maxTrackingStack.push(data);
        } else {
            System.out.println("-------------------");
            System.out.println(this.maxTrackingStack.peek());
            System.out.println(data);
            System.out.println(this.maxTrackingStack.peek().compareTo(data));
            if (this.maxTrackingStack.peek().compareTo(data) > 0) {
                this.maxTrackingStack.push(this.maxTrackingStack.peek());
            } else {
                this.maxTrackingStack.push(data);
            }
        }

        this.mainStack.push(data);
    }

    public T pop() {
        T data = this.mainStack.pop();
        this.maxTrackingStack.pop();
        return data;
    }

    public T getMax() {
        return this.maxTrackingStack.peek();

    }
}
