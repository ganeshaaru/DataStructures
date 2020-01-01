package com.r.basics.tree;

import com.r.basics.common.BinaryNode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TreePrinter
{

    public static <T extends Comparable<?>> void printNode(BinaryNode<T> root)
    {
        int maxLevel = TreePrinter.maxLevel(root);

        printNodeInternal(Collections.singletonList(root), 1, maxLevel);
    }

    private static <T extends Comparable<?>> void printNodeInternal(List<BinaryNode<T>> nodes, int level, int maxLevel)
    {
        if (nodes.isEmpty() || TreePrinter.isAllElementsNull(nodes))
            return;

        int floor = maxLevel - level;
        int endgeLines = (int) Math.pow(2, (Math.max(floor - 1, 0)));
        int firstSpaces = (int) Math.pow(2, (floor)) - 1;
        int betweenSpaces = (int) Math.pow(2, (floor + 1)) - 1;

        TreePrinter.printWhitespaces(firstSpaces);

        List<BinaryNode<T>> newNodes = new ArrayList<BinaryNode<T>>();
        for (BinaryNode<T> node : nodes)
        {
            if (node != null)
            {
                //System.out.print(node.getItem() +" H:"+ node.getHeight());
                System.out.print(node.getItem() );
                newNodes.add(node.getLeftChild());
                newNodes.add(node.getRightChild());
            } else
            {
                newNodes.add(null);
                newNodes.add(null);
                System.out.print(" ");
            }

            TreePrinter.printWhitespaces(betweenSpaces);
        }
        System.out.println("");

        for (int i = 1; i <= endgeLines; i++)
        {
            for (int j = 0; j < nodes.size(); j++)
            {
                TreePrinter.printWhitespaces(firstSpaces - i);
                if (nodes.get(j) == null)
                {
                    TreePrinter.printWhitespaces(endgeLines + endgeLines + i + 1);
                    continue;
                }

                if (nodes.get(j).getLeftChild() != null)
                    System.out.print("/");
                else
                    TreePrinter.printWhitespaces(1);

                TreePrinter.printWhitespaces(i + i - 1);

                if (nodes.get(j).getRightChild() != null)
                    System.out.print("\\");
                else
                    TreePrinter.printWhitespaces(1);

                TreePrinter.printWhitespaces(endgeLines + endgeLines - i);
            }

            System.out.println("");
        }

        printNodeInternal(newNodes, level + 1, maxLevel);
    }

    private static void printWhitespaces(int count)
    {
        for (int i = 0; i < count; i++)
            System.out.print(" ");
    }

    private static <T extends Comparable<?>> int maxLevel(BinaryNode<T> node)
    {
        if (node == null)
            return 0;

        return Math.max(TreePrinter.maxLevel(node.getLeftChild()), TreePrinter.maxLevel(node.getRightChild())) + 1;
    }

    private static <T> boolean isAllElementsNull(List<T> list)
    {
        for (Object object : list)
        {
            if (object != null)
                return false;
        }

        return true;
    }

}
