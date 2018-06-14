package main.java.classes;

import java.util.Scanner;


/**
 * https://www.hackerrank.com/challenges/30-abstract-classes/problem
 * */
public class Abstract {
    abstract class Book {
        String title;
        String author;

        Book(String title, String author) {
            this.title = title;
            this.author = author;
        }

        abstract void display();
    }


    class MyBook extends Book{
        private int price;


        /**
         *   Class Constructor
         *
         *   @param title The book's title.
         *   @param author The book's author.
         *   @param price The book's price.
         **/

        public MyBook(String title, String author, int price) {
            super(title, author);
            this.price = price;
        }


        /**
         *
         *   Print the title, author, and price in the specified format.
         **/
        @Override
        void display() {
            System.out.println("Title: " + this.title);
            System.out.println("Author: " + this.author);
            System.out.println("Price: " + this.price);
        }
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String title = scanner.nextLine();
        String author = scanner.nextLine();
        int price = scanner.nextInt();
        scanner.close();

        Book book = new MyBook(title, author, price);
        book.display();
    }
}
