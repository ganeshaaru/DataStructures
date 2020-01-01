package com.r.array;

public class BinarySearchIterative {
    //a is sorted array
    public int binSearch(int[] sortedArray, int key) {
        return search(0, sortedArray.length - 1, key, sortedArray);
    }

    private static int search(int start, int end, int key, int[] sortedArray) {
        int mid = start + ((end - start) / 2);

        while (mid >= start && mid <= end) {
            if (sortedArray[mid] == key) {
                return mid;
            } else if (sortedArray[mid] > key) {
                end = mid - 1;
            } else if (sortedArray[mid] < key) {
                start = mid + 1;
            }
            mid = start + ((end - start) / 2);
        }

        return -1;
    }

}
