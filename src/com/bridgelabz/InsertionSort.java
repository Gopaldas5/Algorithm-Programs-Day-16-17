package com.bridgelabz;


import java.lang.reflect.Array;

public class InsertionSort {
    static int step = 1;

    public static void main(String[] args) {

        String[] input = {"Mango", "Apple", "Lemon", "Grapes", "Papaya", "Banana", "Mango"};
        insertionSort(input);
    }

    private static void printNumbers(String[] input) {
        System.out.println("Step " + step);
        System.out.println("-------------------------------------------");
        step++;

        for (int i = 0; i < input.length; i++) {
            System.out.print(input[i] + ", ");
        }

        System.out.println("\n");
    }

    public static void insertionSort(String array[]) {

        for (int j = 1; j < array.length; j++) {
            String key = array[j];
            int i = j - 1;

            while ((i > -1) && (key.compareTo(array[i]) < 0)) {
                array[i + 1] = array[i];
                i--;
            }

            array[i + 1] = key;
            printNumbers(array);
        }
    }

}
