package com.r.basics.tree;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class AVLTreeTest
{

    private AVLTree<Integer> avlTreeKlassUT;

    @Before
    public void setUp(){
        avlTreeKlassUT =  new AVLTree<>();
    }

    @Test
    public void testShoudl(){
        avlTreeKlassUT.insert(10);
        avlTreeKlassUT.insert(20);
        avlTreeKlassUT.insert(30);
       avlTreeKlassUT.insert(40);
       avlTreeKlassUT.insert(50);
        avlTreeKlassUT.insert(25);
        avlTreeKlassUT.insert(33);
        avlTreeKlassUT.insert(55);
        avlTreeKlassUT.insert(22);
        avlTreeKlassUT.insert(11);
        avlTreeKlassUT.insert(7);
        TreePrinter.printNode(avlTreeKlassUT.getRoot());
        avlTreeKlassUT.delete(40);




        TreePrinter.printNode(avlTreeKlassUT.getRoot());

        avlTreeKlassUT.traversal();
    }

}