package com.r.basics;


/**
 * Array : collection of elements of same type
 * <p>
 * Advantages:
 * 1. Random Access
 * 2. Add last, get operation using index in O(1)
 * 3. Easy to implement'
 * <p>
 * <p>
 * Dis Advantages:
 * 1. Not dynamic
 * 2. Array resize is expensive operation, O(n)
 * 3. Delete and Insert operation are slow in O(n)
 * 4. we need to know the indexes to get best out of using array as data type.
 * <p>
 * Applications:
 * Mathematical Computations such as Multi dimentional arrays
 * Look up tables
 * Hash tables
 * Heaps
 * Any applications were we want to insert last frequently and get element  using indexes.
 * <p>
 * Operations:
 * <p>
 * add() - O(1)
 * insert(index) - O(n)
 * remove(index) - O(n)
 * removeLast - O(1)
 */

public class Array {

    public static void main(String[] args) {
        // Compilation issue in below code, if array size is not provided during array creation
        //int[] intArray =  new int[];

        // initialise the array with capacity
        int[] intArray = new int[5];

        //insert data
        for (int i = 0; i < intArray.length; i++) {
            intArray[i] = i;
        }

        // random access using indexes, O(1) , we need to know the index (must)
        System.out.println(intArray[2]);
        System.out.println(intArray[4]);

        //Searching O(n)

        for (int i = 0; i < intArray.length; i++) {
                if(intArray[i] == 4){
                    System.out.println("Search Found :  " + intArray[i]);
                }
        }



    }
}
