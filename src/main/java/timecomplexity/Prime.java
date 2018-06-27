package src.main.java.timecomplexity;

import java.util.Scanner;

/**
 * https://www.hackerrank.com/challenges/30-running-time-and-complexity/problem
 * */
public class Prime {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = scanner.nextInt();

        for (int i = 0; i < number; i++) {
            int n = scanner.nextInt();

            isPrime(n);
        }


    }

    private static void isPrime(int n) {
        // brutforce - check all numbers from 2 to n.
        // optimization - dividers swaps after square root of n, so we don't
        // really check dividers after that.

        boolean isPrime = true;
        if (n <= 0) {
            System.out.println("Number should be greater than 0");
            return;
        }

        if (n == 1) {
            isPrime = false;
        }

        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) isPrime = false;
        }

        if (isPrime) {
            System.out.println("Prime");
        } else {
            System.out.println("Not prime");
        }
    }
}
