package Target100In30DaysEnd16JanLeetCode.QueueAndStack;

import java.util.List;

/**
 * Given the root of a binary tree and an integer targetSum, return true if the tree has a root-to-leaf
 * path such that adding up all the values along the path equals targetSum.
 * A leaf is a node with no children.
 * */


class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode() {}
      TreeNode(int val) { this.val = val; }
      TreeNode(int val, TreeNode left, TreeNode right) {
          this.val = val;
          this.left = left;
          this.right = right;
     }
}

public class PathSum {
    public boolean hasPathSum(TreeNode root, int targetSum) {
        if(root ==null) return false;
        if(targetSum == root.val && root.left==null && root.right==null) return true;
        boolean left = false;
        boolean right=false;
        if(root.left !=null)
            left =  hasPathSum(root.left,targetSum-root.val);
        if(root.right !=null)
            right =  hasPathSum(root.right,targetSum-root.val);
        return left || right;
    }

    public static void main(String[] args) {
//        int[] root = new int[]{5,4,8,11,13,4,7,2,1};
//        int targetSum = 22;
//        TreeNode head = new TreeNode(root[0]);
//        head.left = new TreeNode(root[1]);
//        head.right = new TreeNode(root[2]);
//        head.left.left = new TreeNode(root[3]);
//        head.right.left = new TreeNode(root[4]);
//        head.right.right = new TreeNode(root[5]);
//        head.left.left.left = new TreeNode(root[6]);
//        head.left.left.right = new TreeNode(root[7]);
//        head.right.right.right = new TreeNode(root[8]);

        int[] root = new int[]{1,2,3};
        int targetSum = 5;
        TreeNode head = new TreeNode(root[0]);
        head.left = new TreeNode(root[1]);
        head.right = new TreeNode(root[2]);

        System.out.println(new PathSum().hasPathSum(head,targetSum));
    }
}
