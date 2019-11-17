package com.r.basics.stack;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ArrayStackTest {
    private ArrayStack<Integer> arrayStackSUT;

    @Before
    public void setUp() {
        arrayStackSUT = new ArrayStack<>();
    }

    @Test
    public void testShouldPushItemToStack() {
        arrayStackSUT.push(22);
        arrayStackSUT.push(23);
        arrayStackSUT.push(24);
        arrayStackSUT.push(25);

        assertEquals(4, arrayStackSUT.size());
    }

    @Test
    public void testShouldPopItemFromStack() {


        arrayStackSUT.push(22);
        arrayStackSUT.push(23);
        arrayStackSUT.push(24);
        arrayStackSUT.push(25);

        arrayStackSUT.pop();

        assertEquals(3, arrayStackSUT.size());

    }

}