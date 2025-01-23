package Prepration.LinkedList;
/**
 * Design your implementation of the linked list. You can choose to use a singly or doubly linked list.
 * A node in a singly linked list should have two attributes: val and next. val is the value of the current
 * node, and next is a pointer/reference to the next node.
 * If you want to use the doubly linked list, you will need one more attribute prev to indicate the previous
 * node in the linked list. Assume all nodes in the linked list are 0-indexed.
 *
 * Implement the MyLinkedList class:
 *
 * MyLinkedList() Initializes the MyLinkedList object.
 * int get(int index) Get the value of the indexth node in the linked list. If the index is invalid, return -1.
 * void addAtHead(int val) Add a node of value val before the first element of the linked list. After the
 * insertion, the new node will be the first node of the linked list.
 * void addAtTail(int val) Append a node of value val as the last element of the linked list.
 * void addAtIndex(int index, int val) Add a node of value val before the indexth node in the linked list.
 * If index equals the length of the linked list, the node will be appended to the end of the linked list.
 * If index is greater than the length, the node will not be inserted.
 * void deleteAtIndex(int index) Delete the indexth node in the linked list, if the index is valid.
 * */
class Node {
    public int val;
    public Node next;

    Node(int val, Node next) {
        this.val = val;
        this.next = next;
    }

    Node(int val) {
        this(val, null);
    }

    Node() {
        this(0, null);
    }
}

public class MyLinkedList {
    private Node head;
    private int size; // Track the size of the linked list

    public MyLinkedList() {
        head = null;
        size = 0;
    }

    // Get the value of the node at the given index
    public int get(int index) {
        if (index < 0 || index >= size) {
            return -1; // Return -1 for invalid index
        }
        Node temp = head;
        for (int i = 0; i < index; i++) {
            temp = temp.next;
        }
        return temp.val;
    }

    // Add a node at the head of the list
    public void addAtHead(int val) {
        Node newNode = new Node(val, head);
        head = newNode;
        size++;
    }

    // Add a node at the tail of the list
    public void addAtTail(int val) {
        if (head == null) {
            addAtHead(val);
            return;
        }
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = new Node(val);
        size++;
    }

    // Add a node at a specific index
    public void addAtIndex(int index, int val) {
        if (index < 0 || index > size) {
            return; // Do nothing for invalid index
        }
        if (index == 0) {
            addAtHead(val);
            return;
        }
        Node temp = head;
        for (int i = 0; i < index - 1; i++) {
            temp = temp.next;
        }
        Node newNode = new Node(val, temp.next);
        temp.next = newNode;
        size++;
    }

    // Delete the node at a specific index
    public void deleteAtIndex(int index) {
        if (index < 0 || index >= size) {
            return; // Do nothing for invalid index
        }
        if (index == 0) {
            head = head.next;
        } else {
            Node temp = head;
            for (int i = 0; i < index - 1; i++) {
                temp = temp.next;
            }
            temp.next = temp.next.next;
        }
        size--;
    }

    public static void main(String[] args) {
        MyLinkedList myLinkedList = new MyLinkedList();
        myLinkedList.addAtHead(1);
        myLinkedList.addAtTail(3);
        myLinkedList.addAtIndex(1, 2); // linked list becomes 1->2->3
        System.out.println(myLinkedList.get(1)); // return 2
        myLinkedList.deleteAtIndex(1); // now the linked list is 1->3
        System.out.println(myLinkedList.get(1)); // return 3
    }
}

