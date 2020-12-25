package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int[] array = {20, 35, -15, 7, 55, 1, -22};

        System.out.println("------Bubble Sort------");
        BubbleSort bubbleSort = new BubbleSort(array);  //   O(N^2) Quadratic Complexity + Stable

        System.out.println("------Selection Sort------");
        SelectionSort selectionSort = new SelectionSort(array); //   O(N^2) Quadratic Complexity + Unstable

        System.out.println("------Insertion Sort------");
        InsertionSort insertionSort = new InsertionSort(array); //   O(N^2) Quadratic Complexity + Stable + !swap();

        System.out.println("------Shell Sort------");
        ShellSort shellSort = new ShellSort(array);

        System.out.print("Enter a number for factorial: ");
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();

        Recursion recursion = new Recursion(num);


    }
}
