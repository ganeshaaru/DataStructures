package com.r.array;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Arrays;

import static java.lang.String.*;

public class RemoveDuplicatesFromSortedArray {
    private static final Logger LOGGER = LoggerFactory.getLogger(RemoveDuplicatesFromSortedArray.class);

    public int removeDuplicates(int[] array) {
        int slowPointer = 0;

        for (int fastPointer = 1; fastPointer < array.length; fastPointer++) {
            if (array[slowPointer] != array[fastPointer]) {
                array[++slowPointer] = array[fastPointer];
            }
        }
        return ++slowPointer;
    }

    public static void main(String[] args) {

        RemoveDuplicatesFromSortedArray test = new RemoveDuplicatesFromSortedArray();

        int[] array = new int[]{1, 1, 1, 2, 3, 4, 4, 4, 5, 5};

        LOGGER.info(valueOf(test.removeDuplicates(array)));
    }
}
