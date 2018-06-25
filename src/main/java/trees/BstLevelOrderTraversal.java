package main.java.trees;


import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/**
 * https://hackerrank.com/challenges/30-binary-trees/problem
 * */
public class BstLevelOrderTraversal {

    static void levelOrder(Node root) {

        Queue<Node> queue = new LinkedList<>();

        if (root != null) {
            queue.add(root);

            while (!queue.isEmpty()) {
                Node node = queue.remove();

                System.out.print(node.data + " ");

                if (node.left != null) {
                    queue.add(node.left);
                }

                if (node.right != null) {
                    queue.add(node.right);
                }
            }
        }
    }


    public static Node insert(Node root,int data){
        if(root==null){
            return new Node(data);
        }
        else{
            Node cur;
            if(data<=root.data){
                cur=insert(root.left,data);
                root.left=cur;
            }
            else{
                cur=insert(root.right,data);
                root.right=cur;
            }
            return root;
        }
    }


    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int T=sc.nextInt();
        Node root=null;
        while(T-->0){
            int data=sc.nextInt();
            root=insert(root,data);
        }
        levelOrder(root);
    }
}