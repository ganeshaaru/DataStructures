package com.r.stack;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ImplementQueueUsingStackAndRecursionTest {

    private ImplementQueueUsingStackAndRecursion<Integer> queueSUT;

    @Before
    public void setUp(){
        queueSUT =  new ImplementQueueUsingStackAndRecursion<>();
    }

    @Test
    public  void testShouldEnqueueItemToQueue(){

        queueSUT.enqueue(100);

        assert(queueSUT.dequeue() == 100);
    }
    @Test
    public  void testShouldDequeueItemFromQueue(){

        queueSUT.enqueue(100);
        queueSUT.enqueue(200);
        queueSUT.enqueue(300);

        queueSUT.dequeue();

        assert(queueSUT.dequeue() == 200);
    }
}