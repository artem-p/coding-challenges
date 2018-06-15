package src.main.java.classes;


import java.util.Scanner;

/**
 * https://www.hackerrank.com/challenges/30-scope/problem
 * */

class Difference {
    private int[] elements;
    public int maximumDifference;

    public Difference(int[] elements) {
        this.elements = elements;
    }


    public void computeDifference() {
        maximumDifference = Integer.MIN_VALUE;

        for (int outerIndex = 0; outerIndex < elements.length; outerIndex++) {
            int firstElement = elements[outerIndex];


            // compute differences between current element and all elements from the right
            for (int innerIndex = outerIndex + 1; innerIndex < elements.length; innerIndex++) {
                int secondElement = elements[innerIndex];

                int difference = Math.abs(firstElement - secondElement);

                if (difference > maximumDifference) {
                    maximumDifference = difference;
                }
            }
        }
    }
}


public class Scope {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int number = sc.nextInt();
        int[] elements = new int[number];

        for (int i = 0; i < number; i++) {
            elements[i] = sc.nextInt();
        }

        sc.close();

        Difference difference = new Difference(elements);

        difference.computeDifference();

        System.out.print(difference.maximumDifference);
    }
}
