package Target100In30DaysEnd16JanLeetCode.Recursion;
/**
 * Given a linked list, swap every two adjacent nodes and return its head. You must solve the problem without
 * modifying the values in the list's nodes (i.e., only nodes themselves may be changed.)
 * */


class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}
public class SwapNodesInPairs {
    public ListNode swapPairs(ListNode head) {
        if(head == null) return null;
        if(head.next == null) return head;
        ListNode temp = head.next;
        head.next = head.next.next;
        temp.next = head;
        temp.next.next = swapPairs(temp.next.next);
        return temp;
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(1,new ListNode(2,new ListNode(3,new ListNode(4,new ListNode(5)))));
        head = new SwapNodesInPairs().swapPairs(head);
        while(head != null){
            System.out.println(head.val);
            head = head.next;
        }
    }
}
