package com.r.basics.queue;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;


public class QueueTest {
    private Queue<String> queueSUT;

    @Before
    public void setUp(){
            queueSUT =  new Queue<>();
    }

    @Test
    public void testShouldAddItemToQueue(){

        queueSUT.enqueue("IronMan");
        queueSUT.enqueue("BatMan");
        queueSUT.enqueue("SuperMan");

        assertEquals(3, queueSUT.size());
        System.out.println(queueSUT.toString());
    }

    @Test
    public void testShouldRemoveItemFromQueue(){

        queueSUT.enqueue("IronMan");
        queueSUT.enqueue("BatMan");
        queueSUT.enqueue("SuperMan");

        queueSUT.dequeue();
        assertEquals(2, queueSUT.size());
        System.out.println(queueSUT.toString());
    }

    @Test
    public void testShouldRemoveItemFromQueueSafelyWhenSizeIsOne(){

        queueSUT.enqueue("IronMan");
        queueSUT.dequeue();

        assertEquals(0, queueSUT.size());
        assertNull(queueSUT.dequeue());
        System.out.println(queueSUT.toString());
    }


}