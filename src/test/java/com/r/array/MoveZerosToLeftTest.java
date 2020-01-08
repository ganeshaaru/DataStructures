package com.r.array;

import org.junit.Test;

import java.util.Arrays;

import static com.r.array.MoveZerosToLeft.move_zeros_to_left_in_array;
import static org.junit.Assert.*;

public class MoveZerosToLeftTest {

    @Test
    public void test(){
        int[] v = new int[]{1, 10, -1, 11, 5, 0, -7, 0, 25, -35};
        System.out.println("Original Array: "+ Arrays.toString(v));
        move_zeros_to_left_in_array(v);
        for(int i = 0 ; i < v.length; i++) {
            System.out.print(v[i] + ", ");
        }
    }
}