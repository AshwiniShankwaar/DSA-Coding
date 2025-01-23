package Prepration.Tree;

import javax.swing.*;

/**
 * Balance binary search tree
 * the height of two nodes of same level it should not be more than 1
 *
 * in bst there is a problem that is if the data is sorted then it will create a skew tree to solve
 * this find the middle one and then put the elements
 * */
public class BinarySearchTree {
    class Node{
        int val;
        Node left;
        Node right;
        int height;

        Node(int val){
            this.val = val;
        }

        public int getVal(){
            return val;
        }
    }
    private Node root;
    public BinarySearchTree(){
    }

    public int getHeight(Node node){
        if(node == null){
            return -1;
        }
        return node.height;
    }

    public boolean isEmpty(){
        return root == null;
    }

    public void insert(int val){
        root = insert(val,root);
    }

    private Node insert(int value,Node node){
        if(node == null){
            node = new Node(value);
            return node;
        }
        if(value<node.val){
            node.left = insert(value,node.left);
        }
        if(value>node.val){
            node.right = insert(value,node.right);
        }

        node.height = Math.max(getHeight(node.left),getHeight(node.right))+1;

        return node;
    }

    public boolean isBalanced(){
        return isBalanced(root);
    }

    private boolean isBalanced(Node root) {
        if(root == null){
            return true;
        }
        return Math.abs(getHeight(root.left)-getHeight(root.right))<=1
                        && isBalanced(root.left) && isBalanced(root.right);
    }

    public void display(){
        display(root,"Root node: ");
        pDisplay(root,0);
    }
    private void display(Node node,String details){
        if(node == null){
            return;
        }
        System.out.println(details +" "+ node.val);
        display(node.left,"left child of: "+node.val+" is");
        display(node.right,"right child of: "+node.val+" is");

    }
    private void pDisplay(Node node,int level){
        if(node == null) return;
        pDisplay(node.left,level+1);
        if(level!=0){
            for (int i = 0; i < level; i++) {
                System.out.print("|\t\t");
            }
            System.out.println("|--->"+node.val);
        }else{
            System.out.println("|--->"+node.val);
        }
        pDisplay(node.right,level+1);
    }
    public void populate(int[] arr){
        for (int a:arr){
            insert(a);
        }
    }

    public static void main(String[] args) {
        BinarySearchTree bst = new BinarySearchTree();
        int[] arr = {8,5,3,4,10,9,7,12,2,6,1,13};
        bst.populate(arr);
        bst.display();
        System.out.println("tree is balanced: "+bst.isBalanced());

        System.out.println("sorted data view");
        bst.root = null;
        int[] sortedArr = {1,2,3,4,5,6,7,8,9,10};
        bst.sortedPopulate(sortedArr,0,sortedArr.length);
        bst.display();
        System.out.println("tree is balanced: "+bst.isBalanced());


        System.out.println("preorder");
        bst.preorder();
        System.out.println();
        System.out.println("inorder");
        bst.inorder();
        System.out.println();
        System.out.println("postorder");
        bst.postorder();
    }

    private void sortedPopulate(int[] sortedArr,int start,int end) {
        if(start>=end) return;
            int mid = (start + end) / 2;
            int val = sortedArr[mid];
            this.insert(val);
            sortedPopulate(sortedArr,start,mid);
            sortedPopulate(sortedArr,mid+1,end);

    }

    //traversal in tree
    //preorder traversal
    //n->l->R
    //can be used for evaluation of mathematical equation or copy or in serialisation of string and array

    public void preorder(){
        preorder(root);
    }

    private void preorder(Node node) {
        if(node == null) return;
        System.out.print(node.val+" ");
        preorder(node.left);
        preorder(node.right);
    }

    //inorder traversal
    //l->n->r
    //in bst we can visit node in sorted manner

    public void inorder(){
        inorder(root);
    }

    private void inorder(Node node) {
        if(node == null) return;
        inorder(node.left);
        System.out.print(node.val+" ");
        inorder(node.right);
    }
    //preorder traversal
    //l->r->n
    //use: when you need a binary tree or bottom up calculation like calculating height or diameter of a tree

    public void postorder(){
        postorder(root);
    }

    private void postorder(Node node) {
        if(node == null) return;
        postorder(node.left);
        postorder(node.right);
        System.out.print(node.val+" ");
    }

    //bfs and dfs or bst and dst
}
