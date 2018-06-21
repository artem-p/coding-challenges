package src.main.java;

import java.util.Scanner;

/**
 * https://www.hackerrank.com/challenges/30-sorting/problem
 * */
public class Bubble {


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int number = in.nextInt();
        int[] inputArray = new int[number];
        for(int count=0; count < number; count++){
            inputArray[count] = in.nextInt();
        }


        int numberOfSwaps = sort(inputArray);

        System.out.println(String.format("Array is sorted in %s swaps.", numberOfSwaps));
        System.out.println(String.format("First Element: %d", inputArray[0]));
        System.out.println(String.format("Last Element: %d", inputArray[number - 1]));
    }


    /**
     * Sort the array and returns number of swaps
     * */
    private static int sort(int[] array) {
        int number = array.length;
        int overallNumberOfSwaps = 0;

        for (int i = 0; i < number; i++) {
            int numberOfSwaps = 0;
            // Track number of elements swapped during a single array traversal

            for (int j = 0; j < number - 1; j++) {
                // Swap adjacent elements if they are in decreasing order
                if (array[j] > array[j + 1]) {
                    swap(array, j, j + 1);
                    numberOfSwaps++;
                    overallNumberOfSwaps++;
                }
            }


            // If no elements were swapped during a traversal, array is sorted
            if (numberOfSwaps == 0) {
                break;
            }
        }

        return overallNumberOfSwaps;
    }


    /**
     * Swap two elements in the array
     * */
    private static void swap(int[] array, int firstIndex, int secondIndex) {
        int first = array[firstIndex];
        int second = array[secondIndex];

        array[firstIndex] = second;
        array[secondIndex] = first;
    }


}
