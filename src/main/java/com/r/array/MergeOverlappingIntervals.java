package com.r.array;

import java.util.ArrayList;

public class MergeOverlappingIntervals {

    static ArrayList<Tuple<Integer,Integer>> merge_intervals(
            ArrayList<Tuple<Integer,Integer>> intervals) {
        ArrayList<Tuple<Integer, Integer>> stack = new ArrayList();
        for(Tuple<Integer,Integer> interval : intervals ){
            if(stack.isEmpty()){
                stack.add(interval);
            }else{
                Tuple<Integer,Integer> currentInterval = stack.get(stack.size()-1);
                if(interval.x > currentInterval.y){
                    stack.add(interval);
                }else {
                    if(interval.y > currentInterval.y){
                        currentInterval.y = interval.y;
                    }
                }
            }
        }
        return stack;
    }



   public static class Tuple<X, Y> {
        public X x;
        public Y y;

        public Tuple(X x, Y y) {
            this.x = x;
            this.y = y;
        }
    }
}
