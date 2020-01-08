package com.r.array;

import org.junit.Test;

import static org.junit.Assert.*;

public class MaxSlidingWindowTest {

    @Test
    public void shouldFindMaxWhileSlidingArray(){
        int[] array = { 1, 2, 3, 1, -2, -1, 7, 8, 9, 10 };
        System.out.println(MaxSlidingWindow.findMaxSlidingWindow(array, 3).toString());
    }

}