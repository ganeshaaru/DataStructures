package com.r.tree;

import com.r.basics.tree.BinarySearchTree;
import com.r.basics.tree.Tree;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertFalse;
import static junit.framework.TestCase.assertTrue;

public class CompareTwoBSTTest
{
    private CompareTwoBST<Integer> compareTwoBSTSUT;

    private Tree<Integer> leftTree;
    private Tree<Integer> rightTree;

    @Before
    public void setUp()
    {
        compareTwoBSTSUT = new CompareTwoBST();
        leftTree = new BinarySearchTree<>();

        leftTree.insert(4);
        leftTree.insert(8);
        leftTree.insert(2);
        leftTree.insert(3);

        rightTree = new BinarySearchTree<>();

        rightTree.insert(4);
        rightTree.insert(8);
        rightTree.insert(2);
        rightTree.insert(3);

    }

    @Test
    public void testShouldReturnTrueWhenBSTareSame()
    {
        assertTrue(compareTwoBSTSUT.compare(leftTree.getRoot(), rightTree.getRoot()));
    }

    @Test
    public void testShouldReturnFalseWhenBSTareNotSameByTopology()
    {
        rightTree = new BinarySearchTree<>();

        rightTree.insert(4);
        rightTree.insert(8);
        rightTree.insert(3);
        rightTree.insert(2);


        assertFalse(compareTwoBSTSUT.compare(leftTree.getRoot(), rightTree.getRoot()));
    }

}