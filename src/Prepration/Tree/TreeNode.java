package Prepration.Tree;

/**
 * insertion and deleting in O(log n)
 *
 * properties:
 * size: total number of nodes
 * siblings: child of same parent
 * height: maximum nbr of edges from the nodes to the nodes you want to find
 * leaf nodes: bottom nodes of a tree
 * level: height of root - height of node(root level is 0)
 *
 *
 * types of bt:
 * complete bt: all level are fulled apart from the last level and last level is fulled from left to right
 * full bt/strict bt: each node has either 0 child or 2 no single child
 * perfect bt: all level are full
 * height balanced bt: abg height O(log n)
 * skewed bt:  every child has one child
 * ordered bt: every node has some property that it follow
 *
 * in perfect bt of height 'h' then total nbr of nodes are 2^(h+1)-1
 * total nbr of perfect bt is 2^h
 * total nbr of internal leaf apart from the leaf: 2^(h+1)-1 - 2^h = 2^h -1
 * if there is n nbr of leafs then level = (log n) +1
 * if you have n nbr of nodes then level = (log n+1)
 *
 * if we have strict bt then total of leaf notes = n
 * internal nodes = n-1
 * no of leaf nodes = internal nodes + 1
 *
 * for every node in the tree the height of left and right subtree is <=1 then it is a balanced tree.
 * */
public class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(){
    }
    TreeNode(int val){
        this.val = val;
    }
    TreeNode(int val, TreeNode left, TreeNode right){
        this.val = val;
        this.left = left;
        this.right = right;
    }

}
