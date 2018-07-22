package com.r.array;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * Given an array of integers,
 * Return indices of the two numbers
 * such that they add up to a specific target
 * <p>
 * hint:
 * <p>
 * Link : https://www.geeksforgeeks.org/write-a-c-program-that-given-a-set-a-of-n-numbers-and-another-number-x-determines-whether-or-not-there-exist-two-elements-in-s-whose-sum-is-exactly-x/
 * <p>
 * Link : https://www.youtube.com/watch?v=EzJB-LX8834
 * <p>
 * there are multiple ways to solve this problem
 * <p>
 * 1. simple solution : with two for loops Big-O(n^2) and space complexity is O(1)
 * <p>
 * 2. Using Hash Map : Big-O(n) and space complexity is O(n)
 * <p>
 * 3. Sort the array and then use two pointers , big-O(nlogn) and space is O(1)
 * merge sort - logn and  traversing the array n , so nlogn
 */
public class TwoSum {
    private int[] UsingHashMap(int[] array, int target) {
        // Validate
        if (null == array || array.length == 0) {
            return null;
        }

        int[] output = new int[2];
        Map<Integer, Integer> map = new HashMap<>();

        for (int index = 0; index < array.length; index++) {
            int key = array[index];
            int difference = target - key;

            if (map.get(difference) != null) {
                output[0] = map.get(difference);
                output[1] = index;
                return output;
            } else {
                map.put(key, index);
            }

        }

        return output;
    }

    public int[] usingSort(int[] array, int target) {
        int[] output = new int[2];
        Arrays.sort(array);
        for (int i = 0, j = array.length - 1; i < j; ) {
            if (array[i] + array[j] < target) {
                System.out.println(array[i] + array[j]);
                    i++;
            } else if (array[i] + array[j] > target) {
                System.out.println(array[i] + array[j] + "Greater");
                    j--;
            } else {
                output[0] = i;
                output[1] = j;
                return output;
            }
        }

        return output;
    }

    public static void main(String[] args) {
        TwoSum twoSum = new TwoSum();

        int[] array = new int[]{1, 2, 3, 4, 5, 6};

        int[] outputArray = twoSum.usingSort(array, 5);
        System.out.println(outputArray[0]);
        System.out.println(outputArray[1]);
    }
}
