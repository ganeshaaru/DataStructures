package com.r.array;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;

public class MaxSlidingWindow {

    public static ArrayDeque<Integer> findMaxSlidingWindow(int[] arr, int windowSize) {

        ArrayDeque<Integer> result = new ArrayDeque<>(); // ArrayDeque for storing max values
        int low = 0;
        int high = windowSize-1;

        if(windowSize < arr.length){
            while(high < arr.length){
                result.add(findMax(arr, low, high));
                low++;
                high++;
            }
        }

        //Write your code

        return result; // returning result
    }

    private static Integer findMax(int[] arr, int low, int high) {
        int pointer = low;
        int max=Integer.MIN_VALUE;
        while(pointer <= high){
            if (arr[pointer] > max){
                max= arr[pointer];
            }
            pointer++;
        }
        return max;
    }
}
