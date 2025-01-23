package Prepration.Tree;

import com.sun.source.tree.Tree;

import java.util.Scanner;

public class BinaryTree {
    static Scanner sc = new Scanner(System.in);
    private void populate(TreeNode head){
            System.out.println(STR."enter left value of:\{head.val}");
            boolean l = sc.nextBoolean();
            if(l){
                System.out.println("Enter value");
                int next = sc.nextInt();
                //left node
                head.left = new TreeNode(next);
                populate(head.left);
            }
        System.out.println(STR."enter right value of: \{head.val}");
        boolean r = sc.nextBoolean();
            if(r){
                System.out.println("Enter value");
                int next = sc.nextInt();
                //right node
                head.right = new TreeNode(next);
                populate(head.right);
            }
    }

    public static void main(String[] args) {
        TreeNode head = null;
        System.out.println("enter head node");
        int v = sc.nextInt();
        head = new TreeNode(v);
        BinaryTree b = new BinaryTree();
        b.populate(head);
        b.display(head,0);
    }

    private void display(TreeNode head,int level) {
        if(head ==null) return;
        //left
        display(head.left,level+1);
        if(level!=0) {
            for (int i = 0; i < level; i++) {
                System.out.print("|\t\t");
            }
            System.out.println(STR."|---->\{head.val}");
        }else{
            System.out.println(STR."|---->\{head.val}");
        }
        //right
        display(head.right,level+1);
    }
}
