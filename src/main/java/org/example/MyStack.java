package org.example;

import java.util.ArrayList;
import java.util.EmptyStackException;

public class MyStack extends ArrayList {
    private ArrayList<Object> delegate;

    public MyStack() {
        this.delegate = new ArrayList<>();
    }

    public void push(Object item) {
        this.add(item);
    }

    public Object pop() {
        if (isEmpty()) {
            throw new IllegalStateException("Stack is empty");
        }
        return this.remove(this.size() - 1);
    }



}
