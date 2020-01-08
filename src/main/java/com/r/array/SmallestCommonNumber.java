package com.r.array;

public class SmallestCommonNumber {

    static Integer findLeastCommonNumber(int[] arr1,
                                            int[] arr2,
                                            int[] arr3) {
        int i = 0;
        int j = 0;
        int k = 0;
        while (i < arr1.length && j < arr2.length && k < arr3.length) {
            if (arr1[i] == arr2[j] && arr1[i] == arr3[k]) {
                return arr1[i];
            } else if (arr1[i] < arr2[j] && arr1[i] < arr3[k]) {
                i++;
            } else if (arr2[j] < arr3[k]) {
                j++;
            } else {
                k++;
            }
        }

        return Integer.MIN_VALUE; // Replace with actual smallest common value
    }
}
