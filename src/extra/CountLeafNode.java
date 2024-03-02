package extra;
import java.util.*;

class Node {
    int val;
    Node left;
    Node right;

    Node(int val) {
        this.val = val;
        this.left = null;
        this.right = null;
    }
}
public class CountLeafNode {

    Node root;

    CountLeafNode() {
        root = null;
    }

    public void insert(int val) {
        Node newNode = new Node(val);
        if (root == null) {
            root = newNode;
            return;
        }
        Queue<Node> queue = new LinkedList<>();
        queue.offer(root);
        while (!queue.isEmpty()) {
            Node currNode = queue.poll();
            if (currNode.left == null) {
                currNode.left = newNode;
                return;
            } else {
                queue.offer(currNode.left);
            }
            if (currNode.right == null) {
                currNode.right = newNode;
                return;
            } else {
                queue.offer(currNode.right);
            }
        }
    }

    public int countLeafNodes(Node root) {
        if (root == null) {
            return 0;
        }
        if (root.left == null && root.right == null) {
            return 1;
        }
        return countLeafNodes(root.left) + countLeafNodes(root.right);
    }

    public static void main(String[] args) {
        String input = new Scanner(System.in).nextLine();
        String[] nums = input.split(" ");
        CountLeafNode tree = new CountLeafNode();
        for (String num : nums) {
            tree.insert(Integer.parseInt(num));
        }
        System.out.println(tree.countLeafNodes(tree.root));
    }
}
