package com.r.tree;

import com.r.basics.tree.BinarySearchTree;
import org.junit.Before;
import org.junit.Test;

public class KthLargestElementInBSTTest
{
    private KthLargestElementInBST classUT;
    BinarySearchTree<Integer> bst;

    @Before
    public void setUp(){
        classUT = new KthLargestElementInBST();
        bst =  new BinarySearchTree<>();

        bst.insert(4);
        bst.insert(8);
        bst.insert(2);
        bst.insert(3);
    }

    @Test
    public void test(){
        classUT.findKthSmallestElement(bst, 2);
    }
}