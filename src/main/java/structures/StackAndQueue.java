package main.java.structures;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * https://hackerrank.com/challenges/30-queues-stacks/problem
 * */
public class StackAndQueue {
    private List<Character> stack = new ArrayList<>();
    private List<Character> queue = new ArrayList<>();

    private int stackTop = -1;  // index of stack's top element
    private int queueFront = 0;  // index of queue's end element
    private int queueRear = -1;


    private void pushCharacter(char character) {
        stack.add(++stackTop, character);
    }

    private void enqueueCharacter(char character) {
        queue.add(++queueRear, character);
    }

    private char popCharacter() {
        return stack.get(stackTop--);
    }

    private char dequeueCharacter() {
        return queue.get(queueFront++);
    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        scan.close();

        // Convert input String to an array of characters:
        char[] s = input.toCharArray();

        // Create a Solution object:
        StackAndQueue stackAndQueue = new StackAndQueue();

        // Enqueue/Push all chars to their respective data structures:
        for (char c : s) {
            stackAndQueue.pushCharacter(c);
            stackAndQueue.enqueueCharacter(c);
        }

        // Pop/Dequeue the chars at the head of both data structures and compare them:
        boolean isPalindrome = true;
        for (int i = 0; i < s.length/2; i++) {
            if (stackAndQueue.popCharacter() != stackAndQueue.dequeueCharacter()) {
                isPalindrome = false;
                break;
            }
        }

        //Finally, print whether string s is palindrome or not.
        System.out.println( "The word, " + input + ", is "
                + ( (!isPalindrome) ? "not a palindrome." : "a palindrome." ) );
    }


}
