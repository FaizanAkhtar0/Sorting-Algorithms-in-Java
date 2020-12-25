package com.company;

public class Recursion {

    public Recursion(int num){
        System.out.println("Facetorial: " + factorial(num));
    }

    private long factorial(int num){

        if (num == 0){
            return 1;
        }

        return num * factorial(num - 1);
    }

}
