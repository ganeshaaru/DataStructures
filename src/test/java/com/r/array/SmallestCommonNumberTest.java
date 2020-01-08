package com.r.array;

import org.junit.Test;

import static com.r.array.SmallestCommonNumber.findLeastCommonNumber;
import static org.junit.Assert.*;

public class SmallestCommonNumberTest {
    int[] v1 = new int[]{1, 6, 10, 14, 50};
    int[] v2 = new int[]{-1, 6, 7, 8, 50};
    int[] v3 = new int[]{0, 5, 7, 10, 25, 30, 40, 51};
    @Test
    public void ShouldSuccessfullyReturnSmallestCommonValue(){
        assertEquals(6, (int)findLeastCommonNumber(v1, v2, v3));
    }
}