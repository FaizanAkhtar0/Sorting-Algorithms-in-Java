package com.company;

public class ShellSort {
    private int[] intArray;

    public ShellSort(int[] array){

        for (int gap = array.length/2; gap > 0; gap /= 2){
            for (int i = 0; i < array.length; i++){
                int newElement = array[i];

                int j = i;

                while(j >= gap && array[j-gap] > newElement){
                    array[j] = array[j-gap];
                    j -= gap;
                }

                array[j] = newElement;
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
