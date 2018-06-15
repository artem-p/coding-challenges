package src.main.java.classes;


import java.util.Scanner;


class Difference {
    private int[] elements;
    public int maximumDifference;

    public Difference(int[] elements) {
        this.elements = elements;
    }

    public void computeDifference() {

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
