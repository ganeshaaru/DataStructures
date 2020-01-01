package com.r.basics.tree;

import org.junit.Before;
import org.junit.Test;

public class BinarySearchTreeTest {

    private BinarySearchTree<Integer> binarySearchTreeSUT;

    @Before
    public void setUp() {
        binarySearchTreeSUT =  new BinarySearchTree<>();
    }

    @Test
    public void testShouldInsertItemToBST(){

        binarySearchTreeSUT.insert(4);
        binarySearchTreeSUT.insert(8);
        binarySearchTreeSUT.insert(2);
        binarySearchTreeSUT.insert(3);

        TreePrinter.printNode(binarySearchTreeSUT.getRoot());
    }

    @Test
    public void testShouldGetMaxItemFromBST(){

        binarySearchTreeSUT.insert(4);
        binarySearchTreeSUT.insert(8);
        binarySearchTreeSUT.insert(2);
        binarySearchTreeSUT.insert(3);

        assert(binarySearchTreeSUT.getMax()  == 8);
    }

    @Test
    public void testShouldGetMinItemFromBST(){

        binarySearchTreeSUT.insert(4);
        binarySearchTreeSUT.insert(8);
        binarySearchTreeSUT.insert(2);
        binarySearchTreeSUT.insert(3);

        assert(binarySearchTreeSUT.getMin()  == 2);
    }
    @Test
    public void testShouldTraverseItemsFromBST(){

        binarySearchTreeSUT.insert(4);
        binarySearchTreeSUT.insert(8);
        binarySearchTreeSUT.insert(2);
        binarySearchTreeSUT.insert(3);

        binarySearchTreeSUT.traversal();
    }

    @Test
    public void testShouldDeleteLeafNOdeItemsFromBST(){

        binarySearchTreeSUT.insert(4);
        binarySearchTreeSUT.insert(8);
        binarySearchTreeSUT.insert(2);
        binarySearchTreeSUT.insert(3);

        binarySearchTreeSUT.traversal();

        binarySearchTreeSUT.delete(3);

        binarySearchTreeSUT.traversal();
    }

    @Test
    public void testShouldDeleteParentNodeWithBothChildrenItemsFromBST(){

        binarySearchTreeSUT.insert(4);
        binarySearchTreeSUT.insert(8);
        binarySearchTreeSUT.insert(2);
        binarySearchTreeSUT.insert(3);

        binarySearchTreeSUT.traversal();

        binarySearchTreeSUT.delete(4);

        binarySearchTreeSUT.traversal();
    }

    @Test
    public void testShouldDeleteParentNodeWithBothChildrenItemsFromBSTWithSuccessor(){

        binarySearchTreeSUT.insert(4);
        binarySearchTreeSUT.insert(8);
        binarySearchTreeSUT.insert(2);
        binarySearchTreeSUT.insert(7);

        binarySearchTreeSUT.traversal();

        binarySearchTreeSUT.delete(4);

        binarySearchTreeSUT.traversal();
    }

    @Test
    public void testShouldDeleteParentNodeWithOneChildrenItemsFromBST(){

        binarySearchTreeSUT.insert(4);
        binarySearchTreeSUT.insert(8);
        binarySearchTreeSUT.insert(2);
        binarySearchTreeSUT.insert(3);

        binarySearchTreeSUT.traversal();

        binarySearchTreeSUT.delete(2);

        binarySearchTreeSUT.traversal();
    }

}