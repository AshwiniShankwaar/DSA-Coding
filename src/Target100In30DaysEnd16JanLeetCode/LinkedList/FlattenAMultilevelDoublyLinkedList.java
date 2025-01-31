package Target100In30DaysEnd16JanLeetCode.LinkedList;
/**
 * You are given a doubly linked list, which contains nodes that have a next pointer, a previous pointer,
 * and an additional child pointer. This child pointer may or may not point to a separate doubly linked
 * list, also containing these special nodes. These child lists may have one or more children of their own,
 * and so on, to produce a multilevel data structure as shown in the example below.
 *
 * Given the head of the first level of the list, flatten the list so that all the nodes appear in a
 * single-level, doubly linked list. Let curr be a node with a child list. The nodes in the child list
 * should appear after curr and before curr.next in the flattened list.
 *
 * Return the head of the flattened list. The nodes in the list must have all of their child pointers set
 * to null.
 * */
class Node{
    public int val;
    public Node prev;
    public Node next;
    public Node child;
    Node(){
    }
    Node(int val){
        this.val = val;
    }
    Node(int val,Node prev,Node next,Node child){
        this.val = val;
        this.child = child;
        this.prev = prev;
        this.next = next;
    }
}
public class FlattenAMultilevelDoublyLinkedList {
    Node fhead = new Node();
    Node temp = fhead;
    public Node flatten(Node head) {
        move(head);
        head = fhead.next;
        head.prev =null;
        return head;
    }
    public void move(Node head){
        Node child = new Node();
        child.val = head.val;
        temp.next = child;
        child.prev = temp;
        temp = temp.next;
        if(head.child!=null){
            flatten(head.child);
        }
        //if there is no more child then move to the right child to add to the last node
        if(head.next!=null){
            flatten(head.next);
        }
    }

}
