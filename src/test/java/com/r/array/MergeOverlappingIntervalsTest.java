package com.r.array;

import org.junit.Test;

import java.util.ArrayList;

import static com.r.array.MergeOverlappingIntervals.merge_intervals;
import static org.junit.Assert.*;
import static com.r.array.MergeOverlappingIntervals.Tuple;

public class MergeOverlappingIntervalsTest {

    @Test
    public void test(){
        ArrayList<Tuple<Integer,Integer>> v1 = new ArrayList<Tuple<Integer,Integer>>();

        Tuple<Integer,Integer> t1 = new Tuple<Integer,Integer>(2,10);
        Tuple<Integer,Integer> t2 = new Tuple<Integer,Integer>(4,12);
        Tuple<Integer,Integer> t3 = new Tuple<Integer,Integer>(13,16);
        Tuple<Integer,Integer> t4 = new Tuple<Integer,Integer>(19,20);
        Tuple<Integer,Integer> t5 = new Tuple<Integer,Integer>(20,24);

        v1.add(t1);
        v1.add(t2);
        v1.add(t3);
        v1.add(t4);
        v1.add(t5);

        ArrayList<Tuple<Integer,Integer>> v2 = merge_intervals(v1);

        for(int i=0 ; i < v2.size() ; i++)
        {
            System.out.print(String.format("{%d,%d) ",v2.get(i).x,v2.get(i).y));
        }

        System.out.println("\n");

        v1.clear();

        v1.add(t1);
        v1.add(t2);

        v2 = merge_intervals(v1);

        for(int i=0 ; i < v2.size() ; i++)
        {
            System.out.print(String.format("{%d,%d) ",v2.get(i).x,v2.get(i).y));
        }

        System.out.println("\n");
    }
}