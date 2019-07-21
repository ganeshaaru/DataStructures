package com.r.array;

/**
 * what is anagram?
 * https://en.wikipedia.org/wiki/Anagram
 */
public class Anagram {

    public boolean areTheyAnagram(String wordOne, String wordTwo) {
        if (wordOne.length() != wordTwo.length()) {
            return false;
        }

        int value = 0;
        for (int i = 0; i < wordOne.length(); i++) {
            value = value ^ (int) wordOne.charAt(i);
            value = value ^ (int) wordTwo.charAt(i);
        }

        return value == 0;
    }

    public static void main(String[] args) {
        //logic  of XOR
        char tempA = 'A';
        char tempB = 'B';
        char tempC = 'C';
        char tempA1 = 'A';
        char tempB1 = 'B';
        char tempC1 = 'D';

        int xorValue = 0;
        xorValue = xorValue ^ tempA;
        System.out.println(xorValue);
        xorValue = xorValue ^ tempB;
        System.out.println(xorValue);
        xorValue = xorValue ^ tempC;
        System.out.println(xorValue);
        xorValue = xorValue ^ tempA1;
        System.out.println(xorValue);
        xorValue = xorValue ^ tempB1;
        System.out.println(xorValue);
        xorValue = xorValue ^ tempC1;
        System.out.println(xorValue);
    }
}
