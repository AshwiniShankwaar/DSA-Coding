package Target100In30DaysEnd16JanLeetCode.LinkedList;

import java.util.List;

/**
 * Given the head of a linked list, rotate the list to the right by k places.
 * */
public class RotateList {
    public ListNode rotateRight(ListNode head, int k) {
        if (head == null || head.next == null || k == 0) {
            return head;
        }
        //get the size of the list
        int size = getSize(head);
        //identify the position after which nodes will be rotated
        k = k%size;
        int pos = size-k-1;
        //sift it from the back to front
        ListNode dummy = new ListNode();
        ListNode temp = head;
        while(temp!=null && pos>0){
            temp = temp.next;
            pos--;
        }
        dummy.next = temp.next;
        temp.next = null;
        ListNode dTemp = dummy;
        while(dTemp.next!=null){
            dTemp = dTemp.next;
        }
        dTemp.next = head;
        return dummy.next;
    }

    private int getSize(ListNode head) {
        ListNode temp = head;
        int i = 0;
        while(temp!=null){
            temp = temp.next;
            i++;
        }
        return i;
    }

    public static void main(String[] args) {
        //ListNode head = new ListNode(1,new ListNode(2,new ListNode(3,new ListNode(4,new ListNode(5)))));
        ListNode head = new ListNode(0,new ListNode(1,new ListNode(2)));
        head = new RotateList().rotateRight(head,4);
        while (head!=null){
            System.out.println(head.val);
            head = head.next;
        }
    }
}
