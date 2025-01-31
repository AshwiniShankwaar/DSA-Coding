package Target100In30DaysEnd16JanLeetCode.LinkedList;
/**
 * A linked list of length n is given such that each node contains an additional random pointer, which
 * could point to any node in the list, or null.
 *
 * Construct a deep copy of the list. The deep copy should consist of exactly n brand new nodes, where
 * each new node has its value set to the value of its corresponding original node. Both the next and
 * random pointer of the new nodes should point to new nodes in the copied list such that the pointers
 * in the original list and copied list represent the same list state. None of the pointers in the new
 * list should point to nodes in the original list.
 *
 * For example, if there are two nodes X and Y in the original list, where X.random --> Y, then for the
 * corresponding two nodes x and y in the copied list, x.random --> y.
 *
 * Return the head of the copied linked list.
 *
 * The linked list is represented in the input/output as a list of n nodes. Each node is represented as a
 * pair of [val, random_index] where:
 *
 * val: an integer representing Node.val
 * random_index: the index of the node (range from 0 to n-1) that the random pointer points to, or null if
 * it does not point to any node.
 * Your code will only be given the head of the original linked list.
 * */
class RNode {
    int val;
    RNode next;
    RNode random;

    public RNode(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
public class CopyListWithRandomPointer {
//[[7,null],[13,0],[11,4],[10,2],[1,0]]
//    [[1,1],[2,1]]
    //[[3,null],[3,0],[3,null]]
    public RNode copyRandomList(RNode head) {
        //first copy the linked list
        RNode newList = new RNode(head.val);
        RNode ntemp = newList;
        RNode temp = head.next;
        while(temp!=null){
            RNode child = new RNode(temp.val);
            ntemp.next = child;
            ntemp = ntemp.next;
            temp = temp.next;
        }
        //now find the position and attach the same positioned node to the copy linked list
        temp = head;
        ntemp = newList;
        while(temp!=null){
            int position = getRandomeNodePosition(head,temp.random);
            if(position == -1){
                ntemp.random = null;
                ntemp = ntemp.next;
                temp = temp.next;
            }else {
                RNode randomNode = getRandomNode(newList, position);
                ntemp.random = randomNode;
                ntemp = ntemp.next;
                temp = temp.next;
            }
        }
        return newList;
    }

    private RNode getRandomNode(RNode newList, int position) {
        int i = 0;
        RNode temp = newList;
        while(i<position){
            temp = temp.next;
            i++;
        }
        return temp;
    }

    private int getRandomeNodePosition(RNode head, RNode random) {
        if(random == null) return -1;
        int pos = 0;
        RNode temp = head;
        while (temp!=random){
            temp = temp.next;
            pos++;
        }
        return pos;
    }

    public static void main(String[] args) {
//        RNode head = new RNode(7);
//        RNode child1 = new RNode(13);
//        RNode child2 = new RNode(11);
//        RNode child3 = new RNode(10);
//        RNode child4 = new RNode(1);
//        head.next = child1;
//        head.random = null;
//        child1.next = child2;
//        child1.random = head;
//        child2.next = child3;
//        child2.random = child4;
//        child3.next = child4;
//        child3.random = child2;
//        child4.random = head;

//        RNode head = new RNode(1);
//        RNode child1 = new RNode(2);
//        head.next = child1;
//        head.random = child1;
//        child1.random = child1;

        RNode head = new RNode(3);
        RNode child1 = new RNode(3);
        RNode child2 = new RNode(3);
        head.next = child1;
        head.random = null;
        child1.next = child2;
        child1.random = head;
        CopyListWithRandomPointer c = new CopyListWithRandomPointer();
        c.copyRandomList(head);
    }
}
