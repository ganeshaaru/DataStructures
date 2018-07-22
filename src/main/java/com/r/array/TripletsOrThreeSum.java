package com.r.array;


/**
 * Link : https://www.youtube.com/watch?v=Zdf_AuEAWpY
 *
 * Link : https://www.geeksforgeeks.org/find-triplets-array-whose-sum-equal-zero
 */
public class TripletsOrThreeSum {

    public static boolean isTriplets(int[] array, int target) {
        boolean found = false;
        int length = array.length;
        for (int i = 0; i < length - 2; i++) {

            for (int j = 0; j < length; j++) {

                for (int k = 0; k < length; k++) {
                    if (array[i] + array[j] + array[k] == 0) {
                        System.out.println("i= " + array[i]);
                        System.out.println("j= " + array[j]);
                        System.out.println("k= " + array[k]);
                    }

                }
            }
        }

        return found;
    }

    public static void main(String[] args) {
        int arr[] = {0, -1, 2, -3, 1};

        isTriplets(arr, 0);

    }

}
