package com.r.basics.linkedlist;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;
import static junit.framework.TestCase.assertTrue;

public class LinkedLIstTest {

    @Test
    public void testShouldCreateAndInsertStringsToList() {
        List<String> list =  new LinkedLIst<>();

        list.insert("MeFirst");
        list.insert("MeSecond");
        list.insert("MeThird");

        System.out.println(list.size());
        assertEquals(list.size() , 3);
        list.traverseList();
    }

    @Test
    public void testShouldRemoveItemFromList() {
        List<String> list =  new LinkedLIst<>();

        list.insert("MeFirst");
        list.insert("MeSecond");
        list.insert("MeThird");

        System.out.println(list.size());
        assertEquals(list.size() , 3);
        list.remove("MeFirst");
        System.out.println(list.size());
        assertEquals(2, list.size() );
        list.traverseList();
    }

}