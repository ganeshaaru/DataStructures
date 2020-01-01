package com.r.tree;

import com.r.basics.common.BinaryNode;
import com.r.basics.tree.Tree;

public class KthLargestElementInBST<T extends Comparable<T>>
{
    public void findKthSmallestElement(Tree<T> bst, int kthElement)
    {
        BinaryNode<T> rootNode = bst.getRoot();

        findElement(rootNode, kthElement);

    }

    private void findElement(BinaryNode<T> node, int kthElement)
    {
        BinaryNode<T> maxNode;
        int count = 0;
        reverserInorderTraversal(node, kthElement, count);
    }

    private int reverserInorderTraversal(BinaryNode<T> node, int kthElement, int count)
    {
        if (null != node && count <= kthElement)
        {
            if (null != node.getRightChild()  && count <= kthElement)
            {
                count = reverserInorderTraversal(node.getRightChild(), kthElement, count);
            }
            if (count == kthElement)
            {
                System.out.println("Found element");
                System.out.println(" see "+node.getItem());
                count = count + 1;
                return count;
            } else if ( count < kthElement)
            {
                count = count + 1;
            }
            if (null != node.getLeftChild()  && count <= kthElement)
            {
                count =   reverserInorderTraversal(node.getLeftChild(), kthElement, count);
            }
        }
        return count;
    }
}
