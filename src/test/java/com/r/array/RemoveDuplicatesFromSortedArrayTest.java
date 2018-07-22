package com.r.array;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class RemoveDuplicatesFromSortedArrayTest {
    private RemoveDuplicatesFromSortedArray testSUT;
    private int[] array;
    private int expected;

    public RemoveDuplicatesFromSortedArrayTest(int[] array, int expected) {
        super();
        this.array = array;
        this.expected = expected;
    }

    @Before
    public void setUp(){
        testSUT=new RemoveDuplicatesFromSortedArray();
    }

    @Parameterized.Parameters
    public static Collection input(){
        return Arrays.asList(new Object[][]{
                {new int[]{1,1,1,2,3,4,5,5,6},6},
                {new int[]{0,1,1,2,2,4,5,5,5},5}
        });
    }

    @Test
    public void test(){
        assertEquals(expected, testSUT.removeDuplicates(array));
    }
}