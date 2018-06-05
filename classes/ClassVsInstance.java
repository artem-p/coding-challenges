package classes;

import java.util.Scanner;

public class ClassVsInstance {
    private int age;

    public ClassVsInstance(int initialAge) {
        if (initialAge >= 0) {
            this.age = initialAge;
        } else {
            this.age = 0;
            System.out.println("Age is not valid, setting age to 0.");
        }
    }


    public void amIOld() {
        String message;

        if (this.age < 13) {
            message = "You are young.";
        } else if (this.age < 18) {
            message = "You are a teenager.";
        } else {
            message = "You are old.";
        }

        System.out.println(message);
    }


    public void yearPasses() {
        this.age++;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int i = 0; i < T; i++) {
            int age = sc.nextInt();
            ClassVsInstance p = new ClassVsInstance(age);
            p.amIOld();
            for (int j = 0; j < 3; j++) {
                p.yearPasses();
            }
            p.amIOld();
            System.out.println();
        }
        sc.close();
    }
}