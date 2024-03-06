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



}
