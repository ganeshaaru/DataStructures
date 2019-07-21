package com.r.array;

import java.util.Random;

public class ReservoirSampling {

    public void sampleItems(int[] array, int noOfSample) {
        int[] sample = new int[noOfSample];
        Random random =  new Random();
        for (int i = 0; i < noOfSample; i++) {
            sample[i] = array[i];
        }

        for (int i = noOfSample; i < array.length; i++) {
                int j = random.nextInt(i)+1;
                if(j < noOfSample)
                {
                 sample[j] = array[i];
                }
        }

        for (int i = 0; i < sample.length; i++) {
            System.out.println(sample[i]);
        }

    }

    public static void main(String[] args){
        ReservoirSampling sampling = new ReservoirSampling();

        sampling.sampleItems(new int[] {1,2,3,4,5,55,6,7,8,99,2,333,11,331,121}, 3);
    }
}
