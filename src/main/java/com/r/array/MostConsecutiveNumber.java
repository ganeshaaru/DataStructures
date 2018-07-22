package com.r.array;

class MostConsecutiveNumber {

    public int findMaxConsecutiveNumber(int[] array) {
        int maxOccur = 0;
        int occur = 0;

        for (int anArray : array) {
            if (1 == anArray) {
                occur++;
            } else {
                maxOccur = findMaxAndSet(maxOccur, occur);
                occur = 0;
            }
        }

        maxOccur = findMaxAndSet(maxOccur, occur);

        return maxOccur;
    }

    private int findMaxAndSet(int maxOccur, int occur) {
        if (occur > maxOccur) {
            maxOccur = occur;
        }
        return maxOccur;
    }

}
