package org.example;

import java.util.ArrayList;
import java.util.EmptyStackException;

public class MyStack  {
    private ArrayList<Object> delegate;

    public MyStack() {
        this.delegate = new ArrayList<>();
    }

    public void push(Object item) {
        delegate.add(item);
    }

    public Object pop() {
        if (isEmpty()) {
            throw new IllegalStateException("Stack is empty");
        }
        return delegate.remove(delegate.size() - 1);
    }

    public boolean isEmpty() {
        return delegate.isEmpty();
    }

    public int size() {
        return delegate.size();
    }




}
