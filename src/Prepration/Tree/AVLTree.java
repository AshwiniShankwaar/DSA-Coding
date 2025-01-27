package Prepration.Tree;

public class AVLTree {
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
    AVLTree(){
    }
    //it is used to make not balanced binary tree a balanced binary tree
    public boolean isEmpty(Node node){
        if(node ==null) return true;
        return false;
    }
    public int getHeight(Node node){
        if(node ==null) return -1;
        return node.height;
    }
    public boolean isBalanced(Node node){
        if(node == null) return true;
        return Math.abs(getHeight(node.left)-getHeight(node.right))<=1 &&
                isBalanced(node.left) && isBalanced(node.right);
    }
    public void populate(int[] arr){
        for (int a:arr){
            insert(a);
        }
    }
    public void insert(int value){
        root = insert(value,root);
    }
    private Node insert(int value, Node node){
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

        return rotate(node);
    }

    private Node rotate(Node node) {
        if(getHeight(node.left)-getHeight(node.right)>1){
            //left is heavy
            if(getHeight(node.left.left)-getHeight(node.left.right)>0)
                //left left is heavy
                return rightRotation(node);
            if(getHeight(node.left.left)-getHeight(node.left.right)<0)
                node.left = leftRotation(node);
            return rightRotation(node);
        }
        if(getHeight(node.left)-getHeight(node.right) < -1){
            //right is heavy
            if(getHeight(node.right.left)-getHeight(node.right.right)>0)
                //right right is heavy
                return leftRotation(node);
            if(getHeight(node.right.left)-getHeight(node.right.right)<0)
                node.right = rightRotation(node);
            return leftRotation(node);
        }
        return node;
    }

    private Node rightRotation(Node p) {
        Node c = p.left;
        Node t = p.left.right;

        c.right = p;
        p.left = t;

        p.height = Math.max(getHeight(p.left),getHeight(p.right))+1;
        c.height = Math.max(getHeight(c.left),getHeight(c.right))+1;
        return c;
    }

    private Node leftRotation(Node p) {
        Node c = p.right;
        Node t = p.right.left;

        c.left = p;
        p.right = t;

        p.height = Math.max(getHeight(p.left),getHeight(p.right))+1;
        c.height = Math.max(getHeight(c.left),getHeight(c.right))+1;
        return c;

    }

    private void pDisplay(Node node, int level){
        if(node == null) return;
        pDisplay(node.left,level+1);
        if(level!=0){
            for (int i = 0; i < level; i++) {
                System.out.print("|\t\t");
            }
            System.out.println("|--->"+node.val +" height:"+node.height);
        }else{
            System.out.println("|--->"+node.val +" height:"+node.height);
        }
        pDisplay(node.right,level+1);
    }
    public static void main(String[] args) {
        AVLTree avl = new AVLTree();
        int arr[] = {8,5,3,4,10,9,7,12,2,6,1,13};
        avl.populate(arr);
        avl.pDisplay(avl.root,0);
    }
}
