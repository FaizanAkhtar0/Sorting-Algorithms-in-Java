package com.company;

public class InsertionSort {
    private int[] intArray;


    public InsertionSort(int[] array){

        for (int firstUnsortedIndex = 1; firstUnsortedIndex < array.length; firstUnsortedIndex++){
            int newElement = array[firstUnsortedIndex];

            int i;

            for (i = firstUnsortedIndex; i > 0 && array[i-1] > newElement; i--){
                array[i] = array[i-1];
            }
            array[i] = newElement;
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
