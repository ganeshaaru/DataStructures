package com.r.array;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class MostConsecutiveNumberTest {

    private MostConsecutiveNumber testSUT;
    private int[] inputArray;
    private int expectedResult;

    public MostConsecutiveNumberTest(int[] inptArray, int expectedResult) {
        super();
        this.expectedResult = expectedResult;
        this.inputArray = inptArray;
    }

    @Before
    public void initialize() {
        testSUT = new MostConsecutiveNumber();
    }

    @Parameterized.Parameters
    public static Collection input(){
        return Arrays.asList(new Object[][]{
                {new int[]{1,1,0,1}, 2},
                {new int[]{1,1,0,1,1,1}, 3},
                {new int[]{0,1,0,1,1,1,0,1,1,1,1}, 4},
                {new int[]{0,1,0,1,1,1,0,1,-1,1,-1}, 3}
        });
    }

    @Test
    public void testMostConsecutiveNumber(){
        System.out.println("test");
        assertEquals(expectedResult,testSUT.findMaxConsecutiveNumber(inputArray));
    }
}