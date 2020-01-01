package com.r.array;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class BinarySearchTest {
    private BinarySearch binarySearchCUT;
    private static final int UNSUCCESSFUL = -1;

    @Before
    public void setUp(){
        binarySearchCUT = new BinarySearch();
    }
    @Test
    public void testShouldReturnUnsuccessfulOnEmptyArray() {
        assertEquals(UNSUCCESSFUL, binarySearchCUT.binSearch(new int[]{}, 0));
    }

    @Test
    public void testShouldReturnUnsuccessfulOnLeftBound() {
        assertEquals(UNSUCCESSFUL, binarySearchCUT.binSearch(new int[]{1, 2, 4, 7, 8, 12, 15, 19, 24, 50, 69, 80, 100}, 0));
    }

    @Test
    public void testShouldReturnUnsuccessfulOnRightBound() {
        assertEquals(UNSUCCESSFUL, binarySearchCUT.binSearch(new int[]{1, 2, 4, 7, 8, 12, 15, 19, 24, 50, 69, 80, 100}, 101));
    }

    @Test
    public void testShouldReturnSuccessfulOnLeftBound() {
        assertEquals(0, binarySearchCUT.binSearch(new int[]{1, 2, 4, 7, 8, 12, 15, 19, 24, 50, 69, 80, 100}, 1));
    }

    @Test
    public void testShouldReturnSuccessfulOnRightBound() {
        assertEquals(12, binarySearchCUT.binSearch(new int[]{1, 2, 4, 7, 8, 12, 15, 19, 24, 50, 69, 80, 100}, 100));
    }
    @Test
    public void testShouldReturnSuccessfulOnMid() {
        assertEquals(7, binarySearchCUT.binSearch(new int[]{1, 2, 4, 7, 8, 12, 15, 19, 24, 50, 69, 80, 100}, 19));
    }

    @Test
    public void testShouldReturnSuccessfulOnMidGreaterThanGivenNumber() {
        assertEquals(5, binarySearchCUT.binSearch(new int[]{1, 2, 4, 7, 8, 12, 15, 19, 24, 50, 69, 80, 100}, 12));
    }

    @Test
    public void testShouldReturnSuccessfulOnMidLesserThanGivenNumber() {
        assertEquals(10, binarySearchCUT.binSearch(new int[]{1, 2, 4, 7, 8, 12, 15, 19, 24, 50, 69, 80, 100}, 69));
    }
}