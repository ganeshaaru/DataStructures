package com.r.array;

public class DuplicatesInAnArray {

    public void findDuplicatesInArray(int[] inputArray) {
        for (int i = 0; i < inputArray.length; i++) {
            if (inputArray[Math.abs(inputArray[i])] > 0) {
                inputArray[Math.abs(inputArray[i])] = -inputArray[Math.abs(inputArray[i])];
            } else {
                System.out.println(Math.abs(inputArray[i]));
            }

        }
    }
}
