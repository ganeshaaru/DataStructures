package com.r.array;

import org.junit.Before;
import org.junit.Test;

public class DuplicatesInAnArrayTest {

    private DuplicatesInAnArray duplicatesInAnArray;

    @Before
    public void setUp() {
        duplicatesInAnArray = new DuplicatesInAnArray();
    }

    @Test
    public void testShouldPrintDuplicatesINArray(){
        DuplicatesInAnArray process = new DuplicatesInAnArray();
        process.findDuplicatesInArray(new int[]{1, 2, 3, 4, 5, 6, 7, 2, 1, 3});
    }

}