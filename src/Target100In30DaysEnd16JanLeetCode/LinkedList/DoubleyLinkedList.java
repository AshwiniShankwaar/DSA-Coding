package Target100In30DaysEnd16JanLeetCode.LinkedList;

public class DoubleyLinkedList {
    private ListNode head;
    private int size; // Track the size of the linked list

    public DoubleyLinkedList() {
        head = null;
        size = 0;
    }

    // Get the value of the node at the given index
    public int get(int index) {
        if (index < 0 || index >= size) {
            return -1; // Return -1 for invalid index
        }
        ListNode temp = head;
        for (int i = 0; i < index; i++) {
            temp = temp.next;
        }
        return temp.val;
    }

    // Add a node at the head of the list
    public void addAtHead(int val) {
        ListNode newNode = new ListNode(val, head);
        head = newNode;
        size++;
    }

    // Add a node at the tail of the list
    public void addAtTail(int val) {
        if (head == null) {
            addAtHead(val);
            return;
        }
        ListNode temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = new ListNode(val);
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
        ListNode temp = head;
        for (int i = 0; i < index - 1; i++) {
            temp = temp.next;
        }
        ListNode newNode = new ListNode(val, temp.next);
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
            ListNode temp = head;
            for (int i = 0; i < index - 1; i++) {
                temp = temp.next;
            }
            temp.next = temp.next.next;
        }
        size--;
    }
}
