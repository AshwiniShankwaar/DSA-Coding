package Target100In30DaysEnd16JanLeetCode.LinkedList;

public class RemoveNthNodeFromEndOfList {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummy = new ListNode();
        dummy.next = head;
        ListNode fast = dummy;
        ListNode slow = fast;

        for (int i = 0; i <= n; i++) {
            fast = fast.next;
        }

        while(fast !=null){
            fast = fast.next;
            slow = slow.next;
        }

        slow.next = slow.next.next;
        return dummy.next;
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(1,new ListNode(2));
//        ListNode head = new ListNode(1);
//        ListNode head = new ListNode(1,new ListNode(2,new ListNode(3,new ListNode(4,new ListNode(5)))));
        head = new RemoveNthNodeFromEndOfList().removeNthFromEnd(head,1);
        while(head!=null){
            System.out.println(head.val);
            head = head.next;
        }
    }
}
