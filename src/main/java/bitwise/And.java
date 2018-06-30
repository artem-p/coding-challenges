package main.java.bitwise;

import java.util.Scanner;


/**
 * https://hackerrank.com/challenges/30-bitwise-and/problem
 * */

public class And {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int t = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");


        for (int tItr = 0; tItr < t; tItr++) {
            String[] nk = scanner.nextLine().split(" ");

            int n = Integer.parseInt(nk[0]);

            int k = Integer.parseInt(nk[1]);


            int bitwiseAndMax = Integer.MIN_VALUE;

            for (int first = 1; first <= n; first++) {
                for (int second = first + 1; second <= n; second++) {
                    int bitwiseAnd = first & second;

                    if (bitwiseAnd > bitwiseAndMax && bitwiseAnd < k) bitwiseAndMax = bitwiseAnd;
                }
            }

            System.out.println(bitwiseAndMax);
        }


        scanner.close();
    }
}
