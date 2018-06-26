package src.main.java.structures;


import java.util.*;

/**
 * https://www.hackerrank.com/challenges/30-linked-list-deletion/problem
 */
public class LinkedListNoDuplicates {

    public static Node removeDuplicates(Node head) {
        if (head == null) return null;

        Set<Integer> set = new HashSet<>();

        // if we need to preserve sorting
        // SortedSet<Integer> set = new TreeSet<>();


        // Iterate through the list, add elements to a set.
        while (head != null) {
            set.add(head.data);
            head = head.next;
        }

        // crete new list from the set
        Node output = null;

        for (int element : set) {
            output = insert(output, element);
        }

        return output;
    }


    public static  Node insert(Node head,int data) {
        Node p=new Node(data);
        if(head==null)
            head=p;
        else if(head.next==null)
            head.next=p;
        else {
            Node start=head;
            while(start.next!=null)
                start=start.next;
            start.next=p;

        }
        return head;
    }


    public static void display(Node head) {
        Node start=head;
        while(start!=null)
        {
            System.out.print(start.data+" ");
            start=start.next;
        }
    }


    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        Node head=null;
        int T=sc.nextInt();
        while(T-->0){
            int ele=sc.nextInt();
            head=insert(head,ele);
        }
        head=removeDuplicates(head);
        display(head);
    }
}
