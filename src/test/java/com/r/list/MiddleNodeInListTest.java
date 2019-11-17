package com.r.list;

import com.r.basics.linkedlist.LinkedLIst;
import org.junit.Before;
import org.junit.Test;




public class MiddleNodeInListTest {
    private LinkedLIst<String> list;
    private MiddleNodeInList middleNodeInList;

    @Before
    public void setUp() {
         list = new LinkedLIst<>();
        list.insert("A");
        list.insert("B");
        list.insert("C");
        list.insert("D");
        list.insert("E");
    }

    @Test
    public void testShouldReturnMiddleOfTheOddSizeList() {
        middleNodeInList =  new MiddleNodeInList<String>();

        String middle = (String) middleNodeInList.MiddleOfTheList(list.getRoot());
    }

}