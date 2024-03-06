package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;


public class MyStackTest
{
    @Test
    void testPushAndPop() {
        MyStack stack = new MyStack();
        stack.push(1);
        stack.push(2);
        assertEquals(2, stack.pop());
        assertEquals(1, stack.pop());
        assertTrue(stack.isEmpty());
    }
    @Test
    void testPopEmptyStack() {
        MyStack stack = new MyStack();
        assertThrows(IllegalStateException.class, stack::pop);
    }





}
