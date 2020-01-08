package com.r.array;

public class MoveZerosToLeft {

    static void move_zeros_to_left_in_array(int[] array) {
        int read = array.length - 1;
        int write = array.length - 1;
        int count = 0;

        while (read >= 0) {
            if (array[read] != 0) {
                int temp = array[read];
                array[write] = temp;
                write--;
            } else {
                count++;
            }
            read--;
        }
        while (count > 0) {
            array[write] = 0;
            write--;
            count--;
        }
    }
}
