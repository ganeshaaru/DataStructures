package com.r.book.array;

public class UnorderedArray {

    public static void main(String[] args) {

        Array array = new Array(5);

        array.insert(2);
        array.insert(1);
        array.insert(3);
        array.insert(4);
        array.insert(5);

        array.display();

        array.delete(3);

        array.display();
    }


    static class Array {

        int[] array;
        int currentIndex;

        public Array(int size) {
            array = new int[size];
            currentIndex = 0;
        }


        public void insert(int data) {
            this.array[currentIndex] = data;
            currentIndex++;
        }

        void delete(int data) {
            int deleteKey=0;
            for (int i = 0; i < currentIndex; i++) {
                if (array[i] == data) {
                    deleteKey = i;
                    break;
                }
            }


            for(int j=deleteKey; j< currentIndex-1;j++){
                    array[j]=array[j+1];
            }
                currentIndex = currentIndex-1;
        }

        int find(int data) {

            for (int i = 0; i < currentIndex; i++) {
                if (array[i] == data) {
                    return i;
                }
            }
            return 0;
        }

        void display() {
            System.out.println("------------------------------------------------------");
            for (int i = 0; i < currentIndex; i++) {
                System.out.println("data : " + array[i]);
            }

        }

    }

}


