package src.main.java.structures;

import java.util.*;

/**
 * https://www.hackerrank.com/challenges/30-linked-list/problem
 * */
class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class LinkedListSimple {

    /**
     * Insert node at the tall
     * */
    public static  Node insert(Node head,int data) {
        Node node = new Node(data);
        if (head == null) return node;

        if (head.next == null) {
            head.next = node;
            return head;
        } else {
            insert(head.next, data);
            return head;
        }
    }


    public static void display(Node head) {
        Node start = head;
        while(start != null) {
            System.out.print(start.data + " ");
            start = start.next;
        }
    }


    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        Node head = null;
        int N = sc.nextInt();

        while(N-- > 0) {
            int element = sc.nextInt();
            head = insert(head,element);
        }

        display(head);
        sc.close();
    }
}
