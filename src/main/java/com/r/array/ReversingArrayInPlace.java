package com.r.array;

/**
 * Reverse the content of given array without any extra memory
 */


public class ReversingArrayInPlace {

    public static void main(String[] args) {
        int[] givenArray = new int[6];

        for (int i = 0; i < givenArray.length; i++) {
            givenArray[i] = i;
        }

        for (int i = 0; i < givenArray.length; i++) {
            System.out.println(" input  = " + givenArray[i]);
        }

        ReversingArrayInPlace reversingArrayInPlace = new ReversingArrayInPlace();

        reversingArrayInPlace.logic(givenArray);

    }


    public void logic(int[] givenArray) {

        int startPointer = 0;
        int lastPointer = givenArray.length - 1;

        while (startPointer < lastPointer) {
            int temp = givenArray[startPointer];
            givenArray[startPointer] = givenArray[lastPointer];
            givenArray[lastPointer] = temp;

            System.out.println("How many times loop runs " + startPointer);
            startPointer++;
            lastPointer--;
        }

        for (int i = 0; i < givenArray.length; i++) {
            System.out.println(" value = " + givenArray[i]);
        }
    }
}
