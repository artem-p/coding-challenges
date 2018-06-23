package main.java.trees;


import java.util.Scanner;


/**
 * https://www.hackerrank.com/challenges/30-binary-search-trees/problem
 * */

class Node{
    Node left,right;
    int data;
    Node(int data){
        this.data=data;
        left=right=null;
    }
}


public class Bst {

    public static int getHeight(Node root){
        if (root == null || (root.left == null && root.right == null)) {
            return 0;
        } else {
            return 1 + Math.max(getHeight(root.left), getHeight(root.right));
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
        int height=getHeight(root);
        System.out.println(height);
    }
}
