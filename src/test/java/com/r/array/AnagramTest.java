package com.r.array;

import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertTrue;

public class AnagramTest {
    private Anagram anagramSUT;

    @Before
    public void setUp() {
        anagramSUT =  new Anagram();
    }

    @Test
    public void testShouldReturnTrueWhenGivenWordsAreAnagram() {

            assertTrue(anagramSUT.areTheyAnagram("restful", "fluster"));
    }

}