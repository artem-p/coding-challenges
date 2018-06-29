package src.main.java.regex;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Gmail {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int number = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        List<String> names = new ArrayList<>();

        for (int i = 0; i < number; i++) {
            String[] firstNameEmailID = scanner.nextLine().split(" ");

            String firstName = firstNameEmailID[0];

            String emailID = firstNameEmailID[1];

            if (emailID.matches("^[\\w.+\\-]+@gmail\\.com$")) {
                names.add(firstName);
            }

        }


        Collections.sort(names);

        for (String name : names) {
            System.out.println(name);
        }

        scanner.close();
    }
}
