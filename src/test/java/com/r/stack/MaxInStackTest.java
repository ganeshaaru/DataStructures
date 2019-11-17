package com.r.stack;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MaxInStackTest {

    private MaxInStack<Integer> maxInStackSUT;

    @Before
    public void setUp() throws Exception {
        maxInStackSUT = new MaxInStack<>();
    }

    @Test
    public void testShouldGetMaxFromStack() {
        maxInStackSUT.push(4);
        maxInStackSUT.push(34);
        maxInStackSUT.push(1);

        Integer max =  maxInStackSUT.getMax();

        assert(34 == max);
    }
}