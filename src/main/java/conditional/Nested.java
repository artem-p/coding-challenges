package src.main.java.conditional;

import java.util.Scanner;

/**
 * https://www.hackerrank.com/challenges/30-nested-logic/problem
 * */

public class Nested {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */

        Scanner scan = new Scanner(System.in);
        int actualDay = scan.nextInt();
        int actualMonth = scan.nextInt();
        int actualYear = scan.nextInt();
        int expectedDay = scan.nextInt();
        int expectedMonth = scan.nextInt();
        int expectedYear = scan.nextInt();
        scan.close();

        int yearDelay = 0;
        int monthDelay = 0;
        int dayDelay = 0;

        if (actualYear > expectedYear) {
            yearDelay = 1;
        } else if (actualYear == expectedYear && actualMonth > expectedMonth) {
            monthDelay = actualMonth - expectedMonth;
        } else if (actualYear == expectedYear && actualMonth == expectedMonth && actualDay > expectedDay) {
            dayDelay = actualDay - expectedDay;
        }

        System.out.println(yearDelay * 10000 + monthDelay * 500 + dayDelay * 15);
    }
}
