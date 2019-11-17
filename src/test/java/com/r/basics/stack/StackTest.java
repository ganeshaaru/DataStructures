package com.r.basics.stack;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class StackTest {

    private Stack<Integer> integerStackSUT;

    @Before
    public void setUp() {

        integerStackSUT = new Stack<>();
    }

    @Test
    public void testShouldPushDataIntoStack() {
        integerStackSUT.push(33);
        integerStackSUT.push(22);
        integerStackSUT.push(44);

        assertEquals(3, integerStackSUT.size());
    }

    @Test
    public void testShouldPopDataFromStack() {
        integerStackSUT.push(33);
        integerStackSUT.push(22);
        integerStackSUT.push(44);

        integerStackSUT.pop();

        assertEquals(2, integerStackSUT.size());
    }

    @Test
    public void testShouldPeekDataFromStack() {
        integerStackSUT.push(33);
        integerStackSUT.push(22);
        integerStackSUT.push(44);

        integerStackSUT.peek();


        assertEquals(44, (int) integerStackSUT.peek());
        assertEquals(3, integerStackSUT.size());
    }


}