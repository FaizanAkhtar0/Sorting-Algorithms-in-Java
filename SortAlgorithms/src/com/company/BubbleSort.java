package com.company;

public class BubbleSort {

    private int[] intArray;

    private void swap(int[] array, int i, int j){

        if (i == j){
            return;
        }

        int tempVal = array[i];
        array[i] = array[j];
        array[j] = tempVal;
    }

    public BubbleSort(int[] array){

        for (int lastUnsortedIndex = array.length - 1; lastUnsortedIndex > 0; lastUnsortedIndex--){
            for (int i = 0; i < lastUnsortedIndex; i++){

                if (array[i] > array[i+1]){
                    swap(array, i, i + 1);
                }
            }
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
