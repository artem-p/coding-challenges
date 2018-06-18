package src.main.java.exceptions;

import java.util.Scanner;


/**
 * https://www.hackerrank.com/challenges/30-more-exceptions/problem
 * */
class Calculator {
    public int power(int number, int power) throws Exception {
        if (number >= 0 && power >= 0) {
            return (int) (Math.pow(number, power));
        } else {
            throw new Exception("n and p should be non-negative");
        }
    }
}


public class ExceptionSimple {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while (t-- > 0) {

            int n = in.nextInt();
            int p = in.nextInt();
            Calculator myCalculator = new Calculator();
            try {
                int ans = myCalculator.power(n, p);
                System.out.println(ans);
            }
            catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
        in.close();
    }
}
