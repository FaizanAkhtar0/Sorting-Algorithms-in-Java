package com.company;

public class SelectionSort {
    private int[] intArray;

    private void swap(int[] array, int i, int j){

        if (i == j){
            return;
        }

        int tempVal = array[i];
        array[i] = array[j];
        array[j] = tempVal;
    }

    public SelectionSort(int[] array){

        for (int lastUnsortedIndex = array.length - 1; lastUnsortedIndex > 0; lastUnsortedIndex--){
            int largest = 0;
            for (int i = 1; i <= lastUnsortedIndex; i++){

                if (array[i] > array[largest]){
                    largest = i;
                }
            }
            swap(array, largest, lastUnsortedIndex);
        }
        this.intArray = array;
        printArray();
    }

    private void printArray() {
        for(int i = 0; i < intArray.length; i++){
            System.out.print(intArray[i] + "  ->  ");
        }
        System.out.println();
    }
}
