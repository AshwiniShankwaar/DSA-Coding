package Target100In30DaysEnd16JanLeetCode.HashTable;

import com.sun.source.tree.Tree;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Given the root of a binary tree, return all duplicate subtrees.
 *
 * For each kind of duplicate subtrees, you only need to return the root node of any one of them.
 *
 * Two trees are duplicate if they have the same structure with the same node values.
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
public class DublicateSubTree {
    HashMap<String, Integer> map = new HashMap<>();
    List<TreeNode> dublicate = new ArrayList<>();
    public List<TreeNode> findDuplicateSubtrees(TreeNode root) {
        traverse(root);
        return dublicate;
    }

    public String traverse(TreeNode root){
        if(root == null) return "#";
        String key = root.val+","+traverse(root.left)+","+traverse(root.right);
        map.put(key,map.getOrDefault(key,0)+1);
        if(map.get(key) >1) {
            dublicate.add(root);
        }
        return key;
    }

    public static void main(String[] args) {
        //create tree here
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.right.left = new TreeNode(2);
        root.right.right = new TreeNode(4);
        root.right.left.left = new TreeNode(4);

        //input 2
//        TreeNode root = new TreeNode(2);
//        root.left = new TreeNode(1);
//        root.right = new TreeNode(1);

        //input 3
//        TreeNode root = new TreeNode(2);
//        root.left = new TreeNode(2);
//        root.right = new TreeNode(2);
//        root.left.left = new TreeNode(3);
//        root.right.left = new TreeNode(3);

        DublicateSubTree tree = new DublicateSubTree();
        tree.findDuplicateSubtrees(root);
    }
}
