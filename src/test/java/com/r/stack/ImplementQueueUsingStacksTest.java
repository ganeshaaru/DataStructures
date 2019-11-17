package com.r.stack;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ImplementQueueUsingStacksTest {

    private ImplementQueueUsingStacks<Integer> queueSUT;

    @Before
    public void setUp() throws Exception {
        queueSUT = new ImplementQueueUsingStacks<>();
    }

    @Test
    public void testShouldEnqueueItemToQueue(){
        queueSUT.enqueue(100);

        assert(queueSUT.dequeue() == 100);
    }
    @Test
    public void testShouldDequeueItemFromQueueWhenDequeueStackIsEmpty(){
        queueSUT.enqueue(100);
        queueSUT.enqueue(200);
        queueSUT.enqueue(300);

        assert(queueSUT.dequeue() == 100);
    }

    @Test
    public void testShouldDequeueItemFromQueueWhenDequeueStackIsNotEmpty(){
        queueSUT.enqueue(100);
        queueSUT.enqueue(200);
        queueSUT.enqueue(300);

        queueSUT.dequeue();

        assert(queueSUT.dequeue() == 200);
    }

}