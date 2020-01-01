package com.r.array;

class BinarySearch {
     public int binSearch(int[] sortedArray, int key) {
        return search(0, sortedArray.length - 1, key, sortedArray);
    }

    private static int search(int start, int end, int key, int[] sortedArray) {
         int mid = start + ((end-start)/2);
         if(mid >= start && mid <= end){
             if (sortedArray[mid] == key) {
                 return mid;
             } else if (sortedArray[mid] > key) {
                 return search(start, mid-1, key, sortedArray);
             } else if(sortedArray[mid] < key){
                 return search(mid+1, end, key, sortedArray);
             }
         }

        return -1;
    }
}
